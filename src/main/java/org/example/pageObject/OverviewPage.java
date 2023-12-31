package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    public static WebDriver driver;

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        OverviewPage.driver = driver;
    }

    // Select element for verify user already on overview page
    @FindBy(xpath = "//span[text()='Checkout: Overview']")
    private WebElement displayOverviewPage;

    // select product for verify what product wanna checkout
    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
    private WebElement verifyCheckoutProduct;

    // select element user verify total product price
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement verifyTotalPrice;

    // select button finish order
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement buttonFinish;

    // select order complete verification
    @FindBy(xpath = "//span[text()='Checkout: Complete!']")
    private WebElement verifyFinishOrder;

    // ============================================================

    // verify user already on checkout overview page
    public boolean verifyOverviewPage() {
        return displayOverviewPage.isDisplayed();
    }

    // user verifies which product to checkout
    public boolean verifyCheckoutPrdct() {
        return verifyCheckoutProduct.isDisplayed();
    }

    // user verify total product price
    public String verifyTotalPrc() {
        return verifyTotalPrice.getText().replace("Total: ", "");
    }

    // click finish button
    public void clickFinish() {
        buttonFinish.click();
    }

    // verify user finish oder
    public boolean verifyFinishOrdr() {
        return verifyFinishOrder.isDisplayed();
    }
}
