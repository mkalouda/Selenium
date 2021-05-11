package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

    static String url ="http://syntaxtechs.com/selenium-practice/dynamic-elements-loading.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@style = 'padding: 10%;']")));

        WebElement text = driver.findElement(By.xpath("//h4[@style = 'padding: 10%;']"));
        System.out.println(text.getText());
    }
}
