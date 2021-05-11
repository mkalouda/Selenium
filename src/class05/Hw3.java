package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        WebElement categoriesDD = driver.findElement(By.id("gh-cat"));
        Select select = new Select(categoriesDD);

        List<WebElement> allOptions = select.getOptions();
        for(WebElement options:allOptions){
            String optionsText = options.getText();
            System.out.println(optionsText);
        }
        Thread.sleep(1000);

        select.selectByValue("58058");
        Thread.sleep(1000);

        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();
        Thread.sleep(1000);

        WebElement computersTabletsNetworkHeader =
                driver.findElement(By.xpath("//span[@class = 'b-pageheader__text']"));
        boolean isComputersTabletsNetworkHeaderDisplayed = computersTabletsNetworkHeader.isDisplayed();
        System.out.println(isComputersTabletsNetworkHeaderDisplayed);

        driver.quit();


    }
}
