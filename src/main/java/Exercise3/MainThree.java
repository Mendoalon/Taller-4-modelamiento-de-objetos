package Exercise3;

/**
 * Estas librería nos permite manejar: arrays, capturar la excepciones y capturar de datos por teclado durante el programa
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Representa la clase principal del proyecto.
 * @author Luis mendoza
 */
public class MainThree {

    /*
    * Método pricipal del proyecto.
     */
    public static void main(String[] args) {
        
        /**
         * Se inicializa la librería escáner que recibe parámetro por teclado
         */
        Scanner scanner = new Scanner(System.in);
        
        /**
         * Se crea una instancia de la clase Methods
         */
        Methods methods = new Methods();
        
        /**
         * Se crea un nuevo objeto de tipo Double de tipo list
         */
        List<Double> randoms = new ArrayList<>();
        
        /**
         * Se asigna el objeto de tipo arraylist todo lo que contiene arraylist randoms
         */
        randoms.addAll(methods.genRamNumbers());

        /**
         * Imprime un menú inicial de Bienvenida
         */
        System.out.println("==== Bienvenido a la aplicación Sofka Random ====");
        System.out.print("Aplicación donde ordenar números reales aleatorios");

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
            System.out.println("Opción 1. Ver número aleatorio generado.");
            System.out.println("Opción 2. Ordenar mediante el algoritmo de burbuja.");
            System.out.println("Opción 3. Ordenar creciente mediante el algoritmo de Quik sort.");
            System.out.println("Opción 4. Para salir de la aplicación.");

            try {
                
                /**
                 * Se le captura en la variable option lo que el usuario ingrese
                 */
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option) {

                    case 1:
                        
                        /**
                         * Muestra todos los números aleatorios generados
                         */
                        methods.showRanNumbers(randoms);
                        System.out.println();

                        break;

                    case 2:
                        
                        /**
                         * Muestra todos los números ordenados con él el algoritmo de Burbuja
                         */
                        List<Double> listBubble = new ArrayList<>();
                        listBubble.addAll(randoms);
                        methods.bubbleMethod(listBubble);
                        
                        System.out.println("Los números ordenados decrecientes con el algoritmo de Burbuja son:");
                        for (int i = listBubble.size() -1 ; i >= 0; i--) {
                            System.out.print(listBubble.get(i) + ", ");
                        }
                        System.out.println();
                        
                        break;

                         /**
                         * Muestra todos los números ordenados con él el algoritmo de Quik Sort
                         */
                    case 3:
                        List<Double> listQuikSort = new ArrayList<>();
                        listQuikSort.addAll(randoms);
                        methods.bubbleMethod(listQuikSort);

                        System.out.println("Los números ordenados crecientes con el algoritmo de Quik Sort son:");
                        for (int i = 0; i < listQuikSort.size(); i++) {
                            System.out.print(listQuikSort.get(i) + ", ");
                        }
                        System.out.println();

                        break;

                    case 4:
                        
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
                        System.out.println("Las opciones son entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                
                /**
                 * Exception para que el usuario solo ingrese números
                 */
                System.out.println("Debe ingresar un número");
                scanner.next();
            }

        }

    }

}
