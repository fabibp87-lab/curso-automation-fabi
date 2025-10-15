package org.automation.clase3;

public class P4CondicionalesEstructuras {
    public static void main(String[] args) {
        //Formas del IF

        int var1 = 100;
        int var2 = 340;

        //If simples

        if (var1 < var2) {
            System.out.println("Se cumple la condicion. var1 es menor a var2");
        }

        //If multiples

        if (var1 > var2){
            System.out.println("var1 es mayor a var2");
        } else {
            System.out.println("var1 no es mayor a var2");
        }
        //!= es el distinto y el == es igual

        String diaDeLaSemana = "Sabado";

        //If anidados

        if (diaDeLaSemana == "Lunes"){
            System.out.println("Hoy es Lunes");
        } else if (diaDeLaSemana == "Martes") {
            System.out.println("Hoy es Martes");
        } else if (diaDeLaSemana == "Miercoles") {
            System.out.println("Hoy es Miercoles");
        } else {
            System.out.println("No es lunes, martes ni miercoles");
        }

        //switch

        switch (diaDeLaSemana) {
            case "Lunes":
                System.out.println("Hoy es Lunes");
                break;
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles");
                break;
            default:
                System.out.println("No es lunes, martes ni miercoles");
                break; //esto es opcional
        }




    }
}
