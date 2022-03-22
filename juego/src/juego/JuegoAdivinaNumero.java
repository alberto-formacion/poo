package juego;

import java.util.Scanner;

import juego.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable{ //extiende de Juego
	
	//crear un atributo numeroAdivinar de tipo entero
	private int numeroAdivinar;
	
	//crear un constructor de JuegoAdivinaNumero que recibe por parametro el numero de vidas y el numero a adivinar
	public JuegoAdivinaNumero(int vidas, int numeroAdivinar) {
		//llamamos al constructor del padre con el parametro de numero de vidas
		super(vidas);
		//asignamos el valor de numero a adivinar a la variable numeroAdivinar de la clase
		this.numeroAdivinar = numeroAdivinar;
	}
	
	//sobreescribimos el metodo jugar del padre (Juego)
	@Override
	public void jugar() {
		Scanner teclado = new Scanner(System.in);
		//llamamos al metodo reiniciar partida de la clase Juego
		reiniciarPartida();
		//crear una variable llamanda seguirJugando de tipo boolean inicializada a false
		boolean seguirJugando = false;
		//do{
		do {
			System.out.println("Introduce un numero por teclado");
			//pedir un numero al usuario por consola y guardar ese numero en una variable de tipo entero numero
			int numero = teclado.nextInt();
			
			//si validarNumero es igual a true
			if(validarNumero(numero)) {
				//si el numero es igual a numeroAdivinar
				if(numero == numeroAdivinar) {
					//mostrar un mensaje de acertasre
					System.out.println("Has acertado!!");
					//llamar al metodo actualizarRecord
					actualizaRecord();
					//poner la variable seguirJugando a false
					seguirJugando = false;
				//en caso contrario
				}else {
					//se llama al metodo quitarVida y se guarda el retorno en seguirJugando
					seguirJugando = quitarVida();
					//añado un if para no sacar los mensajes de mayor/menor en caso de que el jugador no pueda seguir jugando
					if(seguirJugando == true) {
						//si el numero es mayor a numeroAdivinar
						if(numero > numeroAdivinar) {
							//mostrar mensaje "El numero a adivinar es menor"
							System.out.println("El numero a adivinar es menor");
						//en caso contrario
						}else {
							//mostrar mensaje "El numero a adivinar es mayor"
							System.out.println("El numero a adivinar es mayor");
						}
					}
				}
			//en caso contrario
			}else {
				//le ponemos a la variable seguirJugando el valor true
				seguirJugando = true;
			}

		//} while(seguirJugando sea true);
		}while(seguirJugando);
		//}while(seguirJugando == true);
		
	}
	
	//crear un metodo que devuelve un boolean y recibe por parametro un numero entero
	public boolean validarNumero(int numero) {
		//retornamos un true
		return true;
	}

	@Override
	public void muestraNombre() {
		System.out.println("Juego Adivina Numero");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Introduce numeros hasta encontrar el numero secreto, tienes " + getNumVidasIniciales() + " intentos para conseguirlo");
	}
}
