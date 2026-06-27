
package tarea01;

/**
 * Ejercicio 2. Operaciones con constantes y variables.
 *
 * @author Indica el nombre del alumno/a
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        //---------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        double CONSTANTE1 = 80.3;
        final int CONSTANTE2 = 3;

        // Variables de entrada
        
        // Variables de salida
        
        // Variables auxiliares
        boolean valorBool;
        byte enteroByte;
        short enteroShort;
        int enteroInt, producto;
        long enteroLong;
        double decimalDoble;
        float decimalSimple;

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        // No hay entrada de datos
        System.out.println("OPERACIONES CON CONSTANTES Y VARIABLES.");
        System.out.println("---------------------------------------");
        System.out.println(" ");

        //----------------------------------------------
        //     Procesamiento 
        //----------------------------------------------
        
        //----------------------------------------------
        // Ejemplos que se proporcionan como modelo:
        
        // Las variables booleanas solo pueden tener los valores true o false
        // valorBool = 0;
        
        // decimalSimple = 9.9 * 4.6;       
        // SOLUCIÓN: CASTING EXPLÍCITO
        decimalSimple = (float) (9.9 * 4.6);

        // CASTING IMPLÍCITO: de tipo char a tipo int
        enteroInt = 'a';
        //----------------------------------------------
         // CASTING EXPLICITO
        // decimalDoble = 5,17;
        decimalDoble = (double) (5.17);
        
        //CASTING IMPLICITO: de tipo char a tipo Long
        //enteroLong = 25_369L;
        enteroLong = 25369;
        
        // Las variable int y long no pueden mezclarse
        //producto = enteroLong * enteroInt;
        
        //Los valores Booleanos solo puedn tomar valores true or false
       // valorBool = (97 == 'a' == 97);
        
        //CASTING EXPLICITO
        //CONSTANTE1 = 100.3;
          CONSTANTE1 = (double) (100.3);
        
          //CASTING IMPLICITO: de tipo char a tipo float 
        decimalSimple = 'c';
        
        //CASTING EXPLICITO
        //decimalDoble = 3.2 * 4.7;
        decimalDoble = (float) (3.2 * 4.7);
           
        // SOLUCIÓN: CASTING EXPLÍCITO
        // decimalSimple = 9.9 * 4.6;
         decimalSimple = (float) (9.9 * 4.6);
       
        // producto = CONSTANTE1 * CONSTANTE2;
        // La constante 1 siendo un entero (int) no se puede multiplicar por double
       
        
        // decimalDoble = 5.67F;
        // CASTING EXPLICITO 
        decimalDoble = (double) (5.67);
        
        
        //CASTING EXPLICITO
        // decimalDoble = 8;
        decimalDoble = (int) (8);

       // CASTING IMPLICITO DE TIPO FLOAT A TIPO INT 
       enteroInt = 1 / 2;
    }
}
