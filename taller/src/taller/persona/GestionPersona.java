package taller.persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestionPersona {
	
	private Cliente[] clientes = new Cliente[10];
	//[cliente, null, cliente, null, null, null, null, null, null, null]
	
	public void crearCliente() {
		Scanner teclado = new Scanner(System.in);
		
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
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
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
		
		teclado.close();
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

}
