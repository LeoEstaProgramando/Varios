package condicionales;

import java.awt.BorderLayout;
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

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   
	    JTextField txtGrado, txtAngulo;
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
		setBounds(0, 0, 328, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblGrado = new JLabel("Grado :");
		lblGrado.setBounds(30, 30, 80, 30);
		contentPane.add(lblGrado);
		
		JLabel lblAngulo = new JLabel("Angulo :");
		lblAngulo.setBounds(30, 70, 80, 30);
		contentPane.add(lblAngulo);

		Insets insets = new Insets(5,5,5,5);
		txtGrado = new JTextField("");
		txtGrado.setBounds(120, 30, 60, 30);
		txtGrado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGrado.setMargin(insets);
		contentPane.add(txtGrado);
		
		txtAngulo = new JTextField("");
		txtAngulo.setBounds(120, 70, 60, 30);
		txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAngulo.setMargin(insets);
        contentPane.add(txtAngulo);

		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular, BorderLayout.SOUTH);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int g = Integer.parseInt(txtGrado.getText());
		
		String a ="";
		
		String nulo = "Nulo";
		String agudo = "Agudo";
		String recto = "Recto";
		String obtuso = "Obtuso";
		String llano = "Llano";
		String concavo = "Concavo";
		String completo = "Completo";
		
		
		 if (g == 0) a = nulo;
		 else if ((0 < g) && (g < 90)) a = agudo;
		 else if (g == 90) a = recto;
		 else if ((90 < g) && (g < 180))a = obtuso;
		 else if (g == 180) a = llano;
		 else if ((180 < g) && (g < 360)) a = concavo;
		 else a = completo;
		
	    
	 txtAngulo.setText((a));
  }
	
}