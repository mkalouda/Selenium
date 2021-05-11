package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

        WebElement redCheckBox = driver.findElement(By.xpath("//input[@type = 'checkbox'][@value = 'red']"));

        boolean redCheckBoxIsEnabled = redCheckBox.isEnabled();
        System.out.println("is red check box enabled? "+redCheckBoxIsEnabled);
        boolean redCheckBoxIsSelected = redCheckBox.isSelected();
        System.out.println("is red check box selected? "+redCheckBoxIsSelected);

        Thread.sleep(2000);
        redCheckBox.click();
        redCheckBoxIsSelected = redCheckBox.isSelected();
        System.out.println("is red check box selected? "+redCheckBoxIsSelected);

        List<WebElement> colorCheckBoxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("number of check boxes "+ colorCheckBoxes.size());

        //select yellow, orange, and purple

        for(WebElement colorCheckBox:colorCheckBoxes){
            String checkBox = colorCheckBox.getAttribute("value");
            if (checkBox.equalsIgnoreCase("yellow") || checkBox.equalsIgnoreCase("purple") ){
                colorCheckBox.click();

            }

        }
    }
}
