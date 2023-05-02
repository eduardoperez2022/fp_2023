/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo4_fp2022;

import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class sumador {
    
    public void solucion() {
     
        System.out.println("Entra a solucion");

        menu_numero menu1 = new menu_numero();
        
        int n11 = menu1.pide_numero();        
        int n22 = menu1.pide_numero();        
        int n33 = menu1.pide_numero();        
        int n44 = menu1.pide_numero();        
        int n55 = menu1.pide_numero();        
        
        int suma = n11+n22+n33+n44+n55;
        
        System.out.println("El resultado es " + suma);
        
    }
    
}
