import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class catagory3 extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;
	JLabel t1,t2,logo;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,bkbtn;
	ImageIcon img;
	Color c1;
	public catagory3()
	{
		super("Catagory");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("framelogo.png");
		this.setIconImage(img.getImage());
	
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(126, 250, 193);
		panel.setBackground(c1);
		
		//d1
		btn1 = new JButton();
        btn1.setIcon(new ImageIcon("1.monitor.jpg"));
        btn1.setBounds(60, 160, 300, 220);
        btn1.setBackground(Color.white);
		btn1.addActionListener(this);
		panel.add(btn1);
       
        lbl1 = new JLabel("<html>Component 1<br>MONITOR</html>");
        lbl1.setBounds(60, 395, 300, 45);
        lbl1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lbl1);
		
		//d2
		btn2 = new JButton();
        btn2.setIcon(new ImageIcon("1.motherboard.jpg"));
        btn2.setBounds(380, 160, 300, 220);
        btn2.setBackground(Color.white);
		btn2.addActionListener(this);
		panel.add(btn2);

        lbl2 = new JLabel("<html>Component 2<br>MOTHER BOAER</html>");
        lbl2.setBounds(380, 395, 300, 45);
        lbl2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lbl2);
		
		//d3
		btn3 = new JButton();
        btn3.setIcon(new ImageIcon("1.gpu.jpg"));
        btn3.setBounds(700, 160, 300, 220);
        btn3.setBackground(Color.white);
		btn3.addActionListener(this);
		panel.add(btn3);
       
        lbl3 = new JLabel("<html>Component 3<br>GPU</html>");
        lbl3.setBounds(700, 395, 300, 45);
        lbl3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lbl3);
		
		//d4
		btn4 = new JButton();
        btn4.setIcon(new ImageIcon("1.cpu.jpg"));
        btn4.setBounds(1020, 160, 300, 220);
        btn4.setBackground(Color.white);
		btn4.addActionListener(this);
		panel.add(btn4);
       

        lbl4 = new JLabel("<html>Component 4<br>CPU</html>");
        lbl4.setBounds(1020, 395, 300, 45);
        lbl4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lbl4);
		//d5
		btn5 = new JButton();
        btn5.setIcon(new ImageIcon("1.ssd.jpg"));
        btn5.setBounds(60, 460, 300, 220);
        btn5.setBackground(Color.white);
		btn5.addActionListener(this);
		panel.add(btn5);
       

        lbl5 = new JLabel("<html>Component 5<br>SSD</html>");
        lbl5.setBounds(60, 685, 300, 45);
        lbl5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lbl5);
		
		//d6
		btn6 = new JButton();
        btn6.setIcon(new ImageIcon("1.mouse.jpg"));
        btn6.setBounds(380, 460, 300, 220);
        btn6.setBackground(Color.white);
		btn6.addActionListener(this);
		panel.add(btn6);
       

        lbl6 = new JLabel("<html>Component 6<br>MOUSE</html>");
        lbl6.setBounds(380, 685, 300, 45);
        lbl6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lbl6);
		
		//d7
		btn7 = new JButton();
        btn7.setIcon(new ImageIcon("1.headphone.jpg"));
        btn7.setBounds(700, 460, 300, 220);
        btn7.setBackground(Color.white);
		btn7.addActionListener(this);
		panel.add(btn7);
       

        lbl7 = new JLabel("<html>Component 7<br>HEADPHONE</html>");
        lbl7.setBounds(700, 685, 300, 45);
        lbl7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lbl7);
		
		//d8
		btn8 = new JButton();
        btn8.setIcon(new ImageIcon("1.keyboard.jpg"));
        btn8.setBounds(1020, 460, 300, 220);
        btn8.setBackground(Color.white);
		btn8.addActionListener(this);
		panel.add(btn8);
       

        lbl8 = new JLabel("<html>Component 8<br>KEYBOARD</html>");
        lbl8.setBounds(1020, 685, 300, 45);
        lbl8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lbl8);
		
		
		//TitledBorder
		t1 = new JLabel("Welcome to our DIGITECH");
        t1.setBounds(200, 30, 800, 80);
        t1.setFont(new Font("Segoe UI", Font.BOLD, 50));
		panel.add(t1);
        t2 = new JLabel("Find your all tech need here in one place");
        t2.setBounds(205, 80, 500, 60);
        t2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(t2);
		
		//logo error
		logo = new JLabel();
        logo.setIcon(new ImageIcon("rsz_logo.png"));
        logo.setBounds(80, 10, 120, 120);
		panel.add(logo);
		
		
		bkbtn = new JButton("Back");
        bkbtn.setBounds(1150,40,170,40);
        bkbtn.setForeground(Color.black);
        bkbtn.setFont(new Font("Serif", Font.BOLD, 30));
        bkbtn.setBackground(Color.orange);
		bkbtn.setContentAreaFilled(false);
		bkbtn.addActionListener(this);
		panel.add(bkbtn);
		
		
		
		
		
        
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn1)
		{
		Product111 p1 = new Product111();
		p1.setVisible(true);
		this.setVisible(false);
		}	
		
		else if(ae.getSource() == btn2)
		{
		Product222 p1 = new Product222();
		p1.setVisible(true);
		this.setVisible(false);
		}		
		
		else if(ae.getSource() == btn3)
		{
		Product333 p1 = new Product333();
		p1.setVisible(true);
		this.setVisible(false);
		}		
		
		else if(ae.getSource() == btn4)
		{
		Product444 p1 = new Product444();
		p1.setVisible(true);
		this.setVisible(false);
		}		
		
		else if(ae.getSource() == btn5)
		{
		Product555 p1 = new Product555();
		p1.setVisible(true);
		this.setVisible(false);
		}		
		
		else if(ae.getSource() == btn6)
		{
		Product666 p1 = new Product666();
		p1.setVisible(true);
		this.setVisible(false);
		}		
		
		else if(ae.getSource() == btn7)
		{
		Product777 p1 = new Product777();
		p1.setVisible(true);
		this.setVisible(false);
		}		
		
		else if(ae.getSource() == btn8)
		{
		Product888 p1 = new Product888();
		p1.setVisible(true);
		this.setVisible(false);
		}
			
		else if(ae.getSource() == bkbtn)
		{
		Uhome home = new Uhome();
		home.setVisible(true);
		this.setVisible(false);
		}
		
		
		
		
		
	}
	
	
	
	
	
}