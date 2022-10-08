package repetitivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frm19 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;


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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[90][90][90]", "[90][90][90][90][90]"));
		
		txtCodigo = new JTextField();
		txtCodigo.setBorder(null);
		txtCodigo.setFocusable(false);
		txtCodigo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txtCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtCodigo, "cell 0 0 3 1,grow");
		txtCodigo.setColumns(4);
		
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setForeground(new Color(255, 255, 255));
		btnBorrar.setBackground(new Color(255, 0, 0));
		contentPane.add(btnBorrar, "cell 0 4,grow");
		
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() > 0) {
					txtCodigo.setText(codigo.substring(0, codigo.length()-1));
				}
			}
		});
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(0, 128, 0));
		btnAceptar.setForeground(new Color(255, 255, 255));
		contentPane.add(btnAceptar, "cell 2 4,grow");
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		List<JButton> botones = Arrays.asList(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
		Collections.shuffle(botones);
		contentPane.add(botones.get(0), "cell 0 1,grow");
		contentPane.add(botones.get(1), "cell 1 1,grow");
		contentPane.add(botones.get(2), "cell 2 1,grow");
		contentPane.add(botones.get(3), "cell 0 2,grow");
		contentPane.add(botones.get(4), "cell 1 2,grow");
		contentPane.add(botones.get(5), "cell 2 2,grow");
		contentPane.add(botones.get(6), "cell 0 3,grow");
		contentPane.add(botones.get(7), "cell 1 3,grow");
		contentPane.add(botones.get(8), "cell 2 3,grow");
		contentPane.add(botones.get(9), "cell 1 4,grow");
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "0");
				}
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "1");
				}
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "2");
				}
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "3");
				}
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "4");
				}
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "5");
				}
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "6");
				}
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "7");
				}
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "8");
				}
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				if (codigo.length() < 4) {
					txtCodigo.setText(codigo + "9");
				}
			}
		});
		
		
		
	}

}
