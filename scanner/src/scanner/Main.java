package scanner;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Hola " + nombre + ", bienvenido!");
		teclado.close();
		
		/*Per�metro = lado * 4
		�rea = lado * lado

		Se muestra a continuaci�n un ejemplo de ejecuci�n:

		Introduce el lado del cuadrado: 6 <R>
		El per�metro del cuadrado es 24
		El �rea del cuadrado es 36
		El valor de la diagonal es 8.49*/

	}

}
