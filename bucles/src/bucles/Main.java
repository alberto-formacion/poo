package bucles;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*int i = 1; 
		int j = i++; //j = 1, i =2
		int k = ++i;// k = 3, i = 3*/
		//for(inicializacion;condicion;actualizacion) 0..N
		for(int i=0;i<10;i++) {
			int a = 0;
			System.out.println(i);
		}
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		Scanner teclado = new Scanner(System.in);
		
		int numero = 0;
		//while(condicion) 0..N
		while(numero >= 0) {
			System.out.println("introduce un numero:");
			numero = teclado.nextInt();
			System.out.println(numero);
		}
		
		//do{ cuerpo } while(condicion); 1..N
		int numero2 = 0;
		do {
			System.out.println("introduce un numero:");
			numero2 = teclado.nextInt();
			System.out.println(numero);	
		}while(numero2 >= 0);
		
		teclado.close();
	}

}
