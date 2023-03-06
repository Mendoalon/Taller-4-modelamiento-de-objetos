
package Exercise3;

/**
 * Libreria que permite utilizar ArrayList durante el programa
 */
import java.util.List;

/**
 *
 * @author Luis mendoza
 */
public interface MethodsInteface {
    
    /**
     * Métodos de la interfaz
     */
    public List genRamNumbers();
    
     public void showRanNumbers(List<Double> numsRandoms);
            
    public void bubbleMethod(List<Double> numsRandoms);
    
    public void quikSortMethod(List<Double> numsRandoms, int start ,int end );
    
    public int partitionMethod(List<Double> numsRandoms, int start ,int end );
    
}
