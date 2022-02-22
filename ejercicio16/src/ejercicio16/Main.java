package ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		int numero = teclado.nextInt(); //125

		String num = String.valueOf(numero);//convertir numero a cadena de caracteres
		
		for(int i=0; i<num.length();i++) { //num.length() - obtiene cuantos caracteres tiene mi cadena de caracteres
			System.out.println(num.charAt(i)); //charAt - devuelve el caracter en la posicion que le pida
		}
		
		teclado.close();

	}

}
