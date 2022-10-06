package condicionales;

import java.awt.BorderLayout;
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

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   
	    JTextField txtNumero1, txtNumero2,txtNumero3,txtIntermedio;
	    JButton btnCalcular;
      
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	    public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero1 = new JLabel("Numero1 :");
		lblNumero1.setBounds(30, 30, 80, 30);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero2 :");
		lblNumero2.setBounds(30, 70, 80, 30);
		contentPane.add(lblNumero2);
		
		JLabel lblNumero3 = new JLabel("Numero3 :");
		lblNumero3.setBounds(30,110, 80, 30);
		contentPane.add(lblNumero3);
		
		JLabel lblIntermedio = new JLabel("Intermedio :");
		lblIntermedio.setBounds(30, 150, 80, 30);
		contentPane.add(lblIntermedio);

		Insets insets = new Insets(5,5,5,5);
		txtNumero1 = new JTextField("");
		txtNumero1.setBounds(120, 30, 60, 30);
		txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(insets);
		contentPane.add(txtNumero1);
		
		txtNumero2 = new JTextField("");
		txtNumero2.setBounds(120, 70, 60, 30);
		txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero2.setMargin(insets);
        contentPane.add(txtNumero2);
        
		txtNumero3 = new JTextField("");
		txtNumero3.setBounds(120, 110, 60, 30);
		txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero3.setMargin(insets);
		contentPane.add(txtNumero3);
		
		txtIntermedio = new JTextField("");
		txtIntermedio.setBounds(120, 150, 60, 30);
		txtIntermedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIntermedio.setMargin(insets);
		txtIntermedio.setFocusable(false);
        contentPane.add(txtIntermedio);
        
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int n1 = Integer.parseInt(txtNumero1.getText());
		int n2 = Integer.parseInt(txtNumero2.getText());
		int n3 = Integer.parseInt(txtNumero3.getText());
		
		
		DecimalFormat df= new DecimalFormat("##.00");
		int mayor = n1 > n2 && n1 > n3 ? n1 : n2 > n3 && n2 > n1 ? n2 : n3;
		int menor = n1 < n2 && n1 < n3 ? n1 : n2 < n3 && n2 < n1 ? n2 : n3;
		int intermedio = ((n1 + n2 + n3 ) - mayor) - menor;
		
		txtIntermedio.setText(df.format(intermedio));
	}
}