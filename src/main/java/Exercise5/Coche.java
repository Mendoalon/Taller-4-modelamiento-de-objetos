
package Exercise5;

/**
 * Importamos la clase vehiculo pára implementar en durante el programa
 */
import Exercise4.Vehicle;
/**
 *
 * @author Luis mendoza
 */
public class Coche extends Vehicle{
    
    /**
     * Declaración de los atributos de la clase Coche.
     */
    private boolean threeOFive;
    
    /**
     * Constructor: Crea una instancia de la clase Coche sin atributos.
     */
    public Coche() {
    }
    
    
    /**
     * Constructor: Crea una instancia de la clase Coche con valor en los atributos.
     */
    public Coche(int esTresPuertas, int numPassengers, boolean presPassengers, int numWheels, String dateRegistration, String forDesplazamineto, String color) {
        
        super(numPassengers, presPassengers, numWheels, dateRegistration, forDesplazamineto, color);
        if( esTresPuertas == 3 ){
                 this.threeOFive = true;
        }if(esTresPuertas == 5){
             this.threeOFive = true;
        }else{
            
        }
   
    }

    /**
    * Método toString muestra las propiedades de la clase Coche
    *
    * @return Una cadena que representa a los planetas con sus atributos concatenados.
    */
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
