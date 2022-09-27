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

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
      
      JPanel contentPane;
      JLabel lblVarones,   lblMujeres,   lblTotal,   lblPorcentajeV, lblPorcentajeM;
      JTextField txtVarones, txtMujeres, txtTotal, txtPorcentajeV, txtPorcentajeM;
      JButton btnCalcular;
     
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblVarones = new JLabel("Varones :");
		lblVarones.setBounds(30, 30, 80, 30);
		contentPane.add(lblVarones);
		
		lblMujeres = new JLabel("Mujeres :");
		lblMujeres.setBounds(30, 70, 80, 30);
		contentPane.add(lblMujeres);
		
		lblTotal = new JLabel("Total :");
		lblTotal.setBounds(30, 110, 80, 30);
		contentPane.add(lblTotal);
		
		lblPorcentajeV = new JLabel("PorcentajeV :");
		lblPorcentajeV.setBounds(30, 150, 80, 30);
		contentPane.add(lblPorcentajeV);
		
		lblPorcentajeM = new JLabel("PorcentajeM :");
		lblPorcentajeM.setBounds(30, 190, 80, 30);
		contentPane.add(lblPorcentajeM);
		
		txtVarones  = new JTextField("");
		txtVarones .setBounds(100, 30, 100, 30);
		txtVarones .setHorizontalAlignment(SwingConstants.RIGHT);
        txtVarones .setMargin(new Insets(5, 5, 5, 5));
        contentPane.add(txtVarones );
	
		txtMujeres = new JTextField("");
		txtMujeres.setBounds(100, 70, 100, 30);
		txtMujeres.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMujeres.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtMujeres);
		
		txtTotal = new JTextField("");
		txtTotal.setBounds(100, 110, 100, 30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setMargin(new Insets(5, 5, 5, 5));
        txtTotal.setFocusable(false);
		contentPane.add(txtTotal);
		
		txtPorcentajeV  = new JTextField("");
		txtPorcentajeV .setBounds(100, 150, 100, 30);
		txtPorcentajeV .setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcentajeV .setMargin(new Insets(5, 5, 5, 5));
        txtPorcentajeV.setFocusable(false);
        contentPane.add(txtPorcentajeV );
	
		txtPorcentajeM = new JTextField("");
		txtPorcentajeM.setBounds(100, 190, 100, 30);
		txtPorcentajeM.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPorcentajeM.setMargin(new Insets(5, 5, 5, 5));
        txtPorcentajeM.setFocusable(false);
		contentPane.add(txtPorcentajeM);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(80, 230, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
 	}
    
	private void btnCalcular_Click() {
	int varones = Integer.parseInt( txtVarones.getText() );
	int mujeres = Integer.parseInt( txtMujeres.getText() );
		 
	double suma = varones + mujeres;
	txtTotal.setText("" + suma);
  
	double  pvarones=(varones*100)/suma;
	double pmujeres=(mujeres*100)/suma;
	       
    txtPorcentajeV.setText(""+pvarones+"%");
	 txtPorcentajeM.setText(""+pmujeres+"%");
	
    }
	
    }