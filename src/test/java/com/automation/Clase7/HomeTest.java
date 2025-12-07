package com.automation.Clase7;

import com.automation.BaseTest;
import org.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void validarPaginaInicio(){
        //Instancia un objeto o sea la clase HomePage
        HomePage homePage = new HomePage(getDriver());

        //1. Abrir la pagina.
        getDriver().get("https://opencart.abstracta.us/");

        //2. Validar elementos de la Home.
        Assert.assertTrue(homePage.searchIsDisplayed(), "Search input no visible");
        Assert.assertTrue(homePage.carrouselIsdDisplayed(), "Carrousel no visible");
        Assert.assertTrue(homePage.navbarIsdDisplayed(), "Navbar no visible");
        Assert.assertTrue(homePage.myaccountDropdownIsdDisplayed(), "Dowdown no visible");

    }
}
