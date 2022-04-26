package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class VentanaLista {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLista window = new VentanaLista();
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
	public VentanaLista() {
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
		
		JList<String> listLeguajes = new JList<String>();
		listLeguajes.setBounds(37, 35, 107, 181);
		
		DefaultListModel<String> modelLenguajes = new DefaultListModel<String>();
		modelLenguajes.addElement("Java");
		modelLenguajes.addElement("C#");
		modelLenguajes.addElement(".Net");
		modelLenguajes.addElement("PHP");
		
		listLeguajes.setModel(modelLenguajes);
		
		frame.getContentPane().add(listLeguajes);
		
		JList<String> listCompetencias = new JList<String>();
		
		DefaultListModel<String> modelCompetencias = new DefaultListModel<String>();
		
		listCompetencias.setModel(modelCompetencias);

		listCompetencias.setBounds(253, 35, 107, 181);
		frame.getContentPane().add(listCompetencias);
		
		JButton btnPasarDrchUno = new JButton(">");
		btnPasarDrchUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicion = listLeguajes.getSelectedIndex();
				String lenguaje = listLeguajes.getModel().getElementAt(posicion);
				
				DefaultListModel<String> modeloC = (DefaultListModel<String>) listCompetencias.getModel();
				modeloC.addElement(lenguaje);
				
				DefaultListModel<String> modelL = (DefaultListModel<String>) listLeguajes.getModel();
				modelL.removeElement(lenguaje);
				
			}
		});
		btnPasarDrchUno.setBounds(154, 64, 89, 23);
		frame.getContentPane().add(btnPasarDrchUno);
		
		JButton btnPasarDrchTodos = new JButton(">>");
		btnPasarDrchTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> modelL = (DefaultListModel<String>) listLeguajes.getModel();
				DefaultListModel<String> modelC = (DefaultListModel<String>) listCompetencias.getModel();
				
				for(int i=0;i<modelL.getSize();i++) {
					modelC.addElement(modelL.getElementAt(i));
				}
				
				modelL.removeAllElements();
			}
		});
		btnPasarDrchTodos.setBounds(154, 98, 89, 23);
		frame.getContentPane().add(btnPasarDrchTodos);
		
		JButton btnPasarIzqUno = new JButton("<");
		btnPasarIzqUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicion = listCompetencias.getSelectedIndex();
				String lenguaje = listCompetencias.getModel().getElementAt(posicion);
				
				DefaultListModel<String> modelL = (DefaultListModel<String>) listLeguajes.getModel();
				DefaultListModel<String> modeloC = (DefaultListModel<String>) listCompetencias.getModel();
				modelL.addElement(lenguaje);
				modeloC.removeElement(lenguaje);
			}
		});
		btnPasarIzqUno.setBounds(154, 132, 89, 23);
		frame.getContentPane().add(btnPasarIzqUno);
		
		JButton btnPasarIzqTodos = new JButton("<<");
		btnPasarIzqTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> modelL = (DefaultListModel<String>) listLeguajes.getModel();
				DefaultListModel<String> modelC = (DefaultListModel<String>) listCompetencias.getModel();
				
				for(int i=0;i<modelC.getSize();i++) {
					modelL.addElement(modelC.getElementAt(i));
				}
				
				modelC.removeAllElements();
			}
		});
		btnPasarIzqTodos.setBounds(154, 166, 89, 23);
		frame.getContentPane().add(btnPasarIzqTodos);
	}
}
