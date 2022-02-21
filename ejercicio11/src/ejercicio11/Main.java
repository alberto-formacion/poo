package ejercicio11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero 1:");
		int numero1 = teclado.nextInt();
		
		System.out.println("Introduce el numero 2:");
		int numero2 = teclado.nextInt();
		
		System.out.println("Introduce el operador");
		String operador = teclado.next();
		
		switch(operador) {
		case "+":
			System.out.println(numero1 + numero2);
			break;
		case "-":
			System.out.println(numero1 - numero2);
			break;
		case "*":
			System.out.println(numero1 * numero2);
			break;
		case "/":
			System.out.println(numero1 / numero2);
			break;
		case "%":
			System.out.println(numero1 % numero2);
			break;
		default:
			System.out.println("Operador no valido!");
		}
		
		
		teclado.close();
	}
}
