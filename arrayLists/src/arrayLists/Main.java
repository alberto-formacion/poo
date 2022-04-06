package arrayLists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//ArrayList vs Array
		
		//Inicializacion
		String[] letras = new String[5];
		ArrayList<String> letrasAL = new ArrayList<String>();
		
		//añadir un elemento
		letras[0] = "hola";
		letrasAL.add("hola");
		
		//Array es limitado a el numero de valores con el que inicia
		//ArrayList es DINAMICO
		
		//Obtener la dimension
		int dimensionArray = letras.length;
		int dimensionAL = letrasAL.size();
		
		//recorrer valores
		for(int i = 0; i<letras.length;i++) {
			System.out.println(letras[i]);
		}
		
		for(int i=0; i< letrasAL.size();i++) {
			System.out.println(letrasAL.get(i));
		}
		
		//eliminar valores
		letras[0] = null;
		letrasAL.remove(0);
		
		for(int i=0;i<letrasAL.size();i++) {
			if(letrasAL.get(i).equals("hola")) {
				letrasAL.remove(i);
			}
		}
		
		letrasAL.set(0, "adios");

	}

}
