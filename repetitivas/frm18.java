package repetitivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm18 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JTextField txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm18 frame = new frm18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txaEjercicio = new JTextArea();
		txaEjercicio.setFocusable(false);
		txaEjercicio.setText("Desarrolle los métodos ltrim(), rtrim(), alltrim().");
		txaEjercicio.setLineWrap(true);
		txaEjercicio.setBounds(10, 11, 414, 53);
		contentPane.add(txaEjercicio);
		
		JLabel lblTexto = new JLabel("Ingrese texto:");
		lblTexto.setBounds(10, 75, 129, 34);
		contentPane.add(lblTexto);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(110, 75, 314, 34);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JButton btnLtrim = new JButton("LTRIM");
		btnLtrim.setBounds(110, 120, 89, 23);
		contentPane.add(btnLtrim);
		
		btnLtrim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLtrim_Click();
			}
		});
		
		JButton btnRtrim = new JButton("RTRIM");
		btnRtrim.setBounds(224, 120, 89, 23);
		contentPane.add(btnRtrim);
		
		btnRtrim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRtrim_Click();
			}
		});
		
		JButton btnAlltrim = new JButton("ALLTRIM");
		btnAlltrim.setBounds(335, 120, 89, 23);
		contentPane.add(btnAlltrim);
		
		btnAlltrim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAlltrim_Click();
			}
		});
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(10, 163, 129, 34);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(110, 163, 314, 34);
		contentPane.add(txtResultado);
	}

	protected void btnLtrim_Click() {
		String texto = txtTexto.getText();
		
		for (int i = 0; i < texto.length(); i++) {
			if (String.valueOf(texto.charAt(i)).equals(" ")) {
				continue;
			} else {
				String nuevo = texto.substring(i, texto.length());
				txtResultado.setText(nuevo);
				break;
			}
		}
	}

	protected void btnRtrim_Click() {
		String texto = txtTexto.getText();
		
		for (int i = texto.length() - 1; i >= 0; i--) {
			if (String.valueOf(texto.charAt(i)).equals(" ")) {
				continue;
			} else {
				String nuevo = texto.substring(0, i + 1);
				txtResultado.setText(nuevo);
				break;
			}
		}
	}

	protected void btnAlltrim_Click() {
		String texto = txtTexto.getText();
		String ltrim = "";
		
		for (int i = 0; i < texto.length(); i++) {
			if (String.valueOf(texto.charAt(i)).equals(" ")) {
				continue;
			} else {
				ltrim = texto.substring(i, texto.length());
				break;
			}
		}
		
		for (int i = ltrim.length() - 1; i >= 0; i--) {
			if (String.valueOf(ltrim.charAt(i)).equals(" ")) {
				continue;
			} else {
				String nuevo = ltrim.substring(0, i + 1);
				txtResultado.setText(nuevo);
				break;
			}
		}
	}

}
