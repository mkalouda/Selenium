package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HwRedo {
    public static void main(String[] args) {
        DriverMethods driverMethods = new DriverMethods();
        driverMethods.openDriver("https://the-internet.herokuapp.com/dynamic_controls");
        driverMethods.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driverMethods.driver, 20);

        WebElement checkbox = driverMethods.driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        checkbox.click();

        WebElement removeButton = driverMethods.driver.findElement(By.xpath("//button[text() = 'Remove']"));
        removeButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id ='message']")));

        WebElement removeText = driverMethods.driver.findElement(By.xpath("//*[@id ='message']"));
        String text = removeText.getText();
        System.out.println("The text that is displayed is : "+text);
        if (text.equalsIgnoreCase("It's gone!")){
            System.out.println("correct text is displayed");
        }else{
            System.out.println("wrong text is displayed");
        }

        WebElement enableButton = driverMethods.driver.findElement(By.xpath("//button[text() = 'Enable']"));
        enableButton.click();

        WebElement textbox = driverMethods.driver.findElement(By.xpath("//input[@type='text']"));
        boolean isTextboxEnabled = textbox.isEnabled();
        System.out.println("Is the textbox enabled = "+isTextboxEnabled);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        WebElement itsEnabledText = driverMethods.driver.findElement(By.id("message"));
        System.out.println(itsEnabledText.getText());
        textbox.sendKeys("Ready to launch!!");

        WebElement disableButton = driverMethods.driver.findElement(By.xpath("//button[text() = 'Disable']"));
        disableButton.click();
        isTextboxEnabled = textbox.isEnabled();
        System.out.println("Is the textbox enabled = "+isTextboxEnabled);

        driverMethods.quitDriver();
    }
}
