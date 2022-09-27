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

import com.ibm.icu.text.DecimalFormat;

public class frm13 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblTitulo, lblCo, lblCa, lblHi;
	JTextField txtCo, txtCa, txtHi;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("TRIANGULO TRIGONOMÉTRICO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblCa = new JLabel("Cateto Opuesto: ");
		lblCa.setBounds(30, 70, 120, 30);
		contentPane.add(lblCa);
		
		lblCo = new JLabel("Cateto adyacente: ");
		lblCo.setBounds(30, 110, 120, 30);
		contentPane.add(lblCo);
		
		lblHi = new JLabel("Hipotenusa: ");
		lblHi.setBounds(30, 150, 120, 30);
		contentPane.add(lblHi);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtCa = new JTextField();
		txtCa.setBounds(160, 70, 120, 30);
		txtCa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCa.setMargin(insets);
		contentPane.add(txtCa);
		
		txtCo = new JTextField();
		txtCo.setBounds(160, 110, 120, 30);
		txtCo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCo.setMargin(insets);
		contentPane.add(txtCo);
		
		txtHi = new JTextField();
		txtHi.setEditable(false);
		txtHi.setBounds(160, 150, 120, 30);
		txtHi.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHi.setMargin(insets);
		contentPane.add(txtHi);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(300, 100, 100, 50);
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
		double ca = Double.parseDouble(txtCa.getText());
		double co = Double.parseDouble(txtCo.getText());
		
		double hi = Math.hypot(ca, co);
		
		DecimalFormat formatoDecimal = new DecimalFormat("##0.0000");
		
		txtHi.setText(formatoDecimal.format(hi));
	}

}
