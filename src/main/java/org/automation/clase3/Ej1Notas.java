package org.automation.clase3;

public class Ej1Notas {
    public static void main(String[] args) {
        /* Ejercicio 1 - Notas
Se requiere informar a los alumnos la nota que sacaron mediante un mensaje en consola.
La nota es del tipo numérica (int) y para mostrar el mensaje se debe tener en cuenta lo
siguiente:
- Si la nota es mayor o igual a 1 y menor o igual a 3, en consola debe mostrar “La
nota del examen es: Insuficiente”.
- Si la nota es mayor o igual a 4 y menor o igual a 5, en consola debe mostrar “La
nota del examen es: Regular”.
- Si la nota es mayor o igual a 6 y menor o igual a 7, en consola debe mostrar “La
nota del examen es: Bien”.
- Si la nota es mayor o igual a 8 y menor o igual a 9, en consola debe mostrar “La
nota del examen es: Muy Bien”.
- Si la nota es igual a 10, en consola debe mostrar “La nota del examen es:
Excelente”.
- Si ninguna condición se cumple, mostrar como mensaje default “Error al cargar la
nota”
Tip: Usar el bloque condicional if para resolver el ejercicio, y para evaluar dos condiciones
deben usar el operador &&
         */
        int nota=10;
        if (nota>=1 && nota<=3){
            System.out.println("La nota del examen es: Insuficiente. ");
        } else if (nota>=4 && nota<=5) {
            System.out.println("La nota del examen es: Regular. ");
        } else if (nota>=6 && nota<=7) {
            System.out.println("La nota del examen es: Bien.");
        } else if (nota>=8 && nota<=9) {
            System.out.println("La nota del examen es: Muy Bien.");
        } else if (nota==10) {
            System.out.println("La nota del examen es: Excelente");
        }


    }
}
