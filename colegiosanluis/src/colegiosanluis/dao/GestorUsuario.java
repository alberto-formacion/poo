package colegiosanluis.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import colegiosanluis.model.Usuario;

public class GestorUsuario {

	// private GestorConexion gestorConexion = new GestorConexion();

	private GestorConexion gestorConexion;

	public GestorUsuario() {
		gestorConexion = new GestorConexion();
	}

	public Usuario login(String user, String password) {
		// "SELECT * FROM usuarios WHERE usuario = 'user' AND password = 'password'"
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Usuario usuarioLogin = null;

		try {
			con = gestorConexion.crearConexion();
			st = con.createStatement();
			rs = st.executeQuery(
					"SELECT * FROM usuarios WHERE usuario = '" + user + "' AND password = '" + password + "'");

			if (rs.next()) { // tambien vale el while
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apellidos");
				String email = rs.getString("email");
				String telefono = rs.getString("telefono");
				String dni = rs.getString("dni");
				String usu = rs.getString("usuario");
				String pass = rs.getString("password");

				usuarioLogin = new Usuario(id, nombre, apellidos, email, telefono, dni, usu, pass);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			gestorConexion.cerrarConexion(con, st, rs);
		}

		return usuarioLogin;
	}

	public void insertarUsuario(Usuario usuario) throws SQLException {
		Connection con = null;
		Statement st = null;

		con = gestorConexion.crearConexion();
		st = con.createStatement();
		st.execute("INSERT INTO usuarios (nombre, apellidos, email, telefono, dni, usuario, password) VALUES ('"
				+ usuario.getNombre() + "','" + usuario.getApellidos() + "', '" + usuario.getEmail() + "', '"
				+ usuario.getTelefono() + "', '" + usuario.getDni() + "', '" + usuario.getUsuario() + "', '"
				+ usuario.getPassword() + "' )");

		gestorConexion.cerrarConexion(con, st, null);

	}

}
