package demo_string_d205;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class proceso {
    
    public void solucion() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un texto:");
        String frase = scan.nextLine();
        
        int largo = frase.length();
        System.out.println("largo: " + largo);
        
        boolean b5 = frase.contains("5");
        System.out.println("contiene: " + b5);
        
        boolean b6 = frase.startsWith(" ");
        System.out.println("empieza: " + b6);

        boolean b7 = frase.endsWith(" ");
        System.out.println("finaliza: " + b7);

        String rep = frase.replace("a", "$");
        System.out.println("reemplazo: " + rep);
        
        String rep2 = frase.trim();
        System.out.println("sin espacios: " + rep2);
        
        int posi = frase.indexOf('5');
        System.out.println("posicion: " + posi);
        
        
    }
    
    
}
