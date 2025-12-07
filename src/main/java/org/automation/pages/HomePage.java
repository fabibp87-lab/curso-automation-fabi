package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private By searchInput = By.xpath("//input[@name=\"search\"]");
    private By searchButton = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");
    private By carrousel = By.xpath("//div[@id=\"slideshow0\"]");
    private By navbar = By.xpath("//nav[@id=\"menu\"]");
    private By myaccountDropdown = By.xpath("//li/a[@title=\"My Account\"]");
    private By loginDropdown = By.xpath("//li/a[text()=\"Login\"]");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean searchIsDisplayed(){
        return isDisplayed(searchInput);
    }

    public boolean ButtonIsDisplayed(){
        return isDisplayed(searchButton);
    }

    public boolean carrouselIsdDisplayed(){
        return isDisplayed(carrousel);
    }

    public boolean navbarIsdDisplayed(){
        return isDisplayed(navbar);
    }
    public boolean myaccountDropdownIsdDisplayed(){
        return isDisplayed(myaccountDropdown);
    }

    public void search(String text){
        sendKeys(searchInput, text);
        click(searchButton);
    }
    public void goToLogin() {
        click( myaccountDropdown);
        click(loginDropdown);
    }
}
