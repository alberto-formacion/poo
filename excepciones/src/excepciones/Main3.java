package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main3 {
	
	public static void main(String[] args) {
		try {
			leerFichero("c:/a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void leerFichero(String ruta) throws FileNotFoundException {
		File fichero = new File(ruta);
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);	
	}

	/*private static void leerFichero(String ruta) {
		File fichero = new File(ruta);
		
		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);	
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			e.printStackTrace();
		}
		
	}*/

}
