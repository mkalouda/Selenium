package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.surveymonkey.com/r/?sm=uQNn3rYKMcVS0Dyy6GTjSw%3D%3D");

        WebElement dropDown = driver.findElement(By.id("211154525"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Answer Choice A");
        select.selectByIndex(2);
        select.selectByValue("2657263885");

        // loop through all the options that are available
        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println("the size of the list is "+size);

        for(WebElement option:allOptions){
            System.out.println("the text of option is: "+option.getText());
        }
    }
}
