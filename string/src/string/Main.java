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
		
		System.out.println(esPalindromo("Alberto"));
		System.out.println(esPalindromo("Ad�n no cede con Eva y Yav� no cede con nada.")); //17
		
		String[] arrayCadena = cadena.split("");
		
		//"me gustaria ser pirata"
		System.out.println(cadena.substring(3,6));
		System.out.println(cadena);
		
		System.out.println(cadena.indexOf("a"));
		
	}
	
	public static boolean esPalindromo(String cadena) {
		
		String cadenaSoloLetras = "";
		//"Alberto"
		for(int i=0; i < cadena.length(); i++) {
			if(cadena.charAt(i) != ' ' && cadena.charAt(i) != ',' && cadena.charAt(i) != '.') {
				cadenaSoloLetras = cadenaSoloLetras + cadena.charAt(i);
			}
		}
		
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("�", "a");
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("�", "e");
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("�", "i");
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("�", "o");
		cadenaSoloLetras = cadenaSoloLetras.replaceAll("�", "u");
		
		String cadenaAlReves = "";
		for(int i = cadenaSoloLetras.length()-1; i>=0; i--) {
			cadenaAlReves = cadenaAlReves + cadenaSoloLetras.charAt(i);
			//otreblA
		}
		
		if(cadenaSoloLetras.equalsIgnoreCase(cadenaAlReves)) {
			return true;
		}else {
			return false;
		}
		
	}

}
