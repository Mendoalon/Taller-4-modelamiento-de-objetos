package Exercise1;

/**
 *
 * @author Luis mendoza
 */
public class Planet {

    /**
     * Declaración de los atributos de la clase Planet.
     */
    private int id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distanceSun;

    /**
     * Constructor: Crea una instancia de la clase Planet con valor en los atributos.
     */
    public Planet(int id, String name, double mass, double density, double diameter, double distanceSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;

    }

    /*
    * Métodos para obtener los valores de las propiedades de la clase Planet.
    *@return Devuelve el valor de las propiedades.
    */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getDensity() {
        return density;
    }

    public double getDiameter() {
        return diameter;
    }

     /*
     * Métodos para asignar los valores a las propiedades la clase Planet.
     * @param: Recibe los valores a asignar a las propiedades.
    */
    public void setDistanceSun(float distanceSun) {
        this.distanceSun = distanceSun;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    /**
    * Método toString muestra las propiedades de la clase Planet
    *
    * @return Una cadena que representa a los planetas con sus atributos concatenados.
    */
    @Override
    public String toString() {
        return "Planeta: " + "Identificador = " + id + ", nombre = " + name + ", masa = " + mass + ", densidad = " + density + ", diámetro = " + diameter + ", distancia al sol =" + distanceSun;
    }

}
