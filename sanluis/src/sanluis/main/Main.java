package sanluis.main;

import java.util.ArrayList;
import java.util.Scanner;

import sanluis.gestion.GestionMateria;
import sanluis.gestion.GestionUsuario;
import sanluis.vo.Materia;
import sanluis.vo.Usuario;
import sanluis.vo.enums.TipoUsuario;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		GestionUsuario gestionUsuario = new GestionUsuario();
		GestionMateria gestionMateria = new GestionMateria();
		
		System.out.println("Bienvenido, haz login para iniciar");
		System.out.println("DNI:");
		String dni = teclado.next();
		System.out.println("Contraseña");
		String contrasena = teclado.next();
		
		Usuario usuarioLogin = gestionUsuario.login(dni, contrasena);
		
		if(usuarioLogin!=null) {
			String respuesta = "";
			do {
				System.out.println("Bienbenido " + usuarioLogin.getNombre() + " " + usuarioLogin.getApellidos());
				int opcion;
				if(usuarioLogin.getTipoUsuario() == TipoUsuario.ALUMNO) {
					opcion = menuAlumno(teclado);
					
					switch(opcion) {
					case 1:
						gestionUsuario.consultarNotas(usuarioLogin);
						break;
					case 2:
						System.out.println("¿En que materia quieres una revision?");
						ArrayList<Materia> materias = gestionMateria.obtenerMaterias();
						
						for(Materia m : materias) {
							System.out.println(m.getCodigo() + ".-" + m.getNombre());
						}
						String codigo = teclado.next();
						
						Materia materia = gestionMateria.obtenerMateria(codigo);
						
						gestionUsuario.enviarPropuestaRevision(usuarioLogin, materia);
					}
					
				}else {
					opcion = menuProfesor(teclado);
					
					switch(opcion) {
					case 1:
						//solicitar los datos del usuario y ponerlos en el usuario
						Usuario usuario = null;
						gestionUsuario.anadirUsuario(usuario);
						break;
					case 2:
						System.out.println("Introduce el dni del alumno");
						String dniAlumno = teclado.next();
						
						System.out.println("Introduce el codigo de la materia");
						String codMat = teclado.next();
						
						System.out.println("Introduce la nota");
						double nota = teclado.nextDouble();
						
						Usuario alumno = gestionUsuario.obtenerUsuario(dniAlumno);
						Materia materia = gestionMateria.obtenerMateria(codMat);
						
						gestionUsuario.anadirNota(alumno, usuarioLogin, materia, nota);
						break;
					case 3:
						//solicitar los datos de la materia y ponerlos en materia
						Materia materiaNueva = null;
						gestionMateria.anadirMateria(materiaNueva);
						break;
					}
				}
				
				System.out.println("¿Quieres realizar alguna otra cosa? (S/N)");
				respuesta = teclado.next();
			
			}while("s".equalsIgnoreCase(respuesta));			

			
		}else {
			System.out.println("Usuario no encontrado");
		}
		
		teclado.close();
	}

	private static int menuProfesor(Scanner teclado) {
		System.out.println("Que quieres hacer:");
		System.out.println("1.-Dar de alta un nuevo usuario");
		System.out.println("2.-Añadir una nueva nota");
		System.out.println("3.-Dar de alta una materia");
		return teclado.nextInt();
	}

	private static int menuAlumno(Scanner teclado) {
		System.out.println("Que quieres hacer:");
		System.out.println("1.-Consultar notas");
		System.out.println("2.-Enviar propuesta de revisión");
		return teclado.nextInt();
	}

}
