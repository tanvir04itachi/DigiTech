import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Contribution extends JFrame implements ActionListener
{
	JLabel lbl;
	JPanel panel;
	JButton btn1,btn2;
	ImageIcon img , image;
	Color c1;
	Font f1;
	
	public Contribution()
	{
	super("Contribution");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(10, 11, 66);
		panel.setBackground(c1);
		
		img = new ImageIcon("about.png");
		
		lbl = new JLabel(img);
		lbl.setBounds(700,0,700,768);
		panel.add(lbl);
		 
		 
		btn1 = new JButton("BACK");
		btn1.setBounds(150,430,400,40);
		btn1.setBackground(Color.RED);
		btn1.setForeground(Color.WHITE);
		f1 = new Font("Arial", Font.BOLD,25);
		btn1.addActionListener(this);
		btn1.setFont(f1);
		panel.add(btn1);
		
		btn2 = new JButton("EXIT");
		btn2.setBounds(150,490,400,40);
		btn2.setBackground(Color.RED);
		btn2.setForeground(Color.WHITE);
		f1 = new Font("Arial", Font.BOLD,25);
		btn2.setFont(f1);
		btn2.addActionListener(this);
		panel.add(btn2);
		
		
		image = new ImageIcon("logo.png");
		lbl = new JLabel(image);
		lbl.setBounds(180,10,300,300);
		panel.add(lbl);
		
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn2)
		{
			System.exit(0);
			
		}
		else if(ae.getSource() == btn1)
		{
            Home home = new Home();
		    home.setVisible(true);
			this.setVisible(false);
			
		}
		
	}
}