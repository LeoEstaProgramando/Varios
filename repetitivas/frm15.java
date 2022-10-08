package repetitivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm15 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEntrada;
	private JTextField txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txaEjercicio = new JTextArea();
		txaEjercicio.setEditable(false);
		txaEjercicio.setFont(new Font("Arial", Font.PLAIN, 13));
		txaEjercicio.setLineWrap(true);
		txaEjercicio.setText("Desarrolle los métodos que convierta una cadena de texto a Mayúsculas y/o Minúsculas.");
		txaEjercicio.setBounds(24, 11, 382, 49);
		contentPane.add(txaEjercicio);
		
		JLabel lblEntrada = new JLabel("Ingrese texto:");
		lblEntrada.setBounds(24, 71, 106, 14);
		contentPane.add(lblEntrada);
		
		txtEntrada = new JTextField();
		txtEntrada.setBounds(147, 71, 224, 20);
		contentPane.add(txtEntrada);
		txtEntrada.setColumns(10);
		
		JLabel lblProceso = new JLabel("Convertir a:");
		lblProceso.setBounds(24, 101, 106, 24);
		contentPane.add(lblProceso);
		
		JButton btnMayus = new JButton("Mayúscula");
		btnMayus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMayus_Click();
			}
		});
		
		btnMayus.setBounds(147, 102, 106, 23);
		contentPane.add(btnMayus);
		
		JButton btnMinus = new JButton("Minúscula");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMinus_Click();
			}
		});
		
		btnMinus.setBounds(263, 101, 108, 24);
		contentPane.add(btnMinus);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(24, 150, 106, 31);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(147, 147, 224, 34);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}

	protected void btnMayus_Click() {
		
		String entrada = txtEntrada.getText();
		
		String mayusc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String minusc = "abcdefghijklmnñopqrstuvwxyz";
		
		char[] resultado = new char[entrada.length()];
		
		for (int i = 0; i < entrada.length(); i++) {
			if (mayusc.contains(String.valueOf(entrada.charAt(i)))) {
				resultado[i] = entrada.charAt(i);
			} else if (!mayusc.contains(String.valueOf(entrada.charAt(i))) && !minusc.contains(String.valueOf(entrada.charAt(i)))) {
				resultado[i] = entrada.charAt(i);
			} else {
				int conversion = minusc.indexOf(entrada.charAt(i));
				char proceso = mayusc.charAt(conversion);
				resultado[i] = proceso;
			}
		}
		
		txtResultado.setText(String.valueOf(resultado));
	}

	protected void btnMinus_Click() {
		
		String entrada = txtEntrada.getText();
		
		String mayusc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String minusc = "abcdefghijklmnñopqrstuvwxyz";
		
		char[] resultado = new char[entrada.length()];
		
		for (int i = 0; i < entrada.length(); i++) {
			if (minusc.contains(String.valueOf(entrada.charAt(i)))) {
				resultado[i] = entrada.charAt(i);
			} else if (!mayusc.contains(String.valueOf(entrada.charAt(i))) && !minusc.contains(String.valueOf(entrada.charAt(i)))) {
				resultado[i] = entrada.charAt(i);
			} else {
				int conversion = mayusc.indexOf(entrada.charAt(i));
				char proceso = minusc.charAt(conversion);
				resultado[i] = proceso;
			}
		}
		
		txtResultado.setText(String.valueOf(resultado));
	}
		
}
