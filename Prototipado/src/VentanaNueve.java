import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaNueve extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	JButton btnConcatena;
	JLabel etiTexto;
	JLabel lblUno;
	JLabel lblDos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNueve frame = new VentanaNueve();
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
	public VentanaNueve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUno = new JLabel("Ingrese Palabra 1");
		lblUno.setBounds(10, 36, 121, 14);
		contentPane.add(lblUno);
		
		lblDos = new JLabel("Ingrese Palabra 2");
		lblDos.setBounds(10, 84, 121, 14);
		contentPane.add(lblDos);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(148, 33, 102, 20);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setBounds(148, 81, 102, 20);
		contentPane.add(txtPalabra2);
		txtPalabra2.setColumns(10);
		
		btnConcatena = new JButton("Concatenar");
		btnConcatena.setBounds(73, 168, 121, 23);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
		
		etiTexto = new JLabel("Texto: ");
		etiTexto.setBounds(24, 130, 226, 20);
		contentPane.add(etiTexto);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btnConcatena==e.getSource()) {
			etiTexto.setText("Texto: "+txtPalabra1.getText()+txtPalabra2.getText());
		}
	}

}