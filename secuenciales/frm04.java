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

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JLabel lblPies, lblPulgadas, lblMetro;
	JTextField txtPies, txtPulgadas, txtMetro;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblPies = new JLabel("Pies : ");
		lblPies.setBounds(30, 30, 70, 30);
		contentPane.add(lblPies);
		
		lblPulgadas = new JLabel("Pulgadas : ");
		lblPulgadas.setBounds(30, 70, 70, 30);
		contentPane.add(lblPulgadas);
		
		lblMetro = new JLabel("Metro : ");
		lblMetro.setBounds(30, 110, 70, 30);
		contentPane.add(lblMetro);
		
		txtPies = new JTextField();
		txtPies.setBounds(100, 30, 80, 30);
		txtPies.setHorizontalAlignment(JTextField.RIGHT);;
		txtPies.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtPies);
		
		txtPulgadas = new JTextField();
		txtPulgadas.setBounds(100, 70, 80, 30);
		txtPulgadas.setHorizontalAlignment(JTextField.RIGHT);;
		txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtPulgadas);
		
		txtMetro = new JTextField();
		txtMetro.setBounds(100, 110, 80, 30);
		txtMetro.setHorizontalAlignment(JTextField.RIGHT);;
		txtMetro.setMargin(new Insets(5, 5, 5, 5));
		txtMetro.setFocusable(false);
		contentPane.add(txtMetro);
		
		btnCalcular = new JButton("Calcular ");
		btnCalcular.setBounds(60, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	private void btnCalcular_Click() {
		int pies = Integer.parseInt(txtPies.getText() );
		int pulgadas = Integer.parseInt(txtPulgadas.getText() );
		
		double p1 = pies * 30.48 / 100;
		double p2 = pulgadas * 2.54 / 100;
		double metro = (p1 + p2);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtMetro.setText( df.format(metro) );
	}

}
