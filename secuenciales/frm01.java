package secuenciales;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ibm.icu.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm01 extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblVarones, lblMujeres;
	JTextField txtVarones, txtMujeres;
	JButton btnCalcular;
	JTextField txtVaronesRes, txtMujeresRes;
	
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
		setBounds(0, 0, 370, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblVarones = new JLabel("Varones: ");
		lblVarones.setBounds(30, 30, 80, 30);
		contentPane.add(lblVarones);
		
		lblMujeres = new JLabel("Mujeres: ");
		lblMujeres.setBounds(30, 70, 80, 30);
		contentPane.add(lblMujeres);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtVarones = new JTextField();
		txtVarones.setBounds(120, 30, 100, 30);
		txtVarones.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVarones.setMargin(insets);
		contentPane.add(txtVarones);
		
		txtMujeres = new JTextField();
		txtMujeres.setBounds(120, 70, 100, 30);
		txtMujeres.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMujeres.setMargin(insets);
		contentPane.add(txtMujeres);
		
		txtVaronesRes = new JTextField();
		txtVaronesRes.setEditable(false);
		txtVaronesRes.setBounds(230, 30, 100, 30);
		txtVaronesRes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVaronesRes.setMargin(insets);
		contentPane.add(txtVaronesRes);
		
		txtMujeresRes = new JTextField();
		txtMujeresRes.setEditable(false);
		txtMujeresRes.setBounds(230, 70, 100, 30);
		txtMujeresRes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMujeresRes.setMargin(insets);
		contentPane.add(txtMujeresRes);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(SystemColor.textHighlight);
		btnCalcular.setBounds(230, 120, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
		
	}


	protected void btnCalcular_Click() {
		
		double varones = Integer.parseInt(txtVarones.getText());
		double mujeres = Integer.parseInt(txtMujeres.getText());
		double total = varones + mujeres;
		
		double varonesRes = varones / total;
		double mujeresRes = mujeres / total;
		
		DecimalFormat formato = new DecimalFormat("##.##%");
		
		txtVaronesRes.setText(formato.format(varonesRes));
		txtMujeresRes.setText(formato.format(mujeresRes));		
	}
	
	
	
	

}
