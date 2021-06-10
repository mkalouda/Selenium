package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo2 {

    public static String url = "http://amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        js.executeScript("window.scrollBy(0,-500)");

        WebElement backToTop = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
        js.executeScript("arguments[0].scrollIntoView(true)", backToTop);
    }
}
