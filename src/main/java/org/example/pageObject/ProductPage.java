package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    public static WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        ProductPage.driver = driver;
    }

    // Select element to verify user already in product page
    @FindBy(xpath = "//span[@class='title']")
    private WebElement productPageVerif;

    // Select element for sorting product
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectSorting;

    // Select element button cart
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement buttonCart;

    // Verify user already in product page
    public boolean verifyProductPage() {
        return productPageVerif.isDisplayed();
    }

    // Sorting product
    public void sortProduct(String sortBy) {
        Select sorting = new Select(selectSorting);
        sorting.selectByVisibleText(sortBy);
    }

    // Click spesific product in product page to cart
    public void productClick(String productName) {
        String productElement = "//div[text()[contains(.,'" + productName
                + "')]]/ancestor::div[@class='inventory_item_description']//*[contains(@id,'add-to-cart')]";
        driver.findElement(By.xpath(productElement)).click();
    }

    // Click cart button
    public void clickCart() {
        buttonCart.click();
    }
}
