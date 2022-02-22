package ejercicio19b;

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
				if(j == 0) {
					System.out.print("*");
				}else if(j == filas -1) {
					System.out.print("*");
				}else {
					if(i==0) {
						System.out.print("*");
					}else if(i==columnas-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println("");
		}

		teclado.close();
	}

}
