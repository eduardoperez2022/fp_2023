package demo_obj1;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Demo_obj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
            
        System.out.println("Auto 1 - Ingrese km:");
        double km = scan.nextDouble();

        System.out.println("Ingrese litros:");
        double lit = scan.nextDouble();
            
        automovil a1 = new automovil(km, lit);
            
        System.out.println("Auto 2 - Ingrese km:");
        km = scan.nextDouble();

        System.out.println("Ingrese litros:");
        lit = scan.nextDouble();
            
        automovil a2 = new automovil(km, lit);
        
        a1.calculo_consumo();
        a2.calculo_consumo();
        
        System.out.println("Cansumos Auto1: " + a1.elconsumo);
        
        System.out.println("Cansumos Auto2: " + a2.elconsumo);
        
        String mensaje;
        if (a1.elconsumo > a2.elconsumo) {
            mensaje = "Mejor consumo tiene Auto 1";
        }
        else if (a2.elconsumo > a1.elconsumo) {
            mensaje = "Mejor consumo tiene Auto 2";
        }
        else {
            mensaje = "El consumo es igual en los dos autos";
        }
        
        System.out.println(mensaje);
        
    }
    
}
