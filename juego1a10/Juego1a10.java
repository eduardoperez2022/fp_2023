// C01 – Escribir un programa que calcule un numero incógnita, aleatorio, del 1 al 10, 
// y proponga al usuario descubrirlo. El usuario tiene 3 intentos, si falla en los 3 
// intentos, pierde, sino, gana el juego. Realizar el código en una clase distinta a 
// la principal.

package juego1a10;

/**
 *
 * @author eduardo
 */
public class Juego1a10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        juego jue = new juego();
        jue.menu();
        
    }
    
}
