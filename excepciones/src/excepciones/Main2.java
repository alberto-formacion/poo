package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
	
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String[] dias = {"L", "M", "X", "J", "V", "S", "D"};

		boolean repetir = true;
		
		do {
			try {
				System.out.println("Dime que dia quieres ver:");
				int posicion = teclado.nextInt();
				System.out.println(dias[posicion]);
				repetir = false;
			}catch(InputMismatchException e) {
				System.out.println("No has introducido un numero");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("El numero que has introducido es incorrecto, introduce un nuemro entre 0 y 6");
			}finally {
				teclado.nextLine();
			}
			
		}while(repetir);
		
		/*for(int i = 0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}*/
		System.out.println("Adios");
		teclado.close();
	}

}
