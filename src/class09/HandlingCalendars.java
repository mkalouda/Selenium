package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingCalendars {

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leave = driver.findElement(By.linkText("Leave"));
        leave.click();

        WebElement fromTextBox = driver.findElement(By.id("calFromDate"));
        fromTextBox.click();

        WebElement monthDD = driver.findElement(By.className("ui-datepicker-month"));
        Select monthDDSelect = new Select(monthDD);
        monthDDSelect.selectByVisibleText("Jul");

        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(fromDates.size());
        for (WebElement fromDate:fromDates){
            if (fromDate.getText().equals("29"))  {
                fromDate.click();
                break;
            }
        }
    }
}
