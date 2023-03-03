package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis mendoza
 */
public class PlanetarySystem implements PlanetInterface {
    // Constante de gravitación universal en N(m/kg)^2
    private final double unigravitation =  6.6743e-11; 

    @Override
    public ArrayList createCelestialbody() {
        ArrayList<Planet> celestialBody = new ArrayList<>();

        celestialBody.add(new Planet(1, "Mercurio", 3.285, 5.43, 4.88, 58.4));
        celestialBody.add(new Planet(2, "Venus", 4.867, 5.24, 12.104, 108.6));
        celestialBody.add(new Planet(3, "Tierra", 5.97, 5.51, 12.742, 149.6));
        celestialBody.add(new Planet(4, "Marte", 6.39, 3.93, 6.779, 206.7));
        celestialBody.add(new Planet(5, "Jupiter", 1.898, 1.33, 139.82, 750.0));
        celestialBody.add(new Planet(6, "Saturno", 5.683, 687.0, 116.46, 1.434));
        celestialBody.add(new Planet(7, "Urano", 8681.0, 1.27, 50.724, 2.871));
        celestialBody.add(new Planet(8, "Neptuno", 1.024, 1.64, 49.244, 4.495));

        return celestialBody;
    }

    @Override
    public void viewPlanets(ArrayList<Planet> planets) {

        for (Planet planet1 : planets)
        {
            System.out.println(planet1.toString());
        }

    }

    @Override
    public void gravitAttraction(ArrayList<Planet> planets) {
        Scanner scanner = new Scanner(System.in);
      
            System.out.println("=== Planetas a comparar ===");
            System.out.println("Opcion: 1.  Mercurio.\nOpcion: 2.  Venus.\nOpcion: 3.  Tierra.");
            System.out.println("Opcion: 4.  Marte.\nOpcion: 5.  Jupiter.\nOpcion: 6.  Saturno.");
            System.out.println("Opcion: 7.  Urano.\nOpcion: 8.  Neptuno.");

            try {
                System.out.println("¿Seleccione el planeta 1?");
                int planet1 = scanner.nextInt();
                
                System.out.println("¿Seleccione el planeta 2?");
                int planet2 = scanner.nextInt();
                
                if( !(planet1 == planet2) ){
                    if( ( planet1 > 0 ) && (planet1 <=9 ) && ( planet2 > 0) && (planet2 <= 9 ) ) {
                        planet1 -= 1;
                        planet2 -= 1;
                        double distancia = Math.abs(planets.get(planet1).getDistanceSun()  - 
                                                      planets.get(planet2).getDistanceSun());
                        double mass1 = planets.get(planet1).getMass();
                        double mass2 = planets.get(planet2).getMass();
                        double force = unigravitation * (mass1 * mass2) / (distancia * distancia);
                        System.out.println("La atracción gravitatoria entre " + planets.get(planet1).getName()  + " y " +
                                                          planets.get(planet2).getName() + " es: " +force);
     
                    }else{
                    System.out.println("Selecione los planetas del listado.");
                    }
                }else{
                    System.out.println("Los datos ingresados son iguales.");
                }
                
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Las opciones del planeta son del 1 al 8");
            }
         
        }

    }


