package ejercicio7;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero 1:");
		int numero1 = teclado.nextInt();
		System.out.println("Introduce el numero 2:");
		int numero2 = teclado.nextInt();
		System.out.println("Introduce el numero 3:");
		int numero3 = teclado.nextInt();
		System.out.println("Introduce el numero 4:");
		int numero4 = teclado.nextInt();
		System.out.println("Introduce el numero 5:");
		int numero5 = teclado.nextInt();
		
		int menor = numero1;
		
		if(numero2<menor) {
			menor = numero2;
		}
		if(numero3<menor) {
			menor = numero3;
		}
		if(numero4<menor) {
			menor = numero4;
		}
		if(numero5<menor) {
			menor = numero5;
		}
		
		System.out.println("El valor mas pequeño es: " + menor);
		
		int mayor = numero1;
		
		if(numero2>mayor) {
			mayor = numero2;
		}
		if(numero3>mayor) {
			mayor = numero3;
		}
		if(numero4>mayor) {
			mayor = numero4;
		}
		if(numero5>mayor) {
			mayor = numero5;
		}
		
		System.out.println("El valor mas grande es: " + mayor);
		
		double media = (numero1+numero2+numero3+numero4+numero5)/5;
		
		System.out.println("La media es: " + media);
		
		teclado.close();
	}

}
