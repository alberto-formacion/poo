package arrays;

public class Main {
	public static void main(String[] args) {
		String[] diasSemana = {"l", "m", "x", "j", "v", "s", "d"};
		String[] listaNombres = new String[10];
		
		System.out.println(diasSemana[2]);
		System.out.println(diasSemana.length);
		
		int ultimaPosicion = diasSemana.length - 1;
		System.out.println(diasSemana[ultimaPosicion]);
		
		for(int i=0;i<diasSemana.length;i++) {
			System.out.println(diasSemana[i]);
		}
		for(int i=diasSemana.length-1;i>=0;i--) {
			System.out.println(diasSemana[i]);
		}
		
		listaNombres[0] = "Gaizka";
		listaNombres[0] = "Alex";
		
	}
}
