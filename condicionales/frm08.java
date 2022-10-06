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

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   
	    JTextField txtNota1, txtNota2, txtNota3, txtTotal;
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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNota1 = new JLabel("Nota1 :");
		lblNota1.setBounds(30, 30, 80, 30);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota2 :");
		lblNota2.setBounds(30, 70, 80, 30);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota3 :");
		lblNota3.setBounds(30,110, 80, 30);
		contentPane.add(lblNota3);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setBounds(30, 150, 80, 30);
		contentPane.add(lblTotal);
		

		Insets insets = new Insets(5,5,5,5);
		txtNota1 = new JTextField("");
		txtNota1.setBounds(120, 30, 60, 30);
		txtNota1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNota1.setMargin(insets);
		contentPane.add(txtNota1);
		
		txtNota2 = new JTextField("");
		txtNota2.setBounds(120, 70, 60, 30);
		txtNota2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNota2.setMargin(insets);
        contentPane.add(txtNota2);
        
		txtNota3 = new JTextField("");
		txtNota3.setBounds(120, 110, 60, 30);
		txtNota3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNota3.setMargin(insets);
		contentPane.add(txtNota3);
		
		txtTotal = new JTextField("");
		txtTotal.setBounds(120, 150, 60, 30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setMargin(insets);
		txtTotal.setFocusable(false);
        contentPane.add(txtTotal);
        
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int a = Integer.parseInt(txtNota1.getText());
		int b = Integer.parseInt(txtNota2.getText());
		int c = Integer.parseInt(txtNota3.getText());
		
	    DecimalFormat df= new DecimalFormat("##.00");
	    
	    int incentivo = 5;
	    int propina = 20;
	    
	    int a2 = 0;
	    int b2 = 0;
	    int c2 = 0;
	    
	    int a1 = a >= 14 ? incentivo : a2;
	    int b1 = b >= 14 ? incentivo : b2;
	    int c1 = c >= 14 ? incentivo : c2;
	    
	    int total = (a1 + b1 + c1) + propina;
	    
	 txtTotal.setText(df.format(total));
  }
	
}
