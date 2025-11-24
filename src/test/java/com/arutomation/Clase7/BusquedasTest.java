package com.arutomation.Clase7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

}
