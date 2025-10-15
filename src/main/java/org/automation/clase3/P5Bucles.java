package org.automation.clase3;

public class P5Bucles {
    public static void main(String[] args) {

        //While

        int contador = 0;

        while (contador <= 5) {//<= menor o igual
            System.out.println("Hola Mundo desde While");
            contador++;//contador = contador + 1;
        }

        //Do While

        int contador2 = 0;

        do {
            System.out.println("Hola Mundo desde Do While");
            contador2++;
        } while (contador2 < 5);

        //For

        for (int i=0; i < 5; i++){
            System.out.println("Hola Mundo desde For");
        }

    }
}
