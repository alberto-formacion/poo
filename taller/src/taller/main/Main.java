package taller.main;

import taller.persona.GestionPersona;

public class Main {

	public static void main(String[] args) {
		
		GestionPersona gestionPersona = new GestionPersona();

			gestionPersona.crearCliente();
			gestionPersona.mostrarClientes();

	}

}
