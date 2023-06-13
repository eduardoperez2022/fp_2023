/*

D402- Escribir un programa en java que pida ingresar datos como nombre, edad y 
salario base. Luego calcular el salario final de acuerdo a estas reglas:
- Si es menor de 16 no tiene edad para trabajar
- Entre 19 y 50 años el salario es un 5 por ciento más
- Entre 51 y 60 años el salario es un 10 por ciento más
- Si es mayor de 60 el salario es un 15 por ciento más

*/
package demo_repaso.d402;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class d402 {

    public static void main(String[] args) {
        // TODO code application logic here
        d402 ejercicio = new d402();
        ejercicio.solucion();
        
    }

    public void solucion() {

        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese un nombre: ");
            String nombre = entrada.next();

            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();

            System.out.println("Ingrese su salario base: ");
            int salarioBase = entrada.nextInt();

            if (edad <= 50 && edad >= 19) {
                double porsentaje1950 = (salarioBase * 5) / 100;
                double salario1950 = porsentaje1950 + salarioBase;
                System.out.println("el salario de " + nombre + " sera de : " + salario1950);
            } else if (edad >= 51 && edad <= 60) {
                double porsentaje5160 = (salarioBase * 10) / 100;
                double salario5160 = porsentaje5160 + salarioBase;
                System.out.println("el salario de " + nombre + " sera de : " + salario5160);
            } else if (edad > 60) {
                double porsentaje60 = (salarioBase * 15) / 100;
                double salario60 = porsentaje60 + salarioBase;
                System.out.println("el salario de " + nombre + " sera de : " + salario60);
            } else if (edad <= 18 && edad > 0) {
                System.out.println(nombre + " no tiene edad para trabajar ");
            } else {
                System.out.println(nombre + " has ingresado una edad invalida");
            }

            System.out.println("Desea continuar (s/n)");
            String repetir = entrada.next();

            continuar = repetir.equalsIgnoreCase("s");

        }
    }
}
