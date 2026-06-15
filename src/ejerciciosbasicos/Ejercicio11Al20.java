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
            System.out.printf("%d tiene 1 cifra.\n",numero);
        }else if(numero < 100){
            System.out.printf("%d tiene 2 cifras.\n",numero);
        }else if(numero < 1000){
            System.out.printf("%d tiene 3 cifras.\n",numero);
        }else{
            System.out.printf("%d tiene 4 cifras.\n",numero);
        }

    }
    public static void ej12(Scanner sn){
        //12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés
        int numero;
        int numeromod;
        int unidad,decena,centena,umillar;
        boolean valido;
        
        System.out.print("Introduce un número entre el 0 y el 9999: ");
        
        do{
        numero = sn.nextInt();
        valido = numero >= 0 && numero <= 9999;
        
        if(!valido){
            System.out.print("Por favor introduce un número válido: ");
        }       
            
        }while(!valido);
        numeromod = numero;
        if (numero < 10) {
            
            unidad = numeromod;
            System.out.printf("%d al revés es %d\n",numero,unidad);
            
        }else if(numero < 100){
            
            unidad = numeromod%10;
            numeromod /=10;
            decena = numeromod;
            
            System.out.printf("%d al revés es %d%d\n",numero,unidad,decena);
            
            
        }else if(numero < 1000){
            
            unidad = numeromod%10;
            numeromod /=10;
            decena = numeromod%10;
            numeromod /= 10;
            centena = numeromod;
            
            System.out.printf("%d al revés es %d%d%d\n",numero,unidad,decena,centena);
            
        }else{
            
            unidad = numeromod%10;
            numeromod /=10;
            decena = numeromod%10;
            numeromod /= 10;
            centena = numeromod%10;
            numeromod /= 10;
            umillar = numeromod;
            
            System.out.printf("%d al revés es %d%d%d%d\n",numero,unidad,decena,centena,umillar);
        }
        
    }
}
