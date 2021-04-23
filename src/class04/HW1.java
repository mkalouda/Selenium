package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Open chrome browser
        Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify Syntax Logo is displayed.*/
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement usernameTextBox = driver.findElement(By.cssSelector("input#txtUsername"));
        usernameTextBox.sendKeys("Admin");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        passwordTextBox.sendKeys("Hum@nhrm123");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        loginBtn.click();

        WebElement syntaxLogo = driver.findElement(By.cssSelector("img[alt *= 'Orange']"));
        boolean isSyntaxLogoDisplayed = syntaxLogo.isDisplayed();
        System.out.println(isSyntaxLogoDisplayed);

        driver.quit();

    }
}
