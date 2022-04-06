package sanluis.gestion;

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
		return null;
	}
	
	public Usuario obtenerUsuario(String dni) {
		//retornar un usuario si el dni coincide con el recibido por parametro
		return null;
	}
	
	//tipo usuario profesor
	public void anadirUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	public void anadirNota(Usuario alumno, Usuario usuarioLogin, Materia materia, double nota) {
		// TODO Auto-generated method stub
		
	}
	
	//tipo usuario alumno
	public void consultarNotas(Usuario usuarioLogin) {
		//muestra las notas del usuario
	}

	public void enviarPropuestaRevision(Usuario usuarioLogin, Materia materia) {
		//saca por consola un texto en el que sale que el usuario solicita una revsion de la materia y la nota que ha obtenido
		//PARA NOTA: enviar un email (buscar el uso de la libreria javamail)
		
	}

}
