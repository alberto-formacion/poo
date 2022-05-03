package mundial;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class VentanaResultados {

	private JFrame frame;
	private JTextField textGolesQatarJ1;
	private JTextField textGolesEcuadorJ1;
	private JTextField textGolesSenegalJ1;
	private JTextField textGolesPaisesBajosJ1;
	private JTextField textGolesPaisesBajosJ2;
	private JTextField textGolesEcuadorJ2;
	private JTextField textGolesQatarJ2;
	private JTextField textGolesSenegalJ2;
	private JTextField textGolesEcuadorJ3;
	private JTextField textGolesSenegalJ3;
	private JTextField textGolesPaisesBajosJ3;
	private JTextField textGolesQatarJ3;

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
		frame.setBounds(100, 100, 805, 470);
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
		
		JLabel lblNewLabel_2 = new JLabel("Jornada 2");
		lblNewLabel_2.setBounds(93, 128, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblPaisesBajosJ2 = new JLabel("Paises Bajos");
		lblPaisesBajosJ2.setBounds(10, 151, 62, 14);
		frame.getContentPane().add(lblPaisesBajosJ2);
		
		JLabel lblQatarJ2 = new JLabel("Qatar");
		lblQatarJ2.setBounds(10, 198, 49, 14);
		frame.getContentPane().add(lblQatarJ2);
		
		JLabel lblEcuadorJ2 = new JLabel("Ecuador");
		lblEcuadorJ2.setBounds(192, 151, 49, 14);
		frame.getContentPane().add(lblEcuadorJ2);
		
		JLabel lblSenegalJ2 = new JLabel("Senegal");
		lblSenegalJ2.setBounds(192, 198, 49, 14);
		frame.getContentPane().add(lblSenegalJ2);
		
		JLabel lblNewLabel_8 = new JLabel("Jornada 3");
		lblNewLabel_8.setBounds(93, 243, 49, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblEcuadorJ3 = new JLabel("Ecuador");
		lblEcuadorJ3.setBounds(10, 278, 49, 14);
		frame.getContentPane().add(lblEcuadorJ3);
		
		JLabel lblPaisesBajosJ3 = new JLabel("Paises Bajos");
		lblPaisesBajosJ3.setBounds(10, 321, 49, 14);
		frame.getContentPane().add(lblPaisesBajosJ3);
		
		JLabel lblSenegalJ3 = new JLabel("Senegal");
		lblSenegalJ3.setBounds(192, 278, 49, 14);
		frame.getContentPane().add(lblSenegalJ3);
		
		JLabel lblQatarJ3 = new JLabel("Qatar");
		lblQatarJ3.setBounds(192, 321, 49, 14);
		frame.getContentPane().add(lblQatarJ3);
		
		textGolesPaisesBajosJ2 = new JTextField();
		textGolesPaisesBajosJ2.setBounds(59, 148, 50, 20);
		frame.getContentPane().add(textGolesPaisesBajosJ2);
		textGolesPaisesBajosJ2.setColumns(10);
		
		textGolesEcuadorJ2 = new JTextField();
		textGolesEcuadorJ2.setBounds(132, 148, 50, 20);
		frame.getContentPane().add(textGolesEcuadorJ2);
		textGolesEcuadorJ2.setColumns(10);
		
		textGolesQatarJ2 = new JTextField();
		textGolesQatarJ2.setBounds(59, 195, 50, 20);
		frame.getContentPane().add(textGolesQatarJ2);
		textGolesQatarJ2.setColumns(10);
		
		textGolesSenegalJ2 = new JTextField();
		textGolesSenegalJ2.setBounds(132, 195, 50, 20);
		frame.getContentPane().add(textGolesSenegalJ2);
		textGolesSenegalJ2.setColumns(10);
		
		textGolesEcuadorJ3 = new JTextField();
		textGolesEcuadorJ3.setBounds(59, 275, 50, 20);
		frame.getContentPane().add(textGolesEcuadorJ3);
		textGolesEcuadorJ3.setColumns(10);
		
		textGolesSenegalJ3 = new JTextField();
		textGolesSenegalJ3.setBounds(132, 275, 50, 20);
		frame.getContentPane().add(textGolesSenegalJ3);
		textGolesSenegalJ3.setColumns(10);
		
		textGolesPaisesBajosJ3 = new JTextField();
		textGolesPaisesBajosJ3.setBounds(59, 318, 50, 20);
		frame.getContentPane().add(textGolesPaisesBajosJ3);
		textGolesPaisesBajosJ3.setColumns(10);
		
		textGolesQatarJ3 = new JTextField();
		textGolesQatarJ3.setBounds(132, 318, 50, 20);
		frame.getContentPane().add(textGolesQatarJ3);
		textGolesQatarJ3.setColumns(10);
		
		JLabel lblResultadoP1J2 = new JLabel("");
		lblResultadoP1J2.setBounds(388, 151, 185, 14);
		frame.getContentPane().add(lblResultadoP1J2);
		
		JLabel lblResultadoP2J2 = new JLabel("");
		lblResultadoP2J2.setBounds(388, 198, 185, 14);
		frame.getContentPane().add(lblResultadoP2J2);
		
		JLabel lblResultadoP1J3 = new JLabel("");
		lblResultadoP1J3.setBounds(388, 278, 185, 14);
		frame.getContentPane().add(lblResultadoP1J3);
		
		JLabel lblResultadoP2J3 = new JLabel("");
		lblResultadoP2J3.setBounds(388, 321, 185, 14);
		frame.getContentPane().add(lblResultadoP2J3);
		
		JLabel lblPuntosTotales = new JLabel("");
		lblPuntosTotales.setBounds(388, 380, 358, 14);
		frame.getContentPane().add(lblPuntosTotales);
		
		JList<String> listClasificacion = new JList<String>();
		listClasificacion.setBounds(616, 46, 130, 276);
		frame.getContentPane().add(listClasificacion);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int puntosQatar = 0;
				int puntosEcuador = 0;
				int puntosPaisesBajos = 0;
				int puntosSenegal = 0;
				
				/**** JORNADA 1 ****/
				//int golesQatarJ1 = Integer.parseInt(((JTextField)lblQatarJ1.getLabelFor()).getText());
				int golesQatarJ1 = Integer.parseInt(textGolesQatarJ1.getText()); 
				int golesEcuadorJ1 = Integer.parseInt(textGolesEcuadorJ1.getText());
				
				int golesSenegalJ1 = Integer.parseInt(textGolesSenegalJ1.getText());
				int golesPaisesBajosJ1 = Integer.parseInt(textGolesPaisesBajosJ1.getText());
				
				if(golesQatarJ1 > golesEcuadorJ1) {
					lblResultadoP1J1.setText(lblQatarJ1.getText() + " ha ganado");
					puntosQatar = puntosQatar + 3;
				}else if (golesQatarJ1 < golesEcuadorJ1) {
					lblResultadoP1J1.setText(lblEcuadorJ1.getText() + " ha ganado");
					puntosEcuador = puntosEcuador + 3;
				}else {
					lblResultadoP1J1.setText(lblQatarJ1.getText() + " y " + lblEcuadorJ1.getText() + " han empatado");
					puntosQatar = puntosQatar + 1;
					puntosEcuador = puntosEcuador + 1;
				}
				if(golesSenegalJ1 > golesPaisesBajosJ1) {
					lblResultadoP2J1.setText(lblSenegalJ1.getText() + " ha ganado");
					//puntosSenegal = puntosSenegal + 3;
					puntosSenegal += 3;
				}else if (golesSenegalJ1 < golesPaisesBajosJ1) {
					lblResultadoP2J1.setText(lblPaisesBajosJ1.getText() + " ha ganado");
					puntosPaisesBajos += 3;
				}else {
					lblResultadoP2J1.setText(lblSenegalJ1.getText() + " y " + lblPaisesBajosJ1.getText() + " han empatado");
					puntosSenegal += 1;
					puntosPaisesBajos += 1;
				}				
				
				/**** JORNADA 2 ****/
				int golesEcuadorJ2 = Integer.parseInt(textGolesEcuadorJ2.getText());
				int golesPaisesBajosJ2 = Integer.parseInt(textGolesPaisesBajosJ2.getText());
				
				int golesQatarJ2 = Integer.parseInt(textGolesQatarJ2.getText()); 
				int golesSenegalJ2 = Integer.parseInt(textGolesSenegalJ2.getText());
				
				
				if(golesPaisesBajosJ2 > golesEcuadorJ2) {
					lblResultadoP1J2.setText(lblPaisesBajosJ2.getText() + " ha ganado");
					puntosPaisesBajos += 3;
				}else if (golesPaisesBajosJ2 < golesEcuadorJ2) {
					lblResultadoP1J2.setText(lblEcuadorJ2.getText() + " ha ganado");
					puntosEcuador += 3;
				}else {
					lblResultadoP1J2.setText(lblPaisesBajosJ2.getText() + " y " + lblEcuadorJ2.getText() + " han empatado");
					puntosPaisesBajos += 1;
					puntosEcuador += 1;
				}
				
				if(golesSenegalJ2 > golesQatarJ2) {
					lblResultadoP2J2.setText(lblSenegalJ2.getText() + " ha ganado");
					puntosSenegal += 3;
				}else if (golesSenegalJ2 < golesQatarJ2) {
					lblResultadoP2J2.setText(lblQatarJ2.getText() + " ha ganado");
					puntosQatar += 3;
				}else {
					lblResultadoP2J2.setText(lblSenegalJ2.getText() + " y " + lblQatarJ2.getText() + " han empatado");
					puntosSenegal += 1;
					puntosQatar += 1;
				}	
				
				/**** JORNADA 3 ****/
				int golesEcuadorJ3 = Integer.parseInt(textGolesEcuadorJ3.getText());
				int golesSenegalJ3 = Integer.parseInt(textGolesSenegalJ3.getText());
				
				int golesPaisesBajosJ3 = Integer.parseInt(textGolesPaisesBajosJ3.getText());
				int golesQatarJ3 = Integer.parseInt(textGolesQatarJ3.getText()); 

				if(golesSenegalJ3 > golesEcuadorJ3) {
					lblResultadoP1J3.setText(lblSenegalJ3.getText() + " ha ganado");
					puntosSenegal += 3;
				}else if (golesSenegalJ3 < golesEcuadorJ3) {
					lblResultadoP1J3.setText(lblEcuadorJ3.getText() + " ha ganado");
					puntosEcuador += 3;
				}else {
					lblResultadoP1J3.setText(lblSenegalJ3.getText() + " y " + lblEcuadorJ3.getText() + " han empatado");
					puntosSenegal += 1;
					puntosEcuador += 1;
				}
				
				if(golesPaisesBajosJ3 > golesQatarJ3) {
					lblResultadoP2J3.setText(lblPaisesBajosJ3.getText() + " ha ganado");
					puntosPaisesBajos += 3;
				}else if (golesPaisesBajosJ3 < golesQatarJ3) {
					lblResultadoP2J3.setText(lblQatarJ3.getText() + " ha ganado");
					puntosQatar += 3;
				}else {
					lblResultadoP2J3.setText(lblPaisesBajosJ3.getText() + " y " + lblQatarJ3.getText() + " han empatado");
					puntosPaisesBajos += 1;
					puntosQatar += 1;
				}
				
				//lblPuntosTotales.setText("Qatar:" + puntosQatar + " Ecuador:" + puntosEcuador + " Paises bajos:" + puntosPaisesBajos + " Senegal:" + puntosSenegal);
				
				String[] equipos = {"Qatar", "Ecuador", "Paises Bajos", "Senegal"};
				int[] puntos = {puntosQatar, puntosEcuador, puntosPaisesBajos, puntosSenegal};
				
			    boolean ordenado = false;
			    int temp;
			    String tempEquipo;
			    
			    //while(!ordenado) {
			    while(ordenado == false) {
			    	ordenado = true;
			        for (int i = 0; i < puntos.length - 1; i++) {
			            if (puntos[i] > puntos[i+1]) {
			                temp = puntos[i];
			                tempEquipo = equipos[i];
			                
			                puntos[i] = puntos[i+1];
			                equipos[i] = equipos[i+1];
			                
			                puntos[i+1] = temp;
			                equipos[i+1] = tempEquipo;
			                
			                ordenado = false;
			            }
			        }
			    }
			    
			    lblPuntosTotales.setText(equipos[0] + ":" + puntos[0] + "pts " + equipos[1] + ":" + puntos[1] + "pts " + equipos[2] + ":" + puntos[2] + "pts " + equipos[3] + ":" + puntos[3] + "pts ");
			    
			    DefaultListModel<String> model = new DefaultListModel<String>();
			    
			    for(int i=equipos.length-1;i>=0;i--) {
			    	model.addElement(equipos[i] + " " + puntos[i]);
			    }
			    
			    listClasificacion.setModel(model);

			}


		});
		btnCalcular.setBounds(280, 376, 89, 23);
		frame.getContentPane().add(btnCalcular);
	}
}
