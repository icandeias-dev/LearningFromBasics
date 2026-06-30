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
public abstract class B2Ejercicio1Al10 {

    public static void ej1(Scanner sn) {
        //1.Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.

        int numero;
        System.out.println("Introduce un número y te devuevo su cuadrado hasta que introduzcas un número negativo.");

        do {
            System.out.print("Introduce un número: ");
            numero = sn.nextInt();

            if (numero > 0) {
                System.out.println("Su cuadrado es " + Math.powExact(numero, 2));
            }

        } while (numero >= 0);
        System.out.println("Es negativo. Fin de programa.");
    }

    public static void ej2(Scanner sn) {
        //2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
        int numero;
        boolean esCero;
        boolean esPositivo;
        System.out.print("Introduce un número se te dirá si es positivo o negativo, si introduces un 0 se acaba el programa: ");

        do {
            numero = sn.nextInt();
            esCero = numero == 0;
            esPositivo = numero > 0;

            if (!esCero) {
                if (esPositivo) {
                    System.out.println("Es positivo.");
                } else {
                    System.out.println("Es negativo.");
                }

            }

        } while (!esCero);
        System.out.println("Es cero. Fin de programa.");

    }

    public static void ej3(Scanner sn) {
        //3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
        int numero;
        boolean esCero;
        boolean esPar;
        System.out.print("Introduce un número para saber si es par o impar. Si introduces un 0 se acaba el programa: ");
        do {
            numero = sn.nextInt();
            esCero = numero == 0;
            esPar = (numero % 2) == 0;

            if (!esCero) {
                if (esPar) {
                    System.out.println("Es par.");
                } else {
                    System.out.println("Es impar.");
                }
            }

        } while (!esCero);
        System.out.println("Has introducido un 0. Fin de programa.");

    }

    public static void ej4(Scanner sn) {
        //4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
        int numero;
        int contador = 0;
        boolean esNegativo;

        System.out.print("Introduce números hasta que pongas un número negativo. Mostraremos el total al final: ");

        do {
            numero = sn.nextInt();
            esNegativo = numero < 0;

            if (!esNegativo) {
                contador++;
                System.out.print("Introduce otro: ");
            }

        } while (!esNegativo);
        System.out.printf("Has introducido un número negativo tras introducir %d números positivos y/o ceros. Fin de programa.\n ", contador);
    }

    public static void ej5(Scanner sn) {
        //5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
        //El proceso termina cuando el usuario acierta.

        int numeroSecreto = (int) ((Math.random() * 1000) + 1); // Numero entre 1 y 1000 ambos incluidos.
        int numero;
        int contador = 0;
        boolean haAcertado = false;

        System.out.println("Adivina el número.");

        while (!haAcertado) {

            numero = sn.nextInt();

            haAcertado = numero == numeroSecreto;

            if (haAcertado) {
                System.out.printf("Enhorabuena. Has adivinado el número en %d intentos.\n", contador);
            } else {
                if (numeroSecreto < numero) {
                    System.out.println("El número es menor.");
                    contador++;
                } else {
                    System.out.println("El número es mayor.");
                    contador++;
                }
            }
        }
    }

    public static void ej6(Scanner sn) {
        //6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
        int numero;
        int total = 0;
        boolean esCero;

        System.out.print("Introduce números, se irán sumando hasta que se introduzca un 0: ");

        do {
            numero = sn.nextInt();
            esCero = numero == 0;

            total += numero;

        } while (!esCero);

        System.out.printf("Has introducido un 0. La suma de todos los número previos es %d. Fin de programa.\n", total);

    }

    public static void ej7(Scanner sn) {
        //7. Pedir números hasta que se introduzca uno negativo, y calcular la media.
        double numero;
        double contador = 0;
        double total = 0;
        double media;
        boolean esNegativo;

        System.out.println("Introduce números y se calculará su media.");

        do {
            numero = sn.nextInt();
            esNegativo = numero < 0;

            if (!esNegativo) {
                total += numero;
                contador++;
            }

        } while (!esNegativo);

        if(contador != 0){
        media = total / contador;

        System.out.printf("Has introducido un número negativo. La media de todos los números previos es %.2f \n", media);
        }else{
            System.out.println("Necesitas al menos un número para calcular una media.");
        }

    }

    public static void ej8(Scanner sn) {
        //8. Pedir un número N, y mostrar todos los números del 1 al N.
        int numero;
        String sentencia;

        System.out.print("Introduce un número y te diré todos los números que hay entre medias: ");
        do {
            numero = sn.nextInt();
            if (numero <= 0) {
                System.out.print("Por favor introduce un número positivo: ");
            }
        } while (numero <= 0);
        sentencia = "Entre 1 y " + numero + " están los siguientes: ";

        for (int i = 2; i < numero; i++) {
            if (i != numero - 1) {
                sentencia = sentencia + i + " ";
            } else {
                sentencia = sentencia + i + ".";
            }
        }
        System.out.println(sentencia);
    }

    public static void ej9(Scanner sn) {
        //9. Escribir todos los números del 100 al 0 de 7 en 7.
        String sentencia = "Numeros del 100 al 0 de 7 en 7: ";

        for (int i = 100; i >= 0; i -= 7) {

            if (i - 7 < 0) {
                sentencia += i + ".";
            } else {
                sentencia += i + " ";
            }
        }

        System.out.println(sentencia);

    }
    public static void ej10(Scanner sn){
    //10. Pedir 15 números y escribir la suma total.
        int numero;
        int total = 0;
        final int numerosPedidos = 15;
        
        System.out.print("Introduce 15 números y tendrás su total: ");
        
        for(int i = 0; i < numerosPedidos; i++){
            
            numero = sn.nextInt();
            total +=numero;
            if(numerosPedidos - i - 1 != 0){
            System.out.printf("Introduce %d más: ",numerosPedidos - i - 1);
            }
        }
        
        System.out.printf("El total es %d.\n",total);
    }
}
