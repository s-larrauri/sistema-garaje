package vehiculos;

// Herencia: esta clase extiende de Vehiculo, por lo tanto hereda sus atributos y métodos.
public class Moto extends Vehiculo {

    // Encapsulamiento: atributo privado, accesible solo mediante getter.
    private int cilindrada;

    // Constructor que inicializa los atributos heredados y propios.
    public Moto(String marca, double kilometraje,String patente, int cilindrada) {
        super(marca, kilometraje,patente); // Herencia: se llama al constructor de la clase base.
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    // Polimorfismo: se sobreescribe el comportamiento del método toString para mostrar los datos específicos de Moto.
    @Override
    public String toString() {
        return super.toString() + ", Tipo: Moto, Cilindrada: " + cilindrada + "cc";
    }

    // Polimorfismo: implementación específica del método abstracto heredado desde Vehiculo.
    @Override
    public int getCantidadRuedas() {
        return 2;
    }
}