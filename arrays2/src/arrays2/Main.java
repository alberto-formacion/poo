package arrays2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Crear un array de enteros de 10 posiciones 
		// => *pedir el numero de posiciones
		int mayor=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		int suma=0;
		
		System.out.println("De cuantas posiciones queremos nuestro array:");
		int posiciones = teclado.nextInt();
		
		int[] numeros = new int[posiciones];
		//Pedir por teclado 10 numeros y añadirlos al array (intentad con un for)
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduce un numero:");
			numeros[i]=teclado.nextInt();
		}
		//visualizar los numeros que hay en el array, obtener el mayor, menor y media
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>mayor) {
				mayor = numeros[i];
			}
			
			if(numeros[i]<menor) {
				menor = numeros[i];
			}
			
			suma = suma + numeros[i];
			
			System.out.println(numeros[i]);
		}
	
		//visualizar el mayor, menor y media
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
		System.out.println("La media es: " + (suma/numeros.length));
		
		
		teclado.close();
	}

}
