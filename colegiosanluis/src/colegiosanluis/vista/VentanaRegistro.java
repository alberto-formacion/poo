package colegiosanluis.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import colegiosanluis.dao.GestorUsuario;
import colegiosanluis.model.Usuario;

public class VentanaRegistro extends JFrame {
	
	private GestorUsuario gestorUsuario;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textEmail;
	private JTextField textTelefono;
	private JTextField textDNI;
	private JTextField textUsuario;
	private JTextField textContrasena;

	public VentanaRegistro() {
		gestorUsuario = new GestorUsuario();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(10, 102, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setBounds(10, 146, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DNI");
		lblNewLabel_4.setBounds(10, 188, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Usuario");
		lblNewLabel_5.setBounds(211, 60, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contrase\u00F1a");
		lblNewLabel_6.setBounds(211, 102, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textNombre = new JTextField();
		textNombre.setBounds(84, 20, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(84, 57, 86, 20);
		contentPane.add(textApellidos);
		textApellidos.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(84, 99, 86, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(84, 143, 86, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textDNI = new JTextField();
		textDNI.setBounds(84, 185, 86, 20);
		contentPane.add(textDNI);
		textDNI.setColumns(10);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(278, 57, 86, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textContrasena = new JTextField();
		textContrasena.setBounds(278, 99, 86, 20);
		contentPane.add(textContrasena);
		textContrasena.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin ventanaLogin = new VentanaLogin();
				setVisible(false);
				ventanaLogin.setVisible(true);
			}
		});
		
		btnVolver.setBounds(310, 184, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblError = new JLabel("Usuario incorrecto");
		lblError.setForeground(Color.RED);
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setBounds(211, 146, 188, 14);
		lblError.setVisible(false);
		contentPane.add(lblError);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombre.getText();
				String apellidos = textApellidos.getText();
				String telefono = textTelefono.getText();
				String email = textEmail.getText();
				String dni = textDNI.getText();
				String usuario = textUsuario.getText();
				String password = textContrasena.getText();
				
				if("".equals(nombre)) {
					lblError.setVisible(true);
					textNombre.requestFocus();
				}else if("".equals(apellidos)) {
					lblError.setVisible(true);
					textApellidos.requestFocus();
				}else if("".equals(telefono)) {
					lblError.setVisible(true);
					textTelefono.requestFocus();
				}else if("".equals(email)) {
					lblError.setVisible(true);
					textEmail.requestFocus();
				}else if("".equals(dni)) {
					lblError.setVisible(true);
					textDNI.requestFocus();
				}else if("".equals(usuario)) {
					lblError.setVisible(true);
					textUsuario.requestFocus();
				}else if("".equals(password)) {
					lblError.setVisible(true);
					textContrasena.requestFocus();
				}else {
					Usuario u = new Usuario(0, nombre, apellidos, email, telefono, dni, usuario, password);
					try {
						gestorUsuario.insertarUsuario(u);
						
						VentanaLogin ventanaLogin = new VentanaLogin();
						
						setVisible(false);
						ventanaLogin.setVisible(true);
					}catch(SQLException ex) {
						lblError.setText("Usuario duplicado");
						lblError.setVisible(true);
					}
				}
				

			}
		});
		btnGuardar.setBounds(211, 184, 89, 23);
		contentPane.add(btnGuardar);
	}
}
