
package Exercise5;

/**
 * Importamos la clase vehiculo pára implementar en durante el programa
 */
import Exercise4.Vehicle;

/**
 *
 * @author Luis mendoza
 */
public class Lancha extends Vehicle{
    
    /**
     * Declaración de los atributos de la clase Lancha.
     */
    private String functionality;

    /**
     * Constructor: Crea una instancia de la clase Lancha con valor en los atributos.
     */
    public Lancha(String use, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        this.functionality = use;
    }
    
     /**
    * Método toString muestra las propiedades de la clase Lancha
    *
    * @return Una cadena que representa a los planetas con sus atributos concatenados.
    */
    @Override
    public String toString() {
      
        StringBuilder sb = new StringBuilder();
        sb.append("La lancha creada tiene las siguientes caracterisiticas: ");
        sb.append(" funcionalidad = ");
        sb.append(functionality );
        sb.append(", ");
        sb.append(super.toString());
        return sb.toString();
    }
    
    
}
