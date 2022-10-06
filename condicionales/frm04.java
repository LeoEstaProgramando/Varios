package condicionales;

import java.awt.BorderLayout;
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

public class frm04 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JLabel lblN1, lblN2, lblN3, lblPromedio;
	JTextField txtN1, txtN2, txtN3, txtPromedio;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 270, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(null);

		lblN1 = new JLabel("N1 :");
		lblN1.setBounds(30,30,60,30);
		contentPane.add(lblN1);

		lblN2 = new JLabel("N2 :");
		lblN2.setBounds(30,65,60,30);
		contentPane.add(lblN2);

		lblN3 = new JLabel("N3 :");
		lblN3.setBounds(30,100,60,30);
		contentPane.add(lblN3);
	
		lblPromedio = new JLabel("Promedio :");
		lblPromedio.setBounds(30,135,80,30);
		contentPane.add(lblPromedio);
		
		txtN1 = new JTextField();
		txtN1.setBounds(120,30,80,30);
		txtN1.setMargin(new Insets(5,5,5,5));
		txtN1.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtN1);
	
		txtN2 = new JTextField();
		txtN2.setBounds(120,65,80,30);
		txtN2.setMargin(new Insets(5,5,5,5));
		txtN2.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtN2);
		
		txtN3 = new JTextField();
		txtN3.setBounds(120,100,80,30);
		txtN3.setMargin(new Insets(5,5,5,5));
		txtN3.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(txtN3);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(120,135,80,30);
		txtPromedio.setMargin(new Insets(5,5,5,5));
		txtPromedio.setHorizontalAlignment(JTextField.RIGHT);
		txtPromedio.setFocusable(false);
		contentPane.add(txtPromedio);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(85,180,100,30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener( new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
	}

	protected void btnCalcular_Click() {
		int N1 = Integer.parseInt( txtN1.getText() );
		int N2 = Integer.parseInt( txtN2.getText() );
		int N3 = Integer.parseInt( txtN3.getText() );
		
		if ( N3 > 10 ) N3 += 2;
		if ( N3 > 20 ) N3 = 20;
		
		double promedio = ( N1 + N2 + N3 ) / 3.0;
		
		DecimalFormat df = new DecimalFormat("###.00");
		txtPromedio.setText( df.format(promedio) );
	}

}