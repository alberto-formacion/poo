package sanluis.vo;

import java.time.LocalDateTime;

public class UsuarioMateria {
	
	private Usuario alumno;
	private Usuario profesor;
	private Materia materia;
	private LocalDateTime fechaHoraEvaluacion;
	private double nota;
	
	public UsuarioMateria(Usuario alumno, Usuario profesor, Materia materia, LocalDateTime fechaHoraEvaluacion, double nota) {
		super();
		this.alumno = alumno;
		this.profesor = profesor;
		this.materia = materia;
		this.fechaHoraEvaluacion = fechaHoraEvaluacion;
		this.nota = nota;
	}
	
	public Usuario getAlumno() {
		return alumno;
	}
	public void setAlumno(Usuario alumno) {
		this.alumno = alumno;
	}
	public Usuario getProfesor() {
		return profesor;
	}
	public void setProfesor(Usuario profesor) {
		this.profesor = profesor;
	}
	public LocalDateTime getFechaHoraEvaluacion() {
		return fechaHoraEvaluacion;
	}
	public void setFechaHoraEvaluacion(LocalDateTime fechaHoraEvaluacion) {
		this.fechaHoraEvaluacion = fechaHoraEvaluacion;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
