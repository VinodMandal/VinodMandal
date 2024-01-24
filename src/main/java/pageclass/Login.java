package pageclass;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class Login extends Base {

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[@class = \"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
    WebElement button;



    public Login() throws FileNotFoundException {
        PageFactory.initElements(driver, this);

    }

    public void loginpage(){

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        button.click();

    }



}
