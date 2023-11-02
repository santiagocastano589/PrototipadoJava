import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaDiez extends JFrame implements MouseListener,ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiUno;
	JLabel etiDos;
	JLabel etiTres;
	JLabel etiCuatro;
	JLabel etiCinco;
	JLabel etiSeis;
	JLabel etiSiete;
	JLabel etiOcho;
	JLabel etiNueve;
	JLabel etiDiez;
	private JTextField txtNumero;
	JButton btnBorrar;

	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDiez frame = new VentanaDiez();
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
	public VentanaDiez() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiUno = new JLabel("0");
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setBounds(82, 75, 46, 14);
		etiUno.addMouseListener(this);
		contentPane.add(etiUno);
		
		etiDos = new JLabel("1");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setBounds(138, 75, 46, 14);
		etiDos.addMouseListener(this);
		contentPane.add(etiDos);
		
		etiTres = new JLabel("2");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setBounds(194, 75, 46, 14);
		etiTres.addMouseListener(this);
		contentPane.add(etiTres);
		
		etiCuatro = new JLabel("3");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setBounds(82, 102, 46, 14);
		contentPane.add(etiCuatro);
		
		etiCinco = new JLabel("4");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setBounds(138, 102, 46, 14);
		etiCinco.addMouseListener(this);
		contentPane.add(etiCinco);
		
		etiSeis = new JLabel("5");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setBounds(194, 102, 46, 14);
		etiSeis.addMouseListener(this);
		contentPane.add(etiSeis);
		
		etiSiete = new JLabel("6");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setBounds(82, 135, 46, 14);
		etiSiete.addMouseListener(this);
		contentPane.add(etiSiete);
		
		etiOcho = new JLabel("7");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setBounds(138, 135, 46, 14);
		etiOcho.addMouseListener(this);
		contentPane.add(etiOcho);
		
		etiNueve = new JLabel("8");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setBounds(194, 135, 46, 14);
		etiNueve.addMouseListener(this);
		contentPane.add(etiNueve);
		
		etiDiez = new JLabel("9");
		etiDiez.setHorizontalAlignment(SwingConstants.CENTER);
		etiDiez.setBounds(138, 163, 46, 14);
		etiDiez.addMouseListener(this);
		contentPane.add(etiDiez);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(82, 23, 158, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(100, 201, 121, 23);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btnBorrar==e.getSource()) {
			txtNumero.setText(null);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (etiUno==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiUno.getText());
		}
		if (etiDos==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiDos.getText());
		}
		if (etiTres==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiTres.getText());
		}
		if (etiCuatro==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiCuatro.getText());
		}
		if (etiCinco==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiCinco.getText());
		}
		if (etiSeis==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiSeis.getText());
		}
		if (etiSiete==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiSiete.getText());
		}
		if (etiOcho==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiOcho.getText());
		}
		if (etiNueve==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiNueve.getText());
		}
		if (etiDiez==e.getSource()) {
			txtNumero.setText(txtNumero.getText()+etiDiez.getText());
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}