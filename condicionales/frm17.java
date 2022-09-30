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

public class frm17 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblTitulo, lblCantidad, lblPrecio, lblCompra, lblDescuento, lblTotal, lblObsequio;
	JTextField txtCantidad, txtPrecio, txtCompra, txtDescuento, txtTotal, txtObsequio;
	JButton btnCalcular;

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
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("FACTURA LAPICEROS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblCantidad = new JLabel("Cantidad (docenas): ");
		lblCantidad.setBounds(30, 70, 120, 30);
		contentPane.add(lblCantidad);
		
		lblPrecio = new JLabel("Precio (S/): ");
		lblPrecio.setBounds(30, 110, 120, 30);
		contentPane.add(lblPrecio);
		
		lblCompra = new JLabel("Importe de Compra: ");
		lblCompra.setBounds(30, 150, 120, 30);
		contentPane.add(lblCompra);
		
		lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(30, 190, 120, 30);
		contentPane.add(lblDescuento);
		
		lblTotal = new JLabel("Total a Pagar: ");
		lblTotal.setBounds(30, 230, 120, 30);
		contentPane.add(lblTotal);
		
		lblObsequio = new JLabel("Obsequio (unid.): ");
		lblObsequio.setBounds(30, 270, 120, 30);
		contentPane.add(lblObsequio);
				
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(160, 70, 120, 30);
		txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidad.setMargin(insets);
		contentPane.add(txtCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(160, 110, 120, 30);
		txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrecio.setMargin(insets);
		contentPane.add(txtPrecio);
		
		txtCompra = new JTextField();
		txtCompra.setEditable(false);
		txtCompra.setBounds(160, 150, 120, 30);
		txtCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCompra.setMargin(insets);
		contentPane.add(txtCompra);
		
		txtDescuento = new JTextField();
		txtDescuento.setEditable(false);
		txtDescuento.setBounds(160, 190, 120, 30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setMargin(insets);
		contentPane.add(txtDescuento);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(160, 230, 120, 30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setMargin(insets);
		contentPane.add(txtTotal);
		
		txtObsequio = new JTextField();
		txtObsequio.setEditable(false);
		txtObsequio.setBounds(160, 270, 120, 30);
		txtObsequio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtObsequio.setMargin(insets);
		contentPane.add(txtObsequio);
		
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
		int cantidad = Integer.parseInt(txtCantidad.getText());
		double precio = Double.parseDouble(txtPrecio.getText());
		
		double compra = cantidad * precio;
		double descuento = (cantidad >= 6) ? compra * 0.15 : compra * 0.10;
		double total = compra - descuento;
		int obsequio = (cantidad >= 30) ? (cantidad / 3) * 2 : 0;
		
		DecimalFormat formatoSoles = new DecimalFormat("S/ ###,###.00");
		
		txtCompra.setText(formatoSoles.format(compra));
		txtDescuento.setText(formatoSoles.format(descuento));
		txtTotal.setText(formatoSoles.format(total));
		txtObsequio.setText(Integer.toString(obsequio));
		
	}

}
