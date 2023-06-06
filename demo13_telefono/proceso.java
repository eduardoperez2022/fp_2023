/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo13_telefono;

/**
 *
 * @author eperez50
 */
public class proceso {
    
    private String formateado="";
    
    public void formateo(String ptelefono) {
        // Número Telefónico: 5256284000
        // Nueva Cadena: (52)-5-6284000
        String salida = "";
        
        salida = salida.concat("(");
        salida = salida.concat(ptelefono.substring(0, 2));
        salida = salida.concat(")-");
        salida = salida.concat(ptelefono.substring(2, 3));
        salida = salida.concat("-");
        salida = salida.concat(ptelefono.substring(3));
        
        this.formateado = salida;
    }


    public void formateo_sb(String ptelefono) {
        // Número Telefónico: 5256284000
        // Nueva Cadena: (52)-5-6284000
        StringBuffer  salida =  new StringBuffer();
        
        salida.append("(");
        salida.append(ptelefono.substring(0, 2));
        salida.append(")-");
        salida.append(ptelefono.substring(2, 3));
        salida.append("-");
        salida.append(ptelefono.substring(3));
        
        this.formateado = salida.toString();
    }
    
    
    
    public String getFormateado() {
        return formateado;
    }

}
