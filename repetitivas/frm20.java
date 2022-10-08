package repetitivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class frm20 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEntrada;
	private JTextField txtPromedio;
	private JTextField txtMenor;
	private JTextField txtMayor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	ArrayList<Integer> numeros = new ArrayList<>();
	
	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txaEjercicio = new JTextArea();
		txaEjercicio.setFocusable(false);
		txaEjercicio.setLineWrap(true);
		txaEjercicio.setText("Diseñe el programa que muestre el Menor, Mayor, Promedio de una lista\r\n de 10 números.");
		txaEjercicio.setBounds(10, 11, 414, 56);
		contentPane.add(txaEjercicio);
		
		JLabel lblEntrada = new JLabel("Ingrese número:");
		lblEntrada.setBounds(20, 78, 95, 25);
		contentPane.add(lblEntrada);
		
		txtEntrada = new JTextField();
		txtEntrada.setMargin(new Insets(5, 5, 5, 5));
		txtEntrada.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEntrada.setBounds(125, 78, 114, 25);
		contentPane.add(txtEntrada);
		txtEntrada.setColumns(10);
		
		JTextArea txaNumeros = new JTextArea();
		txaNumeros.setFocusable(false);
		txaNumeros.setEnabled(false);
		txaNumeros.setEditable(false);
		txaNumeros.setBounds(267, 78, 141, 210);
		contentPane.add(txaNumeros);
		
		JLabel lblMenor = new JLabel("Número menor:");
		lblMenor.setBounds(20, 191, 95, 25);
		contentPane.add(lblMenor);
		
		txtPromedio = new JTextField();
		txtPromedio.setMargin(new Insets(5, 5, 5, 5));
		txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPromedio.setEditable(false);
		txtPromedio.setColumns(10);
		txtPromedio.setBounds(125, 263, 114, 25);
		contentPane.add(txtPromedio);
		
		JLabel lblMayor = new JLabel("Número mayor:");
		lblMayor.setBounds(20, 227, 95, 25);
		contentPane.add(lblMayor);
		
		JLabel lblPromedio = new JLabel("Promedio Total:");
		lblPromedio.setBounds(20, 263, 95, 25);
		contentPane.add(lblPromedio);
		
		txtMenor = new JTextField();
		txtMenor.setMargin(new Insets(5, 5, 5, 5));
		txtMenor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMenor.setEditable(false);
		txtMenor.setColumns(10);
		txtMenor.setBounds(125, 191, 114, 25);
		contentPane.add(txtMenor);
		
		txtMayor = new JTextField();
		txtMayor.setMargin(new Insets(5, 5, 5, 5));
		txtMayor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMayor.setEditable(false);
		txtMayor.setColumns(10);
		txtMayor.setBounds(125, 227, 114, 25);
		contentPane.add(txtMayor);
		
		txtEntrada.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (!txtEntrada.getText().isEmpty()) {
					int numero = Integer.parseInt(txtEntrada.getText());
					numeros.add(numero);
					txaNumeros.append(numero + "\n");
					txtEntrada.setText("");
				}
			}
		});
		
		JButton btnMenor = new JButton("Menor");
		btnMenor.setBounds(10, 114, 108, 25);
		contentPane.add(btnMenor);
		
		btnMenor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMenor_Click();
			}
		});
		
		JButton btnMayor = new JButton("Mayor");
		btnMayor.setBounds(10, 155, 108, 25);
		contentPane.add(btnMayor);
		
		btnMayor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMayor_Click();
			}
		});
		
		JButton btnPromedio = new JButton("Promedio");
		btnPromedio.setBounds(128, 114, 111, 66);
		contentPane.add(btnPromedio);
		
		btnPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPromedio_Click();
			}
		});
	}
	
	protected void btnMenor_Click() {
		int resultado = 20;
		
		for (int numero : numeros) {
			if (numero < resultado) {
				resultado = numero;
			}
		}
		
		txtMenor.setText(Integer.toString(resultado));
	}
	
	protected void btnMayor_Click() {
		int resultado = 0;
		
		for (int numero : numeros) {
			if (numero > resultado) {
				resultado = numero;
			}
		}
		
		txtMayor.setText(Integer.toString(resultado));
	}
	
	protected void btnPromedio_Click() {
		int suma = 0;
		
		for (int numero : numeros) {
			suma = suma + numero;
		}
		
		txtPromedio.setText(Integer.toString(suma / numeros.size()));
		
	}
}
