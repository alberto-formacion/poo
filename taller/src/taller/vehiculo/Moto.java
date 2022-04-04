package taller.vehiculo;

import taller.enums.TipoMotor;

public class Moto extends Vehiculo{
	
	private int cilindrada;

	public Moto(String matricula, String color, String numBastidor, TipoMotor tipoMotor, int caballos, int cilindrada) {
		super(matricula, color, numBastidor, tipoMotor, caballos);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
