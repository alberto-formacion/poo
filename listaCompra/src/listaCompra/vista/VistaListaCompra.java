package listaCompra.vista;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

import listaCompra.dao.GestorProducto;
import listaCompra.model.Producto;

public class VistaListaCompra {

	private JFrame frame;
	private JTextField textProducto;
	private GestorProducto gestorProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaListaCompra window = new VistaListaCompra();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaListaCompra() {
		gestorProducto = new GestorProducto();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList<String> listProductos = new JList<String>();
		listProductos.setBounds(27, 27, 131, 203);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		ArrayList<Producto> productos = gestorProducto.obtenerProductos();
		
		for(int i=0;i<productos.size();i++) {
			model.addElement(productos.get(i).getNombre());
		}
		
		listProductos.setModel(model);
		
		frame.getContentPane().add(listProductos);
		
		textProducto = new JTextField();
		textProducto.setBounds(210, 25, 96, 20);
		frame.getContentPane().add(textProducto);
		textProducto.setColumns(10);
		
		JButton btnAnadirProducto = new JButton("A\u00F1adir");
		btnAnadirProducto.setBounds(316, 24, 89, 23);
		frame.getContentPane().add(btnAnadirProducto);
	}
}
