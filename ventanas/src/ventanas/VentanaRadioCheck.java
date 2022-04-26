package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class VentanaRadioCheck {

	private JFrame frame;
	private final ButtonGroup equipo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRadioCheck window = new VentanaRadioCheck();
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
	public VentanaRadioCheck() {
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
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		equipo.add(rdbtnAzul);
		rdbtnAzul.setBounds(28, 26, 109, 23);
		frame.getContentPane().add(rdbtnAzul);
		
		JRadioButton rdbtnRojo = new JRadioButton("Rojo");
		equipo.add(rdbtnRojo);
		rdbtnRojo.setBounds(28, 62, 109, 23);
		frame.getContentPane().add(rdbtnRojo);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(107, 202, 187, 14);
		frame.getContentPane().add(lblResultado);
		
		JButton btnProcesar = new JButton("Procesar Info");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enumeration<AbstractButton> botones = equipo.getElements();
				while(botones.hasMoreElements()) {
					AbstractButton boton = botones.nextElement();
					if(boton.isSelected()) {
						lblResultado.setText("Eres del equipo " + boton.getText());
					}
				}
			}
		});
		btnProcesar.setBounds(158, 144, 136, 23);
		frame.getContentPane().add(btnProcesar);
	}
}
