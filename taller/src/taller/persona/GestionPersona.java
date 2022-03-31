package taller.persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
	
	/*private Mecanico obtenerMecanicoPorDNI(String dni) {
		
	}
	
	public Cliente obtenerClientePorDNI(String dni) {
		
	}*/

}
