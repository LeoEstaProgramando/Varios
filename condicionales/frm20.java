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

public class frm20 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblTitulo, lblNumberA, lblNumberB, lblNumberC, lblResultado;
	JTextField txtNumberA, txtNumberB, txtNumberC, txtResultado;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("ORDEN DE NÚMEROS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblNumberA = new JLabel("Primer número: ");
		lblNumberA.setBounds(30, 70, 120, 30);
		contentPane.add(lblNumberA);
		
		lblNumberB = new JLabel("Segundo número: ");
		lblNumberB.setBounds(30, 110, 120, 30);
		contentPane.add(lblNumberB);
		
		lblNumberC = new JLabel("Tercer número: ");
		lblNumberC.setBounds(30, 150, 120, 30);
		contentPane.add(lblNumberC);
		
		lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(30, 190, 120, 30);
		contentPane.add(lblResultado);
						
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtNumberA = new JTextField();
		txtNumberA.setBounds(160, 70, 120, 30);
		txtNumberA.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumberA.setMargin(insets);
		contentPane.add(txtNumberA);
		
		txtNumberB = new JTextField();
		txtNumberB.setBounds(160, 110, 120, 30);
		txtNumberB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumberB.setMargin(insets);
		contentPane.add(txtNumberB);
		
		txtNumberC = new JTextField();
		txtNumberC.setBounds(160, 150, 120, 30);
		txtNumberC.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumberC.setMargin(insets);
		contentPane.add(txtNumberC);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(160, 190, 120, 30);
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setMargin(insets);
		contentPane.add(txtResultado);
				
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(300, 110, 120, 30);
		btnCalcular.setMnemonic('c');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
	}

	protected void btnCalcular_Click() {
		int a = Integer.parseInt(txtNumberA.getText());
		int b = Integer.parseInt(txtNumberB.getText());
		int c = Integer.parseInt(txtNumberC.getText());
		String resultado = null;
		
		if (a < b && b < c) {
			resultado = "Ascendente";
		} else if (a > b && b > c) {
			resultado = "Descendente";
		} else {
			resultado = "Desordenado";
		}
		
		txtResultado.setText(resultado);
	}

}
