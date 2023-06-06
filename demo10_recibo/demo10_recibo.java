/*

D204- Escribir un programa en java que lea los siguientes datos como texto cada uno:
Nombre, importe, concepto y fecha
Luego implementar una clase recibo, con un método de nombre construir. Este método debe recibir los
campos recién leídos como parámetros, e intercalarlos sobre una plantilla de texto fijo existente. La
plantilla es la siguiente:
---
Recibo – Fecha <fecha>
Recibí del Sr/a <nombre> la cantidad de pesos <importe> por el concepto de <concepto>

------------------                                   -------------------
---
Firma emisor Firma receptor
El texto final construido debe quedar en una variable de la clase recibo. Luego imprimir en pantalla el
resultado del texto construido.

*/
package demo10_recibo;

/**
 *
 * @author eperez50
 */
public class demo10_recibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        menu mm = new menu();
        mm.principal();
        
    }
    
}
