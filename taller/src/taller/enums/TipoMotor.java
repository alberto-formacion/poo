package taller.enums;

public enum TipoMotor {
	
	GASOLINA("Gasolina"),DIESEL("Diesel");
	
	private String nombre;
	
	private TipoMotor(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
