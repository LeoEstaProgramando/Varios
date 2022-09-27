package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JLabel lblRadio, lblAltura, lblAreatotal, lblVolumen;
	JTextField txtRadio, txtAltura, txtAreatotal, txtVolumen;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblRadio = new JLabel("Radio : ");
		lblRadio.setBounds(30, 30, 70, 30);
		contentPane.add(lblRadio);
		
		lblAltura = new JLabel("Altura : ");
		lblAltura.setBounds(30, 70, 70, 30);
		contentPane.add(lblAltura);
		
		lblAreatotal = new JLabel("Area_total : ");
		lblAreatotal.setBounds(30, 110, 70, 30);
		contentPane.add(lblAreatotal);
		
		lblVolumen = new JLabel("Volumen : ");
		lblVolumen.setBounds(30, 150, 70, 30);
		contentPane.add(lblVolumen);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(100, 30, 80, 30);
		txtRadio.setHorizontalAlignment(JTextField.RIGHT);;
		txtRadio.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtRadio);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(100, 70, 80, 30);
		txtAltura.setHorizontalAlignment(JTextField.RIGHT);;
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtAltura);
		
		txtAreatotal = new JTextField();
		txtAreatotal.setBounds(100, 110, 80, 30);
		txtAreatotal.setHorizontalAlignment(JTextField.RIGHT);;
		txtAreatotal.setMargin(new Insets(5, 5, 5, 5));
		txtAreatotal.setFocusable(false);
		contentPane.add(txtAreatotal);
		
		txtVolumen = new JTextField();
		txtVolumen.setBounds(100, 150, 80, 30);
		txtVolumen.setHorizontalAlignment(JTextField.RIGHT);;
		txtVolumen.setMargin(new Insets(5, 5, 5, 5));
		txtVolumen.setFocusable(false);
		contentPane.add(txtVolumen);
		
		btnCalcular = new JButton("Calcular ");
		btnCalcular.setBounds(60, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	private void btnCalcular_Click() {
		int radio = Integer.parseInt(txtRadio.getText() );
		int altura = Integer.parseInt(txtAltura.getText() );
		
		double areatotal = radio * altura;
		double volumen = 2 * (radio + altura);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtAreatotal.setText( df.format(areatotal) );
		txtVolumen.setText( df.format(volumen) );
	}

}
