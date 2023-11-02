import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VentanaCinco extends JFrame implements MouseListener{

	private JPanel contentPane;
	JLabel etiPal1;
	JLabel etiPal2;
	JLabel etiPal3;
	JLabel etiPal4;
	JLabel etiOcultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCinco frame = new VentanaCinco();
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
	public VentanaCinco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel("Uno");
		etiPal1.setBounds(50, 33, 46, 14);
		
		contentPane.add(etiPal1);
		
		etiPal3 = new JLabel("Tres");
		etiPal3.setBounds(242, 33, 46, 14);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("Cuatro");
		etiPal4.setBounds(320, 33, 46, 14);
		contentPane.add(etiPal4);
		
		etiPal2 = new JLabel("Dos");
		etiPal2.setBounds(140, 33, 46, 14);
		contentPane.add(etiPal2);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setBackground(Color.RED);
		etiOcultar.setBounds(103, 99, 168, 36);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
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
		if (etiOcultar==e.getSource()) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (etiOcultar==e.getSource()) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
		}
	}

}
