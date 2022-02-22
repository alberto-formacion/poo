package ejercicio19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce filas:");
		int filas = teclado.nextInt();

		System.out.println("Introduce columnas:");
		int columnas = teclado.nextInt();
		for (int j = 0; j < filas; j++) {
			for (int i = 0; i < columnas; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		teclado.close();
	}

}
