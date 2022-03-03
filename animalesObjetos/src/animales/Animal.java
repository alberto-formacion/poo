package animales;

public class Animal {
	public String nombre;
	public String tipoAnimal;
	public String raza;
	public String color;
	public String nomDueno;
	public String fechaNacimiento;
	
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
	
	

}
