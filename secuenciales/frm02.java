package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.SystemColor;
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

public class frm02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JLabel lblMetros, lblCentimeros, lblPulgadas, lblPies, lblYardas;
	JTextField txtMetros, txtCentimetros, txtPulgadas, txtPies, txtYardas;
	JButton btnCalcular;
	
	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		//Labels
		lblMetros = new JLabel("Metros: ");
		lblMetros.setBounds(30, 30, 80, 30);
		contentPane.add(lblMetros);
		
		lblCentimeros = new JLabel("Centimetros: ");
		lblCentimeros.setBounds(30, 70, 80, 30);
		contentPane.add(lblCentimeros);
		
		lblPulgadas = new JLabel("Pulgadas: ");
		lblPulgadas.setBounds(30, 110, 80, 30);
		contentPane.add(lblPulgadas);
		
		lblPies = new JLabel("Pies: ");
		lblPies.setBounds(30, 150, 80, 30);
		contentPane.add(lblPies);
		
		lblYardas = new JLabel("Yardas: ");
		lblYardas.setBounds(30, 190, 80, 30);
		contentPane.add(lblYardas);
		
		//Texts
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtMetros = new JTextField();
		txtMetros.setBounds(120, 30, 100, 30);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setMargin(insets);
		contentPane.add(txtMetros);
		
		txtCentimetros = new JTextField();
		txtCentimetros.setEditable(false);
		txtCentimetros.setBounds(120, 70, 100, 30);
		txtCentimetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCentimetros.setMargin(insets);
		contentPane.add(txtCentimetros);
		
		txtPulgadas = new JTextField();
		txtPulgadas.setEditable(false);
		txtPulgadas.setBounds(120, 110, 100, 30);
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPulgadas.setMargin(insets);
		contentPane.add(txtPulgadas);
		
		txtPies = new JTextField();
		txtPies.setEditable(false);
		txtPies.setBounds(120, 150, 100, 30);
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setMargin(insets);
		contentPane.add(txtPies);
		
		txtYardas = new JTextField();
		txtYardas.setEditable(false);
		txtYardas.setBounds(120, 190, 100, 30);
		txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtYardas.setMargin(insets);
		contentPane.add(txtYardas);
		
		//Button
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(SystemColor.textHighlight);
		btnCalcular.setBounds(120, 230, 100, 30);
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
		double metros = Double.parseDouble(txtMetros.getText());
		
		double centimetros = metros * 100;
		double pulgadas = centimetros / 2.54;
		double pies = pulgadas / 12;
		double yardas = pies / 3;
		
		DecimalFormat formato = new DecimalFormat("#,###.00");
		
		txtCentimetros.setText(formato.format(centimetros));
		txtPulgadas.setText(formato.format(pulgadas));
		txtPies.setText(formato.format(pies));
		txtYardas.setText(formato.format(yardas));
		
	}

}
