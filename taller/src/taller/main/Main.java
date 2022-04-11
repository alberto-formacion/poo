package taller.main;

import java.util.Scanner;

import taller.persona.Cliente;
import taller.persona.GestionPersona;
import taller.vehiculo.GestionVehiculo;

public class Main {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		GestionPersona gestionPersona = new GestionPersona();
		GestionVehiculo gestionVehiculo = new GestionVehiculo();
		
		boolean seguirPreguntando = true;
		
		do {
			System.out.println("Introduce una opción:");
			System.out.println("1.-Crear Cliente");
			System.out.println("2.-Modificar Cliente");
			System.out.println("3.-Añadir Vehiculo a cliente");
			System.out.println("4.-Eliminar Vehiculo a cliente");
			System.out.println("5.-Borrar Cliente");
			System.out.println("6.-Crear Mecanico");
			System.out.println("7.-Modificar Mecanico");
			System.out.println("8.-Añadir Vehiculo para reparar a Mecanico");
			System.out.println("9.-Terminar reparacion");
			System.out.println("10.-Calcular sueldo mecanico");
			System.out.println("11.-Borrar Mecanico");
			System.out.println("12.-Añadir vehiculo de cliente a la venta");
			System.out.println("13.-Añadir Vehiculo sin cliente");
			System.out.println("0.-Salir");
			
			int opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				gestionPersona.crearCliente();
				break;
			case 2:
				gestionPersona.modificarClientePorDNI();
				break;
			case 3:
				gestionPersona.anadirNuevoVehiculoACliente();
				break;
			case 4:
				gestionPersona.eliminarVehiculoCliente();
				break;
			case 5:
				gestionPersona.borrarClientePorDNI();
				break;
			case 6:
				gestionPersona.crearMecanico();
				break;
			case 7:
				gestionPersona.modificarMecanico();
				break;
			case 8:
				gestionPersona.anadirVehiculoRepararMecanico();
				break;
			case 9:
				gestionPersona.terminarReparacion();
				break;
			case 10:
				gestionPersona.calcularSueldoMensualMecanico();
				break;
			case 11:
				gestionPersona.borrarMecanicoPorDNI();
				break;
			case 12:
				Cliente c = gestionPersona.obtenerClienteDNI();
				gestionVehiculo.anadirVehiculoClienteVenta(c);
				break;
			case 13:
				gestionVehiculo.altaVehiculo();
				break;
			case 0:
				System.out.println("Gracias por venir!");
				seguirPreguntando = false;
				break;
			default:
				System.out.println("Introduce un valor correcto");
			}
		}while(seguirPreguntando);
	}

}
