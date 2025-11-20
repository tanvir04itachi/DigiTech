import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Uhome extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel label1, label2, label3, label4, ll3;
    JButton l1, l2, l3, l4, l5, l6, l7, l8, bl4,bkbtn,back;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    ImageIcon i1,img;
	Color color1;
	Font f1;
	public Uhome()
	{
		super("Home Page");
		this.setBounds(0,0,1366,768); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(25,118,211); //(Red,Green,Blue)
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		
		
		
		label2 = new JLabel("Welcome to our DIGITECH");
        label2.setBounds(200, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));
		panel.add(label2);

        label3 = new JLabel("Find your all tech need here in one place");
        label3.setBounds(205, 80, 500, 60);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(label3);

        label4 = new JLabel("Select which catagory product");
        label4.setBounds(80, 110, 500, 60);
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(label4);
		
		//desk
		b4 = new JButton();
        b4.setIcon(new ImageIcon("1.jpg"));
        b4.setBounds(60, 460, 300, 220);
        b4.setContentAreaFilled(false);
		b4.addActionListener(this);
        //b4.setBorderPainted(false);
		panel.add(b4);
        l1 = new JButton("Desktop");
        l1.setBounds(60, 685, 300, 35);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        panel.add(l1);
		
		//lap
		b5 = new JButton();
        b5.setIcon(new ImageIcon("11.png"));
        b5.setBounds(380, 460, 300, 220);
		b5.setContentAreaFilled(false);
		b5.addActionListener(this);
        //b5.setBorderPainted(false);
		panel.add(b5);
        
        l2 = new JButton("Laptop");
        l2.setBounds(380, 685, 300, 35);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(l2);
		
		//COMPO 
		
		b6 = new JButton();
        b6.setIcon(new ImageIcon("111.jpg"));
        b6.setBounds(700, 460, 300, 220);
		b6.setContentAreaFilled(false);
        //b6.setBorderPainted(false);
		b6.addActionListener(this);
		panel.add(b6);
      
        l3 = new JButton("Components");
        l3.setBounds(700, 685, 300, 35);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	
		panel.add(l3);
		
		
		b7 = new JButton();
        b7.setIcon(new ImageIcon("1111.jpg"));
        b7.setBounds(1020, 460, 300, 220);
		b7.setContentAreaFilled(false);
		b7.addActionListener(this);
        //b7.setBorderPainted(false);
		panel.add(b7);
		
        l4 = new JButton("Custom Build");
        l4.setBounds(1020, 685, 300, 35);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		
		panel.add(l4);
		
		b8 = new JButton();
        b8.setIcon(new ImageIcon("offer.png"));
        b8.setBounds(75, 160, 1233, 280);
		b8.setContentAreaFilled(false);
        b8.setBorderPainted(false);
		panel.add(b8);
		
		//logo
		bkbtn = new JButton();
        bkbtn.setIcon(new ImageIcon("rsz_logo.png"));
        bkbtn.setBounds(80, 10, 120, 120);
        bkbtn.setContentAreaFilled(false);
        bkbtn.setBorderPainted(false);
		panel.add(bkbtn);
		
		
		back = new JButton("BACK");
		back.setBounds(1150,40,170,40);
		back.setForeground(Color.BLACK);
		f1 = new Font("Arial", Font.BOLD,25);
		back.addActionListener(this);
		back.setContentAreaFilled(false);
		back.setFont(f1);
		panel.add(back);
		
	this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == back)
		{
		ULogin obj1=new ULogin();
		obj1.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource() == b4)
		{
		catagory1 cat = new catagory1();
		cat.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b5)
		{
		catagory2 cat = new catagory2();
		cat.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b6)
		{
		catagory3 cat = new catagory3();
		cat.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b7)
		{
		Custom cus = new Custom();
		cus.setVisible(true);
		this.setVisible(false);
		}
		
	}

	}