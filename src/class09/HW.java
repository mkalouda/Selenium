package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HW {

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        //Thread.sleep(2000);

        WebElement leaveButton = driver.findElement(By.linkText("Leave"));
        leaveButton.click();
        //Thread.sleep(2000);

        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        WebElement mDD = driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD = new Select(mDD);
        monthDD.selectByVisibleText("Jul");

        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(fromDates.size());
        for(WebElement fromDate: fromDates) {
            if(fromDate.getText().equals("29")) {
                fromDate.click();
                break;
            }
        }

        WebElement toCalendar = driver.findElement(By.id("calToDate"));
        toCalendar.click();

        WebElement toMDD = driver.findElement(By.className("ui-datepicker-month"));
        Select toMonthDD = new Select(toMDD);
        toMonthDD.selectByVisibleText("Aug");

        List<WebElement> toDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(toDates.size());
        for (WebElement toDate:toDates){
            if (toDate.getText().equals("2")){
                toDate.click();
                break;
            }
        }

        List<WebElement> optionCheckBoxes = driver.findElements(By.xpath("//input[@name = 'leaveList[chkSearchFilter][]']"));
        for (WebElement optionCheckBox:optionCheckBoxes){
            String checkBox = optionCheckBox.getAttribute("value");
            if (checkBox.equalsIgnoreCase("-1") || checkBox.equalsIgnoreCase("0")){
                optionCheckBox.click();
            }
            if (checkBox.equalsIgnoreCase("1")){
                optionCheckBox.click();
            }
        }

        WebElement subUnitDD = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select subUnitDDSelect = new Select(subUnitDD);
        subUnitDDSelect.selectByValue("2");

        WebElement searchButton = driver.findElement(By.id("btnSearch"));
        searchButton.click();

        driver.quit();
    }
}
