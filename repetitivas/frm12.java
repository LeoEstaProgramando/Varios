package repetitivas;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextArea;

public class frm12 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTexto;
	private JTextArea txaResultado;
	private JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTexto = new JLabel("Desarrolle el programa que muestre los números de 1 a 100 a razón de 10 números por filas");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBounds(10, 11, 414, 70);
		contentPane.add(lblTexto);
		
		txaResultado = new JTextArea();
		txaResultado.setBounds(54, 133, 329, 215);
		txaResultado.setEditable(false);
		txaResultado.setMargin(new Insets(25, 25, 25, 25));
		contentPane.add(txaResultado);
		
		btnCalcular= new JButton("Calcular");
		btnCalcular.setBounds(147, 92, 130, 30);
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
		
		int conteo = 1;
		txaResultado.setText("");
		for (int i = 0; i < 10; i++) {
			for (int j = conteo; j < conteo + 10; j++) {
				DecimalFormat df = new DecimalFormat("000");
				txaResultado.append(df.format(j) + ", ");
			}
			conteo += 10;
			txaResultado.append("\n");
		}
		
		
	}

}
