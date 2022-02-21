package condicionales;

public class Main {
	public static void main(String[] args) {
		// if(condicion -> exp booleana){ ... }
		int numero1 = 1;
		int numero2 = 2;
		int numero3 = 3;

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("El numero1 es mayor");
		}else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("El numero2 es mayor");
		}else {
			System.out.println("El numero3 es mayor");
		}
		/*
		 * if(numero2 > numero1) { System.out.println("El numero2 es mayor"); }
		 */

		// switch(expresion a evaluar){ case : }
		String nombre = "Alberto";
		switch(numero1) {
		case 1:
			System.out.println("Es un uno");
			break;
		case 2:
			System.out.println("Es un dos");
			break;
		case 3:
			System.out.println("Es un tres");
			break;
		default:
			System.out.println("El numero es mayor que tres");
		}
	}
}
