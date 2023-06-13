/*
 * C05 – Realiza un programa que pida el ingreso de dos valores tipo doble, uno correspondiente a una superficie, 
y otro valor a una altura. Estos dos valores deben ser usados para construir un objeto del tipo cilindro. El objeto
cilindro debe tener un constructor con los dos parámetros, getter y setter, y un metodo que calcule el volumen del 
cilindro (superficie de base por altura). Se deben ingresar dos veces los valores para construir dos objetos de este
tipo, y luego calcular cual de los dos cilindros tiene mayor volumen. Informar el resultado al final del programa.
 */
package demo_repaso.pkg5;

import java.util.Scanner;


public class ejercicio5 {

   
    public static void main(String[] args) {
       
        double sup1;
        double base1;
        
        double sup2;
        double base2;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println(" ********** Bienvenido al cilindrometro ****************");
        
        System.out.println(" ingrese la altura de su cilindro 1");
        sup1 = teclado.nextDouble();
        System.out.println("ingrese la base de su cilintro 1");
        base1 = teclado.nextDouble();
        
        System.out.println("********* ingrese los segundos valores *********");
        
        System.out.println(" ingrese la altura de su cilindro 2");
        sup2 = teclado.nextDouble();
        System.out.println("ingrese la base de su cilintro 2");
        base2 = teclado.nextDouble();
        
        
        calculo cilindro1 = new calculo (sup1,base1);
        cilindro1.calculo_volumen();
        
        calculo cilindro2 = new calculo (sup2,base2);
        cilindro2.calculo_volumen();
        
        if (cilindro1.volumen > cilindro2.volumen ){
            
            System.out.println(" el cilindro 1 es mas piola y grandote");
            
        }else if (cilindro2.volumen > cilindro1.volumen){
            System.out.println(" el cilindro 2 es mas piola y morrudo");
        }else{
            System.out.println(" los dos cilindros son identicos");
        }
        
        
    }
    
}
