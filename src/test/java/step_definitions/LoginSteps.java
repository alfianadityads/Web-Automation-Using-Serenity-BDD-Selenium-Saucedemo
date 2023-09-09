package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private WebDriver driver = Hooks.driver;

    LoginPage loginPage = new LoginPage(driver);

    @Given("User already on website saucedemo.com")
    public void verifyLoginPage() {
        Assert.assertTrue(loginPage.verifyLandingPage());
    }

    @When("User inputs {string} as userName and inputs {string} as password, and clicks login button")
    public void inputCredential(String usrName, String pswd) {
        loginPage.setUserName(usrName);
        loginPage.setPassword(pswd);
        loginPage.clickButtonLogin();
    }
}
