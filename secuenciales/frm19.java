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

public class frm19 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblSueldoBasico, lblComision, lblSueldoBruto, lblDescuento, lblSueldoNeto;
	JTextField txtSueldoBasico, txtComision, txtSueldoBruto, txtDescuento, txtSueldoNeto;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblSueldoBasico = new JLabel("Sueldo Básico (S/): ");
		lblSueldoBasico.setBounds(30, 30, 120, 30);
		contentPane.add(lblSueldoBasico);
		
		lblComision = new JLabel("(+) Comisión (9%): ");
		lblComision.setBounds(30, 70, 120, 30);
		contentPane.add(lblComision);
		
		lblSueldoBruto = new JLabel("Sueldo Bruto (S/): ");
		lblSueldoBruto.setBounds(30, 110, 120, 30);
		contentPane.add(lblSueldoBruto);
		
		lblDescuento = new JLabel("(-) Descuento (11%): ");
		lblDescuento.setBounds(30, 150, 120, 30);
		contentPane.add(lblDescuento);
		
		lblSueldoNeto = new JLabel("Sueldo Neto (S/): ");
		lblSueldoNeto.setBounds(30, 190, 120, 30);
		contentPane.add(lblSueldoNeto);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtSueldoBasico = new JTextField();
		txtSueldoBasico.setBounds(160, 30, 100, 30);
		txtSueldoBasico.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoBasico.setMargin(insets);
		contentPane.add(txtSueldoBasico);
		
		txtComision = new JTextField();
		txtComision.setEditable(false);
		txtComision.setBounds(160, 70, 100, 30);
		txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComision.setMargin(insets);
		contentPane.add(txtComision);
		
		txtSueldoBruto = new JTextField();
		txtSueldoBruto.setEditable(false);
		txtSueldoBruto.setBounds(160, 110, 100, 30);
		txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoBruto.setMargin(insets);
		contentPane.add(txtSueldoBruto);
		
		txtDescuento = new JTextField();
		txtDescuento.setEditable(false);
		txtDescuento.setBounds(160, 150, 100, 30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setMargin(insets);
		contentPane.add(txtDescuento);
		
		txtSueldoNeto = new JTextField();
		txtSueldoNeto.setEditable(false);
		txtSueldoNeto.setBounds(160, 190, 100, 30);
		txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoNeto.setMargin(insets);
		contentPane.add(txtSueldoNeto);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(270, 30, 130, 190);
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
		double sueldoBasico = Double.parseDouble(txtSueldoBasico.getText());
		
		double comision = sueldoBasico * 9 / 100;
		double sueldoBruto = sueldoBasico + comision;
		double descuento = sueldoBruto * 11 / 100;
		double sueldoNeto = sueldoBruto - descuento;
		
		DecimalFormat formatoDecimal = new DecimalFormat("###,###.00");
		
		txtComision.setText(formatoDecimal.format(comision));
		txtSueldoBruto.setText(formatoDecimal.format(sueldoBruto));
		txtDescuento.setText(formatoDecimal.format(descuento));
		txtSueldoNeto.setText(formatoDecimal.format(sueldoNeto));
		
	}

}
