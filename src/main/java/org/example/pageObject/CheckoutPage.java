package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public static WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        CheckoutPage.driver = driver;
    }

    // Select element for verify user already on checkout page
    @FindBy(xpath = "//span[text()='Checkout: Your Information']")
    private WebElement displayCheckoutPage;

    // select element first name field
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    // select element last name field
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    // select element postal code field
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    // Select continue button
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    // ============================================================

    // verify user already on checkout page
    public boolean verifyCheckoutPage() {
        return displayCheckoutPage.isDisplayed();
    }

    // user fill first name field with string
    public void fillFirstName(String frstName) {
        firstName.sendKeys(frstName);
    }

    // user fill last name field with string
    public void fillLastName(String lstName) {
        lastName.sendKeys(lstName);
    }

    // user fill postal code field with string
    public void fillPostalCode(String pstlCode) {
        postalCode.sendKeys(pstlCode);
    }

    // Click continue button
    public void clickContinueButton() {
        continueButton.click();
    }
}
