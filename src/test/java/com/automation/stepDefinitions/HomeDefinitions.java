package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.automation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomeDefinitions {

    private HomePage homePage;

    public HomeDefinitions() {
        homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la home")
    public void queElUsuarioIngresaALaHome() {
        WebDriver driver = Hooks.getDriver();
        driver.get(Hooks.getProperty("url"));
    }

    @Entonces("la pantalla de la home se muestra correctamente")
    public void laPantallaDeLaHomeSeMuestraCorrectamente() {
        Assert.assertTrue(homePage.searchIsDisplayed(), "Search input no visible");
        Assert.assertTrue(homePage.carrouselIsDisplayed(), "Carrousel no visible");
        Assert.assertTrue(homePage.navbarIsDisplayed(), "Navbar no visible");
        Assert.assertTrue(homePage.myAccountDropdownIsDisplayed(), "Dropdown no visible");
    }

    @Y("el usuario ingresa a registrar una cuenta")
    public void elUsuarioIngresaARegistrarUnaCuenta() {
        homePage.goToRegister();
    }

    @Y("el usuario ingresa al login")
    public void elUsuarioIngresaAlLogin() {
        homePage.goToLogin();
    }
}
