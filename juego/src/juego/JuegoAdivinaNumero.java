package juego;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import juego.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable{ 
	private int numeroAdivinar;
	private Random random;
	
	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
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
	
	@Override
	public void reiniciarPartida() {
		super.reiniciarPartida();
		numeroAdivinar = random.nextInt(10) + 1;
	}
	
	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int getNumeroAdivinar() {
		return numeroAdivinar;
	}

	public void setNumeroAdivinar(int numeroAdivinar) {
		this.numeroAdivinar = numeroAdivinar;
	}
	
}
