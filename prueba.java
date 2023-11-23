package entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class prueba {

	private JFrame frmPrueba;
	private JTextField Nombre_F;
	private JTextField Apellido_F;
	private JTextField DNI_F;
	
	private ButtonGroup grCurso= new ButtonGroup();
	private ButtonGroup grRepetidor = new ButtonGroup();
	private JTextField texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.frmPrueba.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrueba = new JFrame();
		frmPrueba.setTitle("JOEL MURILLO MASA");
		frmPrueba.setBounds(100, 100, 839, 454);
		frmPrueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrueba.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 255, 255));
		panel.setBounds(0, 0, 823, 109);
		frmPrueba.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 102));
		panel_1.setBounds(0, 113, 433, 302);
		frmPrueba.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Nombre = new JLabel("Nombre: ");
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Nombre.setBounds(10, 11, 96, 27);
		panel_1.add(Nombre);
		
		JLabel Apellido = new JLabel("Apellido: ");
		Apellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Apellido.setBounds(10, 49, 96, 27);
		panel_1.add(Apellido);
		
		JLabel DNI = new JLabel("DNI: ");
		DNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		DNI.setBounds(10, 87, 96, 32);
		panel_1.add(DNI);
		
		Nombre_F = new JTextField();
		Nombre_F.setBounds(102, 15, 284, 20);
		panel_1.add(Nombre_F);
		Nombre_F.setColumns(10);
		
		Apellido_F = new JTextField();
		Apellido_F.setBounds(102, 53, 284, 20);
		panel_1.add(Apellido_F);
		Apellido_F.setColumns(10);
		
		DNI_F = new JTextField();
		DNI_F.setBounds(102, 94, 284, 20);
		panel_1.add(DNI_F);
		DNI_F.setColumns(10);
		
		JLabel Grado = new JLabel("Grado");
		Grado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Grado.setVerticalAlignment(SwingConstants.BOTTOM);
		Grado.setBounds(10, 130, 96, 27);
		panel_1.add(Grado);
		
		final JComboBox cbGrado = new JComboBox();
		
		cbGrado.setModel(new DefaultComboBoxModel(new String[] {"Default", "ASIR", "DAW ", "DAM"}));
		cbGrado.setBounds(102, 139, 284, 22);
		panel_1.add(cbGrado);
		
		JLabel Curso = new JLabel("Curso: ");
		Curso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Curso.setBounds(10, 181, 46, 14);
		panel_1.add(Curso);
		
		final JRadioButton boton1_Curso = new JRadioButton("1º");
		boton1_Curso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton1_Curso.setBounds(102, 180, 107, 20);
		panel_1.add(boton1_Curso);
		
		final JRadioButton boton2_Curso = new JRadioButton("2º");
		boton2_Curso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton2_Curso.setBounds(258, 180, 128, 20);
		panel_1.add(boton2_Curso);
		
		grCurso.add(boton1_Curso);
		grCurso.add(boton2_Curso);
		
		JLabel Repetidor = new JLabel("Repetidor:");
		Repetidor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Repetidor.setBounds(10, 222, 60, 14);
		panel_1.add(Repetidor);
		
		final JRadioButton boton1_Repetidor = new JRadioButton("NO");
		boton1_Repetidor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton1_Repetidor.setBounds(258, 222, 128, 20);
		panel_1.add(boton1_Repetidor);
		
		final JRadioButton boton2_Repetidor = new JRadioButton("SI");
		boton2_Repetidor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton2_Repetidor.setBounds(102, 222, 107, 20);
		panel_1.add(boton2_Repetidor);
		
		grRepetidor.add(boton1_Repetidor);
		grRepetidor.add(boton2_Repetidor);
		
		JButton Borrar = new JButton("Borrar");
		Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nombre_F.setText("");
				Apellido_F.setText("");
				DNI_F.setText("");
				grRepetidor.clearSelection();
				grCurso.clearSelection();
				cbGrado.setSelectedIndex(0);
				
			}
		});
		Borrar.setBounds(10, 268, 89, 23);
		panel_1.add(Borrar);
		
		JButton Guardar = new JButton("Guardar");
		Guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String repetidor="";
				int curso= 0;
				//Condicional para el button del curso
				if(boton1_Curso.isSelected()) {
					curso=1;
				}else if(boton2_Curso.isSelected()) {
					curso=2;
				}
				
				//Condicional para el button de los repetidores
				if(boton1_Repetidor.isSelected()) {
					repetidor="NO";
				}else if(boton2_Repetidor.isSelected()) {
					repetidor="SI";
				}
				
				String combo= cbGrado.getSelectedItem().toString();
				texto.setText("Nombre: "+ Nombre_F.getText()+ "\n"
							+ " - Apellidos: " + Apellido_F.getText()
							+ " - DNI: "+ DNI_F.getText()
							+ " - Grado: "+ combo
							+ " - Curso: "+ curso
							+ " - Repetidor: "+ repetidor);
				
				
			}
		});
		Guardar.setBounds(297, 268, 89, 23);
		panel_1.add(Guardar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 0));
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBounds(443, 113, 380, 302);
		frmPrueba.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		texto = new JTextField();
		texto.setBounds(23, 11, 347, 252);
		texto.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(texto);
		texto.setColumns(10);
		
		JButton Enviar = new JButton("Enviar");
		Enviar.setBounds(257, 268, 89, 23);
		Enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana v = new ventana();
				v.setVisible(true);
			}
		});
		panel_2.add(Enviar);
	}
}
