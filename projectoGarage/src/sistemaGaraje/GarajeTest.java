package sistemaGaraje;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class GarajeTest {

	public static void main(String[] args) {

		// Se crea el objeto garage con un espacio para 3 vehiculos con el costo de rueda por vehiculo
		Garaje miGaraje = new Garaje(2000.0, 3);
		System.out.println(
				"Se ha creado un garaje con capacidad para " + miGaraje.getCapacidadMaximaVehiculos() + " vehículos.");
		System.out.println("------------------------------------");

		// Se crean los objetos objetos coche y moto
		Vehiculo coche1 = new Coche("Ford Focus", 50000.0, "AEC522", 4);
		Vehiculo coche2 = new Coche("Fiat Cronos", 25000.0, "KEL312", 4);
		Vehiculo moto1 = new Moto("Honda CB500X", 15000.0, "XOL615", 500);
		Vehiculo moto2 = new Moto("Yamaha YBR", 10000.0, "POL012", 125);

		// Ingreso de vehículos al garaje
		if (miGaraje.ingresarVehiculo(coche1)) {
			System.out.println("Ingresado con éxito: " + coche1.getPatente());
		}
		if (miGaraje.ingresarVehiculo(coche2)) {
			System.out.println("Ingresado con éxito: " + coche2.getPatente());
		}
		if (miGaraje.ingresarVehiculo(moto1)) {
			System.out.println("Ingresado con éxito: " + moto1.getPatente());
		}

		// Intento de ingreso cuando el garaje está lleno
		if (!miGaraje.ingresarVehiculo(moto2)) {
			System.out.println("No se puede ingresar el Vehiculo: " + moto2.getPatente() + ". El garaje está lleno.");
		}
		System.out.println("------------------------------------");

		// Mostrar información general del garaje
		System.out.println("Número total de vehículos: " + miGaraje.totalVehiculos());
		System.out.println("Kilometraje medio: " + miGaraje.calcularKilometrajeMedio());
		System.out.println("Costo total de cambio de ruedas: $" + miGaraje.calcularPrecioTotalCambioRuedas());
		System.out.println("------------------------------------");

		// Retiro de un vehículo por patente
		Vehiculo vehiculoRetirado = miGaraje.retirarVehiculoPorPatente("KEL312");
		if (vehiculoRetirado != null) {
			System.out.println("Vehículo retirado con patente: " + vehiculoRetirado.getPatente());
		} else {
			System.out.println("No se encontró el vehículo para retirar.");
		}
		System.out.println("------------------------------------");

		// Nuevo ingreso tras liberar espacio
		if (miGaraje.ingresarVehiculo(moto2)) {
			System.out.println("Ingresado con éxito después del retiro: " + moto2.getPatente());
		}
		System.out.println("------------------------------------");

		// Información final del garaje
		System.out.println("Número final de vehículos: " + miGaraje.totalVehiculos());
		System.out.println("Kilometraje medio final: " + miGaraje.calcularKilometrajeMedio());
		System.out.println("Costo total de cambio de ruedas final: $" + miGaraje.calcularPrecioTotalCambioRuedas());
		System.out.println("------------------------------------");

		// Mostrar todos los vehículos con toString())
		System.out.println("Vehículos en el garaje:");
		for (Vehiculo v : miGaraje.getVehiculos()) {
			System.out.println(v);
		}
	}
}