import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField campoNombre;
	private JTextField campoCiudad;
	JLabel lblCiudad,lblTitulo;
	JLabel lblNombre;
	JButton btnOcultarNombre;
	JButton btnVisuNombre;
	JButton btnOcultarCiudad;
	JButton btnVisuCiudad ;
	private JLabel etiNombre;
	private JLabel etiCiudad;
	private JButton btnIngresarNombre;
	private JButton btnIngresarCiudad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitulo = new JLabel("Prototipado");
		lblTitulo.setBounds(257, 11, 70, 14);
		contentPane.add(lblTitulo);
		
		etiNombre = new JLabel("Nombre");
		etiNombre.setBounds(143, 48, 50, 14);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Ciudad");
		etiCiudad.setBounds(370, 48, 58, 14);
		contentPane.add(etiCiudad);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(32, 86, 46, 14);
		contentPane.add(lblNombre);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(101, 83, 143, 20);
		contentPane.add(campoNombre);
		campoNombre.setColumns(10);
		
		lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(263, 86, 46, 14);
		contentPane.add(lblCiudad);
		
		campoCiudad = new JTextField();
		campoCiudad.setBounds(319, 83, 143, 20);
		contentPane.add(campoCiudad);
		campoCiudad.setColumns(10);
		
		btnIngresarNombre = new JButton("Ingresar Nombre");
		btnIngresarNombre.setBounds(10, 124, 124, 23);
		btnIngresarNombre.addActionListener(this);
		contentPane.add(btnIngresarNombre);
		
		btnIngresarCiudad = new JButton("Ingresar Ciudad");
		btnIngresarCiudad.setBounds(144, 124, 147, 23);
		btnIngresarCiudad.addActionListener(this);
		contentPane.add(btnIngresarCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(311, 124, 117, 23);
		btnOcultarNombre.addActionListener(this);
		contentPane.add(btnOcultarNombre);
	
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setBounds(112, 174, 132, 23);
		btnVisuNombre.addActionListener(this);
		contentPane.add(btnVisuNombre);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(445, 124, 125, 23);
		btnOcultarCiudad.addActionListener(this);
		contentPane.add(btnOcultarCiudad);
		
		btnVisuCiudad= new JButton("Visualizar Ciudad");
		btnVisuCiudad.setBounds(298, 174, 143, 23);
		btnVisuCiudad.addActionListener(this);
		contentPane.add(btnVisuCiudad);
		

		

	}
	public void actionPerformed(ActionEvent e) {
		
		if (btnIngresarNombre==e.getSource()) {
			etiNombre.setText(campoNombre.getText());
		}
		if (btnIngresarCiudad==e.getSource()) {
			etiCiudad.setText(campoCiudad.getText());
		}	
		if (btnOcultarNombre==e.getSource()) {
			etiNombre.setVisible(false);
		}
		if (btnVisuNombre==e.getSource()) {
			etiNombre.setVisible(true);
		}
		if (btnOcultarCiudad==e.getSource()) {
			etiCiudad.setVisible(false);
		}
		if (btnVisuCiudad==e.getSource()) {
			etiCiudad.setVisible(true);
		}
	}
}
