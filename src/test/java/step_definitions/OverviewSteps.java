package step_definitions;

import org.example.pageObject.OverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OverviewSteps {

    private WebDriver driver = Hooks.driver;

    OverviewPage overviewPage = new OverviewPage(driver);

    @Then("User already on checkout overview page")
    public void verifyOverviewPage() {
        Assert.assertTrue(overviewPage.verifyOverviewPage());
    }

    @When("User verifies that Sauce Labs Onesie as a product in the checkout list")
    public void verifySelectedProduct() {
        Assert.assertTrue(overviewPage.verifyCheckoutPrdct());
    }

    @And("User verifies the total price of item is {string}")
    public void verifyTotalPriceMatched(String totalPrice) throws InterruptedException {
        Assert.assertEquals(totalPrice, overviewPage.verifyTotalPrc());
        Thread.sleep(2000);
    }

    @Then("User already on Checkout: Complete! page")
    public void verifyFinishOrder() throws InterruptedException {
        Assert.assertTrue(overviewPage.verifyFinishOrdr());
        Thread.sleep(2000);
    }
}
