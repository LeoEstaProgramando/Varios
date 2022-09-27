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

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
      
      JPanel contentPane;
      JLabel lblKilometros, lblPies, lblMillas,lblMetros, lblYardas;
      JTextField txtKilometros, txtPies, txtMillas, txtMetros, txtYardas;
      JButton btnCalcular;
      
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblKilometros = new JLabel("Kilometros :");
		lblKilometros.setBounds(30, 30, 80, 30);
		contentPane.add(lblKilometros);
		
		lblPies = new JLabel("Pies :");
		lblPies.setBounds(30, 70, 80, 30);
		contentPane.add(lblPies);
		
		lblMillas = new JLabel("Millas :");
		lblMillas.setBounds(30, 110, 80, 30);
		contentPane.add(lblMillas);
		
		lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(30, 150, 80, 30);
		contentPane.add(lblMetros);
		
		lblYardas = new JLabel("Yardas :");
		lblYardas.setBounds(30, 190, 80, 30);
		contentPane.add(lblYardas);
		
		txtKilometros = new JTextField("");
		txtKilometros.setBounds(100, 30, 80, 30);
		txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtKilometros.setMargin(new Insets(5, 5, 5, 5));
        contentPane.add(txtKilometros);
		
		txtPies = new JTextField("");
		txtPies.setBounds(100, 70, 80, 30);
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtPies);
		
		txtMillas = new JTextField("");
		txtMillas.setBounds(100, 111, 80, 30);
		txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMillas.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtMillas);
		
		txtMetros = new JTextField("");
		txtMetros.setBounds(100, 150, 80, 30);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5, 5, 5, 5));
        txtMetros.setFocusable(false);
		contentPane.add(txtMetros);
		
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
	int kilometros = Integer.parseInt(txtKilometros.getText() );
	int pies = Integer.parseInt(txtPies.getText() );
	int millas = Integer.parseInt(txtMillas.getText() );

	double metros = kilometros * 1000 + (pies * 12 * 2.54 / 100 ) + millas * 1609;
	double yardas = metros * 1.09;
	
	DecimalFormat df = new DecimalFormat("##.00");
	txtMetros.setText( df.format(metros) );
	txtYardas.setText( df.format(yardas) );
	}
	
	}
