package habladores.aparato;

import habladores.interfaces.Hablador;

public class TV extends Aparato implements Hablador{

	private boolean teletexto;
	private int antiguedad;

	public TV(int consumo, double precio, boolean teletexto, int antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}

	public boolean isTeletexto() {
		return teletexto;
	}

	public void setTeletexto(boolean teletexto) {
		this.teletexto = teletexto;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public void hablar() {
		System.out.println("Soy TV y hablo");
		
	}

}
