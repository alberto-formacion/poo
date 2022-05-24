package colegiosanluis.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import colegiosanluis.model.Asignatura;
import colegiosanluis.model.Usuario;
import colegiosanluis.model.UsuarioAsignatura;

public class GestorAsignatura {

	private GestorConexion gestorConexion;

	public GestorAsignatura() {
		gestorConexion = new GestorConexion();
	}

	public ArrayList<UsuarioAsignatura> obtenerAsignaturasPorUsuario(Usuario usuario) {
		ArrayList<UsuarioAsignatura> resultado = new ArrayList<UsuarioAsignatura>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = gestorConexion.crearConexion();
			st = con.createStatement();
			rs = st.executeQuery(
					"SELECT a.id, a.nombre, a.horas, ua.nota FROM usuarios u, usuarios_asignaturas ua, asignaturas a WHERE u.id = ua.usuarios_id AND ua.asignaturas_id = a.id AND u.id = "
							+ usuario.getId());

			while (rs.next()) {
				int idAsig = rs.getInt("id");
				String nombreAsig = rs.getString("nombre");
				int horas = rs.getInt("horas");
				Asignatura asignatura = new Asignatura(idAsig, nombreAsig, horas);

				Double nota = rs.getDouble("nota");

				UsuarioAsignatura ua = new UsuarioAsignatura(usuario, asignatura, nota);
				
				resultado.add(ua);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			gestorConexion.cerrarConexion(con, st, rs);
		}
		
		return resultado;
	}

}
