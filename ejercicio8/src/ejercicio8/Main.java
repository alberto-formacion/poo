package ejercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una nota:");
		int nota = teclado.nextInt();
		
		switch (nota) {
		case 0,1,2,3,4:
			System.out.println("Suspenso");
			break;
		case 5,6:
			System.out.println("Aprobado");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Matricula de honor");
		}
		
		teclado.close();
	}

}
