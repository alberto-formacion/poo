package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero = teclado.nextInt();
		
		int resultado = 1;
		
		System.out.print("!"+numero+" = ");
		
		for(int i=1;i<=numero;i++) {
			
			if(numero == i) {
				System.out.print(i);
			}else {
				System.out.print(i+"*");
			}
			
			resultado = resultado * i;
		}
		
		System.out.print(" = " + resultado);
		
		// !5 = 1*2*3*4*5 = 120
		
		teclado.close();

	}

}
