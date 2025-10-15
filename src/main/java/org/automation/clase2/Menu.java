package org.automation.clase2;

public class Menu {
    public static void main(String[] args) {
        //Desarrollar el Ejercicio
        //Ejecicio 1 - Menu:
        System.out.println("***** El Bodegon *****");
        System.out.println("Menu del Dia:");
        System.out.println(1 + ". Hamburguesas con papas fritas");
        System.out.println(2 + ". Guiso de Lentejas");
        System.out.println(3 + ". 24 piezas de sushi variadas");
        System.out.println(4 + ". Pizza de jamon y morron");
        System.out.println(5 + ". Empanadas de Carne");


        //Ejercicio 2 - Informe médico
        System.out.println("Paciente: " + "Fabiana Barros Pedernera");
        System.out.println("Edad: " + 38 + " Años");
        System.out.println("Doctor: " + "Dra. Zalazar" + "Matricula" + 159);
        System.out.println("Fecha de estudio: " + 10 + "/" + 11 + "/" + 2025);
        System.out.println("Estudio: " + 'R' + 'e' + 's' + 'o' + 'n' + 'a' + 'n' + 'c' + 'i' + 'a');
        System.out.println("Hora del estudio: " + 17 + ":" + 15 + "hs");

        //Ejercicio 3 - Datos Estudiante
        String nom;
        nom = "Sandra";
        String ape = "Romero";
        int edad = 23;
        boolean trab = false;
        float prom = 9.5f;
        String fecha = "03/10/2002";
        System.out.println("Resumen:\n" + "-La alumna " + nom + " " + ape + ", nacio el " + fecha + " y su edad es " + edad + " años.");
        System.out.println("-Tiene un promedio de " + prom + " y su estado laboral es " + trab + ".");

   }

}
