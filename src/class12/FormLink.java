package class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormLink {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/");

        WebElement formLink = driver.findElement(By.linkText("Form"));
        formLink.click();
        driver.findElement(By.id("firstname")).sendKeys("munz");
        driver.findElement(By.id("lastname")).sendKeys("luda");

        List<WebElement> martialStatusOptions = driver.findElements(By.xpath("//label[@class = 'radio-inline']"));
        for (WebElement martialStatusOption:martialStatusOptions){
            String text = martialStatusOption.getText();
            if (text.equalsIgnoreCase("married")){
                martialStatusOption.click();
                break;
            }
        }

        List<WebElement> hobbyCheckBoxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        for (WebElement hobbyCheckBox:hobbyCheckBoxes){
            String option = hobbyCheckBox.getAttribute("value");
            if (option.equalsIgnoreCase("read")){
                hobbyCheckBox.click();
                break;
            }
        }

        WebElement countryDD = driver.findElement(By.id("sel1"));
        Select countrySelect = new Select(countryDD);
        countrySelect.selectByVisibleText("Egypt");

        WebElement DOB = driver.findElement(By.id("datepicker"));
        DOB.click();
        WebElement month = driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD = new Select(month);
        monthDD.selectByValue("6");
        WebElement year = driver.findElement(By.className("ui-datepicker-year"));
        Select yearDD = new Select(year);
        yearDD.selectByValue("1994");
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date:dates){
            if (date.getText().equals("27")){
                date.click();
                break;
            }
        }

        driver.findElement(By.id("phonenumber")).sendKeys("5403332323");
        driver.findElement(By.id("username")).sendKeys("test123");
        driver.findElement(By.id("email")).sendKeys("test1111@gmail.com");
        driver.findElement(By.id("comment")).sendKeys("hello");
        driver.findElement(By.id("pwd")).sendKeys("passs111");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }
}
