
package Exercise5;

import Exercise4.Vehicle;

/**
 *
 * @author Luis mendoza
 */
public class Camion extends Vehicle{
    private double  height;

    public Camion(double height, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        this.height = height;
    }
    
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
