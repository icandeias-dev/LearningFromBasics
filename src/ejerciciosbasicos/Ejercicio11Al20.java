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

    public static void ej15_16(Scanner sn) {
        //15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
        //16.Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.Sin años bisiestos.
        boolean anoValido = true;
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

        if (ano == 0) {
            anoValido = false;
        }

        if (mes < 1 || mes > 12) {
            mesValido = false;
        }

        if (dia >= 1 && dia <= 31) {
            if (mes == 2 && dia > 28) {
                diaValido = false;
            }
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                diaValido = false;
            }

        } else {
            diaValido = false;
        }

        if (mesValido && diaValido && anoValido) {
            veredicto = "es válida. ";
        }

        System.out.printf("La fecha %d/%d/%d %s", dia, mes, ano, veredicto);
    }

    public static void ej17_18(Scanner sn) {
        //17. Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días.
        //18. Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días).

        int dia, mes, ano;
        int diaS, mesS, anoS; // Fecha siguiente
        boolean diaValido = true;
        boolean mesValido = true;
        boolean anoValido = true;

        boolean esFebrero = false;
        boolean esMes30Dias = false;

        System.out.print("Introduce día: ");
        dia = sn.nextInt();

        System.out.print("Introduce mes: ");
        mes = sn.nextInt();

        System.out.print("Introduce año: ");
        ano = sn.nextInt();

        // Validamos el año  
        if (ano == 0) {
            anoValido = false;
        } else {
            //Validamos el mes
            if (mes == 2) {
                esFebrero = true;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                esMes30Dias = true;
            }
            if (dia > 1 || dia < 31) {

                if ((esFebrero && dia > 28) || (esMes30Dias && dia > 30)) {
                    mesValido = false;
                }
            } else { //Validamos día
                diaValido = false;
            }
        }

        if (diaValido && mesValido && anoValido) {

            //Calculamos dia siguiente
            diaS = dia + 1;
            mesS = mes;
            anoS = ano;

            //Comprobamos si cambia de mes
            if ((esFebrero && diaS > 28) || (esMes30Dias && diaS > 30)) {
                mesS = mes + 1;
                diaS = 1;
            } else if (diaS > 31) {
                mesS = mes + 1;
                diaS = 1;
            }

            //Comprobamos si cambia de año
            if (mesS > 12) {
                anoS = ano + 1;
                mesS = 1;
                diaS = 1;
                if (anoS == 0) {
                    anoS += 1;
                }
            }

            System.out.printf("El día siguiente a %d/%d/%d es %d/%d/%d\n", dia, mes, ano, diaS, mesS, anoS);
        } else {
            System.out.println("La fecha introducida no es válida");
        }

    }

    public static void ej19(Scanner sn) {
        //19. Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.

        int dia, mes, ano;
        int dia2, mes2, ano2; // Fecha a calcular la diferencia
        
        int diasTotales;        // Total de días por fecha
        int diasTotales2;
        
        int diferencia; // Dias de diferencia entre fechas
        
        boolean fechaEsValida;

        boolean fechaEsValida2;

        boolean esFebrero = false;
        boolean esMes30Dias = false;

        boolean esFebrero2 = false;
        boolean esMes30Dias2 = false;
        //Lo suyo es crear una clase fecha y calcular la diferencia entre 2 objetos fecha pero no quiero ensuciar el proyecto basico.

        //Fecha 1
        System.out.print("Introduce día: ");
        dia = sn.nextInt();

        System.out.print("Introduce mes: ");
        mes = sn.nextInt();

        System.out.print("Introduce año: ");
        ano = sn.nextInt();
        // Fecha 2
        System.out.print("Introduce día segunda fecha: ");
        dia2 = sn.nextInt();

        System.out.print("Introduce mes segunda fecha: ");
        mes2 = sn.nextInt();

        System.out.print("Introduce año segunda fecha: ");
        ano2 = sn.nextInt();

        // Validamos ambas fechas
        if (mes == 2) {
            esFebrero = true;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            esMes30Dias = true;
        }
        if (mes2 == 2) {
            esFebrero2 = true;
        } else if (mes2 == 4 || mes2 == 6 || mes2 == 9 || mes2 == 11) {
            esMes30Dias2 = true;
        }

        fechaEsValida = validadorFechas(dia, mes, ano, esFebrero, esMes30Dias);

        fechaEsValida2 = validadorFechas(dia2, mes2, ano2, esFebrero2, esMes30Dias2);

        if (fechaEsValida && fechaEsValida2) {
            
            diasTotales = diasEntreFechas(dia, mes, ano, esFebrero, esMes30Dias);
            diasTotales2 = diasEntreFechas(dia2, mes2, ano2, esFebrero2, esMes30Dias2);
            
            diferencia = Math.abs(diasTotales - diasTotales2);
            
            System.out.printf("La diferencia entre %d/%d/%d y %d/%d/%d es de %d día(s).\n",dia,mes,ano,dia2,mes2,ano2,diferencia);
            
        }else if(!fechaEsValida2 && fechaEsValida){
            System.out.println("La segunda fecha introducida no es válida.");
        }else if(!fechaEsValida && fechaEsValida2){
            System.out.println("La primera fecha introducida no es válida.");
        }else{
            System.out.println("Ambas fechas introducidas no son válidas.");
        }

    }

    private static int diasEntreFechas(int dia, int mes, int ano, boolean esFebrero, boolean esMes30Dias) {

        if (esFebrero) {
            return dia + mes * 28 + ano * 365;
        } else if (esMes30Dias) {
            return dia + mes * 30 + ano * 365;
        } else {
            return dia + mes * 31 + ano * 365;
        }

    }

    private static boolean validadorFechas(int dia, int mes, int ano, boolean esFebrero, boolean esMes30Dias) {
        boolean anoValido = true;
        boolean mesValido = true;
        boolean diaValido = true;

        if (ano == 0) {
            anoValido = false;
        } else {
            if (mes < 1 || mes > 12) {
                mesValido = false;
            } else {
                if (dia > 1 || dia < 31) {

                    if ((esFebrero && dia > 28) || (esMes30Dias && dia > 30)) {
                        mesValido = false;
                    }
                } else {
                    diaValido = false;
                }
            }
        }

        return anoValido && mesValido && diaValido;

    }
    
    public static void ej20(Scanner sn){
        //20. Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.

        int hora, min, seg;
        int hora2 ,min2 ,seg2; // Segundo siguiente;
        
        boolean horaValida;
        boolean minValido; 
        boolean segValido;
        
        System.out.print("Introduce la hora: ");
        hora = sn.nextInt();
        System.out.print("Introduce los minutos: ");
        min = sn.nextInt();
        System.out.print("Introduce los segundos: ");
        seg = sn.nextInt();
        
        hora2 = hora;
        min2 = min;
        seg2 = seg + 1;
        
        //Validamos horam minutos y segundos
        
        horaValida = (hora >= 0) && (hora <= 23);
        minValido = (min>= 0) && (min<= 59);
        segValido = (seg>= 0)&&(seg<= 59);
        
        if(horaValida && minValido && segValido){
            
            if(seg2 > 59){
                min2 += 1;
                seg2 = 0;
                if(min2 > 59){
                    hora2 += 1;
                    min2 = 0;
                    if(hora2 > 23){
                        hora2 = 0;
                    }
                }
            }
            
            System.out.printf("El segundo siguiente a %d:%d:%d es %d:%d:%d.\n",hora,min,seg,hora2,min2,seg2);
            
        }else{
            System.out.println("La hora introducida no es válida.");
        }
        
    }
    
    
}
