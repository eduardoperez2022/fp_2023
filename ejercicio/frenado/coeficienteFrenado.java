package ejercicio.frenado;

public class coeficienteFrenado {
    
    public double kg;
    public double metros;
    public double calculo;

    public coeficienteFrenado(double kg, double metros) {
        this.kg = kg;
        this.metros = metros;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }
    public void calculo(){
    
    this.calculo = this.kg / this.metros;
    
    
    }

    public double getKg() {
        return kg;
    }

    public double getMetros() {
        return metros;
    }
    
    
    
    
}
