package com.liceolapaz.des.sfr;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Escribir menú
        escribirMenu();
        //Escoger opción y guardarla
        int opcion= guardarOpcion();
        //Escribir opción dependiendo de lo escogido
        escribirOpcion(opcion);
    }

    private static void escribirOpcion(int opcion) {
        switch (opcion){
            case 1:
                //Base
                System.out.println("Introduzca el valor de la base: ");
                //Guardar valor (base)
                int base= basePotencia();
                //Exponente
                System.out.println("Introduzca el valor del exponente: ");
                //Guardar valor (exponente)
                int exponente= exponentePotencia();
                //Hacer la operación
                double resultado1= Math.pow(base, exponente);
                //Mostrar resultado
                System.out.println("El resultado de la operación es: "  + resultado1);
                break;
            case 2:
                //Operando
                System.out.println("Introduzca el operando: ");
                //Guardar valor (operando)
                int operando= operandoRaiz();
                //Hacer la operando
                double resultado2= Math.sqrt(operando);
                //Mostrar resultado
                System.out.println("El resultado de la operación es: " + resultado2);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Error, la opción introducida no es válida");
                break;
        }
    }

    private static int operandoRaiz() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static int exponentePotencia() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static int basePotencia() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }


    private static int guardarOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void escribirMenu() {
        System.out.println
        ("POTENCIAS Y RAÍCES CUADRADAS\n" +
                "1.Potencias\n" +
                "2.Raíz cuadrada\n" +
                "3.Salir\n" +
                "Escoja una opción: ");
    }
}
