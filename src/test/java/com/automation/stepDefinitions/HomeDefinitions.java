package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.automation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomeDefinitions {

    private HomePage homePage;

    public HomeDefinitions() {
        homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la home")
    public void queElUsuarioIngresaALaHome(){
        WebDriver driver = Hooks.getDriver();
        driver.get("https://opencart.abstracta.us/");

    }

    @Entonces("la pantalla de la home se muestra correctamente")
    public void laPantallaDeLaHomeSeMuestraCorrectamente(){
        Assert.assertTrue(homePage.searchIsDisplayed(), "Search input no visible");
        Assert.assertTrue(homePage.carrouselIsdDisplayed(), "Carrousel no visible");
        Assert.assertTrue(homePage.navbarIsdDisplayed(), "Navbar no visible");
        Assert.assertTrue(homePage.myaccountDropdownIsdDisplayed(), "Dowdown no visible");
    }

    @Entonces("se muestra correctamente el carrousel")
    public void seMuestraCorrectamenteElCarrousel() {

    }
}
