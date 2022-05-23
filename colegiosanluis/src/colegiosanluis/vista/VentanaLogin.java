package colegiosanluis.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import colegiosanluis.dao.GestorUsuario;
import colegiosanluis.model.Usuario;

public class VentanaLogin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField textUsuario;
	private JTextField textPaasword;
	private GestorUsuario gestorUsuario;

	/**
	 * Create the application.
	 */
	public VentanaLogin() {
		gestorUsuario = new GestorUsuario();
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(86, 86, 90, 14);
		this.getContentPane().add(lblUsuario);
		
		JLabel lblPasword = new JLabel("Contrase\u00F1a");
		lblPasword.setBounds(86, 135, 90, 14);
		this.getContentPane().add(lblPasword);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(186, 83, 96, 20);
		this.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		textPaasword = new JTextField();
		textPaasword.setBounds(186, 132, 96, 20);
		this.getContentPane().add(textPaasword);
		textPaasword.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u = gestorUsuario.login(textUsuario.getText(), textPaasword.getText());
				
				if(u!=null) {
					VentanaInicio ventanaInicio = new VentanaInicio(u);
					setVisible(false);
					ventanaInicio.setVisible(true);
				}
			}
		});
		
		btnEntrar.setBounds(141, 176, 89, 23);
		this.getContentPane().add(btnEntrar);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaRegistro registro = new VentanaRegistro();
				setVisible(false);
				registro.setVisible(true);
			}
		});
		
		btnRegistrarse.setBounds(337, 11, 89, 23);
		this.getContentPane().add(btnRegistrarse);
	}

}
