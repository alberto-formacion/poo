package taller.vehiculo;

import java.util.Scanner;

import taller.enums.TipoMotor;

public class GestionVehiculo {
	
	private Vehiculo[] vehiculos = new Vehiculo[20];
	private Scanner teclado = new Scanner(System.in);
	
	public void altaVehiculo() {
		
		Vehiculo nuevoVehiculo;
		
		System.out.println("¿Que tipo de vehiculo quieres añadir?");
		System.out.println("1.-Coche");
		System.out.println("2.-Moto");
		
		int tipoVehiculo = teclado.nextInt();
		
		System.out.println("Introduce la matricula");
		String matricula = teclado.next();
		System.out.println("Introduce el color");
		String color = teclado.next();
		System.out.println("Introduce el numero de bastidor");
		String numBastidor = teclado.next();
		System.out.println("Introduce el tipo de motor");
		
		TipoMotor[] tiposMotor = TipoMotor.values();
		
		for(int i=0; i<tiposMotor.length;i++) {
			System.out.println((i+1)+".-"+tiposMotor[i].getNombre());
		}
		
		int tipoMotor = teclado.nextInt();
		
		TipoMotor tm;
		
		if(tipoMotor == 1) {
			tm = TipoMotor.DIESEL;
		}else {
			tm = TipoMotor.GASOLINA;
		}
		
		System.out.println("Introduce los caballos");
		int caballos = teclado.nextInt();
		
		if(tipoVehiculo == 1) {
			System.out.println("Introduce la potencia");
			int potencia = teclado.nextInt();
			
			nuevoVehiculo = new Coche(matricula, color, numBastidor, tm, caballos, potencia);
		}else {
			System.out.println("Introduce la cilindrada");
			int cilindrada = teclado.nextInt();
			
			nuevoVehiculo = new Moto(matricula, color, numBastidor, tm, caballos, cilindrada);
		}
		
		boolean vehiculoAnadido = false;
		
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i]==null) {
				vehiculos[i] = nuevoVehiculo;
				
				vehiculoAnadido = true;
				
				break;
			}
		}
		
		if(vehiculoAnadido) {
			System.out.println("El vehiculo se ha añadido correctamente");
		}else {
			System.out.println("No hay espacio para el vehiculo");
		}
		
		
	}
	
	public void bajaVehiculoPorMatricula() {
		System.out.println("Introduce la matricula del vehiculo a eliminar");
		String matricula = teclado.next();
		
		boolean vehiculoEliminado = false;
		
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i] != null && vehiculos[i].getMatricula().equalsIgnoreCase(matricula)) {
				vehiculos[i] = null;
				vehiculoEliminado = true;
				break;
			}
		}
		
		if(vehiculoEliminado) {
			System.out.println("Vehiculo eliminado");
		}else {
			System.out.println("No existe el vehiculo con esa matricula");
		}
	}

}
