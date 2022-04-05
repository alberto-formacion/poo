package taller.persona;

import java.time.LocalDate;

import taller.vehiculo.Vehiculo;

public class Cliente extends Persona{
	
	private String numCliente;
	private Vehiculo vehiculo;

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

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Cliente [numCliente=" + numCliente + ", Dni=" + getDni() + ", Nombre=" + getNombre()
				+ ", Apellidos=" + getApellidos() + ", FechaNacimiento=" + getFechaNacimiento() + "]";
	}
	
}
