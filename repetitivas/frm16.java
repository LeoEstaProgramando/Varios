package repetitivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm16 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEntrada;
	private JTextField txtResultado;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txaEjercicio = new JTextArea();
		txaEjercicio.setLineWrap(true);
		txaEjercicio.setText("Desarrolle el método que invierta una cadena de texto.");
		txaEjercicio.setBounds(10, 11, 414, 55);
		contentPane.add(txaEjercicio);
		
		JLabel lblEntrada = new JLabel("Ingrese un texto:");
		lblEntrada.setBounds(44, 77, 116, 21);
		contentPane.add(lblEntrada);
		
		txtEntrada = new JTextField();
		txtEntrada.setBounds(184, 77, 190, 21);
		contentPane.add(txtEntrada);
		txtEntrada.setColumns(10);
		
		JButton btnInvertir = new JButton("Invertir");
		btnInvertir.setBounds(116, 109, 116, 30);
		contentPane.add(btnInvertir);
		
		btnInvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnInvertir_click();
			}
		});
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(44, 150, 116, 31);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(184, 151, 190, 30);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}

	protected void btnInvertir_click() {
		String texto = txtEntrada.getText();
		String reverse = "";
		
		for (int i = texto.length() - 1; i >= 0; i--) {
			reverse = reverse + texto.charAt(i);
		}
		
		txtResultado.setText(reverse);
	}
}
