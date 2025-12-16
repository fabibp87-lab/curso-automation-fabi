package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.automation.pages.LogoutPage;
import org.automation.pages.MyAccountPage;
import org.testng.Assert;

public class LogoutDefinitions {

    private MyAccountPage myAccountPage;
    private LogoutPage logoutPage;

    public LogoutDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.logoutPage = new LogoutPage(Hooks.getDriver());
    }

    @Cuando("el usuario Cierra Sesion")
    public void elUsuarioCierraSesion() {
        myAccountPage.goToLogout();
    }

    @Entonces("se verifica que muestra un mensaje")
    public void seVerificaQueMuestraUnMensaje() {
       Assert.assertTrue(logoutPage.messageIsDisplayed());
    }

}
