package main;

import juego.JuegoAdivinaImpar;
import juego.JuegoAdivinaNumero;
import juego.JuegoAdivinaPar;

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
		
		//crear una instancia de cada juego
		JuegoAdivinaNumero juegoAN = new JuegoAdivinaNumero(3, 5);
		JuegoAdivinaImpar juegoAI = new JuegoAdivinaImpar(3,7);
		JuegoAdivinaPar juegoAP = new JuegoAdivinaPar(3, 2);
		
		//llamar al metodo jugar de cada una de ellas
		juegoAN.jugar();
		juegoAI.jugar();
		juegoAP.jugar();

	}

}
