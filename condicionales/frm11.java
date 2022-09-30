package condicionales;

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
	
	JLabel lblTitulo, lblNumero, lblSigno;
	JTextField txtNumero, txtSigno;
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
		
		lblTitulo = new JLabel("PROMEDIO DE NÚMEROS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblNumero = new JLabel("Número: ");
		lblNumero.setBounds(30, 70, 120, 30);
		contentPane.add(lblNumero);
		
		lblSigno = new JLabel("Signo: ");
		lblSigno.setBounds(30, 110, 120, 30);
		contentPane.add(lblSigno);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(160, 70, 120, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(insets);
		contentPane.add(txtNumero);
		
		txtSigno = new JTextField();
		txtSigno.setEditable(false);
		txtSigno.setBounds(160, 110, 120, 30);
		txtSigno.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSigno.setMargin(insets);
		contentPane.add(txtSigno);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(300, 70, 120, 30);
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
		int numero = Integer.parseInt(txtNumero.getText());
		
		if (numero > 0) {
			txtSigno.setText("Positivo");
		} else if (numero < 0) {
			txtSigno.setText("Negativo");
		} else {
			txtSigno.setText("Nulo");
		}
		
	}

}
