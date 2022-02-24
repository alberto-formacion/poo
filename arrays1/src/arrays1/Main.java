package arrays1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//crear un array de Strings de 3 posiciones
		String[] nombres = new String[3];
		
		//pedir por teclado 3 nombres y 
		//añadir esos nombres al array
		System.out.println("Introduce el primer nombre:");
		nombres[0] = teclado.next();
		
		System.out.println("Introduce el segundo nombre:");
		nombres[1] = teclado.next();
		
		System.out.println("Introduce el tercer nombre:");
		nombres[2] = teclado.next();
		
		//visualizar todos los nombres
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}
		
		teclado.close();
	}
}
