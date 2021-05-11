package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {

    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandler = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement ajaxLink = driver.findElement(By.linkText("This is a Ajax link"));
        ajaxLink.click();
        WebElement textBox = driver.findElement(By.className("ContactUs"));
        System.out.println(textBox.getText());
    }
}
