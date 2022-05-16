package listaCompra.main;

import java.util.ArrayList;

import listaCompra.dao.GestorProducto;
import listaCompra.model.Producto;

public class Main {

	public static void main(String[] args) {
		GestorProducto gestorProducto = new GestorProducto();
		
		ArrayList<Producto> productos = gestorProducto.obtenerProductos();
		
		for(int i=0;i<productos.size();i++) {
			System.out.println(productos.get(i).getNombre());
		}

	}

}
