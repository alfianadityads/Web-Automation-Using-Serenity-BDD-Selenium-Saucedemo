package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    public static WebDriver driver;

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        OverviewPage.driver = driver;
    }
}
