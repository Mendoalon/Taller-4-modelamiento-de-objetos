package Exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class MainTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Bienvenido a la aplicación Donde respondemos preguntas referentes a la clase Main ====");

        int option;
        boolean exit = false;

        while (!exit)
        {
            System.out.println("==== Menu Principal ==== ");
            System.out.println("Opcion 1. ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main?");
            System.out.println("Opcion 2. En caso positivo, ¿cómo se determina el punto de entrada a un programa?");
            System.out.println("Opcion 3. Para salir de la aplicación.");

            try
            {
                System.out.println("¿Seleccione una opción?");
                option = scanner.nextInt();

                switch (option)
                {

                    case 1:
                        System.out.print("Sí, es posible tener varias clases con métodos main en un programa en Java,");
                        System.out.println(" pero solo se puede ejecutar uno a la vez.");
                        break;

                    case 2:
                        System.out.println("Se pueden determinar de 3 formas:");
                        System.out.print("1) Desde el Ide ubicándose en el metodo: public static void main(String[] args) { } ");
                        System.out.println("de la clase que se desea ejecutar, se da click derecho y run file.");
                        System.out.print("2) Configurando el Ide para que ejecute el método ");
                        System.out.println("public static void main(String[] args) { } de la clase que queremos ejecutar.");
                        System.out.print("3) Desde la terminal de windows ejecutando el siguiente comando: java ClaseConMain1 ");
                        System.out.println("Donde ClaseConMain1 es el nombre de la clase que contiene el método main que desea ejecutar. ");

                        break;

                

                    case 3:
                        System.out.println("¡Has salido de la aplicación, vuelva pronto!");
                        exit = true;

                        break;

                    default:
                        System.out.println("Las opciones son entre 1 y 3");
                }

            } catch (InputMismatchException e)
            {
                System.out.println("Debe ingresar un número");
                scanner.next();
            }

        }

    }

}
