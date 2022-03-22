package main;

import java.util.Scanner;

import juego.JuegoAdivinaImpar;
import juego.JuegoAdivinaNumero;
import juego.JuegoAdivinaPar;
import juego.interfaces.Jugable;

public class Main {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		/*Juego j1 = new Juego(5);
		Juego j2 = new Juego(5);
		
		j1.muestraVidasRestantes();
		j1.quitarVida();
		j1.muestraVidasRestantes();
		j1.reiniciarPartida();
		j1.muestraVidasRestantes();
		j2.muestraVidasRestantes();*/
		
		//crear una instancia de cada juego
		/*JuegoAdivinaNumero juegoAN = new JuegoAdivinaNumero(3, 5);
		JuegoAdivinaImpar juegoAI = new JuegoAdivinaImpar(3,7);
		JuegoAdivinaPar juegoAP = new JuegoAdivinaPar(3, 2);
		
		//llamar al metodo jugar de cada una de ellas
		juegoAN.muestraNombre();
		juegoAN.muestraInfo();
		juegoAN.jugar();
		
		juegoAI.muestraNombre();
		juegoAI.muestraInfo();		
		juegoAI.jugar();
		
		juegoAP.muestraNombre();
		juegoAP.muestraInfo();
		juegoAP.jugar();*/
		
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
		
		/* solucion 2: */
		Jugable resultado = null;
		
		int juegoSeleccionado = 0;
		
		JuegoAdivinaNumero juegoAN = new JuegoAdivinaNumero(3, 5);
		JuegoAdivinaImpar juegoAI = new JuegoAdivinaImpar(3,7);
		JuegoAdivinaPar juegoAP = new JuegoAdivinaPar(3, 2);
		
		Jugable[] juegos = new Jugable[3];
		juegos[0] = juegoAN;
		juegos[1] = juegoAI;
		juegos[2] = juegoAP;
		
		do {
			System.out.println("Bienvenido a mis juegos");
			System.out.println("Elige un juego:");
			
			for(int i=0;i<juegos.length;i++) {
				System.out.print((i+1) + ".-");
				juegos[i].muestraNombre();
			}
			
			juegoSeleccionado = teclado.nextInt();
			
			if(juegoSeleccionado > 0 && juegoSeleccionado < juegos.length) {
				/*solucion 1: 
				  return juegos[juegoSeleccionado-1];*/
				
				/*solucion 2:*/
				resultado = juegos[juegoSeleccionado-1];
			}
			
		}while(juegoSeleccionado <= 0 || juegoSeleccionado > juegos.length);
		/*solucion 1:
		return null;*/
		
		/*solucion 2:*/
		return resultado;
	
	}

}
