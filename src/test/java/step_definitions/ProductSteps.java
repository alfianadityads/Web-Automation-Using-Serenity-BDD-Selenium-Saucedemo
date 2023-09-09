package step_definitions;

import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductSteps {

    private WebDriver driver = Hooks.driver;

    ProductPage productPage = new ProductPage(driver);

    @And("User already on product page")
    public void verifyProductPage() {
        Assert.assertTrue(productPage.verifyProductPage());
    }

    @And("User sorts products by {string}")
    public void sortProduct(String sortBy) {
        productPage.sortProduct(sortBy);
    }

    @And("User clicks add products {string} and {string} to cart")
    public void clickProduct(String product1, String Product2) {
        productPage.productClick(product1);
        productPage.productClick(Product2);
    }

    @Then("User clicks cart button")
    public void clickCart() {
        productPage.clickCart();
    }

}
