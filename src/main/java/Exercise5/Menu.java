
package Exercise5;

import Exercise4.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class Menu {
    
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
