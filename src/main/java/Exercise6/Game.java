package Exercise6;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Luis mendoza
 */
public class Game {

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
