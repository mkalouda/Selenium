package class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 1: Amazon link count:
        Open chrome browser
        Go to "https://www.amazon.com/"
        Get all links
        Get number of links that has text
        Print to console only the links that has text*/
public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
    }
}
