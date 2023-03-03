package Exercise3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class MainThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();

        List<Double> randoms = new ArrayList<>();
        randoms.addAll(methods.genRamNumbers());

        System.out.println("==== Bienvenido a la aplicación Sofka Random ====");
        System.out.print("Aplicación donde ordenar números reales aleatorios");

        int option;
        boolean exit = false;

        while (!exit)
        {
            System.out.println("==== Menú Principal ==== ");
            System.out.println("Opción 1. Ver número aleatorio generado.");
            System.out.println("Opción 2. Ordenar mediante el algoritmo de burbuja.");
            System.out.println("Opción 3. Ordenar creciente mediante el algoritmo de Quik sort.");
            System.out.println("Opción 4. Para salir de la aplicación.");

            try
            {
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option)
                {

                    case 1:
                        methods.showRanNumbers(randoms);
                        System.out.println();

                        break;

                    case 2:
                        List<Double> listBubble = new ArrayList<>();
                        listBubble.addAll(randoms);
                        methods.bubbleMethod(listBubble);
                        
                        System.out.println("Los números ordenados decrecientes con el algoritmo de Burbuja son:");
                        for (int i = listBubble.size() -1 ; i >= 0; i--) {
                            System.out.print(listBubble.get(i) + ", ");
                        }
                        System.out.println();
                        
                        break;

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
                        System.out.println("¡Has salido de la aplicación, vuelva pronto!");
                        exit = true;

                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 4");
                }

            } catch (InputMismatchException e)
            {
                System.out.println("Debe ingresar un número");
                scanner.next();
            }

        }

    }

}
