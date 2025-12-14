package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

    private By title = By.xpath("//h2[text()=\"My Account\"]");
    private By myAccountDropdown = By.xpath("//li/a[@title=\"My Account\"]");
    private By logoutDropdown = By.xpath("//li/a[text()=\"Logout\"]");
    private By cameras = By.xpath("//a[contains(@href, 'http://opencart.abstracta.us:80/index.php?route=product/category&path=33')]");


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean titleIsDisplayed() {
        return isDisplayed(title);
    }

    public void goToLogout() {
        click(myAccountDropdown);
        click(logoutDropdown);
    }

    public void goToCamara(){
        click(cameras);
    }
}
