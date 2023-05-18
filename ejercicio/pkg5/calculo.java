
package ejercicio.pkg5;


public class calculo {
    
    
    public double superficie;
    public double altura;
    public double volumen;

    public calculo(double superficie, double altura) {
        this.superficie = superficie;
        this.altura = altura;
        
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getAltura() {
        return altura;
    }

   
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

     
        
  public void calculo_volumen(){
           
      this.volumen = this.superficie * this.altura;
  }
}

