/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo10_recibo;

/**
 *
 * @author eperez50
 */
public class recibo {
    
    private String construido;
    
    public void construir(String pnombre, String pimporte, String pconcepto, String pfecha) {

        String salida="";
        
        String Plantilla = "------------------------------------------------------------\n\n";
        Plantilla = Plantilla.concat("Recibo – Fecha <fecha>\n\n");
        Plantilla = Plantilla.concat("Recibí del Sr/a <nombre> la cantidad de pesos <importe> por\n");
        Plantilla = Plantilla.concat("el concepto de <concepto>\n\n");
        Plantilla = Plantilla.concat("------------------                       -------------------\n");
        Plantilla = Plantilla.concat("  Firma emisor                               Firma receptor\n");
        Plantilla = Plantilla.concat("------------------------------------------------------------\n\n");
        
        salida = Plantilla;
        
        salida = salida.replace("<nombre>", pnombre);
        salida = salida.replace("<importe>", pimporte);
        salida = salida.replace("<concepto>", pconcepto);
        salida = salida.replace("<fecha>", pfecha);
        
        this.construido = salida;
        
    }

    public String getConstruido() {
        return construido;
    }

}
