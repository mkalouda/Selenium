package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://material-ui.com/components/radio-buttons/");

        List<WebElement> firstGender = driver.findElements(By.xpath("//input[@name='gender1']"));

        for (WebElement gender:firstGender){
            String value = gender.getAttribute("value");
            if (value.equalsIgnoreCase("male")){
                gender.click();
            }

            if(!gender.isEnabled()){
                System.out.println("there is a disabled radio button");
            }
        }
    }
}
