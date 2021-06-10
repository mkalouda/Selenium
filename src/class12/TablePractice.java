package class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.AdBlockExtension;

import java.util.List;

public class TablePractice extends AdBlockExtension {
    public static void main(String[] args) {
        adBlock();

        driver.get("http://www.uitestpractice.com/");

        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();

        boolean flag = true;
        while (flag){
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class ='table']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {
                String rowText = tableRows.get(i).getText();
                if (rowText.contains("munz luda")){
                    flag=false;
                    WebElement actionSection = driver.findElement(By.xpath("//table[@class ='table']/tbody/tr["+i+"]/td[4]"));

                    //actionSection.findElement(By.xpath("//button[text()='DELETE']")).click();
                    break;
                }
            }
            WebElement next = driver.findElement(By.xpath("//a[@rel='next']"));
            next.click();
        }
    }
}
