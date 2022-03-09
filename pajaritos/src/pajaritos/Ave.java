package pajaritos;

public class Ave {
	
	private String sexo;
	private int edad;
	
	private DatosPersonales nombres;
	
	public static int numAvesCreadas = 0;

	public Ave(String sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		
		numAvesCreadas++;
	}
	
	public Ave(String sexo, int edad, DatosPersonales nombres) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		this.nombres = nombres;
		
		numAvesCreadas++;	
	}
	
	public static void numeroAvesCreadas() {
		System.out.println("El numero de aves creadas es: " + numAvesCreadas);
	}
	
	public void quienSoy() {
		System.out.println("Sexo: " + sexo + "\n" + "Edad: " + edad);
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public DatosPersonales getNombres() {
		return nombres;
	}

	public void setNombres(DatosPersonales nombres) {
		this.nombres = nombres;
	}

}
