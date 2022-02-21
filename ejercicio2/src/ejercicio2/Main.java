package ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Que quieres convertir:");
		System.out.println("1.- Cº a Fº");
		System.out.println("2.- Fº a Cº");
		
		int opcion = teclado.nextInt();
		
		double celsius = 0;
		double farenheit = 0;
		
		/*switch(opcion) {
		case 1:
			System.out.println("Introduce los grados celsius que quieres convertir:");
			celsius = teclado.nextDouble();
			
			farenheit = (celsius*1.8) + 32;
			
			System.out.println("Los grados en Farenheit son: " + farenheit);
			break;
		case 2:
			System.out.println("Introduce los grados farenheit que quieres convertir:");
			farenheit = teclado.nextDouble();
			
			celsius = (farenheit - 32) / 1.8;
			
			System.out.println("Los grados en Celsius son: " + celsius);
			break;
		default:
			System.out.println("No seas Alberto anda!");
		}*/
		
		if(opcion == 1) {
			System.out.println("Introduce los grados celsius que quieres convertir:");
			celsius = teclado.nextDouble();
			
			farenheit = (celsius*1.8) + 32;
			
			System.out.println("Los grados en Farenheit son: " + farenheit);	
		}else if(opcion == 2) {
			System.out.println("Introduce los grados farenheit que quieres convertir:");
			farenheit = teclado.nextDouble();
			
			celsius = (farenheit - 32) / 1.8;
			
			System.out.println("Los grados en Celsius son: " + celsius);		
		}else {
			System.out.println("No seas Alberto anda!");
		}
		
		teclado.close();
	}
}
