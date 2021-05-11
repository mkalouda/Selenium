package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php");

        WebElement firstFrame = driver.findElement(By.name("FrameOne"));
        driver.switchTo().frame(firstFrame);

        WebElement firstFrameHeader = driver.findElement(By.className("navbar-header"));
        String headerText = firstFrameHeader.getText();
        boolean isFirstNameHeaderDisplayed = firstFrameHeader.isDisplayed();
        if (isFirstNameHeaderDisplayed && headerText.equalsIgnoreCase("AUTOMATION TESTING PLATFORM BY SYNTAX")){
            System.out.println("AUTOMATION TESTING PLATFORM BY SYNTAX is displayed");
        }else{
            System.out.println("AUTOMATION TESTING PLATFORM BY SYNTAX is Not displayed");
        }
        driver.switchTo().defaultContent();

        driver.switchTo().frame("FrameTwo");
        WebElement enrollBtn = driver.findElement(By.className("enroll-btn"));
        boolean isEnrollBtnEnabled = enrollBtn.isEnabled();
        System.out.println(isEnrollBtnEnabled);
        driver.switchTo().defaultContent();

    }
}
