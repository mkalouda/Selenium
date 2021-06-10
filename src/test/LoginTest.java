package test;

import pages.LoginPage;
import testbase.BaseClass;

public class LoginTest {
    public static void main(String[] args) {
        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.sendText(loginPage.userNameField, "Admin");
        loginPage.sendText(loginPage.passwordField,"Hum@nhrm123" );
        //loginPage.userNameField.sendKeys("Admin");
        //loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();
        //BaseClass.tearDown();
    }
}
