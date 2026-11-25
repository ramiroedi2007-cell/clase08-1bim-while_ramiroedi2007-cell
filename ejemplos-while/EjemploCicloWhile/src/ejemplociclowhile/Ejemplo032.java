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
public class Ejemplo032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite ;
        int contador = 1;
        int suma = 0;
        int valor_ingresado;
        System.out.println("Ingrese el limite:");
        limite = entrada.nextInt();

        while (contador <= limite) {
            System.out.println("Ingrese el valor a sumar");
            valor_ingresado = entrada.nextInt(); // 20
            // >=20 y <=35
            // Caso contrario... 50
            if (valor_ingresado >= 20 && valor_ingresado <= 35) {
                suma = suma + valor_ingresado; // 0 + 20 = 20
            } else {
                suma = suma + 50;
            }

            System.out.printf("Valor ingresado %d\n",
                    valor_ingresado);
            contador = contador + 1;
        }

        System.out.printf("La suma final es %d\n", suma);

    }
}
