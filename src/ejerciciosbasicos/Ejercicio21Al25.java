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
    
    public static void ej22(Scanner sn){
        
        //22. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
        final int min = 0;
        final int max = 99;
        int numero; // numero introducido por el usuario
        int numeroInmutable;
        boolean tieneUnaCifra = false;
        boolean esTeen = false; // Significa que es un numero entre el 11 y el 15 ambos incluidos.
        int unidad = 0; // unidad del numero
        int decenas = 0; // decena del numero
        
        String [] nombreUnidades = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        String [] nombreDecenas = {"diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
        String [] numeroTeen = {"once","doce","trece","catorce","quince"};
        
        System.out.printf("Introduce un número del %d al %d: ",min,max);

        numero = validadorNumero(min, max, sn);
        numeroInmutable = numero;
        
        if(numeroInmutable < 10){
            tieneUnaCifra = true;
            
        }else if(numeroInmutable > 10 && numeroInmutable < 16){
            esTeen = true;
            
        }else{
        unidad = numero % 10;
        numero /= 10;
        decenas = numero;
        }
        
        if(tieneUnaCifra){
            //No hay que arreglar el indice ya que corresponde con su numero en la array
            System.out.printf("%d escrito es el número %s.\n",numeroInmutable,nombreUnidades[numeroInmutable]); 
            
        }else if(esTeen){
            
            int arregloIndice = numeroInmutable - 11; //Arreglamos el indice para que coincida con su numero en la array
            
            System.out.printf("%d escrito es el número %s.\n",numeroInmutable,numeroTeen[arregloIndice]);
            
            
        }else{
            
            int arregloIndiceDecenas = decenas - 1;
            
            System.out.printf("%d escrito es el número %s y %s.\n",numeroInmutable,nombreDecenas[arregloIndiceDecenas],nombreUnidades[unidad]);
            
        }
        
        
        
        
    }
    
    
    private static int validadorNumero(int min, int max, Scanner sn){
        
        int numero;
        boolean esValido;
        
        do{
        
            numero = sn.nextInt();
            
            esValido = numero >= min && numero <= max;
            
            if(!esValido){
                System.out.print("Por favor introduce un número válido: ");
            }
            
        }while(!esValido);
        
        return numero;
        
    }
    
}
