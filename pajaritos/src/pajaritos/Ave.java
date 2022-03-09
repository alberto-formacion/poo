package pajaritos;

public class Ave {
	
	public String sexo;
	public int edad;
	
	public static int numAvesCreadas = 0;

	public Ave(String sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		
		numAvesCreadas++;
	}
	
	public static void numeroAvesCreadas() {
		System.out.println("El numero de aves creadas es: " + numAvesCreadas);
	}
	
	public void quienSoy() {
		System.out.println("Sexo: " + sexo + "\n" + "Edad: " + edad);
	}

}
