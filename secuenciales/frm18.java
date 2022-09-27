package secuenciales;

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

public class frm18 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblPrecio, lblCantidad, lblImporte, lblDescuento, lblTotal;
	JTextField txtPrecio, txtCantidad, txtImporte, txtDescuento, txtTotal;
	JButton btnCalcular;

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
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblPrecio = new JLabel("Precio (S/): ");
		lblPrecio.setBounds(30, 30, 120, 30);
		contentPane.add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad (unid.): ");
		lblCantidad.setBounds(30, 70, 120, 30);
		contentPane.add(lblCantidad);
		
		lblImporte = new JLabel("Importe de Compra: ");
		lblImporte.setBounds(30, 150, 120, 30);
		contentPane.add(lblImporte);
		
		lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(30, 190, 120, 30);
		contentPane.add(lblDescuento);
		
		lblTotal = new JLabel("Total a Pagar: ");
		lblTotal.setBounds(30, 230, 120, 30);
		contentPane.add(lblTotal);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(160, 30, 100, 30);
		txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrecio.setMargin(insets);
		contentPane.add(txtPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(160, 70, 100, 30);
		txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidad.setMargin(insets);
		contentPane.add(txtCantidad);
		
		txtImporte = new JTextField();
		txtImporte.setEditable(false);
		txtImporte.setBounds(160, 150, 100, 30);
		txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
		txtImporte.setMargin(insets);
		contentPane.add(txtImporte);
		
		txtDescuento = new JTextField();
		txtDescuento.setEditable(false);
		txtDescuento.setBounds(160, 190, 100, 30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setMargin(insets);
		contentPane.add(txtDescuento);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(160, 230, 100, 30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setMargin(insets);
		contentPane.add(txtTotal);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(270, 30, 130, 70);
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
		double precio = Double.parseDouble(txtPrecio.getText());
		int cantidad = Integer.parseInt(txtCantidad.getText());
		
		double importe = precio * cantidad;
		double descuento = (importe * 0.85) * 0.15;
		double total = importe - descuento;
		
		DecimalFormat formatoSoles = new DecimalFormat("S/ ###,###.00");
		
		txtImporte.setText(formatoSoles.format(importe));
		txtDescuento.setText(formatoSoles.format(descuento));
		txtTotal.setText(formatoSoles.format(total));

	}

}
