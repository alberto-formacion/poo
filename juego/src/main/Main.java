package main;

import juego.JuegoAdivinaNumero;

public class Main {

	public static void main(String[] args) {
		/*Juego j1 = new Juego(5);
		Juego j2 = new Juego(5);
		
		j1.muestraVidasRestantes();
		j1.quitarVida();
		j1.muestraVidasRestantes();
		j1.reiniciarPartida();
		j1.muestraVidasRestantes();
		j2.muestraVidasRestantes();*/
		
		JuegoAdivinaNumero juegoAN = new JuegoAdivinaNumero(3, 5);
		juegoAN.jugar();
		
		//crear una instancia de cada juego
		
		//llamar al metodo jugar de cada una de ellas

	}

}
