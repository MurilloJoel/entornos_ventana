package JoelMurilloMasa_PatriciaJimenezBocos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ventana {

	private JFrame frmJoelYPatricia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
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
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJoelYPatricia = new JFrame();
		frmJoelYPatricia.setTitle("JOEL Y PATRICIA");
		frmJoelYPatricia.setBounds(100, 100, 800, 471);
		frmJoelYPatricia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJoelYPatricia.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS ELIMINADOS CORRECTAMENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 776, 176);
		frmJoelYPatricia.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 183, 776, 240);
		frmJoelYPatricia.getContentPane().add(lblNewLabel_1);
	}
}
