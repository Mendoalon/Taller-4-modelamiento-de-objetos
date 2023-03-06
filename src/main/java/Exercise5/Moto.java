
package Exercise5;

/**
 * Importamos la clase vehiculo pára implementar en durante el programa
 */
import Exercise4.Vehicle;

/**
 *
 * @author Luis mendoza
 */
public class Moto extends Vehicle{
    
    /**
     * Declaración de los atributos de la clase Moto.
     */
    private String tipo;

    /**
     * Constructor: Crea una instancia de la clase Moto con valor en los atributos.
     */
    public Moto(String tipo, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        this.tipo = tipo;
    }

    /**
    * Método toString muestra las propiedades de la clase Moto
    *
    * @return Una cadena que representa a los planetas con sus atributos concatenados.
    */
     @Override
    public String toString() {
      
        StringBuilder sb = new StringBuilder();
        sb.append("La moto Creada tiene las siguientes caracterisiticas: ");
        sb.append("tipo = ");
        sb.append(tipo);
        sb.append(", ");
        sb.append(super.toString());
        
        return sb.toString();
    }
    
    
    
    
}
