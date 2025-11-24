package com.arutomation.Clase7;

import com.arutomation.BaseTest;
import org.automation.pages.HomePage;
import org.automation.pages.ResultadoDeBusquedaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BusquedasTest extends BaseTest {

   @Test
    public void busquedaProductoTest(){

       HomePage homePage = new HomePage(getDriver());
       ResultadoDeBusquedaPage resultadoDeBusquedaPage = new ResultadoDeBusquedaPage(getDriver());

       //1. Abrir la pagina.
       getDriver().get("https://opencart.abstracta.us/");

       //2. Realizar la busqueda
       homePage.search("iphone");

       //3.Verificar el esperado (assertion)
       Assert.assertEquals(resultadoDeBusquedaPage.getTitle(),"Search - iphone","Los titulos no coinciden");
   }

}
