package class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsLink {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/");

        WebElement widgetsLink = driver.findElement(By.linkText("Widgets"));
        widgetsLink.click();
        driver.findElement(By.id("image_file")).sendKeys("/Users/mariamosman/Desktop/Guess Who Characters/Captain Hector Barbossa.jpeg");
        driver.findElement(By.xpath("//input[@value='Upload']")).click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ContactUs']")));
        String expectedText = "File Successfully Uploaded";
        WebElement text = driver.findElement(By.xpath("//div[@class='ContactUs']"));
        String recievedText = text.getText();
        if (expectedText.contains(recievedText)){
            System.out.println("The file uploaded");
        }
    }
}
