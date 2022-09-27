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

public class frm16 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblHorasTrabajo, lblTarifaHoraria, lblSueldoBasico, lblSueldoBruto, lblSueldoNeto;
	JTextField txtHorasTrabajo,txtTarifaHoraria, txtSueldoBasico, txtSueldoBruto, txtSueldoNeto;
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
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblHorasTrabajo = new JLabel("Horas Trabajo: ");
		lblHorasTrabajo.setBounds(30, 30, 120, 30);
		contentPane.add(lblHorasTrabajo);
		
		lblTarifaHoraria = new JLabel("Tarifa Horaria: ");
		lblTarifaHoraria.setBounds(30, 70, 120, 30);
		contentPane.add(lblTarifaHoraria);
		
		lblSueldoBasico = new JLabel("Sueldo Básico: ");
		lblSueldoBasico.setBounds(30, 150, 120, 30);
		contentPane.add(lblSueldoBasico);
		
		lblSueldoBruto = new JLabel("Sueldo Bruto: ");
		lblSueldoBruto.setBounds(30, 190, 120, 30);
		contentPane.add(lblSueldoBruto);
		
		lblSueldoNeto = new JLabel("Sueldo Neto: ");
		lblSueldoNeto.setBounds(30, 230, 120, 30);
		contentPane.add(lblSueldoNeto);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtHorasTrabajo = new JTextField();
		txtHorasTrabajo.setBounds(160, 30, 100, 30);
		txtHorasTrabajo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHorasTrabajo.setMargin(insets);
		contentPane.add(txtHorasTrabajo);
		
		txtTarifaHoraria = new JTextField();
		txtTarifaHoraria.setBounds(160, 70, 100, 30);
		txtTarifaHoraria.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTarifaHoraria.setMargin(insets);
		contentPane.add(txtTarifaHoraria);
		
		txtSueldoBasico = new JTextField();
		txtSueldoBasico.setEditable(false);
		txtSueldoBasico.setBounds(160, 150, 100, 30);
		txtSueldoBasico.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoBasico.setMargin(insets);
		contentPane.add(txtSueldoBasico);
		
		txtSueldoBruto = new JTextField();
		txtSueldoBruto.setEditable(false);
		txtSueldoBruto.setBounds(160, 190, 100, 30);
		txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoBruto.setMargin(insets);
		contentPane.add(txtSueldoBruto);
		
		txtSueldoNeto = new JTextField();
		txtSueldoNeto.setEditable(false);
		txtSueldoNeto.setBounds(160, 230, 100, 30);
		txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldoNeto.setMargin(insets);
		contentPane.add(txtSueldoNeto);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(270, 30, 130, 70);
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
		double horasTrabajo = Double.parseDouble(txtHorasTrabajo.getText());
		double tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());
		
		double sueldoBasico = horasTrabajo * tarifaHoraria;
		double sueldoBruto = sueldoBasico * 1.2;
		double sueldoNeto = sueldoBruto * 0.9;
		
		DecimalFormat formatoSoles = new DecimalFormat("S/ ###,###.00");
		
		txtSueldoBasico.setText(formatoSoles.format(sueldoBasico));
		txtSueldoBruto.setText(formatoSoles.format(sueldoBruto));
		txtSueldoNeto.setText(formatoSoles.format(sueldoNeto));
		
	}

}
