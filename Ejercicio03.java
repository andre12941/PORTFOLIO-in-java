package tarea01;

import java.util.Scanner;

/**
 * Ejercicio 3. Validación de contraseñas.
 *
 * @author Indica el nombre del alumno/a
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Variables de entrada
        // Variables de salida
        // Variables auxiliares
        System.out.println("Necesitamos que registres unas contraseña para ello debe tener");
        System.out.println("12 caracteres, empezar con una vocal minuscula o mayuscula");
        System.out.println("terminar en una consonante minuscula o mayusucla y ");
        System.out.println("poseer lo siguientes caracteres especiales: @ , # , _ , . , ; ");
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduce una contraseña");
        String contraseña = teclado.nextLine();

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VALIDACIÓN DE CONTRASEÑAS");
        System.out.println("-------------------------");

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Cálculo de información auxiliar previa
        // Comprobamos si tiene como mínimo 12 caracteres
        boolean LongitudValida = contraseña.length() >= 12;

        // Comprobamos si comienza por una vocal (mayúscula o minúscula)
        boolean comienzaConVocal = "AEIOUaeiou".indexOf(contraseña.charAt(0)) != -1;

        // Comprobamos si termina con una consonante (mayúscula o minúscula)
        boolean terminaConConsonante = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(contraseña.charAt(contraseña.length() - 1)) != -1;

        // Comprobamos si contiene al menos uno de los caracteres especiales requeridos
        boolean contieneCaracterEspecial = contraseña.contains("@") || contraseña.contains("#") || contraseña.contains("_") || contraseña.contains(".") || contraseña.contains(";");
        // Validacion

        boolean esValida = LongitudValida && comienzaConVocal && terminaConConsonante && contieneCaracterEspecial;
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        String mensaje = esValida ? "La contraseña es válida." : "La contraseña no es válida.";

        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println(mensaje);
    }
}
