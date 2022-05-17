package listaCompra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorConexion {
	
	public Connection crearConexion() {
		try {
			//Cargar el driver
			Class.forName("org.mariadb.jdbc.Driver");
			//Obtener la conexion
			String url = "jdbc:mariadb://localhost:3306/lista_compra";
			String user = "root";
			String pass = "";
			Connection con = DriverManager.getConnection(url, user, pass);
			
			return con;
		}catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}
	
	public void cerrarConexion(Connection con, Statement st, ResultSet rs){
		try {
			if(rs!=null) {
				rs.close();
			}
			
			if(st!=null) {
				st.close();
			}
			
			if(con!=null) {
				con.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
