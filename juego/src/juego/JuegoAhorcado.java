package juego;

import java.util.Scanner;

import juego.interfaces.Jugable;

public class JuegoAhorcado extends Juego implements Jugable{
	
	private String cadenaAdivinar;

	public JuegoAhorcado(int vidas, String cadenaAdivinar) {
		super(vidas);
		this.cadenaAdivinar = cadenaAdivinar;
	}
	
	@Override
	public void jugar() {
		Scanner teclado = new Scanner(System.in);
		reiniciarPartida();
		
		boolean seguirJugando = false;
		
		String cadenaOculta = "";
		
		for(int i=0;i<cadenaAdivinar.length();i++) {
			cadenaOculta = cadenaOculta + "-";
		}
		
		do{
			System.out.println(cadenaOculta);
			
			System.out.println("Introduce un caracter:");
			String letra = teclado.next();
			
			boolean existeCaracter = false;
			
			for(int i = 0; i<cadenaAdivinar.length(); i++) {
				if(cadenaAdivinar.charAt(i) == letra.charAt(0)) {
					cadenaOculta = cadenaOculta.substring(0,i) + letra + cadenaOculta.substring(i+1);
					existeCaracter = true;
					seguirJugando = true;
				}
			}
			
			if(!existeCaracter) {
				seguirJugando = quitarVida();
			}
			
			if(cadenaAdivinar.equals(cadenaOculta)) {
				System.out.println("Has encontrado la palabra oculta: " + cadenaAdivinar);
				seguirJugando = false;
			}
		}while(seguirJugando);
		
	}

	@Override
	public void muestraNombre() {
		System.out.println("Ahorcado");
		
	}

	@Override
	public void muestraInfo() {
		System.out.println("Adivina la palabra oculta");
		
	}

}
