package colegiosanluis.model;

public class UsuarioAsignatura {
	private Usuario usuario;
	private Asignatura asignatura;
	private Double nota;
	
	public UsuarioAsignatura(Usuario usuario, Asignatura asignatura, Double nota) {
		super();
		this.usuario = usuario;
		this.asignatura = asignatura;
		this.nota = nota;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}

}
