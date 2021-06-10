package class12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utils.AdBlockExtension;
import utils.CommonMethods;

import java.util.List;

public class HWTC4 extends AdBlockExtension {

    public static void main(String[] args) {
       adBlock();
        driver.get("http://www.uitestpractice.com/");
        driver.manage().window().maximize();

        //dragAndDrop
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();

        //doubleClick
        WebElement doubleClickButton = driver.findElement(By.name("dblClick"));
        action.doubleClick(doubleClickButton).perform();
        Alert doubleClickAlert = driver.switchTo().alert();
        doubleClickAlert.accept();

        //iframe
        driver.switchTo().frame("iframe_a");
        WebElement nameTextBox = driver.findElement(By.id("name"));
        nameTextBox.sendKeys("munz");
        driver.switchTo().defaultContent();

        //click on home
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();

        //delete one user from table
        boolean flag = true;
        while (flag){
            List<WebElement> tablerows = driver.findElements(By.xpath("//table[@class ='table']/tbody/tr"));
            for (int i = 0; i < tablerows.size(); i++) {
                String rowText = tablerows.get(i).getText();
                if (rowText.contains("munz luda")){
                    flag=false;
                    List<WebElement> actionSection = driver.findElements(By.xpath("//table[@class ='table']/tbody/tr["+i+"]/td[4]"));
                    for (WebElement button:actionSection){
                        button.findElement(By.xpath("//button[text()='DELETE']")).click();
                    }
                    break;
                }
            }
            WebElement next = driver.findElement(By.xpath("//a[@rel='next']"));
            next.click();
        }

    }
}
