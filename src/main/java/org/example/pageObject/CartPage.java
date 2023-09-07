package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        CartPage.driver = driver;
    }

    // select element for verify user already in cart page
    @FindBy(xpath = "//div[@class='cart_desc_label']")
    private WebElement displayCartPage;

    // Select element to remove spesific product
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement buttonRemoveProduct;

    // Select button to checkout
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckout;

    // ================================================================

    // Verify user already in cart page
    public boolean verifyCartPage() {
        return displayCartPage.isDisplayed();
    }

    // Remove spesific product
    public void clickRemoveProduct() {
        buttonRemoveProduct.click();
    }

    // Click button checkout product
    public void clickCheckout() {
        buttonCheckout.click();
    }
}
