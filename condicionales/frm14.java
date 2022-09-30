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

import com.ibm.icu.text.DecimalFormat;

public class frm14 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblTitulo, lblCompra, lblTarjeta, lblDescuento, lblTotal;
	JTextField txtCompra, txtTarjeta, txtDescuento, txtTotal;
	JButton btnSacar, btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("TARJETA SORPRESA!   DESCUENTO?");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblCompra = new JLabel("Importe de Compra: ");
		lblCompra.setBounds(30, 70, 120, 30);
		contentPane.add(lblCompra);
		
		lblTarjeta = new JLabel("Tarjeta: ");
		lblTarjeta.setBounds(30, 110, 120, 30);
		contentPane.add(lblTarjeta);
		
		lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(30, 150, 120, 30);
		contentPane.add(lblDescuento);
		
		lblTotal = new JLabel("Total a pagar: ");
		lblTotal.setBounds(30, 190, 120, 30);
		contentPane.add(lblTotal);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtCompra = new JTextField();
		txtCompra.setBounds(160, 70, 120, 30);
		txtCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCompra.setMargin(insets);
		contentPane.add(txtCompra);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setEnabled(false);
		txtTarjeta.setBounds(160, 110, 120, 30);
		txtTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTarjeta.setMargin(insets);
		contentPane.add(txtTarjeta);
		
		txtDescuento = new JTextField();
		txtDescuento.setEditable(false);
		txtDescuento.setBounds(160, 150, 120, 30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setMargin(insets);
		contentPane.add(txtDescuento);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(160, 190, 120, 30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setMargin(insets);
		contentPane.add(txtTotal);
		
		btnSacar = new JButton("Sacar tarjeta");
		btnSacar.setBounds(300, 70, 120, 30);
		btnSacar.setMnemonic('s');
		contentPane.add(btnSacar);
		
		btnSacar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnSacar_Click();
			}
		});
		
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

	protected void btnSacar_Click() {
		int tarjeta = (int) (Math.random()*200+1);
		txtTarjeta.setText(Integer.toString(tarjeta));
		
	}
	
	protected void btnCalcular_Click() {
		double compra = Double.parseDouble(txtCompra.getText());
		int tarjeta = Integer.parseInt(txtTarjeta.getText());
		double descuento = 0;
		
		if (tarjeta % 2 == 0 && tarjeta >= 100) {
			descuento = compra * 0.15;
		} else {
			descuento = compra * 0.05;
		}
		
		DecimalFormat formatoSoles = new DecimalFormat("S/ ###,###.00");
		
		txtDescuento.setText(formatoSoles.format(descuento));
		txtTotal.setText(formatoSoles.format(compra - descuento));
	}
}
