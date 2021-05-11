package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        //switch to the iframe under consideration

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        driver.switchTo().defaultContent();
    }
}
