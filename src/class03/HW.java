package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        //driver.manage().window().maximize();

        WebElement startPractisingLink = driver.findElement(By.xpath("//a[contains(text(), 'Start')]"));
        startPractisingLink.click();
        Thread.sleep(2000);

        WebElement simpleFormDemoLink = driver.findElement(By.xpath("//a[contains(text(),'Check')]/preceding-sibling::a"));
        simpleFormDemoLink.click();
        Thread.sleep(2000);

        WebElement enterMessageTextBox = driver.findElement(By.xpath("//input[@id = 'user-message']"));
        enterMessageTextBox.sendKeys("Hello");
        Thread.sleep(2000);

        WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(), 'Show')]"));
        showMessageButton.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
