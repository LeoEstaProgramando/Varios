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

public class frm20 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JLabel lblDinero, lblBilletes200, lblBilletes100, lblBilletes50, lblBilletes20, lblBilletes10, lblMonedas5, lblMonedas2, lblMonedas1;
	JTextField txtDinero, txtBilletes200, txtBilletes100, txtBilletes50, txtBilletes20, txtBilletes10, txtMonedas5, txtMonedas2, txtMonedas1;
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
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblDinero = new JLabel("Dinero a retirar (S/): ");
		lblDinero.setBounds(30, 30, 120, 30);
		contentPane.add(lblDinero);
		
		lblBilletes200 = new JLabel("Billetes de 200: ");
		lblBilletes200.setBounds(30, 70, 120, 30);
		contentPane.add(lblBilletes200);
		
		lblBilletes100 = new JLabel("Billetes de 100: ");
		lblBilletes100.setBounds(30, 110, 120, 30);
		contentPane.add(lblBilletes100);
		
		lblBilletes50 = new JLabel("Billetes de 50: ");
		lblBilletes50.setBounds(30, 150, 120, 30);
		contentPane.add(lblBilletes50);
		
		lblBilletes20 = new JLabel("Billetes de 20: ");
		lblBilletes20.setBounds(30, 190, 120, 30);
		contentPane.add(lblBilletes20);
		
		lblBilletes10 = new JLabel("Billetes de 10: ");
		lblBilletes10.setBounds(30, 230, 120, 30);
		contentPane.add(lblBilletes10);
		
		lblMonedas5 = new JLabel("Monedas de 5: ");
		lblMonedas5.setBounds(30, 270, 120, 30);
		contentPane.add(lblMonedas5);
		
		lblMonedas2 = new JLabel("Monedas de 2: ");
		lblMonedas2.setBounds(30, 310, 120, 30);
		contentPane.add(lblMonedas2);
		
		lblMonedas1 = new JLabel("Monedas de 1: ");
		lblMonedas1.setBounds(30, 350, 120, 30);
		contentPane.add(lblMonedas1);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtDinero = new JTextField();
		txtDinero.setBounds(160, 30, 100, 30);
		txtDinero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDinero.setMargin(insets);
		contentPane.add(txtDinero);
		
		txtBilletes200 = new JTextField();
		txtBilletes200.setEditable(false);
		txtBilletes200.setBounds(160, 70, 100, 30);
		txtBilletes200.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBilletes200.setMargin(insets);
		contentPane.add(txtBilletes200);
		
		txtBilletes100 = new JTextField();
		txtBilletes100.setEditable(false);
		txtBilletes100.setBounds(160, 110, 100, 30);
		txtBilletes100.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBilletes100.setMargin(insets);
		contentPane.add(txtBilletes100);
		
		txtBilletes50 = new JTextField();
		txtBilletes50.setEditable(false);
		txtBilletes50.setBounds(160, 150, 100, 30);
		txtBilletes50.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBilletes50.setMargin(insets);
		contentPane.add(txtBilletes50);
		
		txtBilletes20 = new JTextField();
		txtBilletes20.setEditable(false);
		txtBilletes20.setBounds(160, 190, 100, 30);
		txtBilletes20.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBilletes20.setMargin(insets);
		contentPane.add(txtBilletes20);
		
		txtBilletes10 = new JTextField();
		txtBilletes10.setEditable(false);
		txtBilletes10.setBounds(160, 230, 100, 30);
		txtBilletes10.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBilletes10.setMargin(insets);
		contentPane.add(txtBilletes10);
		
		txtMonedas5 = new JTextField();
		txtMonedas5.setEditable(false);
		txtMonedas5.setBounds(160, 270, 100, 30);
		txtMonedas5.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMonedas5.setMargin(insets);
		contentPane.add(txtMonedas5);
		
		txtMonedas2 = new JTextField();
		txtMonedas2.setEditable(false);
		txtMonedas2.setBounds(160, 310, 100, 30);
		txtMonedas2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMonedas2.setMargin(insets);
		contentPane.add(txtMonedas2);
		
		txtMonedas1 = new JTextField();
		txtMonedas1.setEditable(false);
		txtMonedas1.setBounds(160, 350, 100, 30);
		txtMonedas1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMonedas1.setMargin(insets);
		contentPane.add(txtMonedas1);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(270, 110, 130, 190);
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
		int dinero = Integer.parseInt(txtDinero.getText());
		
		int billetes200 = dinero / 200;
		int billetes100 = (dinero % 200) / 100;
		int billetes50 = ((dinero % 200) % 100) / 50;
		int billetes20 = (((dinero % 200) % 100) % 50) / 20;
		int billetes10 = ((((dinero % 200) % 100) % 50) % 20) / 10;
		int monedas5 = (((((dinero % 200) % 100) % 50) % 20) % 10) / 5;
		int monedas2 = ((((((dinero % 200) % 100) % 50) % 20) % 10) % 5) / 2;
		int monedas1 = (((((((dinero % 200) % 100) % 50) % 20) % 10) % 5) % 2) / 1;
		
		txtBilletes200.setText(Integer.toString(billetes200));
		txtBilletes100.setText(Integer.toString(billetes100));
		txtBilletes50.setText(Integer.toString(billetes50));
		txtBilletes20.setText(Integer.toString(billetes20));
		txtBilletes10.setText(Integer.toString(billetes10));
		txtMonedas5.setText(Integer.toString(monedas5));
		txtMonedas2.setText(Integer.toString(monedas2));
		txtMonedas1.setText(Integer.toString(monedas1));
		
	}
}
