
package Exercise5;

import Exercise4.Vehicle;

/**
 *
 * @author Luis mendoza
 */
public class Bicicleta extends Vehicle{
    private String material;

    public Bicicleta(String material, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        this.material = material;
    }
    
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
