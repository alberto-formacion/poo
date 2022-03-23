package string;

public class Main {
	
	public static void main(String[] args) {
		String cadena = "me gustaria ser pirata";
		
		if(cadena.equalsIgnoreCase("Alberto")) {
			System.out.println("La cadena es igual a Alberto");
		}else {
			System.out.println("La cadena es diferente a Alberto");
		}
		
		for(int i=0; i<cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		
		System.out.println(cadena.trim());
		
		String resultado = "";
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i) != ' ') {
				resultado = resultado + cadena.charAt(i);
			}
		}
		
		System.out.println(resultado);
		
		cadena = cadena.concat(resultado);
		
		System.out.println(cadena);
		
	}

}
