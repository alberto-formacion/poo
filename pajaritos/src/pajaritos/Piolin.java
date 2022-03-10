package pajaritos;

public class Piolin extends Canario{
	
	private int numPeliculas;

	public Piolin(String sexo, int edad, int numPeliculas) {
		super(sexo, edad);
		this.numPeliculas = numPeliculas;
	}

	@Override
	public void cantar() {
		System.out.println("Canto como un piolin");
		
	}
	
	public int getNumPeliculas() {
		return numPeliculas;
	}

	public void setNumPeliculas(int numPeliculas) {
		this.numPeliculas = numPeliculas;
	}
}
