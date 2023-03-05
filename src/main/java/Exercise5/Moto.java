
package Exercise5;

import Exercise4.Vehicle;

/**
 *
 * @author Luis mendoza
 */
public class Moto extends Vehicle{
    
    private String tipo;

    public Moto(String tipo, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        this.tipo = tipo;
    }

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
