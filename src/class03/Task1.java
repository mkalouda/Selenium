package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        //driver.manage().window().maximize();

        WebElement userNameTextBox = driver.findElement(By.xpath("//input[contains(@id, 'username')]"));
        userNameTextBox.sendKeys("Tester");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[contains(@id, 'password')]"));
        passwordTextBox.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value = 'Login']"));
        loginButton.click();

        WebElement logoutLink = driver.findElement(By.xpath("//a[text() = 'Logout']"));
        logoutLink.click();

        driver.quit();
    }
}
