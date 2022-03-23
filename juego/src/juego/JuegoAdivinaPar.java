package juego;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{//extiende de JuegoAdivinaNumero

	public JuegoAdivinaPar(int vidas, int numeroAdivinar) {
		super(vidas, numeroAdivinar);
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
	
	//sobreescribir el metodo reiniciarPartida del padre (JuegoAdivinaNumero)
		//llamar al metodo reiniciarPartida del padre utilizando super
		//crear numeros aleatorios y validaros con el metodo validarNumero hasta que el metodo devuelva un true utilizando un do..while
		
}
