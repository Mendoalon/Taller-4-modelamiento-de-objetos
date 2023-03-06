package Exercise3;

/**
 * Esta librería nos permite manejar: arrays, colecciones y listas durante el programa
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luis mendoza
 */
public class Methods implements MethodsInteface {

        /**
     * Método que retorna números reales aleatorios
     *
     * @return randoms
     */
    @Override
    public List<Double> genRamNumbers() {
        List<Double> randoms = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            randoms.add(Math.random());
        } 
        
        return randoms;
    }   
    
    /**
     * Método que permite mostrar los números reales aleatorios
     *
     * @param numsRandoms
     */
    @Override
    public void showRanNumbers(List<Double> numsRandoms) {
        
        System.out.println("Los números aleatorio generado son:");
        for (Double number : numsRandoms) {
            System.out.print(number + ", ");
        }
        
    }

    /**
     * Método que permite ordenar una serie de números con el algoritmo de Burbuja
     *
     * @param listBubble
     */
    @Override
    public void bubbleMethod(List<Double> listBubble) {
        double aux;
        
        for (int i = 0; i < (listBubble.size() -1 ) ; i++) {
            for (int j = 0; j < (listBubble.size() -1 ); j++) {
                if ( listBubble.get(j) > listBubble.get( j+1 ) ) {
                    aux = listBubble.get(j);
                    listBubble.set(j,  listBubble.get(j+1) );
                    listBubble.set( j+1, aux);
                }
            }
          }

    }

    /**
     * Método que permite ordenar una serie de números con el algoritmo de Quik Sort
     *
     * @param listQuikSort, start, end
     */
    @Override
    public void quikSortMethod(List<Double> listQuikSort, int start, int end) {
               
        if (start< end) {
            int pivotIndex = partitionMethod(listQuikSort, start, end);
            quikSortMethod(listQuikSort, start, pivotIndex - 1);
            quikSortMethod(listQuikSort, pivotIndex + 1, end);
        }
        
    }

    /**
     * Método que permite ordenar una serie de números con el algoritmo de Quik Sort
     *
     * @param listQuikSort, start, end
     */
    @Override
    public int partitionMethod(List<Double> listQuikSort, int start, int end) {
         int i = start - 1;
         double pivot = listQuikSort.get(end);
       
        for (int j = start; j < end; j++) {
            if (listQuikSort.get(j) <= pivot) {
                i++;
                Collections.swap(listQuikSort, i, j);
            }
        }

        Collections.swap(listQuikSort, i + 1, end);

        return i + 1;
    }
    
    }

