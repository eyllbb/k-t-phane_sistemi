/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

	private JMenuBar menuBar;
	private JButton button1;
	private JButton button2;
	private JLabel label1;
	private JLabel label10;
	private JLabel label11;
	private JLabel label13;
	private JLabel label14;
	private JLabel label16;
	private JLabel label17;
	private JLabel label18;
	private JLabel label19;
	private JLabel label20;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JPanel panel1;
	private JPanel panel2;
	private JTextField textfield1;
	private JTextField textfield10;
	private JTextField textfield11;
	private JTextField textfield12;
	private JTextField textfield13;
	private JTextField textfield14;
	private JTextField textfield15;
	private JTextField textfield16;
	private JTextField textfield17;
	private JTextField textfield18;
	private JTextField textfield19;
	private JTextField textfield4;
	private JTextField textfield5;
	private JTextField textfield6;
	private JTextField textfield7;
	private JTextField textfield8;

	//Constructor 
	public GUI_project(){

		this.setTitle("GUI_project");
		this.setSize(1063,547);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1063,547));
		contentPane.setBackground(new Color(0,0,0));


		button1 = new JButton();
		button1.setBounds(190,335,90,35);
		button1.setBackground(new Color(214,217,223));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("sansserif",0,12));
		button1.setText("KAYDET");
		button1.setVisible(true);

		button2 = new JButton();
		button2.setBounds(204,335,90,35);
		button2.setBackground(new Color(214,217,223));
		button2.setForeground(new Color(0,0,0));
		button2.setEnabled(true);
		button2.setFont(new Font("sansserif",0,12));
		button2.setText("KAYDET");
		button2.setVisible(true);

		label1 = new JLabel();
		label1.setBounds(412,132,367,34);
		label1.setBackground(new Color(214,217,223));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("sansserif",0,12));
		label1.setText("KITAP REZERVE ICIN UYGUN SECIMI YAPINIZ!");
		label1.setVisible(true);

		label10 = new JLabel();
		label10.setBounds(5,57,139,32);
		label10.setBackground(new Color(214,217,223));
		label10.setForeground(new Color(0,0,0));
		label10.setEnabled(true);
		label10.setFont(new Font("sansserif",0,12));
		label10.setText("KITAP_IADE_UYE_NO");
		label10.setVisible(true);

		label11 = new JLabel();
		label11.setBounds(5,96,244,29);
		label11.setBackground(new Color(214,217,223));
		label11.setForeground(new Color(0,0,0));
		label11.setEnabled(true);
		label11.setFont(new Font("sansserif",0,12));
		label11.setText("KITAP_IADE_CEP_NO");
		label11.setVisible(true);

		label13 = new JLabel();
		label13.setBounds(5,126,212,48);
		label13.setBackground(new Color(214,217,223));
		label13.setForeground(new Color(0,0,0));
		label13.setEnabled(true);
		label13.setFont(new Font("sansserif",0,12));
		label13.setText("KITAP_IADE_EDENIN_ADI");
		label13.setVisible(true);

		label14 = new JLabel();
		label14.setBounds(5,211,216,40);
		label14.setBackground(new Color(214,217,223));
		label14.setForeground(new Color(0,0,0));
		label14.setEnabled(true);
		label14.setFont(new Font("sansserif",0,12));
		label14.setText("IADE_KITAP_ADI");
		label14.setVisible(true);

		label16 = new JLabel();
		label16.setBounds(5,174,206,35);
		label16.setBackground(new Color(214,217,223));
		label16.setForeground(new Color(0,0,0));
		label16.setEnabled(true);
		label16.setFont(new Font("sansserif",0,12));
		label16.setText("KITAP_IADE_EDENIN_SOYADI");
		label16.setVisible(true);

		label17 = new JLabel();
		label17.setBounds(6,253,90,35);
		label17.setBackground(new Color(214,217,223));
		label17.setForeground(new Color(0,0,0));
		label17.setEnabled(true);
		label17.setFont(new Font("sansserif",0,12));
		label17.setText("IADE_KITAP_ID");
		label17.setVisible(true);

		label18 = new JLabel();
		label18.setBounds(5,293,195,39);
		label18.setBackground(new Color(214,217,223));
		label18.setForeground(new Color(0,0,0));
		label18.setEnabled(true);
		label18.setFont(new Font("sansserif",0,12));
		label18.setText("IADE_KITAP_ALIM_TARIHI");
		label18.setVisible(true);

		label19 = new JLabel();
		label19.setBounds(190,5,90,35);
		label19.setBackground(new Color(102,102,255));
		label19.setForeground(new Color(0,0,0));
		label19.setEnabled(true);
		label19.setFont(new Font("sansserif",0,12));
		label19.setText("ODUNC");
		label19.setVisible(true);

		label20 = new JLabel();
		label20.setBounds(206,5,90,35);
		label20.setBackground(new Color(214,217,223));
		label20.setForeground(new Color(0,0,0));
		label20.setEnabled(true);
		label20.setFont(new Font("sansserif",0,12));
		label20.setText("IADE");
		label20.setVisible(true);

		label3 = new JLabel();
		label3.setBounds(6,55,163,30);
		label3.setBackground(new Color(214,217,223));
		label3.setForeground(new Color(0,0,0));
		label3.setEnabled(true);
		label3.setFont(new Font("sansserif",0,12));
		label3.setText("KITAP_ALIM_UYE_NO");
		label3.setVisible(true);

		label4 = new JLabel();
		label4.setBounds(5,93,163,30);
		label4.setBackground(new Color(214,217,223));
		label4.setForeground(new Color(0,0,0));
		label4.setEnabled(true);
		label4.setFont(new Font("sansserif",0,12));
		label4.setText("KITAP_ALIM_CEP_NO");
		label4.setVisible(true);

		label5 = new JLabel();
		label5.setBounds(5,134,163,30);
		label5.setBackground(new Color(214,217,223));
		label5.setForeground(new Color(0,0,0));
		label5.setEnabled(true);
		label5.setFont(new Font("sansserif",0,12));
		label5.setText("KITABI_ALANIN_ADI");
		label5.setVisible(true);

		label6 = new JLabel();
		label6.setBounds(5,178,163,30);
		label6.setBackground(new Color(214,217,223));
		label6.setForeground(new Color(0,0,0));
		label6.setEnabled(true);
		label6.setFont(new Font("sansserif",0,12));
		label6.setText("KITABI_ALANIN_SOYADI");
		label6.setVisible(true);

		label7 = new JLabel();
		label7.setBounds(5,254,175,36);
		label7.setBackground(new Color(214,217,223));
		label7.setForeground(new Color(0,0,0));
		label7.setEnabled(true);
		label7.setFont(new Font("sansserif",0,12));
		label7.setText("ODUNC_KITAP_ID");
		label7.setVisible(true);

		label8 = new JLabel();
		label8.setBounds(5,217,147,32);
		label8.setBackground(new Color(214,217,223));
		label8.setForeground(new Color(0,0,0));
		label8.setEnabled(true);
		label8.setFont(new Font("sansserif",0,12));
		label8.setText("ODUNC_KITAP_ADI");
		label8.setVisible(true);

		label9 = new JLabel();
		label9.setBounds(5,298,181,23);
		label9.setBackground(new Color(214,217,223));
		label9.setForeground(new Color(0,0,0));
		label9.setEnabled(true);
		label9.setFont(new Font("sansserif",0,12));
		label9.setText("ODUNC_KITAP_ALIM_TARIHI");
		label9.setVisible(true);

		panel1 = new JPanel(null);
		panel1.setBorder(BorderFactory.createEtchedBorder(1));
		panel1.setBounds(27,163,467,375);
		panel1.setBackground(new Color(214,217,223));
		panel1.setForeground(new Color(0,0,0));
		panel1.setEnabled(true);
		panel1.setFont(new Font("sansserif",0,12));
		panel1.setVisible(true);

		panel2 = new JPanel(null);
		panel2.setBorder(BorderFactory.createEtchedBorder(1));
		panel2.setBounds(540,161,466,375);
		panel2.setBackground(new Color(214,217,223));
		panel2.setForeground(new Color(0,0,0));
		panel2.setEnabled(true);
		panel2.setFont(new Font("sansserif",0,12));
		panel2.setVisible(true);

		textfield1 = new JTextField();
		textfield1.setBounds(243,9,600,78);
		textfield1.setBackground(new Color(189,222,236));
		textfield1.setForeground(new Color(0,0,0));
		textfield1.setEnabled(true);
		textfield1.setFont(new Font("sansserif",0,12));
		textfield1.setText("                                          BASKENT UNIVERSITESI KUTUPHANE OTOMASYONU");
		textfield1.setVisible(true);

		textfield10 = new JTextField();
		textfield10.setBounds(226,223,233,31);
		textfield10.setBackground(new Color(255,255,255));
		textfield10.setForeground(new Color(0,0,0));
		textfield10.setEnabled(true);
		textfield10.setFont(new Font("sansserif",0,12));
		textfield10.setText("TUTUNAMAYANLAR");
		textfield10.setVisible(true);

		textfield11 = new JTextField();
		textfield11.setBounds(229,296,233,31);
		textfield11.setBackground(new Color(255,255,255));
		textfield11.setForeground(new Color(0,0,0));
		textfield11.setEnabled(true);
		textfield11.setFont(new Font("sansserif",0,12));
		textfield11.setText("10.21");
		textfield11.setVisible(true);

		textfield12 = new JTextField();
		textfield12.setBounds(228,51,233,31);
		textfield12.setBackground(new Color(255,255,255));
		textfield12.setForeground(new Color(0,0,0));
		textfield12.setEnabled(true);
		textfield12.setFont(new Font("sansserif",0,12));
		textfield12.setText("2345");
		textfield12.setVisible(true);

		textfield13 = new JTextField();
		textfield13.setBounds(228,88,233,31);
		textfield13.setBackground(new Color(255,255,255));
		textfield13.setForeground(new Color(0,0,0));
		textfield13.setEnabled(true);
		textfield13.setFont(new Font("sansserif",0,12));
		textfield13.setText("678900");
		textfield13.setVisible(true);

		textfield14 = new JTextField();
		textfield14.setBounds(228,251,233,31);
		textfield14.setBackground(new Color(255,255,255));
		textfield14.setForeground(new Color(0,0,0));
		textfield14.setEnabled(true);
		textfield14.setFont(new Font("sansserif",0,12));
		textfield14.setText("1");
		textfield14.setVisible(true);

		textfield15 = new JTextField();
		textfield15.setBounds(228,128,233,31);
		textfield15.setBackground(new Color(255,255,255));
		textfield15.setForeground(new Color(0,0,0));
		textfield15.setEnabled(true);
		textfield15.setFont(new Font("sansserif",0,12));
		textfield15.setText("RUKIYE");
		textfield15.setVisible(true);

		textfield16 = new JTextField();
		textfield16.setBounds(228,215,233,31);
		textfield16.setBackground(new Color(255,255,255));
		textfield16.setForeground(new Color(0,0,0));
		textfield16.setEnabled(true);
		textfield16.setFont(new Font("sansserif",0,12));
		textfield16.setText("ICIMIZDEKI SEYTAN");
		textfield16.setVisible(true);

		textfield17 = new JTextField();
		textfield17.setBounds(228,172,233,31);
		textfield17.setBackground(new Color(255,255,255));
		textfield17.setForeground(new Color(0,0,0));
		textfield17.setEnabled(true);
		textfield17.setFont(new Font("sansserif",0,12));
		textfield17.setText("DEMIRELLI");
		textfield17.setVisible(true);

		textfield18 = new JTextField();
		textfield18.setBounds(228,294,233,31);
		textfield18.setBackground(new Color(255,255,255));
		textfield18.setForeground(new Color(0,0,0));
		textfield18.setEnabled(true);
		textfield18.setFont(new Font("sansserif",0,12));
		textfield18.setText("11.2021");
		textfield18.setVisible(true);

		textfield19 = new JTextField();
		textfield19.setBounds(432,89,205,42);
		textfield19.setBackground(new Color(255,255,153));
		textfield19.setForeground(new Color(0,0,0));
		textfield19.setEnabled(true);
		textfield19.setFont(new Font("sansserif",0,12));
		textfield19.setText("        KITAP REZERVE SISTEMI");
		textfield19.setVisible(true);

		textfield4 = new JTextField();
		textfield4.setBounds(229,57,233,31);
		textfield4.setBackground(new Color(255,255,255));
		textfield4.setForeground(new Color(0,0,0));
		textfield4.setEnabled(true);
		textfield4.setFont(new Font("sansserif",0,12));
		textfield4.setText("3456");
		textfield4.setVisible(true);

		textfield5 = new JTextField();
		textfield5.setBounds(228,93,233,31);
		textfield5.setBackground(new Color(255,255,255));
		textfield5.setForeground(new Color(0,0,0));
		textfield5.setEnabled(true);
		textfield5.setFont(new Font("sansserif",0,12));
		textfield5.setText("781234");
		textfield5.setVisible(true);

		textfield6 = new JTextField();
		textfield6.setBounds(229,182,233,31);
		textfield6.setBackground(new Color(255,255,255));
		textfield6.setForeground(new Color(0,0,0));
		textfield6.setEnabled(true);
		textfield6.setFont(new Font("sansserif",0,12));
		textfield6.setText("OZDAS");
		textfield6.setVisible(true);

		textfield7 = new JTextField();
		textfield7.setBounds(229,259,233,31);
		textfield7.setBackground(new Color(255,255,255));
		textfield7.setForeground(new Color(0,0,0));
		textfield7.setEnabled(true);
		textfield7.setFont(new Font("sansserif",0,12));
		textfield7.setText("2");
		textfield7.setVisible(true);

		textfield8 = new JTextField();
		textfield8.setBounds(229,136,233,31);
		textfield8.setBackground(new Color(255,255,255));
		textfield8.setForeground(new Color(0,0,0));
		textfield8.setEnabled(true);
		textfield8.setFont(new Font("sansserif",0,12));
		textfield8.setText("EYLUL BEGUM");
		textfield8.setVisible(true);

		//adding components to contentPane panel
		panel1.add(button1);
		panel2.add(button2);
		contentPane.add(label1);
		panel2.add(label10);
		panel2.add(label11);
		panel2.add(label13);
		panel2.add(label14);
		panel2.add(label16);
		panel2.add(label17);
		panel2.add(label18);
		panel1.add(label19);
		panel2.add(label20);
		panel1.add(label3);
		panel1.add(label4);
		panel1.add(label5);
		panel1.add(label6);
		panel1.add(label7);
		panel1.add(label8);
		panel1.add(label9);
		contentPane.add(panel1);
		contentPane.add(panel2);
		contentPane.add(textfield1);
		panel1.add(textfield10);
		panel1.add(textfield11);
		panel2.add(textfield12);
		panel2.add(textfield13);
		panel2.add(textfield14);
		panel2.add(textfield15);
		panel2.add(textfield16);
		panel2.add(textfield17);
		panel2.add(textfield18);
		contentPane.add(textfield19);
		panel1.add(textfield4);
		panel1.add(textfield5);
		panel1.add(textfield6);
		panel1.add(textfield7);
		panel1.add(textfield8);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//method for generate menu
	public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}



	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
	}

}