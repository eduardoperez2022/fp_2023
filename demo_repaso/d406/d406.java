/*
D406- Si la población actual fuera 7309784505 y el crecimiento poblacional por año 
fuera 24807909, realice un programa que estipule la población mundial luego de uno, 
dos, tres, cuatro y cinco años
*/
package demo_repaso.d406;

/**
 *
 * @author eduardo
 */
public class d406 {

    public static void main(String[] args) {

        long poblacion = 7309784505L;
        long crecimiento = 24807909L;

        System.out.println("poblacion actual: " + poblacion);

        for (int i = 1; i <= 5; i++) {
            poblacion += crecimiento;

            System.out.println("la poblacion del año siguiente es " + poblacion);
        }

    }

}
