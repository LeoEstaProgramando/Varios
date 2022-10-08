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

public class frm13 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVariablen;
	private JTextField txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txaEjercicio = new JTextArea();
		txaEjercicio.setLineWrap(true);
		txaEjercicio.setText("Desarrolle el programa que halle la suma de todos los números enteros múltiplos de 3, pero no de 5, que sean menores o iguales a n.");
		txaEjercicio.setBounds(17, 28, 393, 42);
		contentPane.add(txaEjercicio);
		
		JLabel lblVariablen = new JLabel("variable \"n\" = ");
		lblVariablen.setBounds(107, 92, 78, 16);
		contentPane.add(lblVariablen);
		
		txtVariablen = new JTextField();
		txtVariablen.setHorizontalAlignment(SwingConstants.CENTER);
		txtVariablen.setBounds(210, 89, 86, 20);
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
		int suma = 0;
		int n = Integer.parseInt(txtVariablen.getText());
		
		for (int i = 0; i < n + 1; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				suma += i;
			}
		}
		
		txtResultado.setText(Integer.toString(suma));
	}
}
