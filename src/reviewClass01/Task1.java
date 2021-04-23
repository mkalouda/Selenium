package reviewClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        //enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click on login
        driver.findElement(By.name("login-button")).click();
        //click on backpack
        driver.findElement(By.className("inventory_item_name")).click();
        //add to cart
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        //go back a page
        driver.navigate().back();
        //click on dropdown
        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        Thread.sleep(2000);
        //click on about
        driver.findElement(By.linkText("ABOUT")).click();
        Thread.sleep(4000);
        //get Title
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is wrong");
        }
        //go back a page
        driver.navigate().back();
        Thread.sleep(2000);
        //click on shopping cart
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        //click checkout
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(4000);
        //click on dropdown
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        //click on logout
        driver.findElement(By.partialLinkText("LOG")).click();
    }
}
