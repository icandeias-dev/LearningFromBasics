/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ismael Henrique Candeias E Silva
 */
public abstract class Ejercicio1Al10 {

    public static void ej1(Scanner sn) {

        // 1 - Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
        //Declaramos coeficientes para calcular una ecuación de segundo grado
        double a;
        double b;
        double c;

        double valorX1;
        double valorX2;
        double discriminante;

        System.out.print("Introduce el valor de a: ");
        a = sn.nextDouble();
        System.out.print("Introduce el valor de b: ");
        b = sn.nextDouble();
        System.out.print("Introduce el valor de c: ");
        c = sn.nextDouble();

        discriminante = Math.pow(b, 2) - 4 * a * c;

        valorX1 = ((-1 * b) + Math.sqrt(discriminante)) / (2 * a);

        valorX2 = ((-1 * b) - Math.sqrt(discriminante)) / (2 * a);

        if (discriminante > 0) {

            System.out.println("Los resultados son x igual a " + valorX1 + " o x igual a " + valorX2);

        } else if (discriminante < 0) {

            System.out.println("No tiene solución");

        } else {

            System.out.println("El resultado es x igual a " + valorX1);

        }

    }

    public static void ej2(Scanner sn) {
        
        //2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
        
        double area;
        double radio;
        
        System.out.print("Introduce el radio de un circulo en cm: ");
        radio = sn.nextDouble();
        
        area = Math.PI * Math.pow(radio,2);
        
        System.out.println("El area es "+area+"cm");
        
        
        
    }
    
    public static void ej3(Scanner sn){
        //3. Pedir el radio de una circunferencia y calcular su longitud.
        
        double radio;
        double longitud;
        
        System.out.print("Introduce el radio de un circulo en cm: ");
        
        radio = sn.nextDouble();
        
        longitud = 2 * radio * Math.PI;
        
        System.out.println("La longitud de la circunferencia es de "+longitud+"cm");
        
    }
    
    public static void ej4(Scanner sn){
        //4.Pedir dos números y decir si son iguales o no.
        
        int numero1;
        int numero2;
        
        System.out.print("Introduce un número: ");
        numero1 = sn.nextInt();
        System.out.print("Introduce otro número: ");
        numero2 = sn.nextInt();
        
        if(numero1 == numero2){
            System.out.println("\nSon iguales");
        }else{
            System.out.println("\nSon distintos.");     
        }
        
    }
    
    public static void ej5(Scanner sn){
        //5. Pedir un número e indicar si es positivo o negativo.
        int numero1;
        
        System.out.print("Introduce un número: ");
        numero1 = sn.nextInt();
        
        if(numero1 < 0){
            System.out.println("\nEs negativo");
        }else{
            System.out.println("Es positivo");
        }        
    }
    
    public static void ej6(Scanner sn){
        //6. Pedir dos números y decir si uno es múltiplo del otro.
        int numero1;
        int numero2;
        
        System.out.print("Introduce un número: ");
        numero1 = sn.nextInt();
        System.out.print("Introduce otro número: ");
        numero2 = sn.nextInt();
        
        if(numero1 > numero2){
            if(numero1 % numero2 == 0){
                System.out.println("\n"+numero1+" es multiplo de "+numero2);
            }else{
                System.out.println("\n"+numero1+" no es multiplo de "+numero2);
            }
            
        }else{
            
            if(numero2 % numero1 == 0){
                System.out.println("\n"+numero2+" es multiplo de "+numero1);
            }else{
                System.out.println("\n"+numero2+" no es multiplo de "+numero1);
            }
        }
        
    }
    
    public static void ej7(Scanner sn){
        //7. Pedir dos números y decir cual es el mayor.
        int numero1;
        int numero2;
        
        System.out.print("Introduce un número: ");
        numero1 = sn.nextInt();
        System.out.print("Introduce otro número: ");
        numero2 = sn.nextInt();
        
        if(numero1 > numero2){
            
            System.out.println(numero1+" es mayor que "+numero2);
        }else{
            
            System.out.println(numero2+" es mayor que "+numero1);
        }
    }
    public static void ej8(Scanner sn){
        //8. Pedir dos números y decir cual es el mayor o si son iguales.
        int numero1;
        int numero2;
        
        System.out.print("Introduce un número: ");
        numero1 = sn.nextInt();
        System.out.print("Introduce otro número: ");
        numero2 = sn.nextInt();
        
        if(numero1 > numero2){
            
            System.out.println(numero1+" es mayor que "+numero2);
        }else if(numero1 == numero2){
            System.out.println("Son iguales");
        }else{
            
            System.out.println(numero2+" es mayor que "+numero1);
        }
        
    }
    public static void ej9(Scanner sn){
        //9. Pedir dos números y mostrarlos ordenados de mayor a menor.
        
        ArrayList<Integer> al = new ArrayList<Integer>(); 

        int tamanoArray;
        
        System.out.print("¿Cuántos numeros quieres meter?:  ");
        tamanoArray = sn.nextInt();
        
        for(int i = 0; i < tamanoArray; i++){
            
            System.out.print("Introduce un número: ");
    
            al.add(sn.nextInt());
            
            System.out.println("Quedan por introducir "+(tamanoArray - i - 1)+" números");
            
        }

        Collections.sort(al);
        
        System.out.print("Ordenados quedan así: ");
        for(int i : al){
            
            System.out.print(i+" ");
            
        }
        
        
    }
    public static void ej10(Scanner sn){
        //10. Pedir tres números y mostrarlos ordenados de mayor a menor.
        //Esta vez lo haré con ifs como se pretende que se haga.
        
        final int cantidadNumeros = 3;
        final int primerNum = 0;
        final int segundoNum = 1;
        final int tercerNum = 2;
        
        int [] numeros = new int[cantidadNumeros];
        
        String [] orden = {"primer","segundo","tercer"};
        
        for(int i = 0; i < orden.length; i++){
            
            System.out.print("Introduce el "+orden[i]+" numero: ");      
            
            numeros[i] = sn.nextInt();
            
        }
        
        if (numeros[primerNum] > numeros[segundoNum] && numeros[primerNum] > numeros[tercerNum]){ // Teniendo en cuenta que el primer numero sea el mayor
            
            if(numeros[segundoNum] > numeros[tercerNum]){  //Teniendo en cuenta que el segundo numero es el segundo mayor
            
                System.out.println("El orden de mayor a menor es: "+numeros[primerNum]+", "+numeros[segundoNum]+", "+numeros[tercerNum]);
            }else{ // Teniendo en cuenta que el  tercer numero es el segundo mayor                      
                System.out.println("El orden de mayor a menor es: "+numeros[primerNum]+", "+numeros[tercerNum]+", "+numeros[segundoNum]);
            }
            
        }else if (numeros[segundoNum] > numeros[primerNum] && numeros[segundoNum] > numeros[tercerNum]){ // Teniendo en cuenta que el segundo numero sea el mayor
            
            if(numeros[primerNum] > numeros[tercerNum]){  //Teniendo en cuenta que el primer numero es el segundo mayor
            
                System.out.println("El orden de mayor a menor es: "+numeros[segundoNum]+", "+numeros[primerNum]+", "+numeros[tercerNum]);
            }else{ // Teniendo en cuenta que el  tercer numero es el segundo mayor                      
                System.out.println("El orden de mayor a menor es: "+numeros[segundoNum]+", "+numeros[tercerNum]+", "+numeros[primerNum]);
            }
        
        } else { //// Teniendo en cuenta que el tercer numero sea el mayor
            if(numeros[primerNum] > numeros[segundoNum]){  //Teniendo en cuenta que el primer numero es el segundo mayor
            
                System.out.println("El orden de mayor a menor es: "+numeros[tercerNum]+", "+numeros[primerNum]+", "+numeros[segundoNum]);
            }else{ // Teniendo en cuenta que el  segundo numero es el segundo mayor                      
                System.out.println("El orden de mayor a menor es: "+numeros[tercerNum]+", "+numeros[segundoNum]+", "+numeros[primerNum]);
            }
        }
        
        
        
    }
}
