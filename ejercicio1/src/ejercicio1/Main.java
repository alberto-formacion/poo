package ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero para calcular el Perimetro y Area de un cuadrado:");
		int lado = teclado.nextInt();
		
		/*int perimetro = lado * 4;
		int area = lado * lado;
		
		System.out.println("El perimetro es " + perimetro);
		System.out.println("El area es " + area);*/
		
		System.out.println("El perimetro es " + (lado * 4));
		System.out.println("El area es " + (lado * lado));

		teclado.close();
	}
}
