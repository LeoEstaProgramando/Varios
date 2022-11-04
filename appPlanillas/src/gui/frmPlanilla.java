package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class frmPlanilla extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	Thread thHora = new Thread(this);
	JPanel pnlMenu, pnlSubMenu;
	JLabel lblSaludo, lblFecha, lblHora, lblUsuario, lblPC, imgFondo;
	JLabel lblMenu01,lblMenu02,lblMenu03,lblMenu04,lblMenu05,lblMenu06,lblMenu07,lblMenu08,lblMenu09,lblMenu10;
	JLabel imgMenu01,imgMenu02,imgMenu03,imgMenu04,imgMenu05,imgMenu06,imgMenu07,imgMenu08,imgMenu09,imgMenu10;
	JLabel lblSubMenu01,lblSubMenu02,lblSubMenu03,lblSubMenu04,lblSubMenu05,lblSubMenu06,lblSubMenu07,lblSubMenu08,lblSubMenu09,lblSubMenu10;	
	JButton btnTrabajadores, btnPlanillas, btnInformes, btnConfiguraciones, btnUtilitarios;

	JLabel aLblMenu[], aLblSubMenu[], aImgMenu[];
	String[][] aMenu = {
			{ "PERSONAL","ASIGNACIÓN CONCEPTOS","TABLAS" },
			{ "PROCESAR PLANILLLAS", "CALCULAR 5TA. CATEGORÍA", "GRATFICACIONES", "VACACIONES", "C.T.S", "LIQUIDACIÓN" }
	};
	
	String[][] aSubMenu = {
			{"Ficha del Personal", "Contratos", "Derecho habiente", "Control de permisos", "Control de asistencia", "Adelantos y/o Asistencia", "Préstamos", "Pre-Pos Natal / Bonificaciones"},
			{},
			{},
	};
	
	int Menu, SubMenu;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPlanilla frame = new frmPlanilla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frmPlanilla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		Image imageFondo=null, imageMenu=null;
		try {
			BufferedImage bufferedImage = ImageIO.read( new File( getClass().getResource("/gui/img/fondoApp.png" ).getFile() ) );
			imageFondo = bufferedImage.getScaledInstance(1366, 650, Image.SCALE_DEFAULT);
			
			bufferedImage = ImageIO.read( new File( getClass().getResource("/gui/img/logoMenu_1.png" ).getFile() ) );
			imageMenu = bufferedImage.getScaledInstance(180, 50, Image.SCALE_DEFAULT);
		} catch (IOException e) { e.printStackTrace(); }
		
		imgFondo = new JLabel();
		imgFondo.setBounds(0,80,1366,650);
		imgFondo.setIcon(new ImageIcon(imageFondo));
		contentPane.add(imgFondo);

		lblSaludo = new JLabel();
		lblSaludo.setBounds(0,50,1366,30);
		lblSaludo.setBackground( new Color(221,222,226));
		contentPane.add(lblSaludo);

		lblFecha = new JLabel();
		lblFecha.setBounds(1100,733,150,30);
		contentPane.add(lblFecha);
		
		lblHora = new JLabel();
		lblHora.setBounds(1250,733,150,30);
		contentPane.add(lblHora);
		
		JPanel pnlApp = new JPanel();
		pnlApp.setBounds(0,0,1366,50);
		pnlApp.setBackground( new Color(90,17,93) );
		pnlApp.setLayout(null);
		contentPane.add(pnlApp);
		
		JLabel imgLogo = new JLabel();
		imgLogo.setBounds(10,3,208,43);
		imgLogo.setIcon(new ImageIcon(getClass().getResource("/gui/img/logo.png")));
		pnlApp.add(imgLogo);
		
		JLabel imgCerrar = new JLabel();
		imgCerrar.setBounds(1320,9,32,32);
		imgCerrar.setIcon(new ImageIcon(getClass().getResource("/gui/img/cerrar.png")));
		pnlApp.add(imgCerrar);

		btnTrabajadores = new JButton("TRABAJADORES");
		btnTrabajadores.setName("1");
		btnTrabajadores.setBounds(250,0,150,50);
		btnTrabajadores.setBackground( new Color(90,17,93) );
		btnTrabajadores.setBorderPainted(false);
		btnTrabajadores.setFocusPainted(false);
		btnTrabajadores.setForeground(Color.white);
		pnlApp.add(btnTrabajadores);
		
		btnPlanillas = new JButton("PLANILLAS");
		btnPlanillas.setName("2");
		btnPlanillas.setBounds(400,0,150,50);
		btnPlanillas.setBackground( new Color(90,17,93) );
		btnPlanillas.setBorderPainted(false);
		btnPlanillas.setFocusPainted(false);
		btnPlanillas.setForeground(Color.white);
		pnlApp.add(btnPlanillas);

		btnInformes = new JButton("INFORMES");
		btnInformes.setName("3");
		btnInformes.setBounds(550,0,150,50);
		btnInformes.setBackground( new Color(90,17,93) );
		btnInformes.setBorderPainted(false);
		btnInformes.setFocusPainted(false);
		btnInformes.setForeground(Color.white);
		pnlApp.add(btnInformes);
		
		btnConfiguraciones = new JButton("CONFIGURACIONES");
		btnConfiguraciones.setName("4");
		btnConfiguraciones.setBounds(700,0,150,50);
		btnConfiguraciones.setBackground( new Color(90,17,93) );
		btnConfiguraciones.setBorderPainted(false);
		btnConfiguraciones.setFocusPainted(false);
		btnConfiguraciones.setForeground(Color.white);
		pnlApp.add(btnConfiguraciones);
		
		btnUtilitarios = new JButton("UTILITARIOS");
		btnUtilitarios.setName("5");
		btnUtilitarios.setBounds(850,0,150,50);
		btnUtilitarios.setBackground( new Color(90,17,93) );
		btnUtilitarios.setBorderPainted(false);
		btnUtilitarios.setFocusPainted(false);
		btnUtilitarios.setForeground(Color.white);
		pnlApp.add(btnUtilitarios);
		
		pnlMenu = new JPanel();
		pnlMenu.setBounds(1,50,250,650);
		pnlMenu.setBackground( new Color(57, 66, 69) );
		pnlMenu.setLayout(null);
		pnlMenu.setVisible(false);
		contentPane.add(pnlMenu);
		
		JLabel imgMenu = new JLabel();
		imgMenu.setBounds(35,0,250,55);
		imgMenu.setIcon(new ImageIcon(imageMenu));
		pnlMenu.add(imgMenu);
		
		lblMenu01 = new JLabel();
		lblMenu01.setIconTextGap(10);
		lblMenu01.setForeground( Color.white );
		pnlMenu.add(lblMenu01);
		
		lblMenu02 = new JLabel();
		lblMenu02.setIconTextGap(10);
		lblMenu02.setForeground( Color.white );
		pnlMenu.add(lblMenu02);

		lblMenu03 = new JLabel();
		lblMenu03.setIconTextGap(10);
		lblMenu03.setForeground( Color.white );
		pnlMenu.add(lblMenu03);
		
		lblMenu04 = new JLabel();
		lblMenu04.setIconTextGap(10);
		lblMenu04.setForeground( Color.white );
		pnlMenu.add(lblMenu04);
		
		lblMenu05 = new JLabel();
		lblMenu05.setIconTextGap(10);
		lblMenu05.setForeground( Color.white );
		pnlMenu.add(lblMenu05);

		lblMenu06 = new JLabel();
		lblMenu06.setIconTextGap(10);
		lblMenu06.setForeground( Color.white );
		pnlMenu.add(lblMenu06);
		
		lblMenu07 = new JLabel();
		lblMenu07.setIconTextGap(10);
		lblMenu07.setForeground( Color.white );
		pnlMenu.add(lblMenu07);

		lblMenu08 = new JLabel();
		lblMenu08.setIconTextGap(10);
		lblMenu08.setForeground( Color.white );
		pnlMenu.add(lblMenu08);
		
		lblMenu09 = new JLabel();
		lblMenu09.setIconTextGap(10);
		lblMenu09.setForeground( Color.white );
		pnlMenu.add(lblMenu09);

		lblMenu10 = new JLabel();
		lblMenu10.setIconTextGap(10);
		lblMenu10.setForeground( Color.white );
		pnlMenu.add(lblMenu10);
		
		imgMenu01 = new JLabel();
		pnlMenu.add(imgMenu01);
		
		imgMenu02 = new JLabel();
		pnlMenu.add(imgMenu02);

		imgMenu03 = new JLabel();
		pnlMenu.add(imgMenu03);

		imgMenu04 = new JLabel();
		pnlMenu.add(imgMenu04);

		imgMenu05 = new JLabel();
		pnlMenu.add(imgMenu05);

		imgMenu06 = new JLabel();
		pnlMenu.add(imgMenu06);

		imgMenu07 = new JLabel();
		pnlMenu.add(imgMenu07);

		imgMenu08 = new JLabel();
		pnlMenu.add(imgMenu08);

		imgMenu09 = new JLabel();
		pnlMenu.add(imgMenu09);

		imgMenu10 = new JLabel();
		pnlMenu.add(imgMenu10);

		
		this.addWindowListener(new WindowAdapter() { @Override public void windowOpened(WindowEvent e) { form_windowsOpened(); } });
		
		imgCerrar.addMouseListener(new MouseAdapter() { @Override public void mouseClicked(MouseEvent e) { imgCerrar_Clicked(); } });

		btnTrabajadores.addMouseListener(new MouseAdapter() { 
			@Override public void mouseEntered(MouseEvent e) { btnApp_mouseEntered(e); } 
			@Override public void mouseExited(MouseEvent e) { btnApp_mouseExited(e); }	
			@Override public void mouseClicked(MouseEvent e) { btnMenu_mouseClicked(e);	} } );
		
		btnPlanillas.addMouseListener(new MouseAdapter() { 
			@Override public void mouseEntered(MouseEvent e) { btnApp_mouseEntered(e); } 
			@Override public void mouseExited(MouseEvent e) { btnApp_mouseExited(e); } 
			@Override public void mouseClicked(MouseEvent e) { btnMenu_mouseClicked(e); } } );
		
		btnInformes.addMouseListener(new MouseAdapter() { 
			@Override public void mouseEntered(MouseEvent e) { btnApp_mouseEntered(e); } 
			@Override public void mouseExited(MouseEvent e) { btnApp_mouseExited(e); } 
			@Override public void mouseClicked(MouseEvent e) { btnMenu_mouseClicked(e); } });
		
		btnConfiguraciones.addMouseListener(new MouseAdapter() { 
			@Override public void mouseEntered(MouseEvent e) { btnApp_mouseEntered(e); } 
			@Override public void mouseExited(MouseEvent e) { btnApp_mouseExited(e); } 
			@Override public void mouseClicked(MouseEvent e) { btnMenu_mouseClicked(e); } });
	
		btnUtilitarios.addMouseListener(new MouseAdapter() { 
			@Override public void mouseEntered(MouseEvent e) { btnApp_mouseEntered(e); } 
			@Override public void mouseExited(MouseEvent e) { btnApp_mouseExited(e); } 
			@Override public void mouseClicked(MouseEvent e) { btnMenu_mouseClicked(e); } });
	}

	protected void form_windowsOpened() {
		aLblMenu = new JLabel[] { lblMenu01,lblMenu02,lblMenu03,lblMenu04,lblMenu05,lblMenu06,lblMenu07,lblMenu08,lblMenu09,lblMenu10 };
		aLblSubMenu = new JLabel[] { lblSubMenu01,lblSubMenu02,lblSubMenu03,lblSubMenu04,lblSubMenu05,lblSubMenu06,lblSubMenu07,lblSubMenu08,lblSubMenu09,lblSubMenu10 };
		aImgMenu = new JLabel[] { imgMenu01,imgMenu02,imgMenu03,imgMenu04,imgMenu05,imgMenu06,imgMenu07,imgMenu08,imgMenu09,imgMenu10 };
		
		lblSaludo.setText("    Hola " + "" + ",Bienvenido al Sistema de Planilla X6");
		lblFecha.setText( "Fecha : " + new SimpleDateFormat("dd/MM/yyy").format( new Date() ) );
		thHora.start();
	}

	protected void btnApp_mouseEntered(MouseEvent e) {
		e.getComponent().setBackground( new Color(134,37,158) );
	}

	protected void btnApp_mouseExited(MouseEvent e) {
		e.getComponent().setBackground( new Color(90,17,93) );
	}

	protected void btnMenu_mouseClicked(MouseEvent e) {
		Menu = Integer.parseInt( ((JButton) e.getSource()).getName() ) - 1;
		lblSaludo.setVisible(false);
		imgFondo.setVisible(false);
		pnlMenu.setVisible(true);
		//pnlSubMenu.setVisible(false);
		
		for( JLabel lblMenu : aLblMenu ) lblMenu.setVisible(false);
		//for( JLabel lblSubMenu : aLblSubMenu ) lblSubMenu.setVisible(false);
		for( JLabel imgMenu : aImgMenu ) imgMenu.setVisible(false);
		
		for( int i=0; i < aMenu[Menu].length; i++ ) {
			aLblMenu[i].setBounds(10,80 + i*30,200,25);
			aLblMenu[i].setIcon(new ImageIcon(getClass().getResource("/gui/img/menu" + (Menu + 1) + (i + 1) + ".png")));
			aLblMenu[i].setText( aMenu[Menu][i] );
			aLblMenu[i].setVisible(true);
			
			aImgMenu[i].setBounds(215,80 + i*30,20,20);
			aImgMenu[i].setIcon(new ImageIcon(getClass().getResource("/gui/img/abajo.png")));
			aImgMenu[i].setVisible(true);
		}
		
		
		
		//imgMenu01.setBounds(215,60,20,20);
		//imgMenu01.setIcon(new ImageIcon(getClass().getResource("/gui/img/abajo.png")));
		//lblMenu01.setIcon(new ImageIcon(getClass().getResource("/gui/img/menu11.png")));

	}

	protected void imgCerrar_Clicked() {
//		if ( JOptionPane.showConfirmDialog(this, "� Desea salir de la app ?", "Salir", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION )
			System.exit(0);
	}

	@Override
	public void run() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		while(true) {
			lblHora.setText("Hora : " + dateFormat.format( new Date()) );
			try { thHora.sleep(1000);
			} catch (InterruptedException e) { e.printStackTrace();}
		}
			
		
	}


}
