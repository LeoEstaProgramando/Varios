package repetitivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm14 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVariablen;
	private JTextField txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txaEjercicio = new JTextArea();
		txaEjercicio.setLineWrap(true);
		txaEjercicio.setText("Un número es primo si tiene únicamente dos divisores: 1 y el mismo. Desarrolle el programa.");
		txaEjercicio.setBounds(17, 28, 393, 42);
		contentPane.add(txaEjercicio);
		
		JLabel lblVariablen = new JLabel("Ingrese número: ");
		lblVariablen.setBounds(81, 92, 104, 16);
		contentPane.add(lblVariablen);
		
		txtVariablen = new JTextField();
		txtVariablen.setHorizontalAlignment(SwingConstants.CENTER);
		txtVariablen.setBounds(210, 89, 104, 20);
		contentPane.add(txtVariablen);
		txtVariablen.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(111, 196, 158, 22);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(109, 172, 158, 14);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(141, 133, 89, 23);
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
	}

	protected void btnCalcular_Click() {
		int divisores = 0;
		int n = Integer.parseInt(txtVariablen.getText());
		
		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				divisores += 1;
				if (divisores > 2) {
					txtResultado.setText("No es primo");
					break;
				}
			}
		}
		
		if (divisores == 2) { txtResultado.setText("Es primo");};
	}
}
