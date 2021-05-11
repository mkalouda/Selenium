package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement newAccountBtn = driver.findElement(By.xpath("//a[contains(text(), 'Create New')]"));
        newAccountBtn.click();
        Thread.sleep(1000);

        WebElement monthDD = driver.findElement(By.id("month"));
        Select monthSelect = new Select(monthDD);
        List<WebElement> monthOptions = monthSelect.getOptions();
        int monthSize = monthOptions.size();
        System.out.println(monthSize);
        Thread.sleep(1000);

        WebElement dayDD = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDD);
        List<WebElement> dayOptions = daySelect.getOptions();
        int daySize = dayOptions.size();
        System.out.println(daySize);
        Thread.sleep(1000);

        WebElement yearDD = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDD);
        List<WebElement> yearOptions = yearSelect.getOptions();
        int yearSize = yearOptions.size();
        System.out.println(yearSize);
        Thread.sleep(1000);

        driver.quit();
    }
}
