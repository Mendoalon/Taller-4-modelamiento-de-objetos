package Exercise1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class MainOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlanetarySystem planets = new PlanetarySystem();
        ArrayList<Planet> myPlanets = new ArrayList<>();

        int option;
        boolean exit = false;

        myPlanets.addAll(planets.createCelestialbody());

        System.out.println("==== Bienvenido a la aplicación Planeta Sofka  ====");
        System.out.print("Aplicación donde podrá conocer los planetas del sistema solar y ");
        System.out.println("conecer la atracion gravitacional de los planetas.");

        while (!exit)
        {
            System.out.println("==== Menu Principal ====\n1. Mostrar los planetas de nuestro sistema solar. ");
            System.out.println("2. Calcular atracción gravitatoria de dos planetas.");
            System.out.println("3. Para salir de la aplicación.");

            try {
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option) {

                    case 1:
                        planets.viewPlanets(myPlanets);
                        break;

                    case 2:
                        planets.gravitAttraction(myPlanets);
                        break;

                    case 3:
                        System.out.println("¡Has salido de la aplicación, vuelva pronto!");
                        exit = true;

                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 3");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número");
                scanner.next();
            }

        }

    }

}
