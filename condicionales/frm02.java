package condicionales;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JTextField txtUnidades;
	JTextArea txaRpta;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("Unidades : ");
		lblUnidades.setBounds(30, 30, 80, 30);
		contentPane.add(lblUnidades);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(120,30,60,30);
		txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
		txtUnidades.setMargin( new Insets(5,5,5,5) );
		contentPane.add(txtUnidades);
		
		txaRpta = new JTextArea();
		txaRpta.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txaRpta.setFocusable(false);
		
		JScrollPane jsPane = new JScrollPane(txaRpta);
		jsPane.setBounds(40,70,150,150);
		contentPane.add(jsPane);
				
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60,240,100,30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_Click(); } });
	}
	
	private void btnCalcular_Click() {
		int unidades = Integer.parseInt( txtUnidades.getText() );
		
		int precio = 20;
		int compra = unidades * precio;
		int caramelos = unidades <= 50 ? 5 : unidades > 100 ? 15 : 10;
		double descuento = ( compra <= 500 ? 0.12 : compra > 700 ? 0.16 : 0.14 ) * compra;
		
		txaRpta.setText("");
		DecimalFormat df = new DecimalFormat("##.00");
		txaRpta.append( " Precio    : " + df.format(precio) + "\n" );
		txaRpta.append( " Compra    : " + df.format(compra) + "\n" );
		txaRpta.append( " Descuento : " + df.format(descuento) + "\n" );
		txaRpta.append( " Total     : " + df.format(compra - descuento) + "\n" );
		txaRpta.append( " Caramelos : " + df.format(caramelos) + "\n" );
	}

}