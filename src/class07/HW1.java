package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {

    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainPageHandle = driver.getWindowHandle();

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        WebElement windowButton = driver.findElement(By.id("windowButton"));
        WebElement windowMessageButton = driver.findElement(By.id("messageWindowButton"));

        tabButton.click();
        windowButton.click();
        windowMessageButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()){
            String handle = iterator.next();
            if (!handle.equals(mainPageHandle)){
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandle);
        System.out.println("Main page Title: "+driver.getTitle());
        driver.quit();
    }
}
