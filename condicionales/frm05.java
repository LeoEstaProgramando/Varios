package condicionales;

import java.util.Arrays;
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
	private JPanel contentPane;
   
      JLabel lblNumeros, lblNNuevo;
      JTextField  txtNumeros,txtNNuevo;
     
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
		setLocationRelativeTo(btnCalcular);
		
		lblNumeros = new JLabel("Numeros :");
		lblNumeros.setBounds(30, 30, 80, 30);
		contentPane.add(lblNumeros);		
		
	    lblNNuevo = new JLabel("NNuevo :");
		lblNNuevo.setBounds(30, 70, 80, 30);
		contentPane.add(lblNNuevo);		
		
		txtNumeros = new JTextField("");
		txtNumeros.setBounds(100, 30, 80, 30);
		txtNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeros.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtNumeros);
		
		txtNNuevo = new JTextField("");
		txtNNuevo.setBounds(100, 70, 80, 30);
		txtNNuevo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNNuevo.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtNNuevo);
        
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 140, 100, 23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int numero = Integer.parseInt(txtNumeros.getText());
		
		String c1 = Integer.toString(numero / 1000);
		String c2 = Integer.toString((numero % 1000) / 100);
		String c3 = Integer.toString(((numero % 1000) % 100) / 10);
		String c4 = Integer.toString(((numero % 1000) % 100) % 10);
		
		String[] cifras = {c1, c2, c3, c4}; //Ponemos las cifras en un array
		
		Arrays.sort(cifras); //Ordenamos las cifras en orden 
		
		txtNNuevo.setText(cifras[0] + cifras[3]);
 
  }
	
}