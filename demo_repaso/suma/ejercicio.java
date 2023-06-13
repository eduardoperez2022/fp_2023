/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_repaso.suma;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ejercicio {
    
    

    public static void ejecutar(){


        Scanner entrada = new Scanner (System.in);

        System.out.println("ingrese su numero: ");
        int limite = entrada.nextInt();

        int sumapares=0;
        int sumaimpares=0;
        for (int i = 0; i <= limite; i++) {

            if (i%2 == 0) {
                sumapares= i+sumapares;

            }else {
                sumaimpares= i+sumaimpares;

            }

        }
               System.out.println("La suma de sus pares es: " +sumapares);
            System.out.println("La suma de sus impares es: "+ sumaimpares);


    }
}


