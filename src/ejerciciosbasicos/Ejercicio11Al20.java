/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author ihcan
 */
public abstract class Ejercicio11Al20 {

    public static void ej11(Scanner sn) {
        //11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
        int numero;
        boolean valido;
        System.out.print("Introduce un número entre 0 y 9999: ");

        do {
            numero = sn.nextInt();
            valido = numero >= 0 && numero <= 9999;
            if (!valido) {
                System.out.print("Por favor introduce un número válido: ");
            }
        } while (!valido);

        if (numero < 10) {
            System.out.printf("%d tiene 1 cifra.\n", numero);
        } else if (numero < 100) {
            System.out.printf("%d tiene 2 cifras.\n", numero);
        } else if (numero < 1000) {
            System.out.printf("%d tiene 3 cifras.\n", numero);
        } else {
            System.out.printf("%d tiene 4 cifras.\n", numero);
        }

    }

    public static void ej12(Scanner sn) {
        //12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés
        int numero; // Este no se va a modificar
        int numeroMod;
        int unidad, decena, centena, umillar;
        boolean valido;

        System.out.print("Introduce un número entre el 0 y el 9999: ");

        do {
            numero = sn.nextInt();
            valido = numero >= 0 && numero <= 9999;

            if (!valido) {
                System.out.print("Por favor introduce un número válido: ");
            }

        } while (!valido);

        numeroMod = numero;
        if (numero < 10) {

            unidad = numeroMod;
            System.out.printf("%d al revés es %d\n", numero, unidad);

        } else if (numero < 100) {

            unidad = numeroMod % 10;
            numeroMod /= 10;
            decena = numeroMod;

            System.out.printf("%d al revés es %d%d\n", numero, unidad, decena);

        } else if (numero < 1000) {

            unidad = numeroMod % 10;
            numeroMod /= 10;
            decena = numeroMod % 10;
            numeroMod /= 10;
            centena = numeroMod;

            System.out.printf("%d al revés es %d%d%d\n", numero, unidad, decena, centena);

        } else {

            unidad = numeroMod % 10;
            numeroMod /= 10;
            decena = numeroMod % 10;
            numeroMod /= 10;
            centena = numeroMod % 10;
            numeroMod /= 10;
            umillar = numeroMod;

            System.out.printf("%d al revés es %d%d%d%d\n", numero, unidad, decena, centena, umillar);
        }

    }

    public static void ej13(Scanner sn) {
        //13. Pedir un número entre 0 y 9.999, decir si es capicúa.

        int numero;
        int numeroMod;
        int numeroInvert;
        boolean valido;
        int unidad, decenas, centenas, umillar;

        System.out.print("Por favor introduce un número entre el 0 y el 9999: ");
        do {
            numero = sn.nextInt();
            valido = numero >= 0 && numero <= 9999;

            if (!valido) {
                System.out.print("Por favor introduce un número válido: ");
            }

        } while (!valido);

        numeroMod = numero;

        unidad = numeroMod % 10;
        numeroMod /= 10;

        decenas = numeroMod % 10;
        numeroMod /= 10;

        centenas = numeroMod % 10;
        numeroMod /= 10;

        umillar = numeroMod;

        if (numero < 10) {
            System.out.println("Es capicúa (sólo tiene una cifra xD)");
        } else if (numero < 100) {

            numeroInvert = unidad * 10 + decenas;

            esCapicuo(numero, numeroInvert);

        } else if (numero < 1000) {
            numeroInvert = unidad * 100 + decenas * 10 + centenas;

            esCapicuo(numero, numeroInvert);
        } else {
            numeroInvert = unidad * 1000 + decenas * 100 + centenas * 10 + umillar;

            esCapicuo(numero, numeroInvert);
        }
    }

    private static void esCapicuo(int numero, int numeroInvert) {
        if (numero == numeroInvert) {
            System.out.printf("%d es capicúa\n", numero);
        } else {
            System.out.printf("%d no es capicúa\n", numero);
        }

    }

    public static void ej14(Scanner sn) {

        int nota;
        boolean valido;
        System.out.print("Introduce una nota del 0 al 10: ");

        do {
            nota = sn.nextInt();

            valido = nota >= 0 && nota <= 10;

            if (!valido) {
                System.out.println("Por favor introduce una nota válida");
            }

        } while (!valido);

        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }

    public static void ej15(Scanner sn) {
        //15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.

        int ano;
        boolean mesValido = true;
        int mes;
        boolean diaValido = true;
        int dia;
        String veredicto = "no es válida. ";

        System.out.print("Introduce día: ");
        dia = sn.nextInt();
        
        System.out.print("Introduce mes: ");
        mes = sn.nextInt();
        
        System.out.print("Introduce año: ");
        ano = sn.nextInt();
        
        if(mes < 1 || mes > 12){
            mesValido = false;
        }
        
        if(dia >= 1 && dia <= 31){
            if(mes == 2 && dia > 28){
                diaValido = false;
            }
            if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
                diaValido = false;
            }
            
        }else{ 
            diaValido = false;
        }
        
        if(mesValido && diaValido){
            veredicto = "es válida. ";
        }
        
        System.out.printf("La fecha %d/%d/%d %s",dia,mes,ano,veredicto);
    }
}
