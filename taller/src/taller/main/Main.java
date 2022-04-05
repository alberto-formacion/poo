package taller.main;

import taller.persona.Cliente;
import taller.persona.GestionPersona;
import taller.vehiculo.GestionVehiculo;

public class Main {

	public static void main(String[] args) {

		GestionPersona gestionPersona = new GestionPersona();
		GestionVehiculo gestionVehiculo = new GestionVehiculo();
	
		Cliente c = gestionPersona.obtenerClienteDNI();
		gestionVehiculo.anadirVehiculoClienteVenta(c);

	}

}
