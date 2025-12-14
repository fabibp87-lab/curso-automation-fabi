package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private By modelProduct = By.xpath("//td[text()='Product 3']");
    private By unitPrice = By.xpath("//td[text()='$80.00']");
    private By btnContinueShopping = By.xpath("//a[contains(@class, 'btn btn-default')]");

    public CartPage(WebDriver driver) {

        super(driver);
    }
    public boolean modelIsDisplayed(){
        return isDisplayed(modelProduct);
    }
    public boolean unitIsDisplayed(){
        return isDisplayed(unitPrice);
    }
    public boolean isBtnVisible(){
        return isDisplayed(btnContinueShopping);
    }


}
