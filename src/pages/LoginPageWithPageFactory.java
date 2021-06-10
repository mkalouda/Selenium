package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@id ='txtPassword']")
    public WebElement passwordTextBox;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

    /*@FindBy(xpath = "//table[@id='resultTable']/tbody/tr")
    public List<WebElement> tableRows;*/

    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }
}
