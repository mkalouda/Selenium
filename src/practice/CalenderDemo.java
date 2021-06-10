package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalenderDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        String url = "https://www.aa.com/homePage.do";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
        from.sendKeys("LAX");
        WebElement to = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        to.sendKeys("JFK");

        //DEPART
        WebElement departCalendar = driver.findElement(By.xpath("(//button[@class = 'ui-datepicker-trigger'])[1]"));
        departCalendar.click();

        while (true) {
            WebElement nextButton = driver.findElement(By.xpath("//*[@id = 'ui-datepicker-div']/div[2]/div/a"));
            nextButton.click();
            WebElement departMonth = driver.findElement(By.className("ui-datepicker-title"));
            String departMonthText = departMonth.getText();
            if (departMonthText.contains("September")) {
                break;
            }
        }

        List<WebElement> departDates = driver.findElements(By.xpath("(//*[@class = 'ui-datepicker-calendar'])[1]/tbody/tr/td"));
        for (WebElement date : departDates) {
            if (date.getText().equals("28")) {
                date.click();
                break;
            }
        }
        //RETURN
        WebElement returnCalendarButton = driver.findElement(By.xpath("(//*[@class = 'ui-datepicker-trigger'])[2]"));
        returnCalendarButton.click();

        while (true) {
            WebElement nextButton = driver.findElement(By.xpath("//*[@id = 'ui-datepicker-div']/div[2]/div/a"));
            nextButton.click();
            WebElement returnMonth = driver.findElement(By.xpath("(//*[@class = 'ui-datepicker-title'])[2]"));
            String returnMonthText = returnMonth.getText();
            if(returnMonthText.contains("December")) {
                break;
            }
        }
        List<WebElement> returnDates = driver.findElements(By.xpath("(//*[@class = 'ui-datepicker-calendar'])[2]/tbody/tr/td"));
        for (WebElement date : returnDates) {
            if (date.getText().equals("2")) {
                date.click();
                break;
            }
        }
        WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchButton.click();
        Thread.sleep(4000);
        driver.quit();
    }
}
