package class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RIghtAndDoubleClickAction {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightClickButton = driver.findElement(By.xpath("//span[text() = 'right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).perform();
        WebElement editOption = driver.findElement(By.xpath("//span[text() = 'Edit']"));
        //editOption.click();
        actions.click(editOption).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@ondblclick = 'myFunction()']"));
        actions.doubleClick(doubleClickButton).perform();
        System.out.println(alert.getText());
        alert.accept();
    }
}
