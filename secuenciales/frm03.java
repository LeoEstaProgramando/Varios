package secuenciales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ibm.icu.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class frm03 extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum1, txtNum2, txtResultado;
	private JLabel lblNum1, lblNum2, lblResultado;
	private JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{137, 151, 0};
		gbl_contentPane.rowHeights = new int[]{20, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNum1 = new JLabel("Primer número");
		GridBagConstraints gbc_num1 = new GridBagConstraints();
		gbc_num1.anchor = GridBagConstraints.WEST;
		gbc_num1.insets = new Insets(0, 0, 5, 5);
		gbc_num1.gridx = 0;
		gbc_num1.gridy = 0;
		contentPane.add(lblNum1, gbc_num1);
		
		txtNum1 = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(txtNum1, gbc_textField);
		txtNum1.setColumns(10);
		
		lblNum2 = new JLabel("Segundo número");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNum2, gbc_lblNewLabel);
		
		txtNum2 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPane.add(txtNum2, gbc_textField_1);
		txtNum2.setColumns(10);
		
		lblResultado = new JLabel("Resultado");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.anchor = GridBagConstraints.WEST;
		gbc_lblResultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblResultado.gridx = 0;
		gbc_lblResultado.gridy = 2;
		contentPane.add(lblResultado, gbc_lblResultado);
		
		txtResultado = new JTextField();
		GridBagConstraints gbc_textResultado = new GridBagConstraints();
		gbc_textResultado.insets = new Insets(0, 0, 5, 0);
		gbc_textResultado.gridx = 1;
		gbc_textResultado.gridy = 2;
		contentPane.add(txtResultado, gbc_textResultado);
		txtResultado.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnCalcular, gbc_btnNewButton);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
	}
	
	private void btnCalcular_Click() {
		int num1 = Integer.parseInt(txtNum1.getText());
		int num2 = Integer.parseInt(txtNum2.getText());
		int total = num1 + num2;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtResultado.setText(df.format(total));
		
	}
}
