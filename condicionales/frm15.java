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

public class frm15 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblTitulo, lblVentas, lblSueldoBasico, lblComision, lblSueldoBruto, lblDescuento, lblSueldoNeto;
	JTextField txtVentas, txtSueldoBasico, txtComision, txtSueldoBruto, txtDescuento, txtSueldoNeto;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("SUELDO DE TRABAJADOR");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblVentas = new JLabel("Ventas: ");
		lblVentas.setBounds(30, 70, 120, 30);
		contentPane.add(lblVentas);
		
		lblSueldoBasico = new JLabel("Sueldo Básico: ");
		lblSueldoBasico.setBounds(30, 110, 120, 30);
		contentPane.add(lblSueldoBasico);
		
		lblComision = new JLabel("Comisión: ");
		lblComision.setBounds(30, 150, 120, 30);
		contentPane.add(lblComision);
		
		lblSueldoBruto = new JLabel("Sueldo Bruto: ");
		lblSueldoBruto.setBounds(30, 190, 120, 30);
		contentPane.add(lblSueldoBruto);
		
		lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(30, 230, 120, 30);
		contentPane.add(lblDescuento);
		
		lblSueldoNeto = new JLabel("Sueldo Neto: ");
		lblSueldoNeto.setBounds(30, 270, 120, 30);
		contentPane.add(lblSueldoNeto);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtVentas = new JTextField();
		txtVentas.setBounds(160, 70, 120, 30);
		txtVentas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVentas.setMargin(insets);
		contentPane.add(txtVentas);
		
		txtSueldoBasico = new JTextField();
		txtSueldoBasico.setBounds(160, 110, 120, 30);
		txtSueldoBasico.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoBasico.setMargin(insets);
		contentPane.add(txtSueldoBasico);
		
		txtComision = new JTextField();
		txtComision.setEditable(false);
		txtComision.setBounds(160, 150, 120, 30);
		txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComision.setMargin(insets);
		contentPane.add(txtComision);
		
		txtSueldoBruto = new JTextField();
		txtSueldoBruto.setEditable(false);
		txtSueldoBruto.setBounds(160, 190, 120, 30);
		txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoBruto.setMargin(insets);
		contentPane.add(txtSueldoBruto);
		
		txtDescuento = new JTextField();
		txtDescuento.setEditable(false);
		txtDescuento.setBounds(160, 230, 120, 30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setMargin(insets);
		contentPane.add(txtDescuento);
		
		txtSueldoNeto = new JTextField();
		txtSueldoNeto.setEditable(false);
		txtSueldoNeto.setBounds(160, 270, 120, 30);
		txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoNeto.setMargin(insets);
		contentPane.add(txtSueldoNeto);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(300, 70, 120, 30);
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
		double ventas = Double.parseDouble(txtVentas.getText());
		double sueldoBasico = Double.parseDouble(txtSueldoBasico.getText());
		double comision = 0;
		
		if (ventas <= 5000) {
			comision = ventas * 0.05;
		} else if (ventas <= 10000 ) {
			comision = ventas * 0.08;
		} else if (ventas <= 20000) {
			comision = ventas * 0.10;
		} else {
			comision = ventas * 0.20;
		}
		
		double sueldoBruto = sueldoBasico + comision;
		double descuento = 0;
		
		if (sueldoBruto >= 3500) {
			descuento = sueldoBruto * 0.15;
		} else {
			descuento = sueldoBruto * 0.08;
		}
		
		double sueldoNeto = sueldoBruto - descuento;
		
		DecimalFormat formatoSoles = new DecimalFormat("S/ ###,###.00");
		
		txtComision.setText(formatoSoles.format(comision));
		txtSueldoBruto.setText(formatoSoles.format(sueldoBruto));
		txtDescuento.setText(formatoSoles.format(descuento));
		txtSueldoNeto.setText(formatoSoles.format(sueldoNeto));
	}

}
