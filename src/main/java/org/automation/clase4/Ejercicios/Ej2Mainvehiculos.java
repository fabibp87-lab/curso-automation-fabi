package org.automation.clase4.Ejercicios;

public class Ej2Mainvehiculos {
    public static void main(String[] args) {
       /* Ej2Vehiculos vehiculo = new Ej2Vehiculos();
        System.out.println("Marca del vehiculo: " + vehiculo.getMarca());
        System.out.println("Modelo del vehiculo: " + vehiculo.getModelo());
        System.out.println("Año del vehiculo: " + vehiculo.getAnio());*/

        Ej2Vehiculos vehiculo2 = new Ej2Vehiculos("Chevrolet","Classic",2015);
        System.out.println("Marca del vehiculo: " + vehiculo2.getMarca());
        System.out.println("Modelo del vehiculo: " + vehiculo2.getModelo());
        System.out.println("Año del vehiculo: " + vehiculo2.getAnio());

        Ej2Vehiculos vehiculo3 = new Ej2Vehiculos("Fiat", "Palio", 2020);
        System.out.println("Marca del vehiculo: " + vehiculo3.getMarca());
        System.out.println("Modelo del vehiculo: " + vehiculo3.getModelo());
        System.out.println("Año del vehiculo: " + vehiculo3.getAnio());

    }
}
