package sanluis.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		
		String salir = "";

		do {
			System.out.println("Bienvenido, haz login para iniciar");
			System.out.println("DNI:");
			String dni = teclado.next();
			System.out.println("Contraseña");
			String contrasena = teclado.next();

			Usuario usuarioLogin = gestionUsuario.login(dni, contrasena);

			if (usuarioLogin != null) {
				String respuesta = "";
				do {
					System.out.println("Bienvenido " + usuarioLogin.getNombre() + " " + usuarioLogin.getApellidos());
					int opcion;
					if (usuarioLogin.getTipoUsuario() == TipoUsuario.ALUMNO) {
						opcion = menuAlumno(teclado);

						switch (opcion) {
						case 1:
							gestionUsuario.consultarNotas(usuarioLogin);
							break;
						case 2:
							System.out.println("En que materia quieres una revision?");
							ArrayList<Materia> materias = gestionMateria.obtenerMaterias();

							for (Materia m : materias) {
								System.out.println(m.getCodigo() + ".-" + m.getNombre());
							}
							
							String codigo = teclado.next();

							Materia materia = gestionMateria.obtenerMateria(codigo);

							gestionUsuario.enviarPropuestaRevision(usuarioLogin, materia);
						}

					} else {
						opcion = menuProfesor(teclado);

						switch (opcion) {
						case 1:
							// solicitar los datos del usuario y ponerlos en el usuario
							System.out.println("Introduce DNI:");
							String dniAlta = teclado.next();
							System.out.println("Introduce el nombre:");
							String nombreAlta = teclado.next();
							System.out.println("Introduce contraseña:");
							String contrasenaAlta = teclado.next();
							System.out.println("Introduce una fecha de nacimiento: (dd/MM/yyyy))");
							String fechaNacimiento = teclado.next();
							DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

							System.out.println("Introduce email:");
							String emailAlta = teclado.next();
							System.out.println("Introduce telefono:");
							String telefonoAlta = teclado.next();
							System.out.println("Introduce direccion:");
							String direccionAlta = teclado.next();
							System.out.println("Introduce el tipo usuario:");
							for (int i = 0; i < TipoUsuario.values().length; i++) {
								System.out.println((i + 1) + ".-" + TipoUsuario.values()[i]);
							}
							int tipoUsuarioAlta = teclado.nextInt();

							TipoUsuario tu;

							if (tipoUsuarioAlta == 1) {
								tu = TipoUsuario.ALUMNO;
							} else {
								tu = TipoUsuario.PROFESOR;
							}

							Usuario usuario = new Usuario(dniAlta, nombreAlta, fechaNacimiento, contrasenaAlta,
									LocalDate.parse(fechaNacimiento, format), emailAlta, telefonoAlta, direccionAlta,
									tu);
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
							System.out.println("Introduce un codigo:");
							String codMateria = teclado.next();
							System.out.println("Introduce un nombre:");
							String nombreMateria = teclado.next();
							System.out.println("Introduce las horas lectivas:");
							int horasLectivas = teclado.nextInt();
							
							Materia materiaNueva = new Materia(codMateria, nombreMateria, horasLectivas);
							
							gestionMateria.anadirMateria(materiaNueva);
							break;
						}
					}

					System.out.println("Â¿Quieres realizar alguna otra cosa? (S/N)");
					respuesta = teclado.next();

				} while ("s".equalsIgnoreCase(respuesta));

			} else {
				System.out.println("Usuario no encontrado");
			}
			
			System.out.println("¿Quieres salir del sistema? (S/N)");
			salir = teclado.next();

		} while ("n".equalsIgnoreCase(salir));

		// teclado.close();
	}

	private static int menuProfesor(Scanner teclado) {
		System.out.println("Que quieres hacer:");
		System.out.println("1.-Dar de alta un nuevo usuario");
		System.out.println("2.-AÃ±adir una nueva nota");
		System.out.println("3.-Dar de alta una materia");
		return teclado.nextInt();
	}

	private static int menuAlumno(Scanner teclado) {
		System.out.println("Que quieres hacer:");
		System.out.println("1.-Consultar notas");
		System.out.println("2.-Enviar propuesta de revisiÃ³n");
		return teclado.nextInt();
	}

}
