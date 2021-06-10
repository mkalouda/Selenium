package class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class AjaxLinkAndAfter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,20);

        WebElement ajaxCallLink = driver.findElement(By.linkText("AjaxCall"));
        ajaxCallLink.click();

        WebElement thisAjaxLink = driver.findElement(By.linkText("This is a Ajax link"));
        thisAjaxLink.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ContactUs")));

        WebElement text = driver.findElement(By.className("ContactUs"));
        System.out.println(text.getText());
        System.out.println(text.isDisplayed());

    }
}
