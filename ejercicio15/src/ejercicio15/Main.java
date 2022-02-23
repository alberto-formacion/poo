package ejercicio15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce dia:");
		int dia = teclado.nextInt();
		System.out.println("Introduce mes:");
		int mes = teclado.nextInt();
		System.out.println("Introduce año:");
		int anyo = teclado.nextInt();
		
		int enero = 31;
		int febrero = 28;
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
			febrero = 29;
		}
		int marzo = 31;
		int abril = 30;
		int mayo = 31;
		int junio = 30;
		int julio = 31;
		int agosto = 31;
		int septiembre = 30;
		int octubre = 31;
		int noviembre = 30;
		//int diciembre = 31;
		
		switch(mes) {
		case 1:
			System.out.println(dia);
			break;
		case 2:
			System.out.println(enero+dia);
			break;
		case 3:
			System.out.println(enero+febrero+dia);
			break;
		case 4:
			System.out.println(enero+febrero+marzo+dia);
			break;
		case 5:
			System.out.println(enero+febrero+marzo+abril+dia);
			break;
		case 6:
			System.out.println(enero+febrero+marzo+abril+mayo+dia);
			break;
		case 7:
			System.out.println(enero+febrero+marzo+abril+mayo+junio+dia);
			break;
		case 8:
			System.out.println(enero+febrero+marzo+abril+mayo+junio+julio+dia);
			break;
		case 9:
			System.out.println(enero+febrero+marzo+abril+mayo+junio+julio+agosto+dia);
			break;
		case 10:
			System.out.println(enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+dia);
			break;
		case 11:
			System.out.println(enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+dia);
			break;
		case 12:
			System.out.println(enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+noviembre+dia);
			break;
		}
		
		teclado.close();
		
	}
}
