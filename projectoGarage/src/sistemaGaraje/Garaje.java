package sistemaGaraje;

import java.util.ArrayList;
import vehiculos.Vehiculo;

public class Garaje {

	// Encapsulamiento: atributos privados accesibles mediante getters
	private double precioRueda;
	private int capacidadMaxima;
	private ArrayList<Vehiculo> vehiculos;

	// Constructor: inicializa el garaje con un precio por rueda y capacidad máxima
	public Garaje(double precioRueda, int capacidadMaxima) {
		this.precioRueda = precioRueda;
		this.capacidadMaxima = capacidadMaxima;
		this.vehiculos = new ArrayList<>();
	}

	// Verifica si aún hay lugar en el garaje
	public boolean tieneEspacioDisponible() {
		return vehiculos.size() < capacidadMaxima;
	}

	// Agrega un vehículo al garaje si hay espacio disponible
	public boolean ingresarVehiculo(Vehiculo vehiculo) {
		if (tieneEspacioDisponible()) {
			this.vehiculos.add(vehiculo);
			return true;
		}
		return false;
	}

	// Retira un vehículo del garaje buscando por su patente
	public Vehiculo retirarVehiculoPorPatente(String patente) {
		for (int i = 0; i < vehiculos.size(); i++) {
			Vehiculo v = vehiculos.get(i);
			if (v.getPatente().equalsIgnoreCase(patente)) {
				vehiculos.remove(i);
				return v;
			}
		}
		return null;
	}

	// Retorna la cantidad actual de vehículos en el garaje
	public int totalVehiculos() {
		return vehiculos.size();
	}

	// Calcula el kilometraje promedio de todos los vehículos
	public double calcularKilometrajeMedio() {
		if (vehiculos.isEmpty()) {
			return 0.0;
		}

		double totalKilometraje = 0.0;
		for (Vehiculo v : vehiculos) {
			totalKilometraje += v.getKilometraje();
		}

		return totalKilometraje / vehiculos.size();
	}

	// Calcula el costo total de cambiar todas las ruedas,
	public double calcularPrecioTotalCambioRuedas() {
		double costoTotal = 0.0;
		for (Vehiculo v : vehiculos) {
			costoTotal += precioRueda * v.getCantidadRuedas();
		}
		return costoTotal;
	}

	// Getter que devuelve la lista de vehículos
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	// Getter que devuelve el precio actual por rueda
	public double getPrecioCambioRueda() {
		return precioRueda;
	}

	// Getter que devuelve la capacidad máxima del garaje
	public int getCapacidadMaximaVehiculos() {
		return capacidadMaxima;
	}
}