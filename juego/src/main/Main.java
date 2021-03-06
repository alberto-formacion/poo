package main;

import java.util.Scanner;

import juego.JuegoAdivinaImpar;
import juego.JuegoAdivinaNumero;
import juego.JuegoAdivinaPar;
import juego.JuegoAhorcado;
import juego.interfaces.Jugable;

public class Main {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
	
		boolean volverJugar = false;
		
		do {
			Jugable juego = eligeJuego();
			juego.muestraNombre();
			juego.muestraInfo();
			juego.jugar();
			
			String respuesta = "";
			
			do{
				System.out.println("Quieres volver a jugar (s/n)");
				respuesta = teclado.next();
			}while(!"s".equalsIgnoreCase(respuesta) && !"n".equalsIgnoreCase(respuesta));
			
			if(respuesta.equalsIgnoreCase("s")) {
				volverJugar = true;
			}else {
				System.out.println("Fin del juego");
				volverJugar = false;
			}
			
		}while(volverJugar);

	}
	
	public static Jugable eligeJuego() {

		Jugable resultado = null;
		
		int juegoSeleccionado = 0;
		
		JuegoAdivinaNumero juegoAN = new JuegoAdivinaNumero(3);
		JuegoAdivinaImpar juegoAI = new JuegoAdivinaImpar(3);
		JuegoAdivinaPar juegoAP = new JuegoAdivinaPar(3);
		JuegoAhorcado juegoAH = new JuegoAhorcado(3, "aparcar");
		
		Jugable[] juegos = new Jugable[4];
		juegos[0] = juegoAN;
		juegos[1] = juegoAI;
		juegos[2] = juegoAP;
		juegos[3] = juegoAH;
		
		do {
			System.out.println("Bienvenido a mis juegos");
			System.out.println("Elige un juego:");
			
			for(int i=0;i<juegos.length;i++) {
				System.out.print((i+1) + ".-");
				juegos[i].muestraNombre();
			}
			
			juegoSeleccionado = teclado.nextInt();
			
			if(juegoSeleccionado > 0 && juegoSeleccionado <= juegos.length) {
				resultado = juegos[juegoSeleccionado-1];
			}
			
		}while(juegoSeleccionado <= 0 || juegoSeleccionado > juegos.length);

		return resultado;
	
	}

}
