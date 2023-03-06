package Exercise5;

/**
 * Importamos la clase vehiculo pára implementar durante el programa
 */
import Exercise4.Vehicle;

/**
 * Estas librería nos permite manejar: arrays, capturar la excepciones, lista  y capturar de datos por teclado durante el programa
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class MainFive {
    
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
        List<Vehicle> vehicles = new ArrayList<>();
       
        /**
         * Se crea una instancia de la clase Menu
         */
        Menu menu = new Menu();

        /**
         * Imprime un menú inicial de Bienvenida
         */
        System.out.println("==== Bienvenido a la aplicación Sofka vehículos ====");
        System.out.println("Aplicación donde podrá crear y ver diferente tipo de vehículo según si preferencia.");

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
            System.out.println("Opción 1. Crear coche.");
            System.out.println("Opción 2. Crear moto.");
            System.out.println("Opción 3. Crear camión.");
            System.out.println("Opción 4. Crear bicicleta.");
            System.out.println("Opción 5. Crear lancha.");
            System.out.println("Opción 6. Para salir de la aplicación.");

            try {
                
                /**
                 * Se le captura en la variable option lo que el usuario ingrese
                 */
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option) {

                    case 1:
                        
                        /**
                         * Crea y muestra un objetos tipo Coche con sus atributos
                         */
                        vehicles.clear();
                        System.out.println("== Ingrese los datos del coche: ==");
                        System.out.print("Opciones. 3 o  5 puertas: ");
                        int threeOFive = scanner.nextInt();
                        if ( (threeOFive == 3) || (threeOFive == 5) ) {
                            menu.showMenu(vehicles);
                            Coche coche = new Coche(threeOFive, vehicles.get(0).getNumPassengers(),
                                    vehicles.get(0).isPresPassengers(),
                                    vehicles.get(0).getNumWheels(),
                                    vehicles.get(0).getDateRegistration(),
                                    vehicles.get(0).getForDesplazamineto(),
                                    vehicles.get(0).getColor());
                            System.out.println(coche.toString());

                        } else {
                            System.out.println("El coche tiene que tener 3 o 5 puertas.");
                        }
                        break;

                    case 2:
                        
                        /**
                         * Crea y muestra un objetos tipo Moto con sus atributos
                         */
                        vehicles.clear();
                        System.out.println("== Ingrese los datos de la moto: ==");
                        System.out.print("Ingrese el Tipo. Ejemplo: Deportiva. Classica: ");
                        String tipo = scanner.next();
                        menu.showMenu(vehicles);
                        Moto coche = new Moto(tipo, vehicles.get(0).getNumPassengers(),
                                vehicles.get(0).isPresPassengers(),
                                vehicles.get(0).getNumWheels(),
                                vehicles.get(0).getDateRegistration(),
                                vehicles.get(0).getForDesplazamineto(),
                                vehicles.get(0).getColor());
                        System.out.println(coche.toString());
                        break;

                        /**
                         * Crea y muestra un objetos tipo Camion con sus atributos
                         */
                        case 3:
                       vehicles.clear();
                        System.out.println("== Ingrese los datos del camion: ==");
                        System.out.print("Ingrese la altura: ");
                        double height = scanner.nextDouble();
                        menu.showMenu(vehicles);
                        Camion camion = new Camion (height, vehicles.get(0).getNumPassengers(),
                                vehicles.get(0).isPresPassengers(),
                                vehicles.get(0).getNumWheels(),
                                vehicles.get(0).getDateRegistration(),
                                vehicles.get(0).getForDesplazamineto(),
                                vehicles.get(0).getColor());
                        System.out.println(camion.toString());                            
                        break;
                        
                        case 4:
                        
                         /**
                         * Crea y muestra un objetos tipo Bicicleta con sus atributos
                         */
                        vehicles.clear();
                        System.out.println("== Ingrese los datos de la bicicleta: ==");
                        System.out.print("Ingrese el materia de fabricacion: ");
                        String material = scanner.next();
                        menu.showMenu(vehicles);
                        Bicicleta bicicleta = new Bicicleta (material, vehicles.get(0).getNumPassengers(),
                                vehicles.get(0).isPresPassengers(),
                                vehicles.get(0).getNumWheels(),
                                vehicles.get(0).getDateRegistration(),
                                vehicles.get(0).getForDesplazamineto(),
                                vehicles.get(0).getColor());
                        System.out.println(bicicleta.toString());                        
                        break;
                        
                         case 5:
                         
                         /**
                         * Crea y muestra un objetos tipo Lancha con sus atributos
                         */
                         vehicles.clear();
                        System.out.println("== Ingrese los datos de la lancha: ==");
                        System.out.print("Ingrese la funcionalidad. Ejemplo: Pesca. Transporte:");
                        String functionality = scanner.next();
                        menu.showMenu(vehicles);
                        Lancha lancha = new Lancha (functionality, vehicles.get(0).getNumPassengers(),
                                vehicles.get(0).isPresPassengers(),
                                vehicles.get(0).getNumWheels(),
                                vehicles.get(0).getDateRegistration(),
                                vehicles.get(0).getForDesplazamineto(),
                                vehicles.get(0).getColor());
                        System.out.println(lancha.toString());                        
                        break;
                        
                    case 6:
                        
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
                        System.out.println("Las opciones son entre 1 y 6");
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
