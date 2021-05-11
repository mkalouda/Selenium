package reviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://swagger.io/tools/swaggerhub/";
        driver.get(url);
        //get the handle for parent window
        String homePageHandle = driver.getWindowHandle();
        System.out.println("The handle for our homepage is "+ homePageHandle);

        WebElement link1 = driver.findElement(By.xpath("//a[@href='https://bitbar.com/?utm_medium=referral&utm_source=swagger.io&utm_campaign=footer']"));
        link1.click();
        //click on some icon on the new tab
        Set<String> allHandles = driver.getWindowHandles();
        Iterator<String> it = allHandles.iterator();
        homePageHandle= it.next();
        String link1Handle= it.next();
        System.out.println("The handle for link1 is "+link1Handle);
        //switch to the child tab and click on link
        driver.switchTo().window(link1Handle);
        WebElement youtubeLink = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/BitbarChannel/']"));
        youtubeLink.click();

        //get the link2 window handle
        allHandles = driver.getWindowHandles();
        it = allHandles.iterator();

        int handle =2;
        String value="";
        for (int i = 0; it.hasNext(); i++) {
            value = it.next();
            if (i==handle){
                String youtubehandle =value;
                System.out.println("This is 2nd link handle "+ youtubehandle);
                break;
            }
        }
    }
}
