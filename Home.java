import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lbl1,lbl2,lbl3,lbl4 ,Tlbl;
	JButton btn1,btn2,btn3;
	ImageIcon img;
	Color c1;
	Font f1;
	
	public Home()
	{
		super("Home Page");
		this.setBounds(0,0,1366,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(75,213,213);
		panel.setBackground(c1);
		ImageIcon img = new ImageIcon("rsz_logo.png");
		this.setIconImage(img.getImage());
		
		img = new ImageIcon("home.jpg");
		lbl1= new JLabel(img);
		
		lbl1.setBounds(700,0,700,768);
		panel.add(lbl1);
		
		
		//lbl2 = new JLabel();
		btn1 = new JButton("GET START");
		btn1.setBounds(150,370,400,40);
		btn1.setBackground(Color.RED);
		btn1.setForeground(Color.WHITE);
		f1 = new Font("Segou UI", Font.BOLD,25);
		btn1.setFont(f1);
		btn1.addActionListener(this);
		panel.add(btn1);
		
		//lbl3 = new JLabel();
		btn2 = new JButton("About US");
		btn2.setBounds(150,430,400,40);
		btn2.setBackground(Color.RED);
		btn2.setForeground(Color.WHITE);
		f1 = new Font("Arial", Font.BOLD,25);
		btn2.addActionListener(this);
		btn2.setFont(f1);
		panel.add(btn2);
		
		//lbl4 = new JLabel();
		btn3 = new JButton("EXIT");
		btn3.setBounds(150,490,400,40);
		btn3.setBackground(Color.RED);
		btn3.setForeground(Color.WHITE);
		f1 = new Font("Arial", Font.BOLD,25);
		btn3.setFont(f1);
		btn3.addActionListener(this);
		panel.add(btn3);
		
		Tlbl = new JLabel("Welcome To DIGITECH");
		Tlbl.setBounds(160,100,400,150);
		f1 = new Font("Camria", Font.BOLD,30);
		Tlbl.setFont(f1);
		Tlbl.setForeground(Color.blue);
		panel.add(Tlbl);
		
		
		
		
		
		
		
		
		
		this.add(panel);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn3)
		{
			System.exit(0);
			
		}
		else if(ae.getSource() == btn2)
		{
			Contribution contro = new Contribution();
		    contro.setVisible(true);
			this.setVisible(false);
		}	
		else if(ae.getSource() == btn1 )
		{
		Lgad log = new Lgad();
		log.setVisible(true);
		this.setVisible(false);
		}
	}
}