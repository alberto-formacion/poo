package habladores.ave;

import habladores.interfaces.Hablador;

public class Piolin extends Canario implements Hablador{

	private int numPeliculas;

	public Piolin(String sexo, int edad, boolean canta, int numPeliculas) {
		super(sexo, edad, canta);
		this.numPeliculas = numPeliculas;
	}

	public int getNumPeliculas() {
		return numPeliculas;
	}

	public void setNumPeliculas(int numPeliculas) {
		this.numPeliculas = numPeliculas;
	}

	@Override
	public void hablar() {
		System.out.println("Soy Piolin y hablo");		
	}
	
}
