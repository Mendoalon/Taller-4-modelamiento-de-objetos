package Exercise4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class MainFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicleClass = new Vehicle();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        System.out.println("==== Bienvenido a la aplicación Sofka Control Ferry ====");
        System.out.println("Aplicación donde podra crear y ver 10 vehiculos con sus caracteristicas.");

        int option;
        boolean exit = false;

        while (!exit) {
            System.out.println("==== Menú Principal ==== ");
            System.out.println("Opción 1. Crear vehiculos.");
            System.out.println("Opción 2. Ver vehiculos creados.");
            System.out.println("Opción 3. Para salir de la aplicación.");

            try {
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option)
                {

                    case 1:
                        vehicles.clear();
                        vehicleClass.createVehicle(vehicles);
                        break;

                    case 2:
                        vehicleClass.showVehicle(vehicles);

                        break;

                    case 3:
                        System.out.println("¡Has salido de la aplicación, vuelva pronto!");
                        exit = true;

                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar los datos según la instrucción dada. ");
                scanner.next();
            }

        }

    }
}
