package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php");

        WebElement mulDropDown = driver.findElement(By.xpath("//select[@name='States']"));

        Select select = new Select(mulDropDown);

        boolean isMultiple = select.isMultiple();
        System.out.println("is the dropdown multiple? "+ isMultiple);

        // select cali amd ohio
        select.selectByValue("California");
        Thread.sleep(2000);
        select.selectByValue("Ohio");
        Thread.sleep(2000);

        select.deselectByVisibleText("Ohio");
        Thread.sleep(2000);
        select.deselectAll();
    }
}
