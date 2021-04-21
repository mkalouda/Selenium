package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        //driver.manage().window().maximize();

        WebElement createAccountButton = driver.findElement(By.linkText("Create New Account"));
        createAccountButton.click();
        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("john");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("doe");

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("jdoe@fsdsf.com");

        WebElement reEnterEmail = driver.findElement(By.name("reg_email_confirmation__"));
        reEnterEmail.sendKeys("jdoe@fsdsf.com");

        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("jdoe@fsdsf.com");
        Thread.sleep(3000);

        WebElement closePopUp = driver.findElement(By.name("_8idr img"));
        closePopUp.click();

    }
}
