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
public class menu_numero {
    
    public int pide_numero() {
        
        int salida=0;
        
        Scanner sc = new Scanner(System.in);
        
        String n1="";        

        System.out.println("Ingrese un numero:");
        
        n1 = sc.nextLine(); 
        
        salida = Integer.parseInt(n1);        
        
        return salida;
    }
    
}
