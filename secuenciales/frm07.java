package secuenciales;

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
import javax.swing.border.EmptyBorder;

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JLabel lblBase, lblAltura, lblArea, lblPerimetro;
	JTextField txtBase, txtAltura, txtArea, txtPerimetro;
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
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblBase = new JLabel("Base : ");
		lblBase.setBounds(30, 30, 70, 30);
		contentPane.add(lblBase);
		
		lblAltura = new JLabel("Altura : ");
		lblAltura.setBounds(30, 70, 70, 30);
		contentPane.add(lblAltura);
		
		lblArea = new JLabel("Area : ");
		lblArea.setBounds(30, 110, 70, 30);
		contentPane.add(lblArea);
		
		lblPerimetro = new JLabel("Perimetro : ");
		lblPerimetro.setBounds(30, 150, 70, 30);
		contentPane.add(lblPerimetro);
		
		txtBase = new JTextField();
		txtBase.setBounds(100, 30, 80, 30);
		txtBase.setHorizontalAlignment(JTextField.RIGHT);;
		txtBase.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtBase);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(100, 70, 80, 30);
		txtAltura.setHorizontalAlignment(JTextField.RIGHT);;
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		contentPane.add(txtAltura);
		
		txtArea = new JTextField();
		txtArea.setBounds(100, 110, 80, 30);
		txtArea.setHorizontalAlignment(JTextField.RIGHT);;
		txtArea.setMargin(new Insets(5, 5, 5, 5));
		txtArea.setFocusable(false);
		contentPane.add(txtArea);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(100, 150, 80, 30);
		txtPerimetro.setHorizontalAlignment(JTextField.RIGHT);;
		txtPerimetro.setMargin(new Insets(5, 5, 5, 5));
		txtPerimetro.setFocusable(false);
		contentPane.add(txtPerimetro);
		
		btnCalcular = new JButton("Calcular ");
		btnCalcular.setBounds(60, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	private void btnCalcular_Click() {
		int base = Integer.parseInt(txtBase.getText() );
		int altura = Integer.parseInt(txtAltura.getText() );
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtArea.setText( df.format(area) );
		txtPerimetro.setText( df.format(perimetro) );
	}

}

