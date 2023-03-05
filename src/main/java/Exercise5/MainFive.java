package Exercise5;

import Exercise4.Vehicle;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class MainFive {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("==== Bienvenido a la aplicación Sofka vehículos ====");
        System.out.println("Aplicación donde podrá crear y ver diferente tipo de vehículo según si preferencia.");

        int option;
        boolean exit = false;

        while (!exit)
        {
            System.out.println("==== Menú Principal ==== ");
            System.out.println("Opción 1. Crear coche.");
            System.out.println("Opción 2. Crear moto.");
            System.out.println("Opción 3. Crear camión.");
            System.out.println("Opción 4. Crear bicicleta.");
            System.out.println("Opción 5. Crear lancha.");
            System.out.println("Opción 6. Para salir de la aplicación.");

            try
            {
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option)
                {

                    case 1:
                        vehicles.clear();
                        System.out.println("== Ingrese los datos del coche: ==");
                        System.out.print("Opciones. 3 o  5 puertas: ");
                        int threeOFive = scanner.nextInt();
                        if ((threeOFive == 3) || (threeOFive == 5))
                        {
                            menu.showMenu(vehicles);
                            Coche coche = new Coche(threeOFive, vehicles.get(0).getNumPassengers(),
                                    vehicles.get(0).isPresPassengers(),
                                    vehicles.get(0).getNumWheels(),
                                    vehicles.get(0).getDateRegistration(),
                                    vehicles.get(0).getForDesplazamineto(),
                                    vehicles.get(0).getColor());
                            System.out.println(coche.toString());

                        } else
                        {
                            System.out.println("El coche tiene que tener 3 o 5 puertas.");
                        }

                        break;

                    case 2:
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
                        System.out.println("¡Has salido de la aplicación, vuelva pronto!");
                        exit = true;

                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 4");
                }

            } catch (InputMismatchException e)
            {
                System.out.println("Debe ingresar los datos según la instrucción dada. ");
                scanner.next();
            }

        }

    }

}
