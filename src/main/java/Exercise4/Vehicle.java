package Exercise4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class Vehicle  implements VehicleInterface{

    private int numPassengers;
    private boolean presPassengers;
    private int numWheels;
    private String dateRegistration;
    private String forDesplazamineto;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        this.numPassengers = numPassengers;
        this.presPassengers = presPassengers;
        this.numWheels = numWheels;
        this.dateRegistration = dateRegistration;
        this.forDesplazamineto = forDesplazamineto;
        this.color = color;
    }


    
    public void createVehicle( ArrayList<Vehicle> vehicles) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 1; i++) {
                            System.out.println("Ingrese los datos del vehiculo # " + i);
                            
                            System.out.print("Numero de pasajeros: ");
                            int numPassenger = scanner.nextInt();

                            System.out.print("Presencia de pasajeros. Observación: Ingrese true si contiene pasajero O  ");
                            System.out.print("false si no contiene: ");
                            Boolean prePassengers = scanner.nextBoolean();

                            System.out.print("Número de ruedas: ");
                            int numWheels = scanner.nextInt();

                            System.out.print("Fecha de matriculación. Observación. Ingrese el formato de la siguiente forma: dia/mes/año: ");
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

    
    public void showVehicle(ArrayList<Vehicle> vehicles) {
        if (!(vehicles.size() <= 0)) {
            System.out.println("Caracterisiticas del vehiculo: ");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        } else {
            System.out.println("No ha creado vehículo, por favor crearlo para poder mostrar.");
        }

    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public boolean isPresPassengers() {
        return presPassengers;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String getDateRegistration() {
        return dateRegistration;
    }

    public String getForDesplazamineto() {
        return forDesplazamineto;
    }

    public String getColor() {
        return color;
    }
    
    
    
    
        @Override
    public String toString() {
        return  "número de pasajeros = " + numPassengers 
                     + ", presencia de tripulación = " + ((presPassengers)? "si": "no")  + ", número de ruedas = " + numWheels 
                    + ", fecha de matriculación = "+ dateRegistration + ", modo de circulación = " + forDesplazamineto 
                    + ", color = " + color ;
    }
        
    }


