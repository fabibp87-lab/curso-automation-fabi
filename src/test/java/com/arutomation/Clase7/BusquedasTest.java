package com.arutomation.Clase7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BusquedasTest {
   private WebDriver driver;
   @BeforeMethod
    public void setup(){
       ChromeOptions options = new ChromeOptions();

       //Sirve para abrir la pagina en la maxima resolucion o sea abre toda la ventana.
       options.addArguments("start-maxized");

       //Sirve para abrir en incognito
       options.addArguments("incognito");

   }

}
