
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lgad extends JFrame  implements ActionListener
{
	JPanel panel;
	JLabel t1;
	JButton btn1,btn2,btn3,btn4;
	Color color1;
	
	
	public Lgad()
	{
		super("LG AD");
		this.setBounds(0,0,1366,768); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(25,118,211); //(Red,Green,Blue)
		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		ImageIcon img = new ImageIcon("framelogo.png");
		this.setIconImage(img.getImage());
		
		
		btn1 = new JButton("Admin Login");
		btn1.setBounds(500,350,300,30);
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JButton("User Login");
		btn2.setBounds(500,400,300,30);
		btn2.addActionListener(this);
		panel.add(btn2);
		
		btn3 = new JButton("Back");
		btn3.setBounds(200,600,300,30);
		btn3.addActionListener(this);
		panel.add(btn3);
		
		btn4 = new JButton("EXIT");
		btn4.setBounds(800,600,300,30);
		btn4.addActionListener(this);
		panel.add(btn4);
		
		t1 = new JLabel("Welcome to our DIGITECH");
        t1.setBounds(300, 130, 800, 80);
        t1.setFont(new Font("Segoe UI", Font.BOLD, 60));
		panel.add(t1);


		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn4)
		{
			System.exit(0);
			
		}
		else if(ae.getSource() == btn3 )
		{
		Home home = new Home(); 
		home.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == btn2 )
		{
		ULogin obj1=new ULogin();
		obj1.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == btn1 )
		{
		ALogin obj2 = new ALogin();
		obj2.setVisible(true);
		this.setVisible(false);
		}
	}
	
	
}