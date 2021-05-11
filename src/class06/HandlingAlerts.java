package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    static String url ="http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement simpleAlertBtn = driver.findElement(By.id("alert"));
        simpleAlertBtn.click();
        Thread.sleep(1000);

        Alert simpleAlert = driver.switchTo().alert(); //switching focus to alert
        // handling simple alert
        simpleAlert.accept();
        Thread.sleep(1000);

        WebElement confirmBtn = driver.findElement(By.id("confirm"));
        confirmBtn.click();
        Thread.sleep(1000);

        Alert confirmAlert = driver.switchTo().alert();
        String alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();
        Thread.sleep(1000);

        WebElement promptBtn = driver.findElement(By.id("prompt"));
        promptBtn.click();
        Thread.sleep(1000);

        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("we are testing");
        Thread.sleep(2000);
        promptAlert.accept();
        Thread.sleep(1000);
    }
}
