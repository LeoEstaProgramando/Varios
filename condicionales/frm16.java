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

public class frm16 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblTitulo, lblIngresoMensual, lblCostoPropiedad, lblCuotaInicial, lblCuotaMensual;
	JTextField txtIngresoMensual, txtCostoPropiedad, txtCuotaInicial, txtCuotaMensual;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("EVALUACIÓN DE CRÉDITO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblIngresoMensual = new JLabel("Ingreso mensual: ");
		lblIngresoMensual.setBounds(30, 70, 120, 30);
		contentPane.add(lblIngresoMensual);
		
		lblCostoPropiedad = new JLabel("Costo de la casa: ");
		lblCostoPropiedad.setBounds(30, 110, 120, 30);
		contentPane.add(lblCostoPropiedad);
		
		lblCuotaInicial = new JLabel("Cuota inicial: ");
		lblCuotaInicial.setBounds(30, 150, 120, 30);
		contentPane.add(lblCuotaInicial);
		
		lblCuotaMensual = new JLabel("Cuota mensual: ");
		lblCuotaMensual.setBounds(30, 190, 120, 30);
		contentPane.add(lblCuotaMensual);
				
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtIngresoMensual = new JTextField();
		txtIngresoMensual.setBounds(160, 70, 120, 30);
		txtIngresoMensual.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIngresoMensual.setMargin(insets);
		contentPane.add(txtIngresoMensual);
		
		txtCostoPropiedad = new JTextField();
		txtCostoPropiedad.setBounds(160, 110, 120, 30);
		txtCostoPropiedad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCostoPropiedad.setMargin(insets);
		contentPane.add(txtCostoPropiedad);
		
		txtCuotaInicial = new JTextField();
		txtCuotaInicial.setEditable(false);
		txtCuotaInicial.setBounds(160, 150, 120, 30);
		txtCuotaInicial.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCuotaInicial.setMargin(insets);
		contentPane.add(txtCuotaInicial);
		
		txtCuotaMensual = new JTextField();
		txtCuotaMensual.setEditable(false);
		txtCuotaMensual.setBounds(160, 190, 120, 30);
		txtCuotaMensual.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCuotaMensual.setMargin(insets);
		contentPane.add(txtCuotaMensual);
		
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
		double ingresoMensual = Double.parseDouble(txtIngresoMensual.getText());
		double costoPropiedad = Double.parseDouble(txtCostoPropiedad.getText());
		double cuotaInicial = 0;
		double cuotaMensual = 0;
		
		if (ingresoMensual < 1500) {
			cuotaInicial = costoPropiedad * 0.15;
			cuotaMensual = (costoPropiedad - cuotaInicial) / 120;
		} else {
			cuotaInicial = costoPropiedad * 0.30;
			cuotaMensual = (costoPropiedad - cuotaInicial) / 75;
		}
		
		DecimalFormat formatoSoles = new DecimalFormat("S/ ###,###.00");
		
		txtCuotaInicial.setText(formatoSoles.format(cuotaInicial));
		txtCuotaMensual.setText(formatoSoles.format(cuotaMensual));
	}

}
