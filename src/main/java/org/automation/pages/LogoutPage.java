package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {

    private By msnLogout = By.xpath("//p[contains(text(),'You have been logged off your account')]");

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public boolean messageIsDisplayed() {
        return isDisplayed(msnLogout);
    }
}
