package step_definitions;

import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CartSteps {

    private WebDriver driver = Hooks.driver;

    CartPage cartPage = new CartPage(driver);

    @When("User already on cart page")
    public void verifyCartPage() {
        Assert.assertTrue(cartPage.verifyCartPage());
    }

    @And("User clicks remove product Test.allTheThings T-Shirt Red")
    public void removeProduct() {
        cartPage.clickRemoveProduct();
    }

    @And("User clicks checkout button")
    public void clickButtonCheckout() {
        cartPage.clickCheckout();
    }
}
