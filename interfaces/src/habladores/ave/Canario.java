package habladores.ave;

public class Canario extends Ave{
	
	private boolean canta;

	public Canario(String sexo, int edad, boolean canta) {
		super(sexo, edad);
		this.canta = canta;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}
	
}
