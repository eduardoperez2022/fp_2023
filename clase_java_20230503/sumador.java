/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3_fp2022;

import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class sumador {
    
    public void solucion() {
     
        System.out.println("Entra a solucion");
        
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
