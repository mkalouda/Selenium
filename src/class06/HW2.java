package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php");

        WebElement alertBoxBtn = driver.findElement(By.xpath("//button[@onclick = 'myAlertFunction()']"));
        alertBoxBtn.click();
        Thread.sleep(1000);

        Alert alertBox = driver.switchTo().alert();
        alertBox.accept();

        WebElement confirmBoxBtn = driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));
        confirmBoxBtn.click();
        Thread.sleep(1000);

        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();

        WebElement promptBoxBtn = driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']"));
        promptBoxBtn.click();
        Thread.sleep(1000);

        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Munz");
        promptAlert.accept();


    }
}
