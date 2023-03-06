
package Exercise5;

/**
 * Importamos la clase vehiculo pára implementar en durante el programa
 */
import Exercise4.Vehicle;

/**
 *
 * @author Luis mendoza
 */
public class Bicicleta extends Vehicle{
    
    /**
     * Declaración de los atributos de la clase Bicicleta.
     */
    private String material;

    /**
     * Constructor: Crea una instancia de la clase Bicicleta con valor en los atributos.
     */
    public Bicicleta(String material, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        this.material = material;
    }
    
    /**
    * Método toString muestra las propiedades de la clase Bicicleta
    *
    * @return Una cadena que representa a los planetas con sus atributos concatenados.
    */
     @Override
    public String toString() {
      
        StringBuilder sb = new StringBuilder();
        sb.append("La bicicleta creada tiene las siguientes caracterisiticas: ");
        sb.append(" materia de fabricacion = ");
        sb.append(material );
        sb.append(", ");
        sb.append(super.toString());
        return sb.toString();
    }
    
}
