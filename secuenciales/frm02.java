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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
      
      JPanel contentPane;
      JLabel lblMetros, lblCentimetros, lblPulgadas,lblPies, lblYardas;
      JTextField txtMetros, txtCentimetros, txtPulgadas, txtPies, txtYardas;
      JButton btnCalcular;
      
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
	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(30, 30, 80, 30);
		contentPane.add(lblMetros);
		
		lblCentimetros = new JLabel("Centimetros :");
		lblCentimetros.setBounds(30, 70, 80, 30);
		contentPane.add(lblCentimetros);
		
		lblPulgadas = new JLabel("Pulgadas :");
		lblPulgadas.setBounds(30, 110, 80, 30);
		contentPane.add(lblPulgadas);
		
		lblPies = new JLabel("Pies :");
		lblPies.setBounds(30, 150, 80, 30);
		contentPane.add(lblPies);
		
		lblYardas = new JLabel("Yardas :");
		lblYardas.setBounds(30, 190, 80, 30);
		contentPane.add(lblYardas);
		
		txtMetros = new JTextField("");
		txtMetros.setBounds(100, 30, 80, 30);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5, 5, 5, 5));
        contentPane.add(txtMetros);
		
		txtCentimetros = new JTextField("");
		txtCentimetros.setBounds(100, 70, 80, 30);
		txtCentimetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCentimetros.setMargin(new Insets(5, 5, 5, 5));
        txtCentimetros.setFocusable(false);
		contentPane.add(txtCentimetros);
		
		txtPulgadas = new JTextField("");
		txtPulgadas.setBounds(100, 111, 80, 30);
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
        txtPulgadas.setFocusable(false);
		contentPane.add(txtPulgadas);
		
		txtPies = new JTextField("");
		txtPies.setBounds(100, 150, 80, 30);
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        txtPies.setFocusable(false);
		contentPane.add(txtPies);
		
		txtYardas = new JTextField("");
		txtYardas.setBounds(100, 190, 80, 30);
		txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtYardas.setMargin(new Insets(5, 5, 5, 5));
        txtYardas.setFocusable(false);
		contentPane.add(txtYardas);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(80, 230, 150, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	private void btnCalcular_Click() {
	int metros = Integer.parseInt(txtMetros.getText() );

	double centimetros = metros*100;
	double pulgadas = centimetros/2.54;
	double pies = pulgadas/12;
	double yardas = pies/3;
	
	DecimalFormat df = new DecimalFormat("##.00");
	txtCentimetros.setText( df.format(centimetros) );
	txtPulgadas.setText( df.format(pulgadas) );
	txtPies.setText( df.format(pies) );
	txtYardas.setText( df.format(yardas) );
	}
	
	}
