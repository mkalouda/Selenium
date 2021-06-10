package utils;

import org.openqa.selenium.WebElement;
import testbase.BaseClass;

public class CommonMethods extends BaseClass {

    /**
     * this method will clear a textbox and send text
     * @param element
     * @param text
     */
    public void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }
}
