package demo_obj1;


/**
 *
 * @author eduardo
 */
public class automovil {
    
    public double litrosconsumidos;
    public double kmrecorridos;
    public double elconsumo;

    public automovil(double kmrecorridos, double litrosconsumidos) {
        this.litrosconsumidos = litrosconsumidos;
        this.kmrecorridos = kmrecorridos;
    }

    public void calculo_consumo() {
        this.elconsumo=0;
        this.elconsumo = this.kmrecorridos / this.litrosconsumidos;
    }
    
    
    public double getLitrosconsumidos() {
        return litrosconsumidos;
    }

    public double getKmrecorridos() {
        return kmrecorridos;
    }

    public void setLitrosconsumidos(double litrosconsumidos) {
        this.litrosconsumidos = litrosconsumidos;
    }

    public void setKmrecorridos(double kmrecorridos) {
        this.kmrecorridos = kmrecorridos;
    }
    
}
