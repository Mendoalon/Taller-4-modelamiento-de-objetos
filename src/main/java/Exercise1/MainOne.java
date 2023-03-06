package Exercise1;

/**
 * Esta librería nos permite manejar array durante el programa
 */
import java.util.ArrayList;

/**
 * Esta librería nos permite capturar la excepciones ingresadas por teclado
 */
import java.util.InputMismatchException;

/**
 * Esta librería nos permite recibir datos por teclado
 */
import java.util.Scanner;

/**
 * Representa la clase principal del proyecto.
 * @author Luis mendoza
 */
public class MainOne {

    /*
    * Método pricipal del proyecto.
     */
    public static void main(String[] args) {
        
        /**
         * Se inicializa la librería escáner que recibe parámetro por teclado
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Se crea una instancia de la clase PlanetarySystem
         */
        PlanetarySystem planets = new PlanetarySystem();

        /**
         * Se crea un nuevo objeto de tipo myPlanets de tipo arraylist
         */
        ArrayList<Planet> myPlanets = new ArrayList<>();

        /**
         * Variable para guardar la opción que ingrese el usuario
         */
        int option;

        /**
         * Variable que permite salir del programa
         */
        boolean exit = false;

        /**
         * Se asigna el objeto de tipo arraylist todo lo que contiene arraylist celestialBody
         */
        myPlanets.addAll(planets.createCelestialbody());

        /**
         * Imprime un menú inicial de Bienvenida
         */
        System.out.println("==== Bienvenido a la aplicación Planeta Sofka  ====");
        System.out.print("Aplicación donde podrá conocer los planetas del sistema solar y ");
        System.out.println("conecer la atracion gravitacional de los planetas.");

        /**
         * Si la variable exit es false se ejecuta la condición del While
         */
        while (!exit)
        {
            /**
             * Opciones a mostrar al usuario
             */
            System.out.println("==== Menu Principal ====\n1. Mostrar los planetas de nuestro sistema solar. ");
            System.out.println("2. Calcular atracción gravitatoria de dos planetas.");
            System.out.println("3. Para salir de la aplicación.");

            try {
                
                /**
                 * Se le captura en la variable option lo que el usuario ingrese
                 */
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option) {

                    case 1:
                        /**
                         * Muestra todos los planestas del sistema
                         */
                        planets.viewPlanets(myPlanets);
                        break;

                    case 2:
                        /**
                         * Captura y muestra los seleccionado con la atracción gravitatoria
                         */
                        planets.gravitAttraction(myPlanets);
                        break;

                    case 3:
                        /**
                         * Mostramos mensaje de despedida al usuario y le asignamos a la variable exit true para salir de la aplicación
                         */
                        System.out.println("¡Has salido de la aplicación, vuelva pronto!");
                        exit = true;

                        break;

                    default:
                        /**
                         * Se controla que el usuario ingrese solo las opciones dadas
                         */
                        System.out.println("Las opciones son entre 1 y 3");
                }

            } catch (InputMismatchException e) {
                /**
                 * Exception para que el usuario solo ingrese números
                 */
                System.out.println("Debe ingresar un número");
                scanner.next();
            }

        }

    }

}
