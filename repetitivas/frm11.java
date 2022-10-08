package repetitivas;

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

public class frm11 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblTexto, lblResultado;
	JTextField txtResultado;
	JButton btnMostrar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTexto = new JLabel("Números capicúas de 3 cifras");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBounds(30, 30, 370, 30);
		contentPane.add(lblTexto);
		
		lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(116, 165, 100, 30);
		contentPane.add(lblResultado);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(226, 165, 100, 30);
		txtResultado.setEnabled(false);
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setMargin(insets);
		contentPane.add(txtResultado);
		
		btnMostrar = new JButton("Calcular");
		btnMostrar.setBounds(147, 101, 130, 30);
		btnMostrar.setMnemonic('a');
		contentPane.add(btnMostrar);
		
		btnMostrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnMostrar_Click();
			}
		});
		
	}

	protected void btnMostrar_Click() {
		int conteo = 0;
		
		for (int i = 100; i < 1000; i++) {
			String cifra = String.valueOf(i);
			char cifra1 = cifra.charAt(0);
			char cifra2 = cifra.charAt(1);
			char cifra3 = cifra.charAt(2);
			String capicua = "" + cifra3 + cifra2 + cifra1;
			
			if (cifra.equals(capicua)) {
				conteo = conteo + 1;
			}
		}

		txtResultado.setText(Integer.toString(conteo));
		
	}

}
