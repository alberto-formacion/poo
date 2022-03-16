package habladores.ave;

public class Buitre extends Ave{
	
	private double velocidad, peso;

	public Buitre(String sexo, int edad, double velocidad, double peso) {
		super(sexo, edad);
		this.velocidad = velocidad;
		this.peso = peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
