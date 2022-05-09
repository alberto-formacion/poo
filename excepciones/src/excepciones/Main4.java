package excepciones;

import java.util.Scanner;

public class Main4 {
	private static Scanner teclado;
		
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.println("Introduce una fecha (dd/mm/yyyy)");
		String fecha = teclado.next();
		
		try {
			boolean valida = validarFecha(fecha);
			
			if(valida) {
				System.out.println(fecha);
			}
		}catch (FormatoException e) {
			System.out.println(e.getMessage());
		}
	}

	private static boolean validarFecha(String fecha) throws FormatoException{
		String[] fechaCortada = fecha.split("/");
		
		if(Integer.valueOf(fechaCortada[0]) > 31) {
			throw new FormatoException("El dia tiene que ser menor que 31");
		}
		
		return true;
	}
}
