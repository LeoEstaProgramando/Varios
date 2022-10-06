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

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   
	    JTextField txtEdad1, txtEdad2, txtEdad3, txtMayor, txtMenor;
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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblEdad1 = new JLabel("Edad1 :");
		lblEdad1.setBounds(30, 30, 80, 30);
		contentPane.add(lblEdad1);
		
		JLabel lblEdad2 = new JLabel("Edad2 :");
		lblEdad2.setBounds(30, 70, 80, 30);
		contentPane.add(lblEdad2);
		
		JLabel lblEdad3 = new JLabel("Edad3 :");
		lblEdad3.setBounds(30,110, 80, 30);
		contentPane.add(lblEdad3);
		
		JLabel lblMayor = new JLabel("Mayor :");
		lblMayor.setBounds(30, 150, 80, 30);
		contentPane.add(lblMayor);
		
		JLabel lblMenor = new JLabel("Menor :");
		lblMenor.setBounds(30, 190, 80, 30);
		contentPane.add(lblMenor);

		Insets insets = new Insets(5,5,5,5);
		txtEdad1 = new JTextField("");
		txtEdad1.setBounds(120, 30, 60, 30);
		txtEdad1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad1.setMargin(insets);
		contentPane.add(txtEdad1);
		
		txtEdad2 = new JTextField("");
		txtEdad2.setBounds(120, 70, 60, 30);
		txtEdad2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEdad2.setMargin(insets);
        contentPane.add(txtEdad2);
        
		txtEdad3 = new JTextField("");
		txtEdad3.setBounds(120, 110, 60, 30);
		txtEdad3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEdad3.setMargin(insets);
		contentPane.add(txtEdad3);
		
		txtMayor = new JTextField("");
		txtMayor.setBounds(120, 150, 60, 30);
		txtMayor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMayor.setMargin(insets);
		txtMayor.setFocusable(false);
        contentPane.add(txtMayor);
		
		txtMenor = new JTextField("");
		txtMenor.setBounds(120, 190, 60, 30);
		txtMenor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMenor.setMargin(insets);
		txtMenor.setFocusable(false);
        contentPane.add(txtMenor);
        
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int edad1 = Integer.parseInt(txtEdad1.getText());
		int edad2 = Integer.parseInt(txtEdad2.getText());
		int edad3 = Integer.parseInt(txtEdad3.getText());
		
	    DecimalFormat df= new DecimalFormat("##.00");
	    
	    int mayor = edad1 > edad2 && edad1 > edad3 ? edad1 : edad2 > edad3 && edad2 > edad1 ? edad2 : edad3;
	    int menor = edad1 < edad2 && edad1 < edad3 ? edad1 : edad2 < edad3 && edad2 < edad1 ? edad2 : edad3;
	    
	 txtMayor.setText(df.format(mayor));
	 txtMenor.setText(df.format(menor));
  }
	
}
