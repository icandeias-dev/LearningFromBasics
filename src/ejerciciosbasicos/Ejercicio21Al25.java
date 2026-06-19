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
public abstract class Ejercicio21Al25 {

    public static void ej21(Scanner sn) {

        // 21. Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
        int nota;
        boolean notaEsValida;

        System.out.print("Introduce una nota entre el 0 al 10: ");
        do {
            nota = sn.nextInt();
            notaEsValida = nota >= 0 && nota <= 10;

            if (!notaEsValida) {
                System.out.print("Por favor introduce una nota válida: ");
            }
        } while (!notaEsValida);
        
        switch(nota){
            case 0 -> System.out.println("CERO");
            case 1 -> System.out.println("UNO");
            case 2 -> System.out.println("DOS");
            case 3 -> System.out.println("TRES");
            case 4 -> System.out.println("CUATRO");
            case 5 -> System.out.println("CINCO");
            case 6 -> System.out.println("SEIS");
            case 7 -> System.out.println("SIETE");
            case 8 -> System.out.println("OCHO");
            case 9 -> System.out.println("NUEVE");
            case 10 -> System.out.println("DIEZ");
            
        }
        
    }
    
    
    
}
