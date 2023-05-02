/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Realizar un programa que deje ingresar 5 numeros y de como resultado
// la suma de esos numeros ingresados.

package demo2_fp2022;

import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class Demo2_fp2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner sc = new Scanner(System.in);
        
        String n1="";        
        String n2="";        
        String n3="";        
        String n4="";        
        String n5="";        

        System.out.println("Ingrese 5 numeros:");
        
        n1 = sc.nextLine(); 
        n2 = sc.nextLine(); 
        n3 = sc.nextLine(); 
        n4 = sc.nextLine(); 
        n5 = sc.nextLine(); 
        
        int n11 = Integer.parseInt(n1);        
        int n22 = Integer.parseInt(n2);        
        int n33 = Integer.parseInt(n3);        
        int n44 = Integer.parseInt(n4);        
        int n55 = Integer.parseInt(n5);        
        
        int suma = n11+n22+n33+n44+n55;
        
        System.out.println("El resultado es " + suma);
        
    }
}
