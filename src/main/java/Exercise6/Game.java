package Exercise6;

/**
 * Estas librería nos permite manejar: vectores y capturar de datos por teclado durante el programa
 */
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Luis mendoza
 */
public class Game {

    /**
     * Método que permite crear una lista de números ingresados por el usuario y mostrar si se repite algún número consecutivo
     *
     */    
    public void paly() {
        Vector<Integer> numbers = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        boolean result = false;
        while (!result) {
            System.out.print("Ingrese un numero: ");
            int number = scanner.nextInt();
            numbers.add(number);
            if ((numbers.size() > 1) && (numbers.lastElement() == numbers.get(numbers.size() - 2))) {
                System.out.println("Los números ingresados son: " + numbers);
                result = true;
            }
        }

    }

}
