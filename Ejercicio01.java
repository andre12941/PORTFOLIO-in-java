package tarea01;

import java.util.Scanner;

/**
 * Ejercicio 1. Cálculos aritméticos.
 *
 * @author Indica el nombre del alumno/a
 */
public class Ejercicio01 {
    
    // Definición del enum

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Variables de entrada
        int x ; 
        int y ; 
        int z ;
        
        // Variables de salida
        double operacion1;
        double operacion2;
        double operacion3;
        
        // Variables auxiliares
        int num1;
        int num2;
        num1 = 3;
        num2 = 8;
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);
      
        System.out.println("Introduce una cantidad para la variable x");
        x = teclado.nextInt();
        System.out.println("Introduce una cantidad para la variable y");
        y = teclado.nextInt();
        System.out.println("Introduce una cantidad para la variable z");
        z = teclado.nextInt();
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CÁLCULOS ARITMÉTICOS");
        System.out.println("--------------------");
        

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Primera expresión
        operacion1 = ((x  / num1) + num2);
        
        // Segunda expresión
        operacion2 = ((Math.pow(x, 2)) / (Math.pow(y, 2))) + ((Math.pow(y, 2)) / (Math.pow(z, 2)));
        
        // Tercera expresión
        operacion3 = ((Math.pow(x, 2)) + (3*(x)*(y)) +(Math.pow(y, 2))) / ((1)/(Math.pow(x, 2)));
        
        // Cuarta expresión
        
        
        // Quinta expresión
        
        
        // Sexta expresión
        
        
        // Séptima expresión
        
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println(" Operacion 1 = " + operacion1);
        System.out.println("Operacion 2 = " + operacion2);
        System.out.println("Operacion 3 = " + operacion3);
        System.out.println("---------");
    }
}
