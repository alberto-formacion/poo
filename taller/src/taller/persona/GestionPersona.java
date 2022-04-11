package taller.persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import taller.enums.TipoMotor;
import taller.vehiculo.Coche;
import taller.vehiculo.Moto;
import taller.vehiculo.Vehiculo;

public class GestionPersona {
	
	private Cliente[] clientes = new Cliente[10];
	private Mecanico[] mecanicos = new Mecanico[5];
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Scanner teclado = new Scanner(System.in);
	//[cliente, null, cliente, null, null, null, null, null, null, null]
	
	public GestionPersona() {
		Cliente cliente = new Cliente("11", "Fede", "Valverde", LocalDate.parse("12/12/2000", formatter), "1");
		
		clientes[0] = cliente;
	}
	
	public void crearCliente() {
				
		boolean clienteInsertado = false;
		
		for(int i=0;i<clientes.length;i++) {
			if(clientes[i]==null) {
				System.out.println("Introduce un DNI");
				String dni = teclado.next();
				System.out.println("Introduce un nombre");
				String nombre = teclado.next();
				System.out.println("Introduce un apellidos");
				String apellidos = teclado.next();
				System.out.println("Introduce un fecha de nacimiento");
				String fechaNacimiento = teclado.next();
				System.out.println("Introduce un numero de cliente");
				String numCliente = teclado.next();
				
				//String => LocalDate
				
				LocalDate fecNac = LocalDate.parse(fechaNacimiento, formatter);
				
				Cliente cliente = new Cliente(dni, nombre, apellidos, fecNac, numCliente);
				
				clientes[i] = cliente;
				
				clienteInsertado = true;
				
				break;
			}
		}
		
		if(clienteInsertado) {
			System.out.println("El cliente se ha insertado correctamente");
		}else {
			System.out.println("No hay mas espacio para clientes nuevos");
		}
		
	}
	
	
	
	public void mostrarClientes() {
		for(Cliente c: clientes) {
			System.out.println(c);
		}
		
		/*for(int i=0;i<clientes.length;i++) {
			Cliente c = clientes[i];
			System.out.println(c);
		}*/
	}
	
	public void borrarClientePorDNI() {
		System.out.println("Introduce DNI");
		String dni = teclado.next();
		
		boolean clienteEliminado = false;
		
		for(int i=0;i<clientes.length;i++) {
			if(clientes[i]!=null && clientes[i].getDni().equals(dni)) {
				clientes[i] = null;
				clienteEliminado = true;
				break;
			}
		}
		
		if(clienteEliminado) {
			System.out.println("El cliente se ha eliminado");
		}else {
			System.out.println("El cliente no existe");
		}
	}
	
	public void modificarClientePorDNI() {
		System.out.println("Introduce DNI");
		String dni = teclado.next();
		
		boolean clienteModificado = false;
		
		for(int i=0;i<clientes.length;i++) {
			if(clientes[i]!=null && clientes[i].getDni().equals(dni)) {
				System.out.println("Introduce un nombre");
				clientes[i].setNombre(teclado.next());
				System.out.println("Introduce un apellidos");
				clientes[i].setApellidos(teclado.next());
				System.out.println("Introduce un fecha de nacimiento");
				clientes[i].setFechaNacimiento(LocalDate.parse(teclado.next(), formatter));
				System.out.println("Introduce un numero de cliente");
				clientes[i].setNumCliente(teclado.next());
				clienteModificado = true;
				break;
			}
		}
		
		if(clienteModificado) {
			System.out.println("El cliente se ha modificado");
		}else {
			System.out.println("El cliente no existe");
		}
		
	}
	
	public void crearMecanico() {
		boolean mecanicoInsertado = false;
		
		for(int i=0;i<mecanicos.length;i++) {
			if(mecanicos[i]==null) {
				System.out.println("Introduce un DNI");
				String dni = teclado.next();
				System.out.println("Introduce un nombre");
				String nombre = teclado.next();
				System.out.println("Introduce un apellidos");
				String apellidos = teclado.next();
				System.out.println("Introduce un fecha de nacimiento");
				String fechaNacimiento = teclado.next();
				System.out.println("Introduce un numero de la seguridad social");
				String nss = teclado.next();
				System.out.println("Introduce el sueldo anual bruto");
				double sueldo = teclado.nextDouble();
				
				//String => LocalDate
				
				LocalDate fecNac = LocalDate.parse(fechaNacimiento, formatter);
				
				Mecanico mecanico = new Mecanico(dni, nombre, apellidos, fecNac, nss, sueldo);
				
				mecanicos[i] = mecanico;
				
				mecanicoInsertado = true;
				
				break;
			}
		}
		
		if(mecanicoInsertado) {
			System.out.println("El cliente se ha insertado correctamente");
		}else {
			System.out.println("No hay mas espacio para clientes nuevos");
		}
	}
	
	public void borrarMecanicoPorDNI() {
		System.out.println("Introduce DNI");
		String dni = teclado.next();
		
		boolean mecanicoBorrado = false;
		
		for(int i=0;i<mecanicos.length;i++) {
			if(mecanicos[i]!=null && mecanicos[i].getDni().equals(dni)) {
				mecanicos[i] = null;
				mecanicoBorrado = true;
				break;
			}
		}
		
		if(mecanicoBorrado) {
			System.out.println("Mecanico eliminado");
		}else {
			System.out.println("El mecanico no existe");
		}
	}
	
	public void modificarMecanico() {
		System.out.println("Introduce DNI");
		String dni = teclado.next();
		
		boolean mecanicoModificado = false;
		
		for(int i=0;i<mecanicos.length;i++) {
			if(mecanicos[i]!=null && mecanicos[i].getDni().equals(dni)) {
				System.out.println("Introduce un nombre");
				mecanicos[i].setNombre(teclado.next());
				System.out.println("Introduce un apellidos");
				mecanicos[i].setApellidos(teclado.next());
				System.out.println("Introduce un fecha de nacimiento");
				mecanicos[i].setFechaNacimiento(LocalDate.parse(teclado.next(), formatter));
				System.out.println("Introduce un numero de la seguridad social");
				mecanicos[i].setNss(teclado.next());
				System.out.println("Introduce el sueldo");
				mecanicos[i].setSueldoAnualBruto(teclado.nextDouble());
				
				mecanicoModificado = true;
				break;
			}			
		}
		
		if(mecanicoModificado) {
			System.out.println("El mecanico se ha modificado correctamente");
		}else {
			System.out.println("No existe el mecanico");
		}
	}
	
	public void calcularSueldoMensualMecanico() {
		System.out.println("Introduce DNI");
		String dni = teclado.next();
		
		for(int i=0;i<mecanicos.length;i++) {
			if(mecanicos[i]!=null && mecanicos[i].getDni().equals(dni)) {
				double sueldoMensual = (mecanicos[i].getSueldoAnualBruto()*0.85)/12;
				System.out.println("El sueldo del Mecanico " + mecanicos[i].getDni() + " es: " + sueldoMensual + "€");
			}
		}
	}
	
	public void anadirNuevoVehiculoACliente() {
		System.out.println("Introduce DNI cliente");
		String dni = teclado.next();
		
		for(int i=0; i<clientes.length; i++) {
			if(clientes[i]!=null && clientes[i].getDni().equals(dni)) {
	
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
				for(int j=0; j<tiposMotor.length;j++) {
					System.out.println((j+1)+".-"+tiposMotor[j].getNombre());
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
				
				Vehiculo nuevoVehiculo;
				
				if(tipoVehiculo == 1) {
					System.out.println("Introduce la potencia");
					int potencia = teclado.nextInt();
					
					nuevoVehiculo = new Coche(matricula, color, numBastidor, tm, caballos, potencia);
				}else {
					System.out.println("Introduce la cilindrada");
					int cilindrada = teclado.nextInt();
					
					nuevoVehiculo = new Moto(matricula, color, numBastidor, tm, caballos, cilindrada);
				}
				
				if(clientes[i].getVehiculo()!=null) {
					System.out.println("¿Quieres cambiar el vehiculo existente por el nuevo vehiculo que acabas de crear?(S/N)");
					String respuesta = teclado.next();
					if("s".equalsIgnoreCase(respuesta)) {
						clientes[i].setVehiculo(nuevoVehiculo);
					}
				}else {
					clientes[i].setVehiculo(nuevoVehiculo);
					System.out.println("Vehiculo Añadido");
				}
				
				break;
			}
		}
		
	}
	
	public void anadirVehiculoRepararMecanico() {
		System.out.println("Introduce DNI cliente");
		String dni = teclado.next();
		
		boolean vehiculoAsignado = false;
		
		for(int i=0; i<clientes.length; i++) {
			if(clientes[i]!=null && clientes[i].getDni().equals(dni)) {
				for(int j=0;j<mecanicos.length;j++) {
					if(mecanicos[j]!=null && mecanicos[j].getReparandoVehiculo()==null) {
						mecanicos[j].setReparandoVehiculo(clientes[i].getVehiculo());
						vehiculoAsignado = true;
						break;
					}
				}
				if(vehiculoAsignado) {
					break;
				}
			}
		}
		
		
	}
	
	public void terminarReparacion() {
		System.out.println("Introduce DNI cliente");
		String dni = teclado.next();
		
		for(int i=0; i<mecanicos.length; i++) {
			if(mecanicos[i]!=null && mecanicos[i].getDni().equals(dni)) {
				mecanicos[i].setReparandoVehiculo(null);
			}
		}
	}
	
	public Cliente obtenerClienteDNI() {
		System.out.println("Introduce DNI cliente");
		String dni = teclado.next();
		
		for(int i=0; i<clientes.length; i++) {
			if(clientes[i]!=null && clientes[i].getDni().equals(dni)) {
				return clientes[i];
			}
		}
		
		return null;
	}

	public void eliminarVehiculoCliente() {
		Cliente cliente = obtenerClienteDNI();
		
		if(cliente!=null) {
			cliente.setVehiculo(null);
		}
	}
	
}
