package class07;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandle {

    static String url ="https://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle(); //getting current window handle
        System.out.println(mainPageHandle);
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles(); //will automatically return LinkedHashSet
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator = allWindowHandles.iterator();
        mainPageHandle = iterator.next(); //stepping forward and getting main page
        String childHandle = iterator.next(); // stepping forward and getting child page
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle); //switching back to parent window
        driver.close();

    }
}
