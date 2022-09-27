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

public class frm17 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblDonacion, lblCentroSalud, lblComedorInfantil, lblEscuelaInfantil, lblAsiloAncianos;
	JTextField txtDonacion, txtCentroSalud, txtComedorInfantil, txtEscuelaInfantil, txtAsiloAncianos;
	JButton btnCalcular;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblDonacion = new JLabel("Donación (S/): ");
		lblDonacion.setBounds(30, 30, 145, 30);
		contentPane.add(lblDonacion);
		
		lblCentroSalud = new JLabel("Centro de Salud (25%): ");
		lblCentroSalud.setBounds(30, 110, 145, 30);
		contentPane.add(lblCentroSalud);
		
		lblComedorInfantil = new JLabel("Comedor Infantil (35%): ");
		lblComedorInfantil.setBounds(30, 150, 145, 30);
		contentPane.add(lblComedorInfantil);
		
		lblEscuelaInfantil = new JLabel("Escuela Infantil (25%): ");
		lblEscuelaInfantil.setBounds(30, 190, 145, 30);
		contentPane.add(lblEscuelaInfantil);
		
		lblAsiloAncianos = new JLabel("Asilo de Ancianos (15%): ");
		lblAsiloAncianos.setBounds(30, 230, 145, 30);
		contentPane.add(lblAsiloAncianos);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtDonacion = new JTextField();
		txtDonacion.setBounds(180, 30, 100, 30);
		txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDonacion.setMargin(insets);
		contentPane.add(txtDonacion);
		
		txtCentroSalud = new JTextField();
		txtCentroSalud.setBounds(180, 110, 100, 30);
		txtCentroSalud.setEditable(false);
		txtCentroSalud.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCentroSalud.setMargin(insets);
		contentPane.add(txtCentroSalud);
		
		txtComedorInfantil = new JTextField();
		txtComedorInfantil.setEditable(false);
		txtComedorInfantil.setBounds(180, 150, 100, 30);
		txtComedorInfantil.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComedorInfantil.setMargin(insets);
		contentPane.add(txtComedorInfantil);
		
		txtEscuelaInfantil = new JTextField();
		txtEscuelaInfantil.setEditable(false);
		txtEscuelaInfantil.setBounds(180, 190, 100, 30);
		txtEscuelaInfantil.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEscuelaInfantil.setMargin(insets);
		contentPane.add(txtEscuelaInfantil);
		
		txtAsiloAncianos = new JTextField();
		txtAsiloAncianos.setEditable(false);
		txtAsiloAncianos.setBounds(180, 230, 100, 30);
		txtAsiloAncianos.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAsiloAncianos.setMargin(insets);
		contentPane.add(txtAsiloAncianos);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(290, 30, 120, 30);
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
		double donacion = Double.parseDouble(txtDonacion.getText());
		
		DecimalFormat formatoSoles = new DecimalFormat("S/ ###,###.00");
		
		txtCentroSalud.setText(formatoSoles.format(donacion * 25 / 100));
		txtComedorInfantil.setText(formatoSoles.format(donacion * 35 / 100));
		txtEscuelaInfantil.setText(formatoSoles.format(donacion * 25 / 100));
		txtAsiloAncianos.setText(formatoSoles.format(donacion * 15 / 100));
		
	}

}
