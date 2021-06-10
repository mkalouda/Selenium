package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingPagination {

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        WebElement addEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployee.click();

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("Ali");
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("young");
        WebElement empIDField = driver.findElement(By.id("employeeID"));
        String empID = empIDField.getAttribute("value");
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();

        WebElement employeeList = driver.findElement(By.linkText("Employee List"));
        employeeList.click();

        boolean flag =true;
        while (flag){
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id= 'resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {
                String text = tableRows.get(i).getText();
                if (text.contains(empID)){
                    flag = false;
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id= 'resultTable']/tbody/tr["+i+"]/td[1]"));
                    checkBox.click();
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                    break;
                }
            }
            WebElement next = driver.findElement(By.linkText("Next"));
            next.click();
        }
    }
}
