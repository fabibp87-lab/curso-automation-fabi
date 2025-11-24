package com.arutomation.Clase7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTestv1 {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maxized");
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        this.driver = new ChromeDriver(options);
    }
    @AfterMethod
    public void tearDown(){
        if (driver != null){
            //driver.close();//close cierra la ventana que se abrio pero no mata la conexion
            driver.quit();//Mata la conexion y cierra la ventana.
        }
    }

    @Test
    public void validarPaginaInicio(){
        //1. Abrir la pagina.
        driver.get("https://opencart.abstracta.us/");

        //2. Validar Home.
        By searchInput = By.xpath("//input[@name=\"search\"]");
        By carrousel = By.xpath("//div[@id=\"slideshow0\"]");
        By navbar = By.xpath("//nav[@id=\"menu\"]");
        By myaccountDropdown = By.xpath("//li/a[@title=\"My Account\"]");

        WebElement searchInputEl = driver.findElement(searchInput);
        WebElement carrouselEl = driver.findElement(carrousel);
        WebElement navbarEl = driver.findElement(navbar);
        WebElement myaccountDropdownEl = driver.findElement(myaccountDropdown);

        Assert.assertTrue(searchInputEl.isDisplayed(), "Search input no visible");
        Assert.assertTrue(carrouselEl.isDisplayed(), "Carrousel no visible");
        Assert.assertTrue(navbarEl.isDisplayed(), "Navbar no visible");
        Assert.assertTrue(myaccountDropdownEl.isDisplayed(), "Dowdown no visible");

    }
}
