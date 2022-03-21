package juego;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{//extiende de JuegoAdivinaNumero
	
	public JuegoAdivinaImpar(int vidas, int numeroAdivinar) {
		super(vidas, numeroAdivinar);
	}
	
	//sobreescribir el metodo validarNumero del padre (JuegoAdivinaNumero) que recibe un numero por parametro
	@Override
	public boolean validarNumero(int numero) {
		//si el resto de la division entre numero y 2 es disto de 0
		if(numero%2 != 0) {
			//devolvemos un true
			return true;
		//en caso contrario
		}else {
			//mostramos un mensaje de numero incorrecto
			System.out.println("Numero incorrecto debe ser IMPAR");
			//devolvemos un false
			return false;
		}
	
	}
}
