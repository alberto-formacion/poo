package animales.main;

import java.util.Scanner;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);
	//crear una variable global llamada animal de tipo array de String de seis posiciones
	static String[] animal = new String[6];

    public static void main(String[] args) {

        //crear una variable opcion de tipo entero
    	int opcion = 0;
        //crear un do...while(mientras que opcion sea distinto de 5)
    	do {
            //pintar el menu
    		System.out.println("1.-Crear animal");
    		System.out.println("2.-Ver animal");
    		System.out.println("3.-Editar animal");
    		System.out.println("4.-Borrar animal");
    		System.out.println("5.-Salir");
    		//pedir al usuario que introduzca una opcion y guardarla en la variable opcion
    		System.out.println("Insertar una opción");
    		opcion = teclado.nextInt();
    		
    		//hacer un switch con la opcion
    		switch(opcion) {
    		//en caso que sea 1
    		case 1:
                //insertar los datos del animal
    			insertarAnimal();
    			break;
    		//en caso que sea 2
    		case 2:
    			//mostrar por consola los datos del array
    			for(int i=0;i<animal.length;i++) {
    				System.out.println(animal[i]);
    			}
    			break;
    		//en caso que sea 3
    		case 3:
    			insertarAnimal();
    			break;
    		//en caso que sea 4
    		case 4:
    			for(int i=0;i<animal.length;i++) {
    				animal[i] = null;
    			}
    			break;
    		case 5:
    			System.out.println("Hasta la vista Cowboy");
    			break;
    		default:
    			System.out.println("Introduce un numero entre el 1 y el 5");
    		}
    		
    	}while(opcion != 5);
    	
    	teclado.close();

    }
    
  //[visibilidad] [modificadores] tipoDeRetorno nombreDelMetodo ([parametro1], [parametro2]... [parametroN])
    public static void insertarAnimal() {
    	System.out.println("Nombre:");
    	animal[0] = teclado.next();
    	System.out.println("Tipo de animal");
    	animal[1] = teclado.next();
    	System.out.println("Raza");
    	animal[2] = teclado.next();
    	System.out.println("Color");
    	animal[3] = teclado.next();
    	System.out.println("Nombre del dueño");
    	animal[4] = teclado.next();
    	System.out.println("Fecha nacimiento");
    	animal[5] = teclado.next();
    }

}
