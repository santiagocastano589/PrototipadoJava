import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaTres extends JFrame implements KeyListener,ActionListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	JLabel etiTexto;
	private JButton btnVaciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTres frame = new VentanaTres();
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
	public VentanaTres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txtTexto = new JTextField();
		txtTexto.setBounds(71, 35, 293, 44);
		txtTexto.setColumns(10);
		txtTexto.addKeyListener(this);
		contentPane.add(txtTexto);
		
		
		etiTexto = new JLabel("");
		etiTexto.setForeground(new Color(51, 51, 255));
		etiTexto.setBackground(new Color(204, 204, 51));
		etiTexto.setBounds(44, 112, 354, 34);
		etiTexto.addKeyListener(this);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setBounds(154, 182, 107, 23);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==txtTexto) {
			etiTexto.setText("escibiendo");
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==txtTexto) {
			etiTexto.setText(txtTexto.getText());
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btnVaciar==e.getSource()) {
			txtTexto.setText(null);
			etiTexto.setText(null);
			
		}
		
	}

}
