package animales.main;

import java.util.Scanner;

import animales.Animal;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);
	//crear una variable global llamada animal de tipo array de String de seis posiciones
	//static String[] animal = new String[6];
	//static String[][] animales = new String[10][6];
	static Animal[] animales = new Animal[10];
	//static int contadorAnimales = 0;

    public static void main(String[] args) {

        //crear una variable opcion de tipo entero
    	int opcion = 0;
        //crear un do...while(mientras que opcion sea distinto de 5)
    	do {
            //pintar el menu
    		System.out.println("1.-Crear animal");
    		System.out.println("2.-Ver animales");
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
    			boolean vacio = true;
    			for(int i=0;i<animales.length;i++) {
    				if(animales[i]!=null) {
    					vacio = false;
    					System.out.println(animales[i]);
    				}
    			}
    			if(vacio) {
    				System.out.println("No hay animales en el sistema");
    			}
    			break;
    		//en caso que sea 3
    		case 3:
    			System.out.println("Introduce la fila a modificar:");
    			int filaModificar = teclado.nextInt();
    			editarAnimal(filaModificar);
    			break;
    		//en caso que sea 4
    		case 4:
    			System.out.println("Introduce la fila a borrar:");
    			int filaBorrar = teclado.nextInt();
    			
    			animales[filaBorrar] = null;
    			
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
    	/*Animal animal = new Animal();
    	
    	System.out.println("Nombre:");
    	animal.nombre = teclado.next();
    	System.out.println("Tipo de animal");
    	animal.tipoAnimal = teclado.next();
    	System.out.println("Raza");
    	animal.raza = teclado.next();
    	System.out.println("Color");
    	animal.color = teclado.next();
    	System.out.println("Nombre del dueño");
    	animal.nomDueno = teclado.next();
    	System.out.println("Fecha nacimiento");
    	animal.fechaNacimiento = teclado.next();*/
    	
    	System.out.println("Nombre:");
    	String nombre = teclado.next();
    	System.out.println("Tipo de animal");
    	String tipo = teclado.next();
    	System.out.println("Raza");
    	String raza = teclado.next();
    	System.out.println("Color");
    	String color = teclado.next();
    	System.out.println("Nombre del dueño");
    	String dueno = teclado.next();
    	System.out.println("Fecha nacimiento");
    	String fecha = teclado.next();
    	
    	Animal a = new Animal(nombre, tipo, raza, color, dueno, fecha);
    	
    	animales[Animal.numeroAnimalesCreados] = a;
    	
    	Animal.numeroAnimalesCreados ++;

    }
    
    public static void editarAnimal(int fila) {
    	Animal animal = new Animal();
    	
    	System.out.println("Nombre:");
    	animal.setNombre(teclado.next());
    	System.out.println("Tipo de animal");
    	animal.setTipoAnimal(teclado.next());
    	System.out.println("Raza");
    	animal.setRaza(teclado.next());
    	System.out.println("Color");
    	animal.setColor(teclado.next());
    	System.out.println("Nombre del dueño");
    	animal.setNomDueno(teclado.next());
    	System.out.println("Fecha nacimiento");
    	animal.setFechaNacimiento(teclado.next());
    	
    	animales[fila] = animal;
    }

}