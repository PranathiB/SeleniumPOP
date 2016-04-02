package pages;

import controls.Button;
import controls.TextBox;
import controls.UIElement;
import org.openqa.selenium.WebDriver;
import models.UserLoginDetails;

public class LoginPage {

    private WebDriver driver;

    private TextBox emailTextBox(){
        return new TextBox(driver,"email");
    }

    private TextBox passwordTextBox(){
        return new TextBox(driver,"password");
    }

    private Button loginButton(){
        return new Button(driver,"signInButton");
    }

    private UIElement errorMessage() {
        return new UIElement(driver,"errors1");
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage open(){
        driver.get("https://www.cleartrip.com/signin");
        return this;
    }

    public LoginPage fillDetails(UserLoginDetails userLoginDetails) {
        emailTextBox().fill(userLoginDetails.getEmail());
        passwordTextBox().fill(userLoginDetails.getPassword());
        return this;
    }

    public LoginPage clickLogin() {
        loginButton().click();
        return this;
    }

    public LoginPage assertIsShowingLoginError() {
        errorMessage().assertContains("There were errors in your submission\n" +
                "The username or password you entered is incorrect.");
//        passwordTextBox().assertHasCSSClass("form-error");
        return this;
    }

}
