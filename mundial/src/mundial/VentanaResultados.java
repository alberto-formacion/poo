package mundial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaResultados {

	private JFrame frame;
	private JTextField textGolesQatarJ1;
	private JTextField textGolesEcuadorJ1;
	private JTextField textGolesSenegalJ1;
	private JTextField textGolesPaisesBajosJ1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaResultados window = new VentanaResultados();
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
	public VentanaResultados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jornada1");
		lblNewLabel.setBounds(93, 11, 67, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblQatarJ1 = new JLabel("Qatar");
		lblQatarJ1.setBounds(10, 47, 49, 14);
		frame.getContentPane().add(lblQatarJ1);
		
		textGolesQatarJ1 = new JTextField();
		lblQatarJ1.setLabelFor(textGolesQatarJ1);
		textGolesQatarJ1.setBounds(59, 44, 50, 20);
		frame.getContentPane().add(textGolesQatarJ1);
		textGolesQatarJ1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setBounds(118, 47, 9, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textGolesEcuadorJ1 = new JTextField();
		textGolesEcuadorJ1.setBounds(132, 44, 50, 20);
		frame.getContentPane().add(textGolesEcuadorJ1);
		textGolesEcuadorJ1.setColumns(10);
		
		JLabel lblEcuadorJ1 = new JLabel("Ecuador");
		lblEcuadorJ1.setLabelFor(textGolesEcuadorJ1);
		lblEcuadorJ1.setBounds(192, 47, 49, 14);
		frame.getContentPane().add(lblEcuadorJ1);
		
		JLabel lblSenegalJ1 = new JLabel("Senegal");
		lblSenegalJ1.setBounds(10, 84, 49, 14);
		frame.getContentPane().add(lblSenegalJ1);
		
		textGolesSenegalJ1 = new JTextField();
		lblSenegalJ1.setLabelFor(textGolesSenegalJ1);
		textGolesSenegalJ1.setBounds(59, 81, 50, 20);
		frame.getContentPane().add(textGolesSenegalJ1);
		textGolesSenegalJ1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("-");
		lblNewLabel_3.setBounds(118, 84, 9, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textGolesPaisesBajosJ1 = new JTextField();
		textGolesPaisesBajosJ1.setBounds(132, 81, 50, 20);
		frame.getContentPane().add(textGolesPaisesBajosJ1);
		textGolesPaisesBajosJ1.setColumns(10);
		
		JLabel lblPaisesBajosJ1 = new JLabel("Paises Bajos");
		lblPaisesBajosJ1.setLabelFor(textGolesPaisesBajosJ1);
		lblPaisesBajosJ1.setBounds(192, 84, 79, 14);
		frame.getContentPane().add(lblPaisesBajosJ1);
		
		JLabel lblResultadoP1J1 = new JLabel("");
		lblResultadoP1J1.setBounds(388, 47, 185, 14);
		frame.getContentPane().add(lblResultadoP1J1);
		
		JLabel lblResultadoP2J1 = new JLabel("");
		lblResultadoP2J1.setBounds(388, 84, 185, 14);
		frame.getContentPane().add(lblResultadoP2J1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int golesQatarJ1 = Integer.parseInt(((JTextField)lblQatarJ1.getLabelFor()).getText());
				int golesQatarJ1 = Integer.parseInt(textGolesQatarJ1.getText()); 
				int golesEcuadorJ1 = Integer.parseInt(textGolesEcuadorJ1.getText());
				
				int golesSenegalJ1 = Integer.parseInt(textGolesSenegalJ1.getText());
				int golesPaisesBajosJ1 = Integer.parseInt(textGolesPaisesBajosJ1.getText());
				
				if(golesQatarJ1 > golesEcuadorJ1) {
					lblResultadoP1J1.setText(lblQatarJ1.getText() + " ha ganado");
				}else if (golesQatarJ1 < golesEcuadorJ1) {
					lblResultadoP1J1.setText(lblEcuadorJ1.getText() + " ha ganado");
				}else {
					lblResultadoP1J1.setText(lblQatarJ1.getText() + " y " + lblEcuadorJ1.getText() + " han empatado");
				}
				if(golesSenegalJ1 > golesPaisesBajosJ1) {
					lblResultadoP2J1.setText(lblSenegalJ1.getText() + " ha ganado");
				}else if (golesSenegalJ1 < golesPaisesBajosJ1) {
					lblResultadoP2J1.setText(lblPaisesBajosJ1.getText() + " ha ganado");
				}else {
					lblResultadoP2J1.setText(lblSenegalJ1.getText() + " y " + lblPaisesBajosJ1.getText() + " han empatado");
				}				
				

			}
		});
		btnCalcular.setBounds(280, 289, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		JLabel lblNewLabel_2 = new JLabel("Jornada 2");
		lblNewLabel_2.setBounds(93, 128, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
