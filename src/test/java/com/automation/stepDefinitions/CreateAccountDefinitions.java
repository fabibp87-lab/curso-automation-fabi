package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.apache.commons.lang.RandomStringUtils;
import org.automation.pages.CreateAccountPage;
import org.automation.pages.CreatedAccountPage;
import org.testng.Assert;

public class CreateAccountDefinitions {


    private CreateAccountPage createAccountPage;
    private CreatedAccountPage createdAccountPage;

    public CreateAccountDefinitions() {
        this.createAccountPage = new CreateAccountPage(Hooks.getDriver());
        this.createdAccountPage = new CreatedAccountPage(Hooks.getDriver());
    }

    @Cuando("el usuario crea la cuenta")
    public void elUsuarioCreaLaCuenta() {
        String emailRandom = String.format("%s@gmail.com", RandomStringUtils.randomAlphabetic(5));

        createAccountPage.register("Jhone","Doe", emailRandom,"123456789","abc123");
    }

    @Entonces("se verifica que la cuenta se creo correctamente")
    public void seVerificaQueLaCuentaSeCreoCorrectamente() {
        Assert.assertTrue(createdAccountPage.isSuccessfullyTextVisible(),
                "El texto de 'Cuenta creada' no esta visible");
    }

    @Cuando("el usuario crea la cuenta con campos en blanco")
    public void elUsuarioCreaLaCuentaConCamposEnBlanco() {
        String emailRandom = String.format("%s@gmail.com", RandomStringUtils.randomAlphabetic(5));

        createAccountPage.register("","Doe", emailRandom,"123456789","");

    }

    @Entonces("se verifica que la cuenta se creo incorrectamente")
    public void seVerificaQueLaCuentaSeCreoIncorrectamente() {
        Assert.assertTrue(createAccountPage.incorrectRegister());
    }

}
