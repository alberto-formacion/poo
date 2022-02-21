package scanner;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Hola " + nombre + ", bienvenido!");
		teclado.close();
		
		/*Perímetro = lado * 4
		Área = lado * lado

		Se muestra a continuación un ejemplo de ejecución:

		Introduce el lado del cuadrado: 6 <R>
		El perímetro del cuadrado es 24
		El área del cuadrado es 36
		El valor de la diagonal es 8.49*/

	}

}
