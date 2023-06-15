package demo_practica.d209;

import java.util.Scanner;

/**
 *
 * @author Usuario COMENIO
 */
public class d209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresar un numero:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int nn = (n*10)+n;
        int nnn = (n*100) + nn;
        int result1 = n+nn+nnn;
        
        System.out.println("Resultado 1:" + result1);
        
        int result2 = n + (n*11) + (n*111);
        System.out.println("Resultado 2:" + result2);
        
        
        System.out.println("Ingresar un numero:");
        scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String ss = s.concat(s);
        String sss = ss.concat(s);
        
        Integer s1 = Integer.parseInt(s);
        Integer s2 = Integer.parseInt(ss);
        Integer s3 = Integer.parseInt(sss);
        
        System.out.println("la suma de:" + s + " + " + ss + " + " + sss);
        System.out.println("la suma de:" + s1 + " + " + s2 + " + " + s3);
        
        int result3 = s1 + s2 + s3;

        System.out.println("Resultado 3:" + result3);
        
    }
    
}
