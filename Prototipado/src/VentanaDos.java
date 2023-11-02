import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaDos extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel etiTexto2;
	private JButton btnTraspasa1;
	JLabel etiTexto1;
	JButton btnTraspasa2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDos frame = new VentanaDos();
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
	public VentanaDos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(10, 34, 445, 64);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setBackground(new Color(204, 204, 51));
		etiTexto1.setBounds(50, 126, 354, 34);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setBackground(new Color(51, 255, 204));
		etiTexto2.setBounds(50, 171, 354, 34);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setBounds(40, 216, 155, 23);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setBounds(278, 216, 126, 23);
		btnTraspasa2.addActionListener(this);
		contentPane.add(btnTraspasa2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnTraspasa1==e.getSource()) {
			etiTexto1.setText(txtTexto.getText());
		}
		if (btnTraspasa2==e.getSource()) {
			etiTexto2.setText(txtTexto.getText());
		}
		
	}
}
