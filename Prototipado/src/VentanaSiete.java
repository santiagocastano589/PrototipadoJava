import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaSiete extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiTexto;
	JButton btnAzul;
	JButton btnRojo;
	JButton btnVerde;
	JButton btnFondoAzul;
	JButton btnFondoRojo;
	JButton btnFondoVerde;
	JButton btnTransparente;
	JButton btnOpaca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSiete frame = new VentanaSiete();
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
	public VentanaSiete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto = new JLabel("Hola q hace");
		etiTexto.setBounds(169, 35, 98, 34);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(10, 117, 89, 23);
		btnAzul.addActionListener(this);
		contentPane.add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(10, 163, 89, 23);
		btnRojo.addActionListener(this);
		contentPane.add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(10, 209, 89, 23);
		btnVerde.addActionListener(this);
		contentPane.add(btnVerde);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setBounds(169, 117, 98, 23);
		btnFondoAzul.addActionListener(this);
		contentPane.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setBounds(169, 163, 98, 23);
		btnFondoRojo.addActionListener(this);
		contentPane.add(btnFondoRojo);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setBounds(169, 209, 98, 23);
		btnFondoVerde.addActionListener(this);
		contentPane.add(btnFondoVerde);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(319, 117, 105, 23);
		btnTransparente.addActionListener(this);
		contentPane.add(btnTransparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(319, 163, 105, 23);
		btnOpaca.addActionListener(this);
		contentPane.add(btnOpaca);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btnAzul==e.getSource()) {
			etiTexto.setForeground(Color.BLUE);
		}
		if (btnRojo==e.getSource()) {
			etiTexto.setForeground(Color.RED);
		}
		if (btnVerde==e.getSource()) {
			etiTexto.setForeground(Color.GREEN);
		}
		if (btnFondoAzul==e.getSource()) {
			etiTexto.setBackground(Color.BLUE);
		}
		if (btnFondoAzul==e.getSource()) {
			etiTexto.setBackground(Color.RED);
		}
		if (btnFondoAzul==e.getSource()) {
			etiTexto.setBackground(Color.GREEN);
		}
		if (btnTransparente==e.getSource()) {
			etiTexto.setOpaque(false);
		}
		if (btnOpaca==e.getSource()) {
			etiTexto.setOpaque(true);
		}
	}
}