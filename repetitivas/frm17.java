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

public class frm17 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JTextField txtPalabra;
	private JTextField txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txaEjercicio = new JTextArea();
		txaEjercicio.setEditable(false);
		txaEjercicio.setLineWrap(true);
		txaEjercicio.setText("Desarrolle los métodos que implementen los métodos IndexOf de la clase String.");
		txaEjercicio.setBounds(10, 11, 414, 59);
		contentPane.add(txaEjercicio);
		
		JLabel lblTexto = new JLabel("Ingrese texto:");
		lblTexto.setBounds(10, 81, 99, 28);
		contentPane.add(lblTexto);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(119, 78, 305, 31);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel lblPalabra = new JLabel("Ingrese caracter:");
		lblPalabra.setBounds(10, 120, 99, 20);
		contentPane.add(lblPalabra);
		
		txtPalabra = new JTextField();
		txtPalabra.setBounds(119, 120, 89, 20);
		contentPane.add(txtPalabra);
		txtPalabra.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(237, 119, 89, 23);
		contentPane.add(btnBuscar);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBuscar_Click();
			}
		});
		
		JLabel lblResultado = new JLabel("IndexOf:");
		lblResultado.setBounds(10, 165, 99, 20);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(119, 165, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}

	protected void btnBuscar_Click() {
		String texto = txtTexto.getText();
		String palabra = txtPalabra.getText();
		
		for (int i = 0; i < texto.length(); i++) {
			if (palabra.equals(String.valueOf(texto.charAt(i)))) {
				txtResultado.setText(Integer.toString(i));
				break;
			} else {
				txtResultado.setText("No encontrado");
			}
		}
		
	}

}
