package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage{

    private By dropDownList = By.xpath("//select[@id='input-option226']");
    private By optionSelect = By.xpath("//option[contains(text(), 'Red')]");
    private By inputQty = By.xpath("//input[@id='input-quantity']");
    private By addToCartBtn = By.xpath("//button[@id='button-cart']");
    private By dropDownBtn = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
    private By viewCart = By.xpath("//strong[text()=' View Cart']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectOption(String cantidad){
        click(dropDownList);
        click(optionSelect);
        click(inputQty);
        sendKeys(this.inputQty, cantidad);
        click(addToCartBtn);
        click(dropDownBtn);
        click(viewCart);

    }

}
