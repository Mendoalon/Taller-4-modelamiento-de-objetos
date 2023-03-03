package Exercise1;

/**
 *
 * @author Luis mendoza
 */
public class Planet {
    private int id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distanceSun;
    

    public Planet( int id, String name, double mass, double density, double diameter, double distanceSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        
    }
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(float distanceSun) {
        this.distanceSun = distanceSun;
    }

    @Override
    public String toString() {
        return "Planeta: " + "Identificador = " + id + ", nombre = " + name + ", masa = " + mass + ", densidad = " + density + ", diámetro = " + diameter + ", distancia al sol =" + distanceSun ;
    }
    
    

}
