
package Exercise3;

import java.util.List;

/**
 *
 * @author Lmendoza
 */
public interface MethodsInteface {
    
    public List genRamNumbers();
    
     public void showRanNumbers(List<Double> numsRandoms);
            
    public void bubbleMethod(List<Double> numsRandoms);
    
    public void quikSortMethod(List<Double> numsRandoms, int start ,int end );
    
    public int partitionMethod(List<Double> numsRandoms, int start ,int end );
    
}
