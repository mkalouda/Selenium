package reviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/dynamic_loading/1";
        driver.get(url);

        WebElement startButton = driver.findElement(By.xpath("//button"));
        startButton.click();

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Hello')]")));

        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Hello')]"));
        System.out.println(text.getText());
    }
}
