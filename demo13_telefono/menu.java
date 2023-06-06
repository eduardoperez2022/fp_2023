/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo13_telefono;

import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class menu {
    
    String telefono="";
    
    public void principal() {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero telefonico de 10 cifras:");    
        this.telefono = sc.nextLine();

        proceso proc = new proceso();
        proc.formateo(this.telefono);
        
        String resultado = proc.getFormateado();
        
        System.out.println(resultado);
        
        proc.formateo_sb(this.telefono);
        
        String resultado2 = proc.getFormateado();
        
        System.out.println(resultado2);
        
        
        
    }


}
