package habladores.aparato;

public class Aparato {
	
	private int consumo;
	private double precio;
	
	public Aparato(int consumo, double precio) {
		super();
		this.consumo = consumo;
		this.precio = precio;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
