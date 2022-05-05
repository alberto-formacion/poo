package colegio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class VentanaLogin {

	private JFrame frame;
	private JTextField textUsuario;
	private JTextField textPass;
	private JLabel lblNoLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
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
	public VentanaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
		Asignatura java = new Asignatura(1, "Java", 100);
		Asignatura php = new Asignatura(2, "PHP", 80);
		Asignatura redes = new Asignatura(3, "Redes LAN", 80);
		
		asignaturas.add(java);
		asignaturas.add(php);
		asignaturas.add(redes);
		
		Usuario usuario = new Usuario("Alberto", "Garcia de Cortazar", 
				"666666666", "a@a.com", "alberto", "1234", asignaturas);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(114, 97, 69, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(114, 139, 69, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(203, 94, 96, 20);
		frame.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		textPass = new JTextField();
		textPass.setBounds(203, 136, 96, 20);
		frame.getContentPane().add(textPass);
		textPass.setColumns(10);
		
		lblNoLogin = new JLabel("Usuario o contraseña incorrecto");
		lblNoLogin.setForeground(Color.RED);
		lblNoLogin.setBounds(88, 61, 200, 14);
		lblNoLogin.setVisible(false);
		frame.getContentPane().add(lblNoLogin);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usu = textUsuario.getText();
				String pass = textPass.getText();
				
				if(usu.equals(usuario.getLogin()) && pass.equals(usuario.getPass())) {
					VentanaInicio inicio = new VentanaInicio(usuario);
					
					inicio.setVisible(true);
					frame.setVisible(false);
				}else {
					lblNoLogin.setVisible(true);
				}
				

			}
		});
		btnLogin.setBounds(162, 185, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
