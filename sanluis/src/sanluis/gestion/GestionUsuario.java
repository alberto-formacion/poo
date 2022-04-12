package sanluis.gestion;

import java.time.LocalDateTime;
import java.util.ArrayList;

import sanluis.vo.Materia;
import sanluis.vo.Usuario;
import sanluis.vo.UsuarioMateria;
import sanluis.vo.enums.TipoUsuario;

public class GestionUsuario {
	
	ArrayList<Usuario> usuarios;
	ArrayList<UsuarioMateria> notas;
	
	public GestionUsuario() {
		usuarios = new ArrayList<Usuario>();
		
		usuarios.add(new Usuario("1", "a", "a", "1", null, "a", "2", "a", TipoUsuario.ALUMNO));
		usuarios.add(new Usuario("2", "b", "b", "2", null, "a", "2", "a", TipoUsuario.PROFESOR));
		
		notas = new ArrayList<UsuarioMateria>();
	}
	
	//login
	public Usuario login(String dni, String contrasena) {
		//buscar en el array si hay algun usuario que su dni y contraseña coincidan
		
		for(int i=0;i<usuarios.size();i++) {
			Usuario usuario = usuarios.get(i);

			if(usuario.getDni().equalsIgnoreCase(dni) && 
					usuario.getContrasena().equals(contrasena)) {
				return usuario;
			}
		}
		
		return null;
	}
	
	public Usuario obtenerUsuario(String dni) {
		//retornar un usuario si el dni coincide con el recibido por parametro
		for(int i=0;i<usuarios.size();i++) {
			Usuario usuario = usuarios.get(i);

			if(usuario.getDni().equalsIgnoreCase(dni)) {
				return usuario;
			}
		}
		
		return null;
	}
	
	//tipo usuario profesor
	public void anadirUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void anadirNota(Usuario alumno, Usuario profesor, Materia materia, double nota) {
		UsuarioMateria notaNueva = new UsuarioMateria(alumno, profesor, materia, LocalDateTime.now(), nota);
		notas.add(notaNueva);
	}
	
	//tipo usuario alumno
	public void consultarNotas(Usuario alumno) {
		System.out.println(alumno.getApellidos() + ", " + alumno.getNombre() + ":");
		for(int i=0; i<notas.size();i++) {
			UsuarioMateria nota = notas.get(i);
			
			if(nota.getAlumno().getDni().equalsIgnoreCase(alumno.getDni())) {
				System.out.println(nota.getMateria().getCodigo() + " - " + nota.getMateria().getNombre() + ": " + nota.getNota());
			}
		}

	}

	public void enviarPropuestaRevision(Usuario alumno, Materia materia) {
		//saca por consola un texto en el que sale que el usuario solicita una revsion de la materia y la nota que ha obtenido
		for(int i=0;i<notas.size();i++) {
			UsuarioMateria nota = notas.get(i);
			
			if(nota.getAlumno().getDni().equalsIgnoreCase(alumno.getDni()) && nota.getMateria().getCodigo().equals(materia.getCodigo())) {
				System.out.println("El alumno " + alumno.getNombre() + " " + alumno.getApellidos() + " solicita revision para la materia " + materia.getNombre() + " con la nota " + nota.getNota());
			}
		}
		
		//PARA NOTA: enviar un email (buscar el uso de la libreria javamail)
		
	}
	
	public void calcularRepetir() {
		//repite si:
			//ha suspendido mas de 3 asignaturas
			//la suma de las horas lectivas suspendidas es > 100
			//mostrar las asignaturas que ha suspendido
		//no repite en caso contrario
	}

}
