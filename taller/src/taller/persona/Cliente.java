package taller.persona;

import java.time.LocalDate;

public class Cliente extends Persona{
	
	private String numCliente;

	public Cliente(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String numCliente) {
		super(dni, nombre, apellidos, fechaNacimiento);
		this.numCliente = numCliente;
	}

	public String getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}

	@Override
	public String toString() {
		return "Cliente [numCliente=" + numCliente + ", Dni=" + getDni() + ", Nombre=" + getNombre()
				+ ", Apellidos=" + getApellidos() + ", FechaNacimiento=" + getFechaNacimiento() + "]";
	}
	
}
