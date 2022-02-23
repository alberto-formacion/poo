package ejercicio23;

public class Main {

	public static void main(String[] args) {
		int primera = 1;
		int segunda = 1;
		int siguente = 0;
		
		System.out.println(primera);
		System.out.println(segunda);
		
		for(int i=0;i<30;i++) {
			siguente = primera + segunda;
			System.out.println(siguente);
			primera = segunda;
			segunda = siguente;	
		}
	}

}
