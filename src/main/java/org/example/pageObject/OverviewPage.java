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

    // ============================================================

    // verify user already on checkout overview page
    public boolean verifyOverviewPage() {
        return displayOverviewPage.isDisplayed();
    }
}
