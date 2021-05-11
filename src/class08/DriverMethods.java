package class08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
    public WebDriver driver;

    public void openDriver(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public void quitDriver(){
        driver.quit();
    }

    public void closeDriver(){
        driver.close();
    }

}
