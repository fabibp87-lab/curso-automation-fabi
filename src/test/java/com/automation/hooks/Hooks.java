package com.automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maxized");
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        options.addArguments("--ignore-certificate-errors");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown(){
        if (driver != null){
            //driver.close();//close cierra la ventana que se abrio pero no mata la conexion
            driver.quit();//Mata la conexion y cierra la ventana.
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }


}
