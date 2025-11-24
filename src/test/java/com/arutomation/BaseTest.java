package com.arutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
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

    public WebDriver getDriver(){
        return driver;
    }

}
