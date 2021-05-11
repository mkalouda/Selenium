package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class HW  {

    static String url ="https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        checkbox.click();

        WebDriverWait wait1 = new WebDriverWait(driver,20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Remove']")));

        WebElement removeButton = driver.findElement(By.xpath("//button[text() = 'Remove']"));
        removeButton.click();

        WebElement removeText = driver.findElement(By.xpath("//*[@id ='message']"));
        String text = removeText.getText();
        System.out.println(text);
        if (text.equalsIgnoreCase("It's gone!")){
            System.out.println("text is correct");
        }else{
            System.out.println("text is wrong");
        }

        WebDriverWait wait2 = new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Enable']")));

        WebElement enableButton = driver.findElement(By.xpath("//button[text() = 'Enable']"));
        enableButton.click();
        boolean isEnableButtonEnabled = enableButton.isEnabled();
        System.out.println("Is the enable button enabled = "+isEnableButtonEnabled);

        //WebDriverWait waitText = new WebDriverWait(driver,20);
        //waitText.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'text']")));

        WebElement textBox = driver.findElement(By.xpath("//input[@type = 'text']"));
        textBox.sendKeys("Ready to launch!!");

        WebDriverWait wait3 = new WebDriverWait(driver,20);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Disable']")));

        WebElement disableButton = driver.findElement(By.xpath("//button[text() = 'Disable']"));
        disableButton.click();

        WebElement enabledText = driver.findElement(By.xpath("//*[@id ='message']"));
        boolean isEnabledTextEnabled = enabledText.isEnabled();
        if (!isEnabledTextEnabled){
            System.out.println("textbox is disabled");
        }else{
            System.out.println("textbox is enabled");
        }
    }
}
