package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        //driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("yooooo");

        WebElement lastName = driver.findElement(By.name("customer.lastName"));
        lastName.sendKeys("sir");

        WebElement address = driver.findElement(By.id("customer.address.street"));
        address.sendKeys("123 wallaby way");

        WebElement city = driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Atown");

        WebElement state = driver.findElement(By.id("customer.address.state"));
        state.sendKeys("Idaho");

        WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("22222");

        WebElement phoneNumber = driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("434-232-2312");

        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("234-32-2312");

        WebElement userName = driver.findElement(By.id("customer.username"));
        userName.sendKeys("yoyo");

        WebElement password = driver.findElement(By.id("customer.password"));
        password.sendKeys("1234");

        WebElement repeatedPassword = driver.findElement(By.id("repeatedPassword"));
        repeatedPassword.sendKeys("1234");

        WebElement registerButton = driver.findElement(By.className("button"));
        registerButton.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
