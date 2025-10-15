package org.automation.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7integrador {
    /*
Descripcion del ejercicio
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        List<Integer> listadenumeros = new ArrayList<>();

        do {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();
            listadenumeros.add(numero);

        }while (numero <= 500);

        System.out.println("Datos Ingresados:" + listadenumeros);

        if (listadenumeros.size() < 10){
            System.out.println("Se ingresaron pocos numeros");

        } else {
            System.out.println("Se excedio la cantidad de ingresos diarios");
        }

    }
}
