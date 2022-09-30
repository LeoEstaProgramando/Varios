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

import com.ibm.icu.text.DecimalFormat;

public class frm18 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblTitulo, lblDonacion, lblSalud, lblComedor, lblBolsa;
	JTextField txtDonacion, txtSalud, txtComedor, txtBolsa;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm18 frame = new frm18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("DISTRIBUCIÓN DE DONACIÓN");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblDonacion = new JLabel("Donación ($): ");
		lblDonacion.setBounds(30, 70, 120, 30);
		contentPane.add(lblDonacion);
		
		lblSalud = new JLabel("Centro de Salud: ");
		lblSalud.setBounds(30, 110, 120, 30);
		contentPane.add(lblSalud);
		
		lblComedor = new JLabel("Comedor de Niños: ");
		lblComedor.setBounds(30, 150, 120, 30);
		contentPane.add(lblComedor);
		
		lblBolsa = new JLabel("Bolsa Bursátil: ");
		lblBolsa.setBounds(30, 190, 120, 30);
		contentPane.add(lblBolsa);
				
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtDonacion = new JTextField();
		txtDonacion.setBounds(160, 70, 120, 30);
		txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDonacion.setMargin(insets);
		contentPane.add(txtDonacion);
		
		txtSalud = new JTextField();
		txtSalud.setEditable(false);
		txtSalud.setBounds(160, 110, 120, 30);
		txtSalud.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSalud.setMargin(insets);
		contentPane.add(txtSalud);
		
		txtComedor = new JTextField();
		txtComedor.setEditable(false);
		txtComedor.setBounds(160, 150, 120, 30);
		txtComedor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComedor.setMargin(insets);
		contentPane.add(txtComedor);
		
		txtBolsa = new JTextField();
		txtBolsa.setEditable(false);
		txtBolsa.setBounds(160, 190, 120, 30);
		txtBolsa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBolsa.setMargin(insets);
		contentPane.add(txtBolsa);
		
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
		double donacion = Double.parseDouble(txtDonacion.getText());
		double salud, comedor, bolsa = 0;
		
		if (donacion >= 10000) {
			salud = donacion * 0.30;
			comedor = donacion * 0.50;
			bolsa = donacion * 0.20;
		} else {
			salud = donacion * 0.25;
			comedor = donacion * 0.60;
			bolsa = donacion * 0.15;
		}
		
		DecimalFormat formatoDolar = new DecimalFormat("$ ###,###.00");
		
		txtSalud.setText(formatoDolar.format(salud));
		txtComedor.setText(formatoDolar.format(comedor));
		txtBolsa.setText(formatoDolar.format(bolsa));
	}

}
