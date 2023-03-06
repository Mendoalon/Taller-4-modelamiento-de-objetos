package Exercise6;

/**
 * Estas librería nos permite manejar: capturar la excepciones y capturar de datos por teclado durante el programa
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Representa la clase principal del proyecto.
 * 
 * @author Luis mendoza
 */
public class MainSix {

    /*
    * Método pricipal del proyecto.
     */
    public static void main(String[] args) {
        
        /**
         * Se inicializa la librería escáner que recibe parámetro por teclado
         */
        Scanner scanner = new Scanner(System.in);
        
        /**
         * Se crea una instancia de la clase Game
         */
        Game game = new Game();
        
        /**
         * Imprime un menú inicial de Bienvenida
         */
        System.out.println("==== Bienvenido a la aplicación Sofka Game ====");
        System.out.print("Juego donde podrá ingresar una serie de números hasta que se introduzca ");
        System.out.println("dos veces seguidas el mismo número, mostrara los números ingresados.");

        /**
         * Variable para guardar la opción que ingrese el usuario
         */
        int option;
        
        /**
         * Variable que permite salir del programa
         */
        boolean exit = false;

        /**
         * Si la variable exit es false se ejecuta la condición del While
         */
        while (!exit) {
            
            /**
             * Opciones a mostrar al usuario
             */
            System.out.println("==== Menú Principal ==== ");
            System.out.println("Opción 1. Jugar.");
            System.out.println("Opción 2. Para salir del juego.");

            try {
                
                /**
                 * Se le captura en la variable option lo que el usuario ingrese
                 */
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option) {

                    case 1:
                        /**
                         * Permite crear una lista de números ingresados por el usuario y mostrar si se repite algún número consecutivo
                         */
                        game.paly();
                        break;

                    case 2:
                        
                        /**
                         * Mostramos mensaje de despedida al usuario y le asignamos a la variable exit true para salir de la aplicación
                         */
                        System.out.println("¡Has salido de la aplicación, vuelva pronto!");
                        exit = true;

                        break;

                    default:
                        
                        /**
                         * Se controla que el usuario ingrese solo las opciones dadas
                         */
                        System.out.println("Las opciones son entre 1 y 2");
                }

            } catch (InputMismatchException e) {
                
                /**
                 * Exception para que el usuario solo ingrese números
                 */
                System.out.println("Debe ingresar los datos según la instrucción dada. ");
                scanner.next();
                
            }

        }

    }

}
