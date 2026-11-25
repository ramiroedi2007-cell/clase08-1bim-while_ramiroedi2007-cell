/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 3;
        int contador = 1;
        double suma_total = 0;
        String nombre;
        String apellido;

        double promedio_final;
        double calificacion;
        
        String cadenafinal = "Las notas ingresadas son:\n";
        
        System.out.println("Ingrese su Nombre");
        nombre = entrada.nextLine();
        cadenafinal = String.format("\n%sEL nombre del estudiante es:%s\n", cadenafinal,nombre);
        System.out.println("Ingrese su Apellido");
        apellido = entrada.nextLine();
        cadenafinal = String.format("\n%sEl apellido del estudiante es:%s\n",cadenafinal,apellido);
        System.out.println("Ingrese las notas de los estudiantes de su "
                + "materia");

        while (contador <= limite) {
            System.out.printf("Ingrese calificación "
                    + "número %d\n", contador);
            calificacion = entrada.nextDouble();
            cadenafinal = String.format("%s%.1f\n", cadenafinal,calificacion);
            suma_total = suma_total + calificacion;
            // contador
            contador = contador + 1;
        }
        cadenafinal = String.format ("%s\nLa suma de notas es: %.1f\n",cadenafinal,suma_total);
        
        promedio_final = suma_total / limite;
         
        cadenafinal = String.format ("%s\nEl promedio es: %.1f\n",cadenafinal,promedio_final);

        //System.out.printf("El promedio final es %f\n", promedio_final);
        System.out.printf("%s\n", cadenafinal);
    }
}
/*
La cadena final acumulamos valores para presentarlos al final de tipo cadena,
entero y double 
*/