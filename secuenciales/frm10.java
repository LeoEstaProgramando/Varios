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
import javax.swing.border.EmptyBorder;

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JLabel lblNumero, lblInvertido;
	JTextField txtNumero, txtInvertido;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm10() {
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
		
		lblInvertido = new JLabel("Invertido : ");
		lblInvertido.setBounds(30, 70, 70, 30);
		contentPane.add(lblInvertido);
		
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 30, 80, 30);
		txtNumero.setHorizontalAlignment(JTextField.RIGHT);;
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtNumero);
		
		txtInvertido = new JTextField();
		txtInvertido.setBounds(100, 70, 80, 30);
		txtInvertido.setHorizontalAlignment(JTextField.RIGHT);;
		txtInvertido.setMargin(new Insets(5, 5, 5, 5));
		txtInvertido.setFocusable(false);
		contentPane.add(txtInvertido);
		
		btnCalcular = new JButton("Calcular ");
		btnCalcular.setBounds(60, 120, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	private void btnCalcular_Click() {
		int numero = Integer.parseInt(txtNumero.getText());
		
		String c1 = Integer.toString(numero / 1000);
		String c2 = Integer.toString((numero % 1000) / 100);
		String c3 = Integer.toString(((numero % 1000) % 100) / 10);
		String c4 = Integer.toString(((numero % 1000) % 100) % 10);
		
		txtInvertido.setText(c4 + c3 + c2 + c1);
			
		}				
	}



	
		
