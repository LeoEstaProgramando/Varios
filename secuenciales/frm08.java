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

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JLabel lblRadio, lblAltura, lblAreaBase, lblAreaLateral, lblAreaTotal;
	JTextField txtRadio, txtAltura, txtAreaBase, txtAreaLateral, txtAreaTotal;
	JButton btnCalcular;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public frm08() {
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
		
		lblAreaBase = new JLabel("AreaBase : ");
		lblAreaBase.setBounds(30, 110, 70, 30);
		contentPane.add(lblAreaBase);
		
		lblAreaLateral = new JLabel("AreaLateral : ");
		lblAreaLateral.setBounds(30, 150, 70, 30);
		contentPane.add(lblAreaLateral);
		
		lblAreaTotal = new JLabel("AreaTotal : ");
		lblAreaTotal.setBounds(30, 190, 80, 30);
		contentPane.add(lblAreaTotal);
		
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
		
		txtAreaBase = new JTextField();
		txtAreaBase.setBounds(100, 110, 80, 30);
		txtAreaBase.setHorizontalAlignment(JTextField.RIGHT);;
		txtAreaBase.setMargin(new Insets(5, 5, 5, 5));
		txtAreaBase.setFocusable(false);
		contentPane.add(txtAreaBase);
		
		txtAreaLateral = new JTextField();
		txtAreaLateral.setBounds(100, 150, 80, 30);
		txtAreaLateral.setHorizontalAlignment(JTextField.RIGHT);;
		txtAreaLateral.setMargin(new Insets(5, 5, 5, 5));
		txtAreaLateral.setFocusable(false);
		contentPane.add(txtAreaLateral);
		
		txtAreaTotal = new JTextField();
		txtAreaTotal.setBounds(100, 190, 80, 30);
		txtAreaTotal.setHorizontalAlignment(JTextField.RIGHT);;
		txtAreaTotal.setMargin(new Insets(5, 5, 5, 5));
		txtAreaTotal.setFocusable(false);
		contentPane.add(txtAreaTotal);
		
		btnCalcular = new JButton("Calcular ");
		btnCalcular.setBounds(60, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	private void btnCalcular_Click() {
		int radio = Integer.parseInt(txtRadio.getText() );
		int altura = Integer.parseInt(txtAltura.getText() );
		
		double areabase = Math.PI * (radio * radio);
		double arealateral = 2 * Math.PI * (radio * altura);
		double areatotal = 2 * (areabase * arealateral);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtAreaBase.setText( df.format(areabase) );
		txtAreaLateral.setText( df.format(arealateral) );
		txtAreaTotal.setText( df.format(areatotal) );
	}

}
