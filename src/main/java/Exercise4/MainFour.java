package Exercise4;

/**
 * Estas librería nos permite manejar: arrays, capturar la excepciones y capturar de datos por teclado durante el programa
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Representa la clase principal del proyecto.
 * 
 * @author Luis mendoza
 */
public class MainFour {

    /*
    * Método pricipal del proyecto.
     */
    public static void main(String[] args) {
        
        /**
         * Se inicializa la librería escáner que recibe parámetro por teclado
         */
        Scanner scanner = new Scanner(System.in);
        
        /**
         * Se crea una instancia de la clase Vehicle
         */
        Vehicle vehicleClass = new Vehicle();
        
        /**
         * Se crea un nuevo objeto de tipo Vehicle.
         */
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        /**
         * Imprime un menú inicial de Bienvenida
         */
        System.out.println("==== Bienvenido a la aplicación Sofka Control Ferry ====");
        System.out.println("Aplicación donde podra crear y ver 10 vehiculos con sus caracteristicas.");

        /**
         * Variable para guardar la opción que ingrese el usuario
         */
        int option;
        
         /**
         * Variable que permite salir del programa
         */        
        boolean exit = false;
        
        /**
         * Si la variable exit es false se ejecuta la condición del While
         */
        while (!exit) {
            
            /**
             * Opciones a mostrar al usuario
             */
            System.out.println("==== Menú Principal ==== ");
            System.out.println("Opción 1. Crear vehiculos.");
            System.out.println("Opción 2. Ver vehiculos creados.");
            System.out.println("Opción 3. Para salir de la aplicación.");

            try {
                
                /**
                 * Se le captura en la variable option lo que el usuario ingrese
                 */
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option) {

                    case 1:
                        
                        /**
                         * Crea 10 objetos tipo vehicles
                         */
                        vehicles.clear();
                        vehicleClass.createVehicle(vehicles);
                        break;

                    case 2:
                        
                        /**
                         * Muestra todos los vehiculos creados
                         */
                        vehicleClass.showVehicle(vehicles);

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
                        System.out.println("Las opciones son entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                
                /**
                 * Exception para que el usuario solo ingrese números
                 */
                System.out.println("Debe ingresar los datos según la instrucción dada. ");
                scanner.next();
            }

        }

    }
}
