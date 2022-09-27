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

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
      
      JPanel contentPane;
      JLabel lblGB, lblMB, lblKB, lblBytes;
      JTextField txtGB, txtMB, txtKB,  txtBytes;
      JButton btnCalcular;
     
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblGB = new JLabel("Gigabyte :");
		lblGB.setBounds(30, 30, 80, 30);
		contentPane.add(lblGB);
		
		lblMB = new JLabel("Megabyte :");
		lblMB.setBounds(30, 70, 80, 30);
		contentPane.add(lblMB);
		
		lblKB = new JLabel("Kilobyte :");
		lblKB.setBounds(30, 110, 80, 30);
		contentPane.add(lblKB);
		
		lblBytes = new JLabel("Bytes :");
		lblBytes.setBounds(30, 150, 80, 30);
		contentPane.add(lblBytes);
		
		txtGB = new JTextField("");
		txtGB.setBounds(100, 30, 80, 30);
		txtGB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGB.setMargin(new Insets(5, 5, 5, 5));
        txtBytes.setFocusable(false);
        contentPane.add(txtGB);
		
		txtMB = new JTextField("");
		txtMB.setBounds(100, 70, 80, 30);
		txtMB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMB.setMargin(new Insets(5, 5, 5, 5));
        txtBytes.setFocusable(false);
		contentPane.add(txtMB);
		
		txtKB = new JTextField("");
		txtKB.setBounds(100, 111, 80, 30);
		txtKB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtKB.setMargin(new Insets(5, 5, 5, 5));
        txtBytes.setFocusable(false);
		contentPane.add(txtKB);
		
		txtBytes = new JTextField("");
		txtBytes.setBounds(100, 150, 80, 30);
		txtBytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBytes.setMargin(new Insets(5, 5, 5, 5));
        txtBytes.setFocusable(false);
		contentPane.add(txtBytes);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(80, 230, 150, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
 	}
    
	private void btnCalcular_Click() {
	int gigabytes = Integer.parseInt( txtGB.getText() );
		 
	int MB = gigabytes * 1024;
	int KB = MB * 1024;
	int Bytes = KB * 1024;
			
	txtMB.setText("" + MB);
	txtKB.setText("" + MB);
	txtBytes.setText("" + Bytes );
	
    }
	
    };