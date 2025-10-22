package org.automation.clase4;

public class Ej2Vehiculos {
    private String marca;
    private String modelo;
    private int anio;

    public Ej2Vehiculos(){
        this.marca = "Toyota";
        this.modelo = "Yaris";
        this.anio = 2023;
    }

    public Ej2Vehiculos (String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
