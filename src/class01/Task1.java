package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    1. launch the browser
    2. navigate to amazon website
    3. print out the title and the url in the console
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();

    }
}
