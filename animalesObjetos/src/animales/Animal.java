package animales;

public class Animal {
	private String nombre;
	private String tipoAnimal;
	private String raza;
	private String color;
	private String nomDueno;
	private String fechaNacimiento;
	
	public static int numeroAnimalesCreados = 0;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, String tipoAnimal, String raza, String color, String nomDueno,
			String fechaNacimiento) {
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
		this.raza = raza;
		this.color = color;
		this.nomDueno = nomDueno;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Animal [Nombre=" + nombre + ", Tipo Animal=" + tipoAnimal + ", Raza=" + raza + ", Color=" + color
				+ ", Dueño=" + nomDueno + ", Fecha Nacimiento=" + fechaNacimiento + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNomDueno() {
		return nomDueno;
	}

	public void setNomDueno(String nomDueno) {
		this.nomDueno = nomDueno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

}
