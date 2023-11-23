package JoelMurilloMasa_PatriciaJimenezBocos;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;

public class JoelMurillo_PatriciaJimenez {

	private JFrame frmJoelYPatricia;
	private JTextField texto_entrada_datos;
	private JTextField nombreProducto;
	private JTextField texto_Nombre_Producto;
	private JTextField tipo_Producto;
	private JComboBox<String> box_Tipo_Producto;
	private JTextField texto_Precio_Producto;
	private JTextField precioProducto;
	private final ButtonGroup grupoCategoria = new ButtonGroup();
	private JTextField texto_Categoria;
	private JTextField texto_Iva;
	private JRadioButton rbuttonCuatro;
	private JRadioButton rbuttonDiez;
	private JRadioButton rbuttonVeintiuno;
	private final ButtonGroup IVA = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoelMurillo_PatriciaJimenez window = new JoelMurillo_PatriciaJimenez();
					window.frmJoelYPatricia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JoelMurillo_PatriciaJimenez() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJoelYPatricia = new JFrame();
		frmJoelYPatricia.setTitle("JOEL Y PATRICIA");
		frmJoelYPatricia.getContentPane().setBackground(SystemColor.scrollbar);
		frmJoelYPatricia.setBounds(100, 100, 639, 554);
		frmJoelYPatricia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJoelYPatricia.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 40, 605, 234);
		frmJoelYPatricia.getContentPane().add(panel);
		panel.setLayout(null);
		
		nombreProducto = new JTextField();
		nombreProducto.setEditable(false);
		nombreProducto.setBackground(SystemColor.scrollbar);
		nombreProducto.setText("Nombre de producto\r\n");
		nombreProducto.setHorizontalAlignment(SwingConstants.CENTER);
		nombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nombreProducto.setColumns(20);
		nombreProducto.setBounds(10, 10, 144, 19);
		panel.add(nombreProducto);
		
		texto_Nombre_Producto = new JTextField();
		texto_Nombre_Producto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		texto_Nombre_Producto.setHorizontalAlignment(SwingConstants.LEFT);
		texto_Nombre_Producto.setBounds(158, 12, 96, 19);
		panel.add(texto_Nombre_Producto);
		texto_Nombre_Producto.setColumns(10);
		
		JCheckBox aplicaTasa = new JCheckBox("Aplica tasa");
		aplicaTasa.setBackground(SystemColor.scrollbar);
		aplicaTasa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		aplicaTasa.setBounds(503, 11, 96, 21);
		panel.add(aplicaTasa);
		
		JComboBox comboBox = new JComboBox<Object>();
		comboBox.setEditable(true);
		 String[] tipos = {"----", "De temporada", "Importado", "Consumo popular", "Duradero", "No duradero"};
	     box_Tipo_Producto = new JComboBox<>(tipos);
	     box_Tipo_Producto.setModel(new DefaultComboBoxModel(new String[] {"---------", "De temporada", "Importado", "Consumo popular", "Duradero", "No duradero"}));
		box_Tipo_Producto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		box_Tipo_Producto.setBackground(SystemColor.window);
		box_Tipo_Producto.setBounds(168, 41, 86, 21);
		panel.add(box_Tipo_Producto);
		
		tipo_Producto = new JTextField();
		tipo_Producto.setText("Tipo de producto");
		tipo_Producto.setHorizontalAlignment(SwingConstants.CENTER);
		tipo_Producto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tipo_Producto.setEditable(false);
		tipo_Producto.setColumns(20);
		tipo_Producto.setBackground(SystemColor.scrollbar);
		tipo_Producto.setBounds(10, 39, 144, 19);
		panel.add(tipo_Producto);
		
		texto_Precio_Producto = new JTextField();
		texto_Precio_Producto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		texto_Precio_Producto.setHorizontalAlignment(SwingConstants.LEFT);
		texto_Precio_Producto.setColumns(10);
		texto_Precio_Producto.setBounds(158, 74, 96, 19);
		panel.add(texto_Precio_Producto);
		
		precioProducto = new JTextField();
		precioProducto.setText("Precio producto");
		precioProducto.setHorizontalAlignment(SwingConstants.CENTER);
		precioProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		precioProducto.setEditable(false);
		precioProducto.setColumns(20);
		precioProducto.setBackground(SystemColor.scrollbar);
		precioProducto.setBounds(10, 72, 144, 19);
		panel.add(precioProducto);
		
		
		JRadioButton rbuttonExtra = new JRadioButton("Extra");
		rbuttonExtra.setBackground(SystemColor.scrollbar);
		rbuttonExtra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbuttonExtra.setHorizontalAlignment(SwingConstants.LEFT);
		grupoCategoria.add(rbuttonExtra);
		rbuttonExtra.setBounds(152, 115, 103, 21);
		panel.add(rbuttonExtra);
		
		JRadioButton rbuttonPrimera = new JRadioButton("Primera");
		rbuttonPrimera.setBackground(SystemColor.scrollbar);
		rbuttonPrimera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbuttonPrimera.setHorizontalAlignment(SwingConstants.LEFT);
		grupoCategoria.add(rbuttonPrimera);
		rbuttonPrimera.setBounds(268, 115, 103, 21);
		panel.add(rbuttonPrimera);
		
		JRadioButton rbuttonSegunda = new JRadioButton("Segunda");
		rbuttonSegunda.setBackground(SystemColor.scrollbar);
		rbuttonSegunda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbuttonSegunda.setHorizontalAlignment(SwingConstants.LEFT);
		grupoCategoria.add(rbuttonSegunda);
		rbuttonSegunda.setBounds(152, 147, 103, 21);
		panel.add(rbuttonSegunda);
		
		JRadioButton rbuttonSuperExtra = new JRadioButton("Super-Extra");
		rbuttonSuperExtra.setBackground(SystemColor.scrollbar);
		rbuttonSuperExtra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbuttonSuperExtra.setHorizontalAlignment(SwingConstants.LEFT);
		grupoCategoria.add(rbuttonSuperExtra);
		rbuttonSuperExtra.setBounds(268, 147, 103, 21);
		panel.add(rbuttonSuperExtra);
		
		texto_Categoria = new JTextField();
		texto_Categoria.setText("Categoría:");
		texto_Categoria.setHorizontalAlignment(SwingConstants.CENTER);
		texto_Categoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto_Categoria.setEditable(false);
		texto_Categoria.setColumns(20);
		texto_Categoria.setBackground(SystemColor.scrollbar);
		texto_Categoria.setBounds(24, 132, 122, 23);
		panel.add(texto_Categoria);
		
		texto_Iva = new JTextField();
		texto_Iva.setHorizontalAlignment(SwingConstants.CENTER);
		texto_Iva.setText("IVA:");
		texto_Iva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto_Iva.setEditable(false);
		texto_Iva.setColumns(20);
		texto_Iva.setBackground(SystemColor.scrollbar);
		texto_Iva.setBounds(24, 203, 122, 23);
		panel.add(texto_Iva);
		
		rbuttonCuatro = new JRadioButton("4%");
		rbuttonCuatro.setBackground(SystemColor.scrollbar);
		IVA.add(rbuttonCuatro);
		rbuttonCuatro.setHorizontalAlignment(SwingConstants.LEFT);
		rbuttonCuatro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbuttonCuatro.setBounds(152, 204, 70, 21);
		panel.add(rbuttonCuatro);
		
		rbuttonDiez = new JRadioButton("10%");
		rbuttonDiez.setBackground(SystemColor.scrollbar);
		IVA.add(rbuttonDiez);
		rbuttonDiez.setHorizontalAlignment(SwingConstants.LEFT);
		rbuttonDiez.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbuttonDiez.setBounds(238, 205, 70, 21);
		panel.add(rbuttonDiez);
		
		rbuttonVeintiuno = new JRadioButton("21%");
		rbuttonVeintiuno.setBackground(SystemColor.scrollbar);
		IVA.add(rbuttonVeintiuno);
		rbuttonVeintiuno.setHorizontalAlignment(SwingConstants.LEFT);
		rbuttonVeintiuno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbuttonVeintiuno.setBounds(324, 205, 70, 21);
		panel.add(rbuttonVeintiuno);
		
		texto_entrada_datos = new JTextField();
		texto_entrada_datos.setEditable(false);
		texto_entrada_datos.setBackground(SystemColor.scrollbar);
		texto_entrada_datos.setBounds(158, 10, 305, 19);
		frmJoelYPatricia.getContentPane().add(texto_entrada_datos);
		texto_entrada_datos.setHorizontalAlignment(SwingConstants.CENTER);
		texto_entrada_datos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto_entrada_datos.setText("ENTRADA DE DATOS DE PRODUCTOS");
		texto_entrada_datos.setColumns(20);
		
		
		
		
		JButton limpiarDatos = new JButton("Limpiar Datos");
		limpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto_Nombre_Producto.setText("");//String NombreProducto
				box_Tipo_Producto.setSelectedIndex(0);
				texto_Precio_Producto.setText("");
				aplicaTasa.setSelected(false);
				grupoCategoria.clearSelection();
				IVA.clearSelection();
			}
		});
		limpiarDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		limpiarDatos.setBounds(379, 283, 236, 21);
		frmJoelYPatricia.getContentPane().add(limpiarDatos);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 340, 605, 166);
		frmJoelYPatricia.getContentPane().add(textArea);
		
		JButton datosTecleados = new JButton("Ver Datos Tecleados");
		datosTecleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String categoria="";
				String impuesto="";
				String tasa="";
				String tipo=box_Tipo_Producto.getSelectedItem().toString();

				
				//comprobar si la tasa esta seleccionada
				if(aplicaTasa.isSelected()) {
					tasa="SI";
				}else {
					tasa="NO";
				}
				
				//comprobar que categoria se escogio
				if(rbuttonExtra.isSelected()) {
					categoria="Extra";
				}else if(rbuttonPrimera.isSelected()) {
					categoria="Primera";
				}else if(rbuttonSegunda.isSelected()) {
					categoria="Segunda";
				}else if(rbuttonSuperExtra.isSelected()) {
					categoria="Super Extra";
				}else {
					categoria="No introducida";
				}
				
				//comprobar que impuesto se escogio
				if(rbuttonCuatro.isSelected()) {
					impuesto="4%";
				}else if(rbuttonDiez.isSelected()) {
					impuesto="10%";
				}else if(rbuttonVeintiuno.isSelected()) {
					impuesto="21%";
				}else {
					impuesto="No seleccionado";
				}
				
				textArea.setText("LOS DATOS TECLEADOS SON"+
								"\n==========================================================="+
								"\n- Nombre Producto: "+texto_Nombre_Producto.getText()+
								"\n- Tipo Producto: "+ tipo +
								"\n- Precio Producto: "+ texto_Precio_Producto.getText()+
								"\n==========================================================="+
								"\n- Categoria Seleccionada: "+categoria+
								"\n- IVA Seleccionado: "+impuesto+
								"\n- Tasa Seleccionada: "+ tasa
						);
			}
		});
		datosTecleados.setFont(new Font("Tahoma", Font.PLAIN, 14));
		datosTecleados.setBounds(10, 284, 236, 21);
		frmJoelYPatricia.getContentPane().add(datosTecleados);
		
	}
}
