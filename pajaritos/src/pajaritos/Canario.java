package pajaritos;

public class Canario extends Ave{
	
	public double tamano;

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
			System.out.println("Pequeño");
		}else {
			System.out.println("Mediano");
		}
	}

	
}
