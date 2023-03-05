package Exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class MainSix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("==== Bienvenido a la aplicación Sofka Game ====");
        System.out.print("Juego donde podrá ingresar una serie de números hasta que se introduzca ");
        System.out.println("dos veces seguidas el mismo número, mostrara los números ingresados.");

        int option;
        boolean exit = false;

        while (!exit) {
            System.out.println("==== Menú Principal ==== ");
            System.out.println("Opción 1. Jugar.");
            System.out.println("Opción 2. Para salir del juego.");

            try {
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option) {

                    case 1:
                        game.paly();

                        break;

                    case 2:
                        System.out.println("¡Has salido de la aplicación, vuelva pronto!");
                        exit = true;

                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 2");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar los datos según la instrucción dada. ");
                scanner.next();
                
            }

        }

    }

}
