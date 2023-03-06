
package Exercise5;

/**
 * Importamos la clase vehiculo pára implementar en durante el programa
 */
import Exercise4.Vehicle;

/**
 * Esta librería nos permite manejar: listas y colecciones  durante el programa
 */
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class Menu {
    
    
    /**
     * Método que permite capturar y guardar objecto tipo vehiculo en un lista
     *
     * @param vehicles
     */
    public  void showMenu( List<Vehicle> vehicles){
        Scanner scanner = new Scanner(System.in);
                            
                            System.out.print("Numero de pasajeros: ");
                             int numPassenger = scanner.nextInt();
                             
                            System.out.print("Presencia de pasajeros. Observación: Ingrese true si contiene pasajero O  ");
                            System.out.print("false si no contiene: ");
                            Boolean prePassengers = scanner.nextBoolean();

                            System.out.print("Número de ruedas: ");
                            int numWheels = scanner.nextInt();

                            System.out.print("Fecha de matriculación. Observación. Ingrese el formato de la siguiente forma: ");
                            System.out.print("dia/mes/año: ");
                            String dateRegistration = scanner.next();

                            System.out.print("Modo de circulación: ");
                            String forDesplazamineto = scanner.next();
                            
                            System.out.print("Color: ");
                            String color = scanner.next();
                            
                            vehicles.add( new Vehicle(numPassenger, prePassengers, numWheels, 
                                                                                               dateRegistration, forDesplazamineto, color) );
                            
        
    }
    
    
    
}
