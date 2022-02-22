package ejercicio13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int mayor = 0;
		// int menor = Integer.MAX_VALUE;
		int menor = 0;
		double suma = 0;
		int contador = 0;
		int numero = 0;

		do {
			System.out.println("Introduce un numero:");
			numero = teclado.nextInt();
			if (contador == 0) {
				menor = numero;
				mayor = numero;
				suma = numero;
				contador++;
			} else {
				if (numero >= 0) {
					suma = suma + numero;

					if (numero > mayor) {
						mayor = numero;
					}

					if (numero < menor) {
						menor = numero;
					}

					contador++;
				}
			}
		} while (numero >= 0);

		System.out.println("El valor mas grande es: " + mayor);
		System.out.println("El valor mas pequeño es: " + menor);
		System.out.println("La media es: " + suma / contador);

		teclado.close();
	}
}
