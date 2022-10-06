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

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   
	    JTextField txtNota1, txtNota2, txtNota3, txtNota4, txtNota5, txtNotaeliminada1, txtNotaeliminada2, txtPromedio;
	    JButton btnCalcular;
      
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	    public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 328, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
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
		
		JLabel lblNota4 = new JLabel("Nota4 :");
		lblNota4.setBounds(30, 150, 80, 30);
		contentPane.add(lblNota4);
		
		JLabel lblNota5 = new JLabel("Nota5 :");
		lblNota5.setBounds(30, 190, 80, 30);
		contentPane.add(lblNota5);
		
		JLabel lblNotaeliminada1 = new JLabel("Notaeliminada1 :");
		lblNotaeliminada1.setBounds(30, 230, 80, 30);
		contentPane.add(lblNotaeliminada1);
		
		JLabel lblNotaeliminada2 = new JLabel("Notaeliminada2 :");
		lblNotaeliminada2.setBounds(30, 270, 80, 30);
		contentPane.add(lblNotaeliminada2);
		
		JLabel lblPromedio = new JLabel("Promedio :");
		lblPromedio.setBounds(30, 310, 80, 30);
		contentPane.add(lblPromedio);

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
		
		txtNota4 = new JTextField("");
		txtNota4.setBounds(120, 150, 60, 30);
		txtNota4.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNota4.setMargin(insets);
        contentPane.add(txtNota4);
		
		txtNota5 = new JTextField("");
		txtNota5.setBounds(120, 190, 60, 30);
		txtNota5.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNota5.setMargin(insets);
        contentPane.add(txtNota5);
        
        txtNotaeliminada1 = new JTextField("");
		txtNotaeliminada1.setBounds(120, 230, 60, 30);
		txtNotaeliminada1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNotaeliminada1.setMargin(insets);
		txtNotaeliminada1.setFocusable(false);
        contentPane.add(txtNotaeliminada1);
        
        txtNotaeliminada2 = new JTextField("");
		txtNotaeliminada2.setBounds(120, 270, 60, 30);
		txtNotaeliminada2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNotaeliminada2.setMargin(insets);
		txtNotaeliminada2.setFocusable(false);
        contentPane.add(txtNotaeliminada2);
        
        txtPromedio = new JTextField("");
		txtPromedio.setBounds(120, 310, 60, 30);
		txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPromedio.setMargin(insets);
		txtPromedio.setFocusable(false);
        contentPane.add(txtPromedio);
        
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 360, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular, BorderLayout.SOUTH);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int n1 = Integer.parseInt(txtNota1.getText());
		int n2 = Integer.parseInt(txtNota2.getText());
		int n3 = Integer.parseInt(txtNota3.getText());
		int n4 = Integer.parseInt(txtNota4.getText());
		int n5 = Integer.parseInt(txtNota5.getText());
		
		int mayornot = n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5 ? n1 : n2 > n3 && n2 > n4 && n2 > n5 && n2 > n1 ? n2 : n3 > n4 && n3 > n5 && n3 > n1 && n3 > n2 ? n3 : n4 > n5 && n4 > n1 && n4 > n2 && n4 > n3 ? n4 : n5;
		int menornot = n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5 ? n1 : n2 < n3 && n2 < n4 && n2 < n5 && n2 < n1 ? n2 : n3 < n4 && n3 < n5 && n3 < n1 && n3 < n2 ? n3 : n4 < n5 && n4 < n1 && n4 < n2 && n4 < n3 ? n4 : n5;
		
		int notaeliminada1 = mayornot;
		int notaeliminada2 = menornot;
		
		int promedio = (((n1 + n2 + n3 + n4 + n5) - mayornot) - menornot) / 3;
		
	    DecimalFormat df= new DecimalFormat("##.00");
	    
	 txtNotaeliminada1.setText(df.format(notaeliminada1));
	 txtNotaeliminada2.setText(df.format(notaeliminada2));
	 txtPromedio.setText(df.format(promedio));
  }
	
}