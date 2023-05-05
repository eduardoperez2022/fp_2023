// C02 – Escribir un programa que calcule un numero incógnita, aleatorio, 
// del 1 al 100, y proponga al usuario descubrirlo. El usuario tiene 5 
// intentos, si falla en los 5 intentos, pierde, sino, gana el juego. 
// Como ayuda, el juego debe darle una pista al jugador, luego de cada 
// intento fallido, si la diferencia entre el número ingresado y el incógnita 
// es 10 o mayor, debe decirle “lejano”, si la diferencia es entre 1 y 9, 
// debe decirle “cerca”. Realizar el código en una clase distinta a la principal.

package juego1a100;

/**
 *
 * @author eduardo
 */
public class Juego1a100 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        juego jue = new juego();
        jue.menu();
        
    }
    
}
