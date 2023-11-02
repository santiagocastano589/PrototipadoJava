import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaOcho extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField txtPrimerTrimestre;
	private static JTextField txtSegundoTrimestre;
	private static JTextField txtTercerTrimestre;
	private JLabel lblPrimero;
	private JLabel lblSegundo;
	JLabel lblTercero;
	private static JLabel etiNotaFinal;
	private static JLabel etiResultado;
	JButton btnCalcular;
	private JButton btnVaciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOcho frame = new VentanaOcho();
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
	public VentanaOcho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPrimero = new JLabel("Primer Trimestre");
		lblPrimero.setBounds(10, 50, 102, 14);
		contentPane.add(lblPrimero);
		
		lblSegundo = new JLabel("Segundo Trimestre");
		lblSegundo.setBounds(10, 81, 102, 14);
		contentPane.add(lblSegundo);
		
		lblTercero = new JLabel("Tercer Trimestre");
		lblTercero.setBounds(10, 112, 102, 14);
		contentPane.add(lblTercero);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(122, 47, 86, 20);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setBounds(122, 78, 86, 20);
		contentPane.add(txtSegundoTrimestre);
		txtSegundoTrimestre.setColumns(10);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setBounds(122, 109, 86, 20);
		contentPane.add(txtTercerTrimestre);
		txtTercerTrimestre.setColumns(10);
		
		etiNotaFinal = new JLabel("Nota Final: ");
		etiNotaFinal.setBounds(281, 49, 198, 17);
		contentPane.add(etiNotaFinal);
		
		etiResultado = new JLabel("Resultado: ");
		etiResultado.setBounds(281, 80, 198, 17);
		contentPane.add(etiResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(59, 171, 143, 23);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setBounds(274, 171, 136, 23);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
		

	}
	public static void calcular() {
		double resultado,nota1,nota2,nota3;
		nota1=Double.parseDouble(txtPrimerTrimestre.getText());
		nota2=Double.parseDouble(txtSegundoTrimestre.getText());
		nota3=Double.parseDouble(txtTercerTrimestre.getText());
		resultado=(nota1+nota2+nota3)/3;
		if(resultado>5){
			etiNotaFinal.setText("Nota Final: "+resultado);
			etiResultado.setText("Resultado: APROBADO");
			etiNotaFinal.setForeground(Color.BLACK);
			etiResultado.setForeground(Color.BLACK);
		}else{
			etiNotaFinal.setText("Nota Final: "+resultado);
			etiResultado.setText("Resultado: SUSPENSO");
			etiNotaFinal.setForeground(Color.RED);
			etiResultado.setForeground(Color.RED);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btnCalcular==e.getSource()) {
			calcular();
		}
		if (btnVaciar==e.getSource()) {
			txtPrimerTrimestre.setText(null);
			txtSegundoTrimestre.setText(null);
			txtTercerTrimestre.setText(null);
			etiNotaFinal.setText("Nota Final: ");
			etiResultado.setText("Resultado: ");
			etiNotaFinal.setForeground(Color.BLACK);
			etiResultado.setForeground(Color.BLACK);
		}
		
	}
}