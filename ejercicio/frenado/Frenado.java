package ejercicio.frenado;

import java.util.Scanner;

public class Frenado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese kg1 y metros1: ");
        double kg1 = sc.nextDouble();
        double metros1 = sc.nextDouble();

        System.out.println("Ingrese kg2 y metros2: ");
        double kg2 = sc.nextDouble();
        double metros2 = sc.nextDouble();

        coeficienteFrenado frenado1 = new coeficienteFrenado(kg1, metros1);
        coeficienteFrenado frenado2 = new coeficienteFrenado(kg2, metros2);
        frenado1.calculo();
        System.out.println("Resultado frenada 1: " + frenado1.calculo);
        frenado2.calculo();
        System.out.println("Resultado frenada 2: " + frenado2.calculo);

        if (frenado1.calculo > frenado2.calculo) {

            System.out.println("La frenada 1 es mayor");
        } else if (frenado2.calculo > frenado1.calculo) {
            System.out.println("Frenada 2 es mayor");
        } else {
            System.out.println("Son iguales");
        }

    }

}
