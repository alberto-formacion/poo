package habladores.aparato;

public class Lavadora extends Aparato{

	private double alto, ancho;

	public Lavadora(int consumo, double precio, double alto, double ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
}
