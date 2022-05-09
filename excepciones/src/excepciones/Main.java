package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.println("introduce un numero:");
		try {
			int num = teclado.nextInt();
			System.out.println(num);
		}catch(InputMismatchException e) {
			System.out.println("No has introducido un numero, pangolin");
		}catch(Exception e) {
			System.out.println("Error generico");
			//e.printStackTrace();
		}
		
		
		System.out.println("Adios");
		teclado.close();
	}

}
