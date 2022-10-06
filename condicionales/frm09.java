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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   
	    JTextField txtCódigo, txtUnidades, txtCompra, txtDescuento, txtTotal;
	    JButton btnCalcular;
      
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	    public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCódigo = new JLabel("Código :");
		lblCódigo.setBounds(30, 30, 80, 30);
		contentPane.add(lblCódigo);
		
		JLabel lblUnidades = new JLabel("Unidades :");
		lblUnidades.setBounds(30, 70, 80, 30);
		contentPane.add(lblUnidades);
		
		JLabel lblCompra = new JLabel("Compra :");
		lblCompra.setBounds(30,110, 80, 30);
		contentPane.add(lblCompra);
		
		JLabel lblDescuento = new JLabel("Descuento :");
		lblDescuento.setBounds(30, 150, 80, 30);
		contentPane.add(lblDescuento);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setBounds(30, 190, 80, 30);
		contentPane.add(lblTotal);
		

		Insets insets = new Insets(5,5,5,5);
		txtCódigo = new JTextField("");
		txtCódigo.setBounds(120, 30, 60, 30);
		txtCódigo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCódigo.setMargin(insets);
		contentPane.add(txtCódigo);
		
		txtUnidades = new JTextField("");
		txtUnidades.setBounds(120, 70, 60, 30);
		txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
		txtUnidades.setMargin(insets);
        contentPane.add(txtUnidades);
        
		txtCompra = new JTextField("");
		txtCompra.setBounds(120, 110, 60, 30);
		txtCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCompra.setMargin(insets);
		txtCompra.setFocusable(false);
		contentPane.add(txtCompra);
		
		txtDescuento = new JTextField("");
		txtDescuento.setBounds(120, 150, 60, 30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setMargin(insets);
		txtDescuento.setFocusable(false);
        contentPane.add(txtDescuento);
        
        txtTotal = new JTextField("");
		txtTotal.setBounds(120, 190, 60, 30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setMargin(insets);
		txtTotal.setFocusable(false);
        contentPane.add(txtTotal);
        
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(60, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) { btnCalcular_Click(); } });
	}
	    
	private void btnCalcular_Click() {
		int codigo = Integer.parseInt(txtCódigo.getText());
		int unidades = Integer.parseInt(txtUnidades.getText());
		
	    DecimalFormat df= new DecimalFormat("##.00");
	    double descuento = 0;
	    int precioUnitario = 0;
	    
	    if (codigo == 101) precioUnitario = 17;
	    else if (codigo == 102) precioUnitario = 25;
	    else if (codigo == 103) precioUnitario = 16;
	    else if (codigo == 104) precioUnitario = 27;
	    
	    double importecompra = precioUnitario * unidades;
	    
	    if ((unidades >= 1) && (unidades <= 10)) descuento = importecompra * 0.05;
	    if ((unidades >= 11) && (unidades <= 20)) descuento = importecompra * 0.08;
	    if ((unidades >= 21) && (unidades <= 30)) descuento = importecompra * 0.10;
	    if (unidades >= 31) descuento = importecompra * 0.13;
	    
	    double total = importecompra - descuento;
	    
	 txtCompra.setText(df.format(importecompra));
	 txtDescuento.setText(df.format(descuento));
	 txtTotal.setText(df.format(total));
  }
	
}
