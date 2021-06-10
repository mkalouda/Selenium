package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class AdBlockExtension {

    public static WebDriver driver;

    public static void adBlock(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("/Users/mariamosman/Downloads/AdBlock –-der-beste-Ad-Blocker_v4.33.0.crx"));
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
        driver = new ChromeDriver(desiredCapabilities);
    }
}
