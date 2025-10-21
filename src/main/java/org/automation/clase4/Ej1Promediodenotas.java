package org.automation.clase4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1Promediodenotas {
    public static void main(String[] args) {
        /*
        Ejecicio 1: Se requiere cargar las 10 notas de un alumno para calcular el promedio.
         Es necesario cargar las notas usando la consola y al finalizar mostrar en pantalla el
         promedio de todas las notas.
         Tip: usar la clase Scanner para el ingreso por consola, y el bucle for para iterar.
         Tip: usar una lista para almacenar las notas.
         */
        Scanner scanner = new Scanner(System.in);
        float nota;
        List<Float> listanotas = new ArrayList<>();

        for (int i=0; i <= 10; i++){
            System.out.println("Ingrese un numero: ");
            nota = scanner.nextFloat();
            listanotas.add(nota);
        }
        System.out.println("Las notas ingresadas son:" + listanotas);



    }
}
