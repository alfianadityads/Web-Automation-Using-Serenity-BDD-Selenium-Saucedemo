package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        LoginPage.driver = driver;
    }

//    select element user_name
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

//    select element password
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

//    click login button
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement buttonLogin;


//    Verify user already in landing page
    public boolean verifyLandingPage() {
        return userName.isDisplayed();
    }


//    fill user_name field with string
    public void setUserName(String usrName) {
        userName.sendKeys(usrName);
    }

//    fill password field with string
    public  void setPassword(String pswrd) {
        password.sendKeys(pswrd);
    }

//    click button login
    public void clickButtonLogin() {
        buttonLogin.click();
    }
}
