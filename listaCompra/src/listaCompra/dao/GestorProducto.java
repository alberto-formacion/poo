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
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = gestorConexion.crearConexion();
			st = con.createStatement();
			rs = st.executeQuery("Select * from productos");
			
			while(rs.next()) {
				int codigo = rs.getInt("codigo");
				String nombre = rs.getString("nombre");
				Producto p = new Producto(codigo, nombre);
				productos.add(p);
				
				//productos.add(new Producto(rs.getInt("codigo"), rs.getString("nombre")));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			gestorConexion.cerrarConexion(con, st, rs);
		}
		
		return productos;
	}
	
	public void insertarProducto(Producto p) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = gestorConexion.crearConexion();
			st = con.createStatement();
			st.execute("INSERT INTO productos (nombre) VALUES ('"+p.getNombre()+"')");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			gestorConexion.cerrarConexion(con, st, null);
		}
	}
	
	public void modificarProducto(Producto p) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = gestorConexion.crearConexion();
			st = con.createStatement();
			st.execute("UPDATE productos SET nombre = '"+p.getNombre()+"' WHERE codigo =" + p.getCodigo());
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			gestorConexion.cerrarConexion(con, st, null);
		}
	}
	
	public void eliminarProducto(int codigo) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = gestorConexion.crearConexion();
			st = con.createStatement();
			st.execute("DELETE FROM productos WHERE codigo =" + codigo);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			gestorConexion.cerrarConexion(con, st, null);
		}
	}
	
	public void insertarModificarProducto(Producto p) {
		if(p.getCodigo()!=0) {
			modificarProducto(p);
		}else {
			insertarProducto(p);
		}
	}
	
	public Producto obtenerProductoPorCodigo(int codigo) {
		//"SELECT * FROM productos WHERE codigo =" + codigo
		Producto p = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = gestorConexion.crearConexion();
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM productos WHERE codigo =" + codigo);
			
			while(rs.next()) {
				int cod = rs.getInt("codigo");
				String nombre = rs.getString("nombre");
				
				p = new Producto(cod, nombre);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			gestorConexion.cerrarConexion(con, st, rs);
		}
		
		return p;
	}

}
