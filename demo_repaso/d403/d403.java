/*
D403- Escribir un programa en java que pida dos números por teclado, y calcule la 
potencia del primero elevado al segundo, sin usar librería matemática.
 */
package demo_repaso.d403;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class d403 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int numero1;
        final int potencia;

        System.out.print("ingrese el numero: ");
        numero1 = entrada.nextInt();

        System.out.print("ingrese su exponente: ");
        potencia = entrada.nextInt();

        int resultado = calcularPotencia(numero1, potencia);
        System.out.println("El resultado de " + numero1 + " elevado a la " + potencia + " es: " + resultado);
    }

    public static int calcularPotencia(int numero1, int potencia) {
        int resultado = 1;

        for (int i = 0; i < potencia; i++) {
            resultado *= numero1;
        }

        return resultado;
    }
}
