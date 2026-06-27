package tarea02;

import java.util.Scanner;

/**
 * Ejercicio 1. SUELDOS DE EMPLEADOS.
 *
 * @author Andres Morales de los Rios 
 */
public class Ejercicio01 {   
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        
        int sueldobase;
        sueldobase  = 1500;
        int extraPoraño;
        extraPoraño = 50;
        // Variables de entrada
        int añosEmpleado1;
        int añosEmpleado2;
        int añosEmpleado3; 
        // Variables de salida
        
        int pagaAlta;
        pagaAlta = 100;
        
        int pagaBaja;
        pagaBaja = 20;
        
        //Variables auxiliares
        short option;
        
      
        
        
        // Clase Scanner para petición de datos de entrada
      
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 2: Sueldos de Empleados\n");
        System.out.println("-----------------------------------------");      
        
        
        // Bloque 1: Sacamos por pantalla el menú de opciones y pedimos que introduzca una.
        // En caso de introducir una opción inválida, debemos indicarlo y volver a pedirla.  
         
        
        System.out.println("Menu de Opciones");
        System.out.println(" 1 = Calcular el Sueldo en Funcion de la Antiguedad");
        System.out.println(" 2 = Calcular el coste anual y mensual de un empleado nuevo que acaba de llegar a la empresa");
        System.out.println(" 3 = Salir del Programa");
        Scanner teclado = new Scanner(System.in);
      
        
       
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Cuando haya introducido una opción válida, llevamos a cabo la acción oportuna
        //  -Si nos indica 'Salir', nos despedimos y terminamos
        //  -Si nos indica las opciones 1 o 2
        //      -Realizamos los cálculos oportunos

      // uslizamos el do - while para crear la estructura repetitiva depues de usar el menu de opciones  
     do {   
        
        System.out.println("Introduzca una opcion"); 
        option = teclado.nextShort();
   
        switch (option)
        
        { 
        
            case 1 -> {
                System.out.println("Introduce la antiguedad del empleado 1");
                añosEmpleado1 = teclado.nextInt();
                System.out.println("Introce la antiguedad del empleado 2");
                añosEmpleado2 = teclado.nextInt();
                System.out.println("Introce la antiguedad del empleado 3");
                añosEmpleado3 = teclado.nextInt();
                
                int extra1;
                extra1 = añosEmpleado1 > 5 ? pagaAlta : pagaBaja;
                int extra2;
                extra2 = añosEmpleado2 > 5 ? pagaAlta : pagaBaja;
                int extra3;
                extra3 = añosEmpleado3 > 5 ? pagaAlta : pagaBaja;
                
                System.out.println("Los salarios mensuales de los Empleados son");
                System.out.println("Empleado 1 " + ((sueldobase  + (extraPoraño * añosEmpleado1)) + extra1));
                System.out.println("Empleado 2 " + ((sueldobase  + (extraPoraño * añosEmpleado2)) + extra2));
                System.out.println("Empleado 3 " + ((sueldobase  + (extraPoraño * añosEmpleado3)) + extra3));
                      }
            case 2 -> {  
                System.out.println(" El salario anual y mensual del Empleado Nuevo es el siguiente : ");
                System.out.println(" Anual : " + ((sueldobase * 14) + (pagaBaja)/5)) ;    
                System.out.println("Mensual: " + (sueldobase + (((pagaBaja)/5))/12));
                      }
            case 3 ->{System.out.println("Saliendo del Programa... "); 
                     }
            default -> System.out.println(" Error. Opcion no valida... Vuelve a intentarlo");
                     }
            }while (option !=3);
   
   
            }}
           
        
        

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
                   

