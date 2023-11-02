import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
public class VentanaSeis extends JFrame implements ActionListener,MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiNombre;
	JButton btnEsquina;
	JButton btnCentro;
	JButton btnAgrandar;
	JButton btnAchicar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSeis frame = new VentanaSeis();
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
	public VentanaSeis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Santiago");
		etiNombre.setBackground(Color.RED);
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Showcard Gothic", Font.PLAIN, 23));
		etiNombre.setBounds(127, 41, 164, 38);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(43, 131, 117, 23);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(261, 131, 117, 23);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(43, 199, 117, 23);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(261, 199, 117, 23);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		contentPane.add(btnAchicar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btnEsquina==e.getSource()) {
			etiNombre.setLocation(0, 0);
		}
		if (btnCentro==e.getSource()) {
			etiNombre.setLocation(130, 115);
		}
		if (btnAgrandar==e.getSource()) {
			etiNombre.setSize(270, 70);
		}
		if (btnAchicar==e.getSource()) {
			etiNombre.setSize(150, 25);
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
		if (btnAchicar==e.getSource()) {
			btnAchicar.setSize(150, 35);
		}
		if (btnAgrandar==e.getSource()) {
			btnAgrandar.setSize(150, 35);
		}
		if (btnEsquina==e.getSource()) {
			btnEsquina.setSize(150, 35);
		}
		if (btnCentro==e.getSource()) {
			btnCentro.setSize(150, 35);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (btnAchicar==e.getSource()) {
			btnAchicar.setSize(117, 23);
		}
		if (btnAgrandar==e.getSource()) {
			btnAgrandar.setSize(117, 23);
		}
		if (btnEsquina==e.getSource()) {
			btnEsquina.setSize(117, 23);
		}
		if (btnCentro==e.getSource()) {
			btnCentro.setSize(117, 23);
		}
	}
}