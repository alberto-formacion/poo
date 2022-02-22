package ejercicio12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int resultado = 0;
		int numero = 0;
		
		do {
			System.out.println("Introduce un numero:");
			numero = teclado.nextInt();
			if(numero>0) {
				resultado = resultado + numero;
			}
		}while(numero >= 0);
		
		System.out.println("la suma de todos los numeros es: " + resultado);
		teclado.close();
	}
}
