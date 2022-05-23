package colegiosanluis.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import colegiosanluis.model.Usuario;

public class VentanaInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Usuario usuarioLogueado;

	public VentanaInicio(Usuario usuario) {
		this.usuarioLogueado = usuario;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("");
		lblUsuario.setBounds(10, 11, 157, 14);
		contentPane.add(lblUsuario);
		
		lblUsuario.setText("Hola, " + usuarioLogueado.getNombre() + " " + usuarioLogueado.getApellidos());
	}

}
