package juego;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{//extiende de JuegoAdivinaNumero

	public JuegoAdivinaPar(int vidas) {
		super(vidas);
	}

	@Override
	public boolean validarNumero(int numero) {
		if(numero%2 == 0) {
			return true;
		}else {
			System.out.println("Numero incorrecto debe ser PAR");
			return false;
		}
	
	}
	
	@Override
	public void muestraNombre() {
		System.out.println("Juego Adivina Numero PAR");
	}
	
	@Override
	public void muestraInfo() {
		System.out.println("Introduce numeros PARES hasta encontrar el numero secreto, tienes " + getNumVidasIniciales() + " intentos para conseguirlo");
	}

	@Override
	public void reiniciarPartida() {
		boolean esNumImpar= false;
		do {
			super.reiniciarPartida();
			if(getNumeroAdivinar()%2==0) {
				esNumImpar = false; 
			}else {
				esNumImpar = true;
			}
		}while(esNumImpar);
		
	}
		
}
