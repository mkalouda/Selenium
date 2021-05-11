package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement newAccountBtn = driver.findElement(By.xpath("//a[contains(text(), 'Create New')]"));
        newAccountBtn.click();
        Thread.sleep(1000);

        WebElement firstNameTextBox = driver.findElement(By.name("firstname"));
        firstNameTextBox.sendKeys("yo");
        Thread.sleep(1000);

        WebElement lastNameTextBox = driver.findElement(By.name("lastname"));
        lastNameTextBox.sendKeys("Smith");
        Thread.sleep(1000);

        WebElement emailTextBox = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
        emailTextBox.sendKeys("msdfsd@googl.com");
        Thread.sleep(1000);

        WebElement passwordTextBox = driver.findElement(By.id("password_step_input"));
        passwordTextBox.sendKeys("123");
        Thread.sleep(1000);

        WebElement bdayMonthDD = driver.findElement(By.id("month"));
        Select monthSelect = new Select(bdayMonthDD);
        monthSelect.selectByVisibleText("Oct");
        Thread.sleep(1000);

        WebElement bdayDay = driver.findElement(By.id("day"));
        Select daySelect = new Select(bdayDay);
        daySelect.selectByValue("30");
        Thread.sleep(1000);

        WebElement bdayYear = driver.findElement(By.id("year"));
        Select yearSelect = new Select(bdayYear);
        yearSelect.selectByValue("1990");
        Thread.sleep(1000);

        List<WebElement> optionCheckBoxes = driver.findElements(By.xpath("//input[@name = 'sex']"));
        for(WebElement optionCheckBox:optionCheckBoxes){
            String checkBox = optionCheckBox.getAttribute("value");
            if(checkBox.equalsIgnoreCase("2")){
                Thread.sleep(1000);
                optionCheckBox.click();
                break;
            }
        }
        driver.quit();
    }
}
