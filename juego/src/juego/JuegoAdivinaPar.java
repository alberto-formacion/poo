package juego;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{//extiende de JuegoAdivinaNumero

	public JuegoAdivinaPar(int vidas, int numeroAdivinar) {
		super(vidas, numeroAdivinar);
	}

	//sobreescribir el metodo validarNumero del padre (JuegoAdivinaNumero) que recibe un numero por parametro
	@Override
	public boolean validarNumero(int numero) {
		//si el resto de la division entre numero y 2 es 0
		if(numero%2 == 0) {
			//devolvemos un true
			return true;
		//en caso contrario
		}else {
			//mostramos un mensaje de numero incorrecto
			System.out.println("Numero incorrecto debe ser PAR");
			//devolvemos un false
			return false;
		}
	
	}

		
}
