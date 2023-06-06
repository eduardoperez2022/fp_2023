/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo10_recibo;

import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class menu {
    
    String nombre;
    String importe;
    String concepto;
    String fecha;
    
    public void principal() {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese: nombre, importe, concepto y fecha:");    
        this.nombre = sc.nextLine();
        this.importe = sc.nextLine();
        this.concepto = sc.nextLine();
        this.fecha = sc.nextLine();
        
        recibo rec = new recibo();
        rec.construir(nombre, importe, concepto, fecha);
        
        String elrecibo = rec.getConstruido();
        
        System.out.println("");
        System.out.println("");
        System.out.println(elrecibo);
        
    }
}
