package juego;

public class Juego {
	
	private int numVidasRestantes;
	private int numVidasIniciales;
	
	private static int record = 0;
	
	public Juego(int vidas) {
		this.numVidasRestantes = vidas;
		this.numVidasIniciales = vidas;
	}
	
	public void muestraVidasRestantes() {
		System.out.println("El numero de vidas restantes es " + numVidasRestantes);
	}
	
	public boolean quitarVida() {
		numVidasRestantes--;
		if(numVidasRestantes > 0) {
			return true;
		}else {
			System.out.println("Game Over");
			return false;
		}
	}
	
	public void reiniciarPartida() {
		numVidasRestantes = numVidasIniciales;
	}
	
	public void actualizaRecord() {
		if(numVidasRestantes == record) {
			System.out.println("Se ha alcanzado el Record!");
		}else if(numVidasRestantes > record) {
			record = numVidasRestantes;
			System.out.println("Nuevo RECORD mundial " + record);
		}
	}

}
