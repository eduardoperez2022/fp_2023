/*
D210- Escribir un programa en Java que lea un texto de dos palabras, y luego un texto de una palabra.
Obtener un nuevo string intercalando la segunda palabra leida, en el medio de la primera frase leida. */
package demo_practica.d210;

import java.util.Scanner;

/**
 *
 * @author Usuario COMENIO
 */
public class d210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingresar dos frases:");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        
        String sol1 = s1.replace(" ", s2);
        
        System.out.println("Sol1: " + sol1);
        
        int pos1 = s1.indexOf(" ");
        String p1 = s1.substring(0,pos1);
        String p2 = s1.substring(pos1);
        
        String p3 = p1 + s2 + p2;
        
        System.out.println("Sol2: " + p3);
        
        int pos2 = s1.indexOf(" ");
        StringBuilder sb = new StringBuilder(s1);
        sb.insert(pos2, s2);
        
        System.out.println("Sol3: " + sb.toString());
        
    }
    
}

