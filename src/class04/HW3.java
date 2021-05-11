package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* HRMS Application Negative Login:
        Open chrome browser
        Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
        Enter valid username
        Leave password field empty
        Verify error message with text "Password cannot be empty" is displayed.*/
public class HW3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement usernameTextBox = driver.findElement(By.cssSelector("input#txtUsername"));
        usernameTextBox.sendKeys("Admin");
        Thread.sleep(3000);

        WebElement loginBtn = driver.findElement(By.cssSelector("input[value = 'LOGIN']"));
        loginBtn.click();
        Thread.sleep(3000);

        WebElement passwordCantBeEmpty = driver.findElement(By.cssSelector("span#spanMessage"));
        boolean isPasswordCantBeEmptyDisplayed =passwordCantBeEmpty.isDisplayed();
        System.out.println(isPasswordCantBeEmptyDisplayed);
        Thread.sleep(3000);

        driver.quit();
    }
}
