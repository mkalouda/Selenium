package reviewClass02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        //switchTo() it simply switches to that particular alert and allows us to perform operations on it

       //simple alert
       driver.findElement(By.xpath("//input[@value='Alert']")).click();
       Alert simpleAlert = driver.switchTo().alert();
       Thread.sleep(2000);
       simpleAlert.accept();

       //confirmation box
        driver.findElement(By.xpath("//input[@value ='Confirmation Box']")).click();
        Alert confirmationAlert = driver.switchTo().alert();
        String alertText = confirmationAlert.getText();
        System.out.println(alertText);

    }
}
