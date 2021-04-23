package reviewClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.bbc.com/";
        driver.get(url);
        Thread.sleep(2000);
        //click on sign in
        driver.findElement(By.xpath("//a[@id = 'idcta-link']")).click();
        //click on register
        driver.findElement(By.xpath("//span[text() = 'Register now']")).click();
        Thread.sleep(2000);
        //click 16over button
        driver.findElement(By.xpath("//span[starts-with(text(), '16')]")).click();
        Thread.sleep(2000);
        //input day
        driver.findElement(By.xpath("//input[starts-with(@id, 'day')]")).sendKeys("20");
        Thread.sleep(2000);
        //input month
        driver.findElement(By.xpath("//input[starts-with(@id, 'month')]")).sendKeys("12");
        Thread.sleep(2000);
        //input year
        driver.findElement(By.xpath("//input[starts-with(@id, 'year')]")).sendKeys("1990");
        Thread.sleep(2000);
    }
}
