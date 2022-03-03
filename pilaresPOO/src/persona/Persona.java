package persona;

public class Persona {
	
	public String nombre;
	public String apellidos;
	public String estado;
	public String fechaNac;
	public String dni;
	public String numTel;
	public String email;
	
	public void hablar() {
		System.out.println("Hola");
	}
	
	public void hablar(String frase) {
		System.out.println(frase);
	}

}
