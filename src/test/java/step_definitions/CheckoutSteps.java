package step_definitions;

import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutSteps {

    private WebDriver driver = Hooks.driver;

    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Then("User already on checkout page")
    public void verifyCheckoutPage() {
        Assert.assertTrue(checkoutPage.verifyCheckoutPage());
    }

    @And("User inputs {string} as firstName, inputs {string} as lastName, and inputs {string} as postalCode")
    public void inputBuyerInformation(String firstName, String lastName, String postalCode)
            throws InterruptedException {
        checkoutPage.fillFirstName(firstName);
        checkoutPage.fillLastName(lastName);
        checkoutPage.fillPostalCode(postalCode);
        Thread.sleep(3000);
    }

    @And("User clicks continue button")
    public void clickContinueButton() throws InterruptedException {
        checkoutPage.clickContinueButton();
        Thread.sleep(3000);
    }
}
