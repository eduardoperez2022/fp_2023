/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.practicaobjetos;

/**
 *
 * @author fruggiero
 */
public class clase1 {
    public double cantidad_falla;
    public double tiempo;
    public double confiabilidad1;
    

    public clase1(double cantidad_falla, double tiempo) {
        this.cantidad_falla = cantidad_falla;
        this.tiempo = tiempo;
    }
    
    public void confiabilidad(){
        
        this.confiabilidad1 = this.cantidad_falla / this.tiempo;
        
    }

    public double getCantidad_falla() {
        return cantidad_falla;
    }

    public void setCantidad_falla(double cantidad_falla) {
        this.cantidad_falla = cantidad_falla;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
}
