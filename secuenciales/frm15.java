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

public class frm15 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel lblJuan, lblRosa, lblDaniel, lblTotal;
	JTextField txtJuan, txtRosa, txtDaniel, txtTotal, txtJuanPercent, txtRosaPercent, txtDanielPercent;
	JButton btnCalcular;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblJuan = new JLabel("Juan (USD): ");
		lblJuan.setBounds(30, 30, 80, 30);
		contentPane.add(lblJuan);
		
		lblRosa = new JLabel("Rosa (USD): ");
		lblRosa.setBounds(30, 70, 80, 30);
		contentPane.add(lblRosa);
		
		lblDaniel = new JLabel("Daniel (PEN): ");
		lblDaniel.setBounds(30, 110, 80, 30);
		contentPane.add(lblDaniel);
		
		lblTotal = new JLabel("Total (USD): ");
		lblTotal.setBounds(30, 150, 80, 30);
		contentPane.add(lblTotal);
		
		Insets insets = new Insets(5, 5, 5, 5);
		
		txtJuan = new JTextField();
		txtJuan.setBounds(120, 30, 100, 30);
		txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
		txtJuan.setMargin(insets);
		contentPane.add(txtJuan);
		
		txtRosa = new JTextField();
		txtRosa.setBounds(120, 70, 100, 30);
		txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRosa.setMargin(insets);
		contentPane.add(txtRosa);
		
		txtDaniel = new JTextField();
		txtDaniel.setBounds(120, 110, 100, 30);
		txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDaniel.setMargin(insets);
		contentPane.add(txtDaniel);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(120, 150, 100, 30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setMargin(insets);
		contentPane.add(txtTotal);
		
		txtJuanPercent = new JTextField();
		txtJuanPercent.setEnabled(false);
		txtJuanPercent.setBounds(230, 30, 100, 30);
		txtJuanPercent.setHorizontalAlignment(SwingConstants.RIGHT);
		txtJuanPercent.setMargin(insets);
		contentPane.add(txtJuanPercent);
		
		txtRosaPercent = new JTextField();
		txtRosaPercent.setEnabled(false);
		txtRosaPercent.setBounds(230, 70, 100, 30);
		txtRosaPercent.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRosaPercent.setMargin(insets);
		contentPane.add(txtRosaPercent);
		
		txtDanielPercent = new JTextField();
		txtDanielPercent.setEnabled(false);
		txtDanielPercent.setBounds(230, 110, 100, 30);
		txtDanielPercent.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDanielPercent.setMargin(insets);
		contentPane.add(txtDanielPercent);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(230, 150, 100, 30);
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
		double aporteJuan = Double.parseDouble(txtJuan.getText());
		double aporteRosa = Double.parseDouble(txtRosa.getText());
		double aporteDaniel = Double.parseDouble(txtDaniel.getText()) / 3;
		
		double aporteTotal = aporteJuan + aporteRosa + aporteDaniel;
		
		DecimalFormat formatoPercent = new DecimalFormat("##.##%");
		DecimalFormat formatoDecimal = new DecimalFormat("###,###.##");
		
		txtTotal.setText(formatoDecimal.format(aporteTotal));
		txtJuanPercent.setText(formatoPercent.format(aporteJuan / aporteTotal));
		txtRosaPercent.setText(formatoPercent.format(aporteRosa / aporteTotal));
		txtDanielPercent.setText(formatoPercent.format(aporteDaniel / aporteTotal));
	}

}
