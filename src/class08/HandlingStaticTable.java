package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticTable {

    static String url ="http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
        System.out.println(rowData.size());
        Iterator<WebElement> iterator = rowData.iterator();
        while (iterator.hasNext()){
            WebElement row = iterator.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("---------------------------------------------------------");

        List<WebElement> colData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(colData.size());
        for (WebElement header:colData){
            String colText = header.getText();
            System.out.println(colText);
        }
    }
}
