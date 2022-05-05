package colegio;

public class Asignatura {
	private int codAsignatura;
	private String nombreAsignatura;
	private int horasLectivas;
	
	public Asignatura(int codAsignatura, String nombreAsignatura, int horasLectivas) {
		super();
		this.codAsignatura = codAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.horasLectivas = horasLectivas;
	}
	
	public int getCodAsignatura() {
		return codAsignatura;
	}
	public void setCodAsignatura(int codAsignatura) {
		this.codAsignatura = codAsignatura;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public int getHorasLectivas() {
		return horasLectivas;
	}
	public void setHorasLectivas(int horasLectivas) {
		this.horasLectivas = horasLectivas;
	}
}
