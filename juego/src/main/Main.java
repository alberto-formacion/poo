package main;

import juego.Juego;

public class Main {

	public static void main(String[] args) {
		Juego j1 = new Juego(5);
		Juego j2 = new Juego(5);
		
		j1.muestraVidasRestantes();
		j1.quitarVida();
		j1.muestraVidasRestantes();
		j1.reiniciarPartida();
		j1.muestraVidasRestantes();
		j2.muestraVidasRestantes();

	}

}
