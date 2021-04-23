package reviewClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxtechs.com/selenium-practice/basic-first-form-demo.php");

        driver.findElement(By.cssSelector("input[id = 'user-message']")).sendKeys("hello");

        driver.findElement(By.xpath("//button[text() = 'Show Message']")).click();

        WebElement text = driver.findElement(By.cssSelector("span#display"));
        String name;
        name=text.getText();
        System.out.println("inputted name is "+ name);
        if(name.equalsIgnoreCase("tom")){
            System.out.println("it matches!!");
        }else{
            System.out.println("it doesnt match!");
        }

        driver.findElement(By.cssSelector("input[id*='m1']")).sendKeys("100");

        driver.findElement(By.cssSelector("input[id$='m2']")).sendKeys("55");

        driver.findElement(By.cssSelector("button[onclick^='return']")).click();

        WebElement value = driver.findElement(By.cssSelector("span[id*='value']"));
        if(value.getText().equalsIgnoreCase("155")){
            System.out.println("value matches");
        }else{
            System.out.println("value does not match");
        }

    }
}
