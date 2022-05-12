package nomina;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VentanaNomina {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textEmail;
	private JTextField textSueldoBase;
	private final ButtonGroup buttonGroupTurno = new ButtonGroup();
	private final ButtonGroup buttonGroupJornada = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNomina window = new VentanaNomina();
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
	public VentanaNomina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 450, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(25, 35, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(25, 70, 79, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(25, 105, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sueldo Base");
		lblNewLabel_3.setBounds(25, 140, 79, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textNombre = new JTextField();
		textNombre.setBounds(110, 32, 96, 20);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(110, 67, 96, 20);
		frame.getContentPane().add(textApellidos);
		textApellidos.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(110, 102, 96, 20);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textSueldoBase = new JTextField();
		textSueldoBase.setBounds(110, 137, 96, 20);
		frame.getContentPane().add(textSueldoBase);
		textSueldoBase.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Hijos");
		lblNewLabel_4.setBounds(25, 175, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox<String> comboBoxHijos = new JComboBox<String>();
		comboBoxHijos.setModel(new DefaultComboBoxModel<String>(new String[] {"0", "1", "2", "3", "4"}));
		comboBoxHijos.setBounds(110, 171, 96, 22);
		frame.getContentPane().add(comboBoxHijos);
		
		JLabel lblNewLabel_5 = new JLabel("Turno");
		lblNewLabel_5.setBounds(25, 210, 49, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rdbtnDiurno = new JRadioButton("Diurno");
		buttonGroupTurno.add(rdbtnDiurno);
		rdbtnDiurno.setBounds(35, 231, 111, 23);
		frame.getContentPane().add(rdbtnDiurno);
		
		JRadioButton rdbtnNocturno = new JRadioButton("Nocturno");
		buttonGroupTurno.add(rdbtnNocturno);
		rdbtnNocturno.setBounds(167, 231, 111, 23);
		frame.getContentPane().add(rdbtnNocturno);
		
		JLabel lblNewLabel_6 = new JLabel("Extras");
		lblNewLabel_6.setBounds(25, 275, 49, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JCheckBox chckbxPeligrosidad = new JCheckBox("Peligrosidad");
		chckbxPeligrosidad.setBounds(25, 302, 99, 23);
		frame.getContentPane().add(chckbxPeligrosidad);
		
		JCheckBox chckbxDesplazamiento = new JCheckBox("Desplazamiento");
		chckbxDesplazamiento.setBounds(25, 339, 133, 23);
		frame.getContentPane().add(chckbxDesplazamiento);
		
		JLabel lblNewLabel_7 = new JLabel("Jornada");
		lblNewLabel_7.setBounds(25, 395, 49, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JRadioButton rdbtnCompleta = new JRadioButton("Completa");
		buttonGroupJornada.add(rdbtnCompleta);
		rdbtnCompleta.setBounds(35, 416, 111, 23);
		frame.getContentPane().add(rdbtnCompleta);
		
		JRadioButton rdbtnReducida = new JRadioButton("Reducida");
		buttonGroupJornada.add(rdbtnReducida);
		rdbtnReducida.setBounds(153, 416, 111, 23);
		frame.getContentPane().add(rdbtnReducida);
		
		JRadioButton rdbtnMedia = new JRadioButton("Media");
		buttonGroupJornada.add(rdbtnMedia);
		rdbtnMedia.setBounds(265, 416, 111, 23);
		frame.getContentPane().add(rdbtnMedia);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(35, 531, 341, 14);
		frame.getContentPane().add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double sueldoFinal = 0.0;
				try {
					comprobarEmail();
					sueldoFinal = Double.parseDouble(textSueldoBase.getText());
				
					int numHijos = Integer.parseInt(comboBoxHijos.getSelectedItem().toString());
					
					sueldoFinal = sueldoFinal + (numHijos * 50);
					
					Enumeration<AbstractButton> turnos = buttonGroupTurno.getElements();
	
					comprobarTurnos(turnos, sueldoFinal);
					
					if(chckbxPeligrosidad.isSelected()) {
						sueldoFinal = sueldoFinal + 100;
					}
					
					if(chckbxDesplazamiento.isSelected()) {
						sueldoFinal = sueldoFinal + 50;
					}
					
					Enumeration<AbstractButton> jornadas = buttonGroupJornada.getElements();
					
					comprobarJornada(jornadas, sueldoFinal);
					
					lblResultado.setText("El trabajador" + textNombre.getText() + " " + textApellidos.getText() + " cobra " + sueldoFinal);
				}catch (NumberFormatException | NominaException ex) {
					JOptionPane.showMessageDialog(frame, ex.getMessage());
				}
			}
		});
		btnCalcular.setBounds(165, 477, 89, 23);
		frame.getContentPane().add(btnCalcular);
	}
	
	public void comprobarTurnos(Enumeration<AbstractButton> turnos, Double sueldoFinal) throws NominaException {
		boolean turnoSelecionado = false;
		while(turnos.hasMoreElements()) {
			AbstractButton turno = turnos.nextElement();
			
			if(turno.isSelected() && turno.getText().equals("Nocturno")) {
				sueldoFinal = sueldoFinal + 200;
				turnoSelecionado = true;
			}else if(turno.isSelected() && turno.getText().equals("Diurno")) {
				turnoSelecionado = true;
			}
		}
		
		if(!turnoSelecionado) {
			throw new NominaException("Tienes que selecionar un turno");
		}
	}
	
	private void comprobarEmail() throws NominaException{
		Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		String email = textEmail.getText();
		
		Matcher mather = pattern.matcher(email);
		
		if(!mather.find()) {
			throw new NominaException("Email incorrecto");
		}
	}
	
	private void comprobarJornada(Enumeration<AbstractButton> jornadas, Double sueldoFinal) {
		boolean jornadaSeleccionada = false;
		while(jornadas.hasMoreElements()) {
			AbstractButton jornada = jornadas.nextElement();
			
			if(jornada.isSelected()) {
				switch(jornada.getText()) {
				case "Reducida":
					sueldoFinal = sueldoFinal * 0.75;
					jornadaSeleccionada = true;
					break;
				case "Media":
					sueldoFinal = sueldoFinal * 0.5;
					jornadaSeleccionada = true;
					break;
				case "Completa":
					jornadaSeleccionada = true;
					break;
				}
			}
		}
		
		if(!jornadaSeleccionada) {
			throw new NominaException("Tienes que seleccionar una Jornada");
		}
	}
}
