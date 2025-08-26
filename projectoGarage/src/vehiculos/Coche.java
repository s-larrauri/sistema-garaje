package vehiculos;

// Herencia: esta clase extiende de Vehiculo, por lo tanto hereda sus atributos y métodos.
public class Coche extends Vehiculo {

	// Encapsulamiento: atributo privado, accesible solo mediante getter.
	private int numeroPuertas;

	// Constructor que inicializa los atributos heredados y propios.
	public Coche(String marca, double kilometraje, String patente, int numeroPuertas) {
		super(marca, kilometraje, patente); // Herencia: se llama al constructor de la clase base.
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	// Polimorfismo: se sobreescribe el comportamiento del método toString para mostrar los datos específicos del coche.
	@Override
	public String toString() {
		return super.toString() + ", Tipo: Coche, Puertas: " + numeroPuertas;
	}

	// Polimorfismo: implementación específica del método abstracto heredado desde Vehiculo.
	@Override
	public int getCantidadRuedas() {
		return 4;
	}
}