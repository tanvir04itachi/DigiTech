import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ULogin extends JFrame implements MouseListener,ActionListener
{
	
	JPanel panel;
	JLabel user,pass ,name1, name2, name3, name4, name6, name8, name9, name99,lbl1;
	JTextField text,txt2;
	JPasswordField passfield, pf;
	JButton login,signup;
	ButtonGroup bt1;
	JCheckBox c1;
	ImageIcon image , img;
	
	JButton jb, btn1,btn2,btn3;
	Color color1;
	Font f1, f2, f3, f4;
	public ULogin()
	{
		super("Login Page");
		this.setBounds(0,0,1366,768); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(25,118,211); //(Red,Green,Blue)
		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		
		ImageIcon img = new ImageIcon("rsz_logo.png");
		this.setIconImage(img.getImage());
		
		img = new ImageIcon("loginpage.png");
		lbl1= new JLabel(img);
		lbl1.setBounds(0,0,700,768);
		panel.add(lbl1);
		
		//step 4(d)
		name1 = new JLabel("WELCOME TO DIGITECH");
		name1.setBounds(850,70,400,80);
		f1 = new Font("ADLaM Display",Font.BOLD, 30);// (font name, font style, font size)
		name1.setFont(f1);
		//name1.setBackground(Color.WHITE);
		name1.setForeground(Color.BLACK); //used for changing font color
		//name1.setOpaque(true); //used for color overlapping
		panel.add(name1);
		
		name2 = new JLabel("USER LOGIN");
		name2.setBounds(1000,150,200,60);
		f2 = new Font("Cambria", Font.BOLD, 25);// (font name, font style, font size)
		name2.setFont(f2);
		//name2.setBackground(Color.WHITE);
		name2.setForeground(Color.BLACK);
		//name2.setOpaque(true);
		panel.add(name2);
		


		name3 = new JLabel("User Name");
		name3.setBounds(850,280,300,40);
		f3 = new Font("Cambria", Font.BOLD, 20);// (font name, font style, font size)
		name3.setFont(f3);
		panel.add(name3);

		text = new JTextField();
		text.setBounds(980,285,300,40);
		panel.add(text);
		
		name4 = new JLabel("Password");
		name4.setBounds(850,350,300,40);
		f4 = new Font("Cambria", Font.BOLD, 20);
		name4.setFont(f4);
		panel.add(name4);
		
		
		passfield = new JPasswordField();
		passfield.setBounds(980,350,300,40);
		passfield.setEchoChar('*');
		panel.add(passfield);

		
		name6 = new JLabel("Don't have an account?");
		name6.setBounds(990 ,530,300,40);
		panel.add(name6);
		
		signup = new JButton("Signup");
		signup.setBounds(1020 ,530,300,40);
		signup.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		signup.setContentAreaFilled(false);
		signup.setBackground(Color.WHITE);
		signup.setForeground(Color.BLACK);
		f1 = new Font("Cambria", Font.BOLD, 15);
		signup.addActionListener(this);
		signup.addMouseListener(this);
		signup.setFont(f1);
		panel.add(signup);
		
		btn1 = new JButton("Forgot Password?");
		btn1.setBounds(1117,390,170,40);
		btn1.setForeground(Color.black);
		btn1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		btn1.setContentAreaFilled(false);
		f1 = new Font("Cambria", Font.BOLD, 15);
		btn1.setFont(f1);
		panel.add(btn1);
		
		btn2 = new JButton("BACK");
		btn2.setBounds(850,600,170,40);
		btn2.setBackground(Color.RED);
		btn2.setForeground(Color.WHITE);
		f1 = new Font("Arial", Font.BOLD,25);
		btn2.addActionListener(this);
		btn2.setFont(f1);
		panel.add(btn2);
		
		btn3 = new JButton("EXIT");
		btn3.setBounds(1117,600,170,40);
		btn3.setBackground(Color.RED);
		btn3.setForeground(Color.WHITE);
		f1 = new Font("Arial", Font.BOLD,25);
		btn3.setFont(f1);
		btn3.addActionListener(this);
		panel.add(btn3);
		
		image = new ImageIcon("OOP1[I].jpg");
		name9 = new JLabel(image);
		name9.setBounds(400,70,256,285);
		panel.add(name9);
		
		login = new JButton("Login");
		login.setBounds(980 ,480,300,40);
		login.setBackground(Color.WHITE);
		login.setForeground(Color.BLACK);
		login.addActionListener(this);
		login.addMouseListener(this);
		panel.add(login);
		
		

		
		
		
		



		
		this.add(panel);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==login)
		{
			login.setBackground(Color.RED);
		}
		else if(me.getSource()==signup)
		{
			signup.setBackground(Color.RED);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==login)
		{
			login.setBackground(Color.BLUE);
		}
		else if(me.getSource()==signup)
		{
			signup.setBackground(Color.BLUE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
			
		if(ae.getSource() == signup)
		{
			URegistration r1=new URegistration();
			r1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == btn3)
		{
			System.exit(0);
			
		}
		else if(ae.getSource() == btn2 )
		{
		Lgad log = new Lgad();
		log.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource() == login )
		//{
		//Uhome home = new Uhome();
		//home.setVisible(true);
		//this.setVisible(false);
		
		{
			String name=text.getText();
			String pass=passfield.getText();
			
			Account acc=new Account();
			
			if(acc.getAccount(name,pass)==true)
			{
				JOptionPane.showMessageDialog(null,"Sucessfull");
				
				Uhome home = new Uhome();
				home.setVisible(true);
				this.setVisible(false);
				
				//Login obj1=new Login(name,pass);
				//obj1.setVisible(true);
				//this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Incorrect");
			}
		}	
	}
}