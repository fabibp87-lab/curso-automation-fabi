package org.automation.clase4;

import java.util.Scanner;

public class Ej3Maincurso {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        Scanner durac = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String nom;
        int dur;
        Ej3Curso curso = new Ej3Curso(new scanner(nombre), new scanner(durac));

        for (int i=0; i <= 10; i++){
            System.out.println("Ingrese el nombre del curso: ");
            nom = scanner.nextString();
            listanotas.add(nota);
        }
        System.out.println("Las notas ingresadas son:" + listanotas);


    }
}
