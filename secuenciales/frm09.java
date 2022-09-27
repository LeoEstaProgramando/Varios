package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JLabel lblNumero, lblSuma;
	JTextField txtNumero, txtSuma;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblNumero = new JLabel("Numero : ");
		lblNumero.setBounds(30, 30, 70, 30);
		contentPane.add(lblNumero);
		
		lblSuma = new JLabel("Suma : ");
		lblSuma.setBounds(30, 70, 70, 30);
		contentPane.add(lblSuma);
		
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 80, 30);
		txtNumero.setHorizontalAlignment(JTextField.RIGHT);;
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtNumero);
		
		txtSuma = new JTextField();
		txtSuma.setBounds(100, 70, 80, 30);
		txtSuma.setHorizontalAlignment(JTextField.RIGHT);;
		txtSuma.setMargin(new Insets(5, 5, 5, 5));
		txtSuma.setFocusable(false);
		contentPane.add(txtSuma);
		
		btnCalcular = new JButton("Calcular ");
		btnCalcular.setBounds(60, 120, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	private void btnCalcular_Click() {
		int numero = Integer.parseInt(txtNumero.getText() );
		
		int c1 = numero / 1000;
		int c2 = (numero % 1000) / 100;
		int c3 = ( (numero % 1000) % 100) / 10;
		int c4 = numero % 10;
		int suma = (c1 + c2 + c3 + c4);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtSuma.setText( df.format(suma) );
	}

}
