package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*TC 1: Amazon link count:
        Open chrome browser
        Go to "https://www.amazon.com/"
        Get all links
        Get number of links that has text
        Print to console only the links that has text*/
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " +allLinks.size());

        int counter=0;
        for (WebElement link:allLinks){
            String linkText = link.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText);
                counter++;
            }
        }
        System.out.println("Total number of links with text: " + counter);
        Thread.sleep(4000);

        driver.quit();

    }
}
