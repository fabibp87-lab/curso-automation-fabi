package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage{

    private By selectProduct = By.xpath("//img[contains(@src, 'canon_eos_5d_1-228x228.jpg')]");

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public void goToProduct(){
        click(selectProduct);
    }
}
