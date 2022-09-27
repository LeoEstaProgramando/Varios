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

import com.ibm.icu.text.DecimalFormat;

public class frm14 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblTitulo, lblNum1, lblNum2, lblNum3, lblNum4, lblNum5, lblProm;
	JTextField txtNum1, txtNum2, txtNum3, txtNum4, txtNum5, txtProm;
	JButton btnCalcular;

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
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("PROMEDIO DE NÚMEROS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblNum1 = new JLabel("Primer número: ");
		lblNum1.setBounds(30, 70, 120, 30);
		contentPane.add(lblNum1);
		
		lblNum2 = new JLabel("Segundo número: ");
		lblNum2.setBounds(30, 110, 120, 30);
		contentPane.add(lblNum2);
		
		lblNum3 = new JLabel("Tercer número: ");
		lblNum3.setBounds(30, 150, 120, 30);
		contentPane.add(lblNum3);
		
		lblNum4 = new JLabel("Cuarto número: ");
		lblNum4.setBounds(30, 190, 120, 30);
		contentPane.add(lblNum4);
		
		lblNum5 = new JLabel("Quinto número: ");
		lblNum5.setBounds(30, 230, 120, 30);
		contentPane.add(lblNum5);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(160, 70, 120, 30);
		txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum1.setMargin(insets);
		contentPane.add(txtNum1);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(160, 110, 120, 30);
		txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum2.setMargin(insets);
		contentPane.add(txtNum2);
		
		txtNum3 = new JTextField();
		txtNum3.setBounds(160, 150, 120, 30);
		txtNum3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum3.setMargin(insets);
		contentPane.add(txtNum3);
		
		txtNum4 = new JTextField();
		txtNum4.setBounds(160, 190, 120, 30);
		txtNum4.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum4.setMargin(insets);
		contentPane.add(txtNum4);
		
		txtNum5 = new JTextField();
		txtNum5.setBounds(160, 230, 120, 30);
		txtNum5.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum5.setMargin(insets);
		contentPane.add(txtNum5);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(300, 70, 120, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		lblProm = new JLabel("Promedio");
		lblProm.setHorizontalAlignment(SwingConstants.CENTER);
		lblProm.setBounds(300, 190, 120, 30);
		contentPane.add(lblProm);	
		
		txtProm = new JTextField();
		txtProm.setEditable(false);
		txtProm.setBounds(300, 230, 120, 30);
		txtProm.setHorizontalAlignment(SwingConstants.RIGHT);
		txtProm.setMargin(insets);
		contentPane.add(txtProm);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
		
		
	}

	protected void btnCalcular_Click() {
		double num1 = Double.parseDouble(txtNum1.getText());
		double num2 = Double.parseDouble(txtNum2.getText());
		double num3 = Double.parseDouble(txtNum3.getText());
		double num4 = Double.parseDouble(txtNum4.getText());
		double num5 = Double.parseDouble(txtNum5.getText());
		
		double promedio = (num1+ num2 + num3 + num4 + num5) / 5;
		
		DecimalFormat formatoDecimal = new DecimalFormat("##.00");
		
		txtProm.setText(formatoDecimal.format(promedio));

	}

}
