package vehiculos;

// Abstracción: Esta clase va a ser padre de sus hijas Coche y Moto ya que comparten atributos en comun.
public abstract class Vehiculo {

    // Encapsulamiento:atributos privados y se accede a ellos mediante getters y setters.
    private String marca;
    private double kilometraje;
    private String patente;

    // Constructor con parámetros comunes a todos los vehículos
    public Vehiculo(String marca, double kilometraje, String patente) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    
    public String getPatente() {
    	return patente;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Abstracción: método para mostrar información del vehículo (sin sus subclases).
    @Override
    public String toString() {
        return "Marca: " + marca + ", Kilometraje: " + kilometraje;
    }

    // Polimorfismo: método abstracto que será implementado de forma diferente por cada subclase.
    public abstract int getCantidadRuedas();
}