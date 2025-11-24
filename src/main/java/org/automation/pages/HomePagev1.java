package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagev1 {

    private By searchInput = By.xpath("//input[@name=\"search\"]");
    private By searchButton = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");
    private By carrousel = By.xpath("//div[@id=\"slideshow0\"]");
    private By navbar = By.xpath("//nav[@id=\"menu\"]");
    private By myaccountDropdown = By.xpath("//li/a[@title=\"My Account\"]");

    private WebDriver driver;

    public HomePagev1(WebDriver driver){
        this.driver = driver;
    }

    public boolean searchIsDisplayed(){
        WebElement element = driver.findElement(searchInput);
        return element.isDisplayed();
    }

    public boolean ButtonIsDisplayed(){
        WebElement element = driver.findElement(searchButton);
        return element.isDisplayed();
    }

    public boolean carrouselIsdDisplayed(){
        WebElement element = driver.findElement(carrousel);
        return element.isDisplayed();
    }

    public boolean navbarIsdDisplayed(){
        WebElement element = driver.findElement(navbar);
        return element.isDisplayed();
    }
    public boolean myaccountDropdownIsdDisplayed(){
        WebElement element = driver.findElement(myaccountDropdown);
        return element.isDisplayed();
    }

    public void search(String text){
        WebElement searchEl = driver.findElement(searchInput);//busqueda de elemento en la pagina
        WebElement searchBtnEl = driver.findElement(searchButton);

        searchEl.sendKeys(text);//elemento envia un texto
        searchBtnEl.click();

    }

}
