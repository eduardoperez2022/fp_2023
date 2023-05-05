package juego1a100;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class juego {
    
    public int incognita;
    public int intentos;

    public juego() {
        this.intentos=5;
    }
    
    
    public void menu() {
        
        int numero=0;
        
        Scanner menu = new Scanner(System.in);
        
        this.calculo_incognita();

        System.out.println("Adivine un numero entre 1 y 100 !!! tiene cinco intentos :");
        
        // cinco intentos con for
        for(int i=0; i<5; i++) {
            
            numero = menu.nextInt();
            
            if (this.proceso_entrada(numero) == true) {
                System.out.println("Adivino !!!");
            }
            else {
                System.out.println("Casi ... intente de nuevo ...");
            }
        }
        
        System.out.println("El numero es: " + this.incognita);
        
    }
    
    public void calculo_incognita() {
        this.incognita = (int)(Math.random()*100+1);   
    }
    
    public boolean proceso_entrada(int entrada) {
        
        int diferencia;
        
        if (entrada == this.incognita) {
            return true;
        }
        else {
            
            diferencia = this.incognita-entrada;
            if (diferencia<0) {
                diferencia = diferencia * (-1);
            }
            
            if (diferencia >=1 && diferencia <=9) {
                System.out.println("cerca ...");
            }
            else {
                System.out.println("lejano ...");
            }
            
            return false;
        }
    }
    
    
}
