
package Exercise5;

import Exercise4.Vehicle;

/**
 *
 * @author Luis mendoza
 */
public class Lancha extends Vehicle{
    private String functionality;

    public Lancha(String use, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        this.functionality = use;
    }
    
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
