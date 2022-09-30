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

public class frm19 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblTitulo, lblSexo, lblEdad, lblCategoria;
	JTextField txtSexo, txtEdad, txtCategoria;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("CATEGORÍA DE POSTULANTE");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(30, 70, 120, 30);
		contentPane.add(lblSexo);
		
		lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(30, 110, 120, 30);
		contentPane.add(lblEdad);
		
		lblCategoria = new JLabel("Categoría: ");
		lblCategoria.setBounds(30, 150, 120, 30);
		contentPane.add(lblCategoria);
						
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtSexo = new JTextField();
		txtSexo.setBounds(160, 70, 120, 30);
		txtSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSexo.setMargin(insets);
		contentPane.add(txtSexo);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(160, 110, 120, 30);
		txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEdad.setMargin(insets);
		contentPane.add(txtEdad);
		
		txtCategoria = new JTextField();
		txtCategoria.setEditable(false);
		txtCategoria.setBounds(160, 150, 120, 30);
		txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCategoria.setMargin(insets);
		contentPane.add(txtCategoria);
				
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(300, 110, 120, 30);
		btnCalcular.setMnemonic('c');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click();
			}
		});
	}

	protected void btnCalcular_Click() {
		String sexo = txtSexo.getText();
		int edad = Integer.parseInt(txtEdad.getText());
		String categoria = null;
		
		if (sexo.equals("Femenino")) {
			categoria = (edad < 23) ? "FA" : "FB";
		} else if (sexo.equals("Masculino")) {
			categoria = (edad < 25) ? "MA" : "MB";
		}
		
		txtCategoria.setText(categoria);
	}

}
