package ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el tiempo del atleta");
		System.out.println("Horas:");
		int horas = teclado.nextInt();
		System.out.println("Minutos:");
		int minutos = teclado.nextInt();
		System.out.println("Segundos:");
		int segundos = teclado.nextInt();
		
		int tiempoTotal = (horas*3600) + (minutos*60) + segundos;
		
		System.out.println("El total en segundos es " + tiempoTotal + "s");
		
		teclado.close();
	}

}
