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

public class frm13 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblTitulo, lblNumero, lblResultado;
	JTextField txtNumero, txtResultado;
	JButton btnCalcular;

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
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("¿CIFRAS CONSECUTIVAS?");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblNumero = new JLabel("Escriba un número: ");
		lblNumero.setBounds(30, 70, 120, 30);
		contentPane.add(lblNumero);
		
		lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(30, 110, 120, 30);
		contentPane.add(lblResultado);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(160, 70, 120, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(insets);
		contentPane.add(txtNumero);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(160, 110, 120, 30);
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setMargin(insets);
		contentPane.add(txtResultado);
		
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
		char cifra1 = txtNumero.getText().charAt(0);
		char cifra2 = txtNumero.getText().charAt(1);
		char cifra3 = txtNumero.getText().charAt(2);
		
		boolean condicion1 = cifra2 == cifra1 + 1 && cifra2 == cifra3 - 1;
		boolean condicion2 = cifra2 == cifra1 - 1 && cifra2 == cifra3 + 1;
		
		if (condicion1 || condicion2) {
			txtResultado.setText("Verdadero");
		} else {
			txtResultado.setText("Falso");
		}
	}
	
}