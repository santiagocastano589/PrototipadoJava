import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaCuatro extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	JLabel lblNombre;
	JLabel lblCiudad;
	JLabel txtFrase;
	JButton btnAceptar;
	JButton btnDesactivar;
	JButton btnActivar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCuatro frame = new VentanaCuatro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCuatro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(118, 28, 123, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(118, 59, 123, 20);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(24, 31, 46, 14);
		contentPane.add(lblNombre);
		
		lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(24, 62, 46, 14);
		contentPane.add(lblCiudad);
		
		txtFrase = new JLabel("Frase:");
		txtFrase.setBounds(24, 96, 258, 40);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(77, 147, 152, 23);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(77, 181, 152, 23);
		btnDesactivar.addActionListener(this);
		contentPane.add(btnDesactivar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(77, 215, 152, 23);
		btnActivar.addActionListener(this);
		contentPane.add(btnActivar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btnAceptar==e.getSource()) {
			txtFrase.setText("Usted se llama "+txtNombre.getText()+" y vive en "+txtCiudad.getText());
		}
		if (btnDesactivar==e.getSource()) {
			txtNombre.setEditable(false);
			txtCiudad.setEditable(false);
		}
		if (btnActivar==e.getSource()) {
			txtNombre.setEditable(true);
			txtCiudad.setEditable(true);
		}
	}
}
