package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.automation.pages.*;
import org.testng.Assert;

public class AddCartDefinitions {
        
    private MyAccountPage selectCameras;
    private CategoryPage selectProduct;
    private ProductPage addProduct;
    private CartPage cartPage;

    public AddCartDefinitions() {
        this.selectCameras = new MyAccountPage(Hooks.getDriver());
        this.selectProduct = new CategoryPage(Hooks.getDriver());
        this.addProduct = new ProductPage(Hooks.getDriver());
        this.cartPage = new CartPage(Hooks.getDriver());
    }

    @Cuando("el usuario selecciona un producto")
    public void elUsuarioSeleccionaUnProducto() {
        selectCameras.goToCamara();
    }

    @Y("el usuario ingresa al producto")
    public void elUsuarioIngresaAlProducto() {
        selectProduct.goToProduct();
    }

    @Y("el usuario carga en el carrito el producto")
    public void elUsuarioCargaEnElCarritoElProducto() {
        addProduct.selectOption("3");
    }

    @Entonces("se verifica que el producto se cargo")
    public void seVerificaQueElProductoSeCargo() {
        Assert.assertTrue(cartPage.modelIsDisplayed(), "El texto de 'Modelo del Producto' no esta visible");
        Assert.assertTrue(cartPage.unitIsDisplayed(), "El texto de 'Unidad del Producto' no esta visible");
        Assert.assertTrue(cartPage.isBtnVisible(), "El boton no esta visible");

    }
}
