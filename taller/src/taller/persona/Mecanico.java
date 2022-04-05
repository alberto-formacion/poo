package taller.persona;

import java.time.LocalDate;

import taller.vehiculo.Vehiculo;

public class Mecanico extends Persona{
	
	private String nss;
	private Vehiculo reparandoVehiculo;
	
	private double sueldoAnualBruto;
	public Mecanico(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String nss,
			double sueldoAnualBruto) {
		super(dni, nombre, apellidos, fechaNacimiento);
		this.nss = nss;
		this.sueldoAnualBruto = sueldoAnualBruto;
	}
	
	public String getNss() {
		return nss;
	}
	public void setNss(String nss) {
		this.nss = nss;
	}
	public double getSueldoAnualBruto() {
		return sueldoAnualBruto;
	}
	public void setSueldoAnualBruto(double sueldoAnualBruto) {
		this.sueldoAnualBruto = sueldoAnualBruto;
	}

	public Vehiculo getReparandoVehiculo() {
		return reparandoVehiculo;
	}

	public void setReparandoVehiculo(Vehiculo reparandoVehiculo) {
		this.reparandoVehiculo = reparandoVehiculo;
	}

}
