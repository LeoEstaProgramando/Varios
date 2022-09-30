package condicionales;

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

public class frm12 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblTitulo, lblNumero, lblDia;
	JTextField txtNumero, txtDia;
	JButton btnCalcular;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("DÍA DE LA SEMANA");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblNumero = new JLabel("Número de día: ");
		lblNumero.setBounds(30, 70, 120, 30);
		contentPane.add(lblNumero);
		
		lblDia = new JLabel("Día de la semana: ");
		lblDia.setBounds(30, 110, 120, 30);
		contentPane.add(lblDia);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(160, 70, 120, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(insets);
		contentPane.add(txtNumero);
		
		txtDia = new JTextField();
		txtDia.setEditable(false);
		txtDia.setBounds(160, 110, 120, 30);
		txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia.setMargin(insets);
		contentPane.add(txtDia);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(300, 70, 120, 30);
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
		int numero = Integer.parseInt(txtNumero.getText());
		
		switch (numero) {
			case 1:
				txtDia.setText("Lunes");
				break;
			case 2:
				txtDia.setText("Martes");
				break;
			case 3:
				txtDia.setText("Miercoles");
				break;	
			case 4:
				txtDia.setText("Jueves");
				break;
			case 5:
				txtDia.setText("Viernes");
				break;
			case 6:
				txtDia.setText("Sábado");
				break;
			case 7:
				txtDia.setText("Domingo");
				break;
			default:
				txtDia.setText("Error");
				break;
		}	
	}
}
