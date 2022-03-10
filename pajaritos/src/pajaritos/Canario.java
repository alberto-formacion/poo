package pajaritos;

public abstract class Canario extends Ave{
	
	private double tamano;

	public Canario(String sexo, int edad) {
		super(sexo, edad);
	}
	
	public Canario(String sexo, int edad, double tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}
	
	public void tamano() {
		if(tamano > 30) {
			System.out.println("Alto");
		}else if(tamano < 15) {
			System.out.println("Peque�o");
		}else {
			System.out.println("Mediano");
		}
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	
}
