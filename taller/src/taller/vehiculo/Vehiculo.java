package taller.vehiculo;

import taller.enums.TipoMotor;

public abstract class Vehiculo {
	
	private String matricula, color, numBastidor;
	private TipoMotor tipoMotor;
	private int caballos;
	
	public Vehiculo(String matricula, String color, String numBastidor, TipoMotor tipoMotor, int caballos) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.numBastidor = numBastidor;
		this.tipoMotor = tipoMotor;
		this.caballos = caballos;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
}
