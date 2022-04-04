package taller.vehiculo;

import taller.enums.TipoMotor;

public class Coche extends Vehiculo{
	
	private int potencia;

	public Coche(String matricula, String color, String numBastidor, TipoMotor tipoMotor, int caballos, int potencia) {
		super(matricula, color, numBastidor, tipoMotor, caballos);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
