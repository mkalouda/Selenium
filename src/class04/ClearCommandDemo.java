package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_username']"));
        usernameTextBox.sendKeys("Tester");

        WebElement passwordTestBox = driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_password']"));
        passwordTestBox.sendKeys("test");
        Thread.sleep(3000);

        usernameTextBox.clear();
        passwordTestBox.clear();
    }
}
