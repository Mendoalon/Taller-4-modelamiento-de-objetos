package Exercise1;

/**
 * Libreria que permite utilizar ArrayList durante el programa
 */
import java.util.ArrayList;

/**
 *
 * @author Luis mendoza
 */
public interface PlanetInterface {

    /**
     * Métodos de la interfaz
     */
    public ArrayList createCelestialbody();

    public void viewPlanets(ArrayList<Planet> planets);

    public void gravitAttraction(ArrayList<Planet> planets);

}
