package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

    static String url ="http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame(0);
        WebElement nameTextBox = driver.findElement(By.id("name"));
        nameTextBox.sendKeys("Covid sucks");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        /*WebElement alertBtn = driver.findElement(By.id("alert"));
        alertBtn.click();
        Thread.sleep(1000);*/

        driver.switchTo().frame("iframe_a");
        nameTextBox.clear();
        nameTextBox.sendKeys("Selenium rocks");
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        driver.switchTo().frame(frameElement);
        nameTextBox.clear();
        nameTextBox.sendKeys("Webelement text");
    }
}
