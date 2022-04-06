package sanluis.vo;

public class Materia {
	
	private String codigo;
	private String nombre;
	private int horasLectivas;
	
	public Materia(String codigo, String nombre, int horasLectivas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasLectivas = horasLectivas;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHorasLectivas() {
		return horasLectivas;
	}
	public void setHorasLectivas(int horasLectivas) {
		this.horasLectivas = horasLectivas;
	}

}
