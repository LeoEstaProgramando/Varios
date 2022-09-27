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

public class frm12 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblTitulo, lblFormula, lbla, lblb, lblc, lblraiz1, lblraiz2;
	JTextField txta, txtb, txtc, txtraiz1, txtraiz2;
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
		
		lblTitulo = new JLabel("ECUACION DE SEGUNDO GRADO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 450, 30);
		contentPane.add(lblTitulo);
		
		lblFormula = new JLabel("ax² + bx + c");
		lblFormula.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormula.setBounds(0, 70, 450, 30);
		contentPane.add(lblFormula);
		
		lbla = new JLabel("a: ");
		lbla.setBounds(30, 110, 120, 30);
		contentPane.add(lbla);
		
		lblb = new JLabel("b: ");
		lblb.setBounds(30, 150, 120, 30);
		contentPane.add(lblb);
		
		lblc = new JLabel("c: ");
		lblc.setBounds(30, 190, 120, 30);
		contentPane.add(lblc);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txta = new JTextField();
		txta.setBounds(70, 110, 120, 30);
		txta.setHorizontalAlignment(SwingConstants.RIGHT);
		txta.setMargin(insets);
		contentPane.add(txta);
		
		txtb = new JTextField();
		txtb.setBounds(70, 150, 120, 30);
		txtb.setHorizontalAlignment(SwingConstants.RIGHT);
		txtb.setMargin(insets);
		contentPane.add(txtb);
		
		txtc = new JTextField();
		txtc.setBounds(70, 190, 120, 30);
		txtc.setHorizontalAlignment(SwingConstants.RIGHT);
		txtc.setMargin(insets);
		contentPane.add(txtc);
		
		lblraiz1 = new JLabel("Raíz 1: ");
		lblraiz1.setBounds(230, 150, 120, 30);
		contentPane.add(lblraiz1);
		
		lblraiz2 = new JLabel("Raíz 2: ");
		lblraiz2.setBounds(230, 190, 120, 30);
		contentPane.add(lblraiz2);

		txtraiz1 = new JTextField();
		txtraiz1.setEditable(false);
		txtraiz1.setBounds(300, 150, 120, 30);
		txtraiz1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtraiz1.setMargin(insets);
		contentPane.add(txtraiz1);
		
		txtraiz2 = new JTextField();
		txtraiz2.setEditable(false);
		txtraiz2.setBounds(300, 190, 120, 30);
		txtraiz2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtraiz2.setMargin(insets);
		contentPane.add(txtraiz2);
		
		btnCalcular = new JButton("Calcular!");
		btnCalcular.setBounds(230, 110, 190, 30);
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
		int a = Integer.parseInt(txta.getText());
		int b = Integer.parseInt(txtb.getText());
		int c = Integer.parseInt(txtc.getText());
		
		double discriminante = (Math.pow(b, 2) - (4 * a * c));
		DecimalFormat formatoDecimal = new DecimalFormat("##0.00");
		
	    if (discriminante >= 0) {
	 
	        // Una solucion
	        if(discriminante == 0){

	        	double raiz1 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	            double raiz2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	             
	             txtraiz1.setText(formatoDecimal.format(raiz1));
		         txtraiz2.setText(formatoDecimal.format(raiz2));
	 
	        // Dos soluciones
	        }else{
	 
	            double raiz1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	            double raiz2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	            
	            txtraiz1.setText(formatoDecimal.format(raiz1));
	            txtraiz2.setText(formatoDecimal.format(raiz2));
	        }
	    } else {
	        // Sin solucion
	    	txtraiz1.setText(null);
            txtraiz2.setText(null);
	    }
		
		
		
	}

}
