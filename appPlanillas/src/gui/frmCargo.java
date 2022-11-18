package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmCargo extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCargo frame = new frmCargo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmCargo() {
		setBounds(100, 100, 450, 300);

	}

}
