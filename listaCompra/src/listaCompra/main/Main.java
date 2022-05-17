package listaCompra.main;

import java.util.ArrayList;

import listaCompra.dao.GestorProducto;
import listaCompra.model.Producto;

public class Main {

	public static void main(String[] args) {
		GestorProducto gestorProducto = new GestorProducto();
		
		/*Producto p = new Producto(0, "Zanahorias");
		gestorProducto.insertarProducto(p);
		
		Producto p2 = new Producto(0, "Pepinos");
		gestorProducto.insertarProducto(p2);
		
		Producto p3 = new Producto(0, "Pistachos");
		gestorProducto.insertarProducto(p3);
		
		Producto p4 = new Producto(0, "Yogures");
		gestorProducto.insertarProducto(p4);*/
		
		/*Producto p = new Producto(4, "Tomates");
		gestorProducto.modificarProducto(p);*/
		
		gestorProducto.eliminarProducto(4);
		
		ArrayList<Producto> productos = gestorProducto.obtenerProductos();
		
		for(int i=0;i<productos.size();i++) {
			System.out.println(productos.get(i).getNombre());
		}

	}

}
