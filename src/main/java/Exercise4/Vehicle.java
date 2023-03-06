package Exercise4;

/**
 * Estas librería nos permite manejar: arrays y capturar de datos por teclado durante el programa
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class Vehicle  implements VehicleInterface{

    /**
     * Declaración de los atributos de la clase Vehicle.
     */
    private int numPassengers;
    private boolean presPassengers;
    private int numWheels;
    private String dateRegistration;
    private String forDesplazamineto;
    private String color;

    public Vehicle() {
    }

    /**
     * Constructor: Crea una instancia de la clase Vehicle con valor en los atributos.
     */
    public Vehicle(int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        this.numPassengers = numPassengers;
        this.presPassengers = presPassengers;
        this.numWheels = numWheels;
        this.dateRegistration = dateRegistration;
        this.forDesplazamineto = forDesplazamineto;
        this.color = color;
    }


     /**
     * Método que creea 10 objetos tipo vehiculo y los guarda en un arrayList
     *
     * @param vehicles
     */
    public void createVehicle( ArrayList<Vehicle> vehicles) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
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

    /**
     * Método que permite mostrar los objetos tipo vehiculos con sus atributos
     *
     * @param numsRandoms
     */
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

    /*
    * Métodos para obtener los valores de las propiedades de la clase Vehicle.
    *@return Devuelve el valor de las propiedades.
    */
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
    
    
    
    /**
    * Método toString muestra las propiedades de la clase Vehicle
    *
    * @return Una cadena que representa a los vehiculos con sus atributos concatenados.
    */
    @Override
    public String toString() {
        return  "número de pasajeros = " + numPassengers 
                     + ", presencia de tripulación = " + ((presPassengers)? "si": "no")  + ", número de ruedas = " + numWheels 
                    + ", fecha de matriculación = "+ dateRegistration + ", modo de circulación = " + forDesplazamineto 
                    + ", color = " + color ;
    }
        
    }


