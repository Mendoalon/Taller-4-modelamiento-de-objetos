
package Exercise5;

/**
 * Importamos la clase vehiculo pára implementar en durante el programa
 */
import Exercise4.Vehicle;

/**
 *
 * @author Luis mendoza
 */
public class Camion extends Vehicle{
    
    /**
     * Declaración de los atributos de la clase Camion.
     */
    private double  height;

     /**
     * Constructor: Crea una instancia de la clase Camion con valor en los atributos.
     */
    public Camion(double height, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        this.height = height;
    }
    
    /**
    * Método toString muestra las propiedades de la clase Camion
    *
    * @return Una cadena que representa a los planetas con sus atributos concatenados.
    */
    @Override
    public String toString() {
      
        StringBuilder sb = new StringBuilder();
        sb.append("El camion creado tiene las siguientes caracterisiticas: ");
        sb.append(" altura = ");
        sb.append(height );
        sb.append(super.toString());
        sb.append(", ");
        return sb.toString();
    }
    
}
