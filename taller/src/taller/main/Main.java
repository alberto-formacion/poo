package taller.main;

import taller.persona.GestionPersona;
import taller.vehiculo.GestionVehiculo;

public class Main {

	public static void main(String[] args) {

		GestionPersona gestionPersona = new GestionPersona();
		GestionVehiculo gestionVehiculo = new GestionVehiculo();
		
		gestionVehiculo.altaVehiculo();
		
		//gestionPersona.crearCliente();

	}

}
