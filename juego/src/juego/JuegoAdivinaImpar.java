package juego;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{//extiende de JuegoAdivinaNumero
	
	public JuegoAdivinaImpar(int vidas) {
		super(vidas);
	}
	
	@Override
	public boolean validarNumero(int numero) {
		if(numero%2 != 0) {
			return true;
		}else {
			System.out.println("Numero incorrecto debe ser IMPAR");
			return false;
		}
	
	}
	
	@Override
	public void muestraNombre() {
		System.out.println("Juego Adivina Numero IMPAR");
	}
	
	@Override
	public void muestraInfo() {
		System.out.println("Introduce numeros IMPARES hasta encontrar el numero secreto, tienes " + getNumVidasIniciales() + " intentos para conseguirlo");
	}
	
	@Override
	public void reiniciarPartida() {
		boolean esNumPar= false;
		do {
			super.reiniciarPartida();
			if(getNumeroAdivinar()%2==0) {
				esNumPar = true; 
			}else {
				esNumPar = false;
			}
		}while(esNumPar);
	}
}
