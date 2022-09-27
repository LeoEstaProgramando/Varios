package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm11 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblTitulo, lblEntrada, lblResultado;
	JTextField txtEntrada1, txtEntrada2, txtResultado1, txtResultado2;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("INTERCAMBIO DE CIFRAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblEntrada = new JLabel("Entradas");
		lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrada.setBounds(30, 70, 120, 30);
		contentPane.add(lblEntrada);
		
		lblResultado = new JLabel("Resultados");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(290, 70, 120, 30);
		contentPane.add(lblResultado);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtEntrada1 = new JTextField();
		txtEntrada1.setBounds(30, 110, 120, 30);
		txtEntrada1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEntrada1.setMargin(insets);
		contentPane.add(txtEntrada1);
		
		txtEntrada2 = new JTextField();
		txtEntrada2.setBounds(30, 150, 120, 30);
		txtEntrada2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEntrada2.setMargin(insets);
		contentPane.add(txtEntrada2);
		
		txtResultado1 = new JTextField();
		txtResultado1.setEditable(false);
		txtResultado1.setBounds(290, 110, 120, 30);
		txtResultado1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado1.setMargin(insets);
		contentPane.add(txtResultado1);
		
		txtResultado2 = new JTextField();
		txtResultado2.setEditable(false);
		txtResultado2.setBounds(290, 150, 120, 30);
		txtResultado2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado2.setMargin(insets);
		contentPane.add(txtResultado2);
		
		btnCalcular = new JButton("Change!");
		btnCalcular.setBounds(160, 110, 120, 70);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
		
	}

	protected void btnCalcular_Click() {
		int num1 = Integer.parseInt(txtEntrada1.getText());
		int num2 = Integer.parseInt(txtEntrada2.getText());
		
		String num1cifra1 = Integer.toString(num1 / 100);
		String num1cifra2 = Integer.toString((num1 % 100) / 10);
		String num1cifra3 = Integer.toString((num1 % 100) % 10);
		
		String num2cifra1 = Integer.toString(num2 / 100);
		String num2cifra2 = Integer.toString((num2 % 100) / 10);
		String num2cifra3 = Integer.toString((num2 % 100) % 10);
		
		String resultado1 = num2cifra3 + num1cifra2 + num2cifra1;
		String resultado2 = num1cifra3 + num2cifra2 + num1cifra1;
		
		txtResultado1.setText(resultado1);
		txtResultado2.setText(resultado2);
		
	}

}
