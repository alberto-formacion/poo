package colegio;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JTable;

public class VentanaInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public VentanaInicio(Usuario usuario) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(usuario.getNombre() + " " 
				+ usuario.getApellidos());
		lblNewLabel.setBounds(10, 11, 178, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(usuario.getEmail());
		lblNewLabel_1.setBounds(10, 50, 178, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(usuario.getTelefono());
		lblNewLabel_2.setBounds(10, 89, 178, 14);
		contentPane.add(lblNewLabel_2);
		
		JList<String> list = new JList<String>();
		list.setBounds(280, 10, 144, 93);
		
		DefaultListModel<String> modelAsignaturas = new DefaultListModel<String>();
		
		for(int i=0;i<usuario.getAsignaturas().size();i++) {
			modelAsignaturas.addElement(usuario.getAsignaturas().get(i).getNombreAsignatura());		
		}
		
		list.setModel(modelAsignaturas);
		contentPane.add(list);
		

		Object[] cabecera = {"Código", "Nombre", "Horas", "Eval1", "Eval2", "Eval3", "Nota Final"};
		
		DefaultTableModel modeloTabla = new DefaultTableModel(cabecera, 0);
		
		for(int i=0;i<usuario.getAsignaturas().size();i++) {
			Asignatura a = usuario.getAsignaturas().get(i);
			modeloTabla.addRow(new Object[] {a.getCodAsignatura(), a.getNombreAsignatura(), a.getHorasLectivas(), "", "", "", ""});
		}
		
		table = new JTable(modeloTabla);
		table.setBounds(10, 114, 414, 136);
		
		this.repaint();
		
		contentPane.add(table);
		
	}
}
