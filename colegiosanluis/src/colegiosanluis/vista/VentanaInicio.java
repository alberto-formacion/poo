package colegiosanluis.vista;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import colegiosanluis.dao.GestorAsignatura;
import colegiosanluis.model.Asignatura;
import colegiosanluis.model.Usuario;
import colegiosanluis.model.UsuarioAsignatura;

public class VentanaInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Usuario usuarioLogueado;
	private JTable table;
	private GestorAsignatura gestorAsignatura;

	public VentanaInicio(Usuario usuario) {
		gestorAsignatura = new GestorAsignatura();
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 97, 379, 155);
		contentPane.add(scrollPane);
		
		Object[] cabecera = {"Nombre", "Horas", "Nota Final"};
		
		DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 0);
		
		ArrayList<UsuarioAsignatura> usuarioAsignaturas = gestorAsignatura.obtenerAsignaturasPorUsuario(usuario);
		
		for(int i=0;i<usuarioAsignaturas.size();i++) {
			Asignatura a = usuarioAsignaturas.get(i).getAsignatura();
			Double nota = usuarioAsignaturas.get(i).getNota();
			
			modeloTabla.addRow(new Object[] {a.getNombre(), a.getHoras(), nota});
		}
		
		table = new JTable(modeloTabla);
		scrollPane.setViewportView(table);
		
		
	}
}
