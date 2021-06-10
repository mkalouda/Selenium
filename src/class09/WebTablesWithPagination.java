package class09;

import class08.DriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesWithPagination {
    public static void main(String[] args) {
        DriverMethods driverMethods = new DriverMethods();
        driverMethods.openDriver("http://syntaxtechs.com/selenium-practice/table-pagination-demo.php");
        List<WebElement> tableRows = driverMethods.driver.findElements(By.xpath("//table[@class = 'table table-hover']/tbody/tr"));
        WebElement nextButton = driverMethods.driver.findElement(By.xpath("//a[@class = 'next_link']"));
        boolean flag = true;
        while (flag){
            for (WebElement tableRow:tableRows){
                String rowText = tableRow.getText();
                if (rowText.contains("Archy J")){
                    flag=false;
                    System.out.println(rowText);
                    break;
                }
            }
            nextButton.click();
        }
    }
}
