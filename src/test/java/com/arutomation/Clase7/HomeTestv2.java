package com.arutomation.Clase7;

import org.automation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTestv2 {

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
        //Instancia un objeto o sea la clase HomePage
        HomePage homePage = new HomePage(driver);


        //1. Abrir la pagina.
        driver.get("https://opencart.abstracta.us/");

        //2. Validar elementos de la Home.
        Assert.assertTrue(homePage.searchIsDisplayed(), "Search input no visible");
        Assert.assertTrue(homePage.carrouselIsdDisplayed(), "Carrousel no visible");
        Assert.assertTrue(homePage.navbarIsdDisplayed(), "Navbar no visible");
        Assert.assertTrue(homePage.myaccountDropdownIsdDisplayed(), "Dowdown no visible");

    }
}
