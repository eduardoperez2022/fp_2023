package juego1a10;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class juego {
    
    public int incognita;
    
    public void menu() {
        
        int numero=0;
        
        Scanner menu = new Scanner(System.in);
        
        this.calculo_incognita();
        System.out.println("Adivine un numero entre 0 y 9 !!! tiene tres intentos :");
        // tres intentos con for
        for(int i=0; i<3; i++) {
            
            numero = menu.nextInt();
            
            if (this.proceso_entrada(numero) == true) {
                System.out.println("Adivino !!!");
            }
            else {
                System.out.println("Casi ... intente de nuevo ...");
            }
        }

        System.out.println(this.incognita);
        
    }
    
    public void calculo_incognita() {
        this.incognita = (int)(Math.random()*10+1);   
    }
    
    public boolean proceso_entrada(int entrada) {
        if (entrada == this.incognita) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
