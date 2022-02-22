package ejercicio14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		int numero = teclado.nextInt();
		boolean esPrimo = true;
		
		for(int i=2;i<numero;i++) {
			int resto = numero%i;
			if(resto == 0) {
				System.out.println("El numero NO es primo");
				esPrimo = false;
				break;
			}
			
			/*if(numero%i == 0) {
				
			}*/
		}
		
		if(esPrimo) {
			System.out.println("El numero ES primo");
		}

		teclado.close();
	}
}
