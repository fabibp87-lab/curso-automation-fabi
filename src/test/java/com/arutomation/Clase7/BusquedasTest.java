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
import org.testng.asserts.Assertion;

import java.time.Duration;

public class BusquedasTest {
   private WebDriver driver;
   @BeforeMethod
    public void setup(){
       ChromeOptions options = new ChromeOptions();

       //Sirve para abrir la pagina en la maxima resolucion o sea abre toda la ventana.
       options.addArguments("start-maxized");

       //Sirve para abrir en incognito
       options.addArguments("incognito");

       //Esto se usa en servidor. No se va a abrir una ventana sino por consola.A la vista no se ve.
       //options.addArguments("headless");

       //Indica cuanto va a esperar selenium en que abra la pagina.
       options.setPageLoadTimeout(Duration.ofSeconds(60));

       //Pasar la ruta al binario del driver
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");


       //Pasamos las opciones anteriores o sea las instanciamos.
       this.driver = new ChromeDriver(options);

       //todo lo anterior es una configuracion basica del driver


   }

   @AfterMethod
    public void tearDown(){
       if (driver != null){
           //driver.close();//close cierra la ventana que se abrio pero no mata la conexion
           driver.quit();//Mata la conexion y cierra la ventana.
       }
   }

   @Test
    public void busquedaProductoTest(){
       //1. Abrir la pagina.
       driver.get("https://opencart.abstracta.us/");

       //2. Realizar la busqueda
       By searchInput = By.xpath("//input[@name=\"search\"]");
       //By searchInput = By.name("search"); //esto es con name y el anterior con xpath.
       // Estao opcion anterior es valida si el name es unico.

       //Variable del boton
       By searchButton = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");

       //Busqueda del elemento
       WebElement searchInputEl = driver.findElement(searchInput);
       WebElement searchBtnEl = driver.findElement(searchButton);

       //podemos hacer primero la busqueda de los elementos anteriores y despues buscar esos elementos

       //Si lo anterior es correcto, ingresamos la palabra "Iphone".
       //Interactuamos.
       searchInputEl.sendKeys("iphone");

       //Hacemos click en el boton
       searchBtnEl.click();


       //3.Verificar el esperado (assertion)

       By titleSearch = By.xpath("//h1[text()=\"Search - iphone\"]");

       WebElement titleSearchEl = driver.findElement(titleSearch);

       Assert.assertEquals(titleSearchEl.getText(),"Search - iphone","Los titulos no coinciden");


   }

}
