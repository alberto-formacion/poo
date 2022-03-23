package juego;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import juego.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable{ 
	private int numeroAdivinar;
	//crear un atributo de tipo random
	private Random random;
	
	//Eliminar el parametro numeroAdivinar
	public JuegoAdivinaNumero(int vidas, int numeroAdivinar) {
		super(vidas);
		//eliminar esta linea porque ya no tiene sentido
		this.numeroAdivinar = numeroAdivinar;
		//inicializar el atributo random utilizando una semilla
		random = new Random(Calendar.getInstance().getTimeInMillis());
	}
	
	@Override
	public void jugar() {
		Scanner teclado = new Scanner(System.in);
		reiniciarPartida();
		boolean seguirJugando = false;
		do {
			System.out.println("Introduce un numero por teclado");
			int numero = teclado.nextInt();
			
			if(validarNumero(numero)) {
				if(numero == numeroAdivinar) {
					System.out.println("Has acertado!!");
					actualizaRecord();
					seguirJugando = false;
				}else {
					seguirJugando = quitarVida();
					if(seguirJugando == true) {
						if(numero > numeroAdivinar) {
							System.out.println("El numero a adivinar es menor");
						}else {
							System.out.println("El numero a adivinar es mayor");
						}
					}
				}
			}else {
				seguirJugando = true;
			}

		}while(seguirJugando);
		
	}
	
	public boolean validarNumero(int numero) {
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
	
	//sobreescribir el metodo reiniciarPartida del padre (Juego)
		//llamar al metodo padre utilizando super y el nombre del metodo (reiniciarPartida)
		//guardar en numeroAdivinar un numero aleatorio entre 1 y 10 **random.nextInt(10 - 1 + 1) + 1**
}
