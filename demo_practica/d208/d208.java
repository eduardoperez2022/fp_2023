package demo_practica.d208;

import java.util.Scanner;

/**
 *
 * @author fruggiero
 */
public class d208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Ingresá una palabra : ");

        String word = entry.nextLine();

        if (!word.startsWith("a")) {
            if (word.length() < 5) {
                System.out.println("Contiene menos de 5 caracteres y no comienza por la letra a");
            }
            if (word.length() >= 5 && word.length() <= 15) {
                System.out.println("Contiene entre 5 y 15 caracteres y no comienza por la letra a");
            }
            if (word.length() > 15) {
                System.out.println("Contiene más de 15 caracteres y no comienza por la letra a");
            }
        } else {
            if (word.length() < 5) {
                System.out.println("Contiene menos de 5 caracteres y empieza con la letra a");
            }
            if (word.length() >= 5 && word.length() <= 15) {
                System.out.println("Contiene entre 5 y 15 caracteres y empieza con la letra a");
            }
            if (word.length() > 15) {
                System.out.println("Contiene más de 15 caracteres y empieza con la letra a");
            }
        }

    }

}
