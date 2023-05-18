/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practicaobjetos;

import java.util.Scanner;

/**
 *
 * @author fruggiero
 */
public class PracticaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Ejercicio C08 Martin Orefice, Yinglong Chen, Gianfranco Rosciani y Franco Ruggiero

        Scanner entry = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de eventos de falla :");
        double falla1 = entry.nextDouble();
        
        System.out.println("Ingrese cantidad de tiempo:");
        double tiempo1 = entry.nextDouble();
        
        clase1 obj1 = new clase1(falla1, tiempo1);
        obj1.confiabilidad();
        
        System.out.println("Ingrese cantidad de eventos de falla :");
        double falla2 = entry.nextDouble();
        
        System.out.println("Ingrese cantidad de tiempo:");
        double tiempo2 = entry.nextDouble();
        
        clase1 obj2 = new clase1(falla2, tiempo2);
        obj2.confiabilidad();
        
        if(obj1.confiabilidad1 > obj2.confiabilidad1){
           
        System.out.println("El mayor es el 1 :" + obj1.confiabilidad1);
        
        }else if (obj1.confiabilidad1 == obj2.confiabilidad1){
            
            System.out.println("Empate!");
        
        }else{
            
        System.out.println("El mayor es el 2 :" + obj2.confiabilidad1);
        }
        
        
    }
    
}
