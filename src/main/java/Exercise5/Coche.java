
package Exercise5;

import Exercise4.Vehicle;
/**
 *
 * @author Luis mendoza
 */
public class Coche extends Vehicle{
    private boolean threeOFive;

    public Coche() {
    }
    
    

    public Coche(int esTresPuertas, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        if( esTresPuertas == 3 ){
                 this.threeOFive = true;
        }if(esTresPuertas == 5){
             this.threeOFive = true;
        }else{
            
        }
   
    }

    @Override
    public String toString() {
      
        StringBuilder sb = new StringBuilder();
        sb.append("El Coche Creado tiene las siguientes caracterisiticas: ");
        sb.append("número de puertas = ");
        sb.append((threeOFive) ? "3, " : "5, ");
        sb.append(super.toString());
        
        return sb.toString();
    }
    
    
    
}
