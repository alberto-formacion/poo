package listaCompra.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import listaCompra.model.Producto;

public class GestorProducto {
	
	GestorConexion gestorConexion;
	
	public GestorProducto() {
		gestorConexion = new GestorConexion();
	}
	
	public ArrayList<Producto> obtenerProductos(){
		ArrayList<Producto> productos = new ArrayList<Producto>();
		try {
			Connection con = gestorConexion.crearConexion();
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select * from productos");
			
			while(rs.next()) {
				int codigo = rs.getInt("codigo");
				String nombre = rs.getString("nombre");
				
				Producto p = new Producto(codigo, nombre);
				
				productos.add(p);
				
				//productos.add(new Producto(rs.getInt("codigo"), rs.getString("nombre")));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productos;
	}
	
	public void insertarProducto(Producto p) {
		
	}
	
	public void modificarProducto(int codigo) {
		
	}
	
	public void eliminarProducto(int codigo) {
		
	}

	public void insertarModificarProducto(Producto p) {
		
	}

}
