import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ARegistration extends JFrame implements MouseListener, ActionListener
{
	JPanel panel;
	JLabel userlable,passlable;
	JTextField tfield;
	JPasswordField pfield;
	JLabel label2,label3;
	JButton signbtn,exitbtn;
	Color mycolor, mycolor1,color1;
	Font myfont;
	
	
	
	public ARegistration ()
	{
		super("Registration");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(25,118,211);
		
		panel = new JPanel();
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
		
		userlable = new JLabel("USER");
		userlable.setBounds(250,350,80,30);
		userlable.setBackground(Color.green);
		userlable.setOpaque(true);
		userlable.setForeground(Color.WHITE);
		userlable.setFont(myfont);
		panel.add(userlable);
		
		
	    tfield = new JTextField();
		tfield.setBounds(350,350,350,30);
		panel.add(tfield);
		
		passlable = new JLabel("Password");
		passlable.setBounds(250,450,80,30);
		passlable.setBackground(Color.green);
		passlable.setForeground(Color.WHITE);
		passlable.setOpaque(true);
		panel.add(passlable);
		
		pfield = new JPasswordField();
		pfield.setBounds(350,450,350,30);
		panel.add(pfield);
		
		signbtn= new JButton("Signup");
		signbtn.setBounds(480,500,80,30);
		signbtn.setBackground(Color.orange);
		signbtn.addMouseListener(this);
		signbtn.addActionListener(this);
		panel.add(signbtn);
		
		exitbtn = new JButton("Exit");
		exitbtn.setBounds(580,500,80,30);
		exitbtn.setBackground(Color.ORANGE);
		exitbtn.addMouseListener(this);
		exitbtn.addActionListener(this);
		panel.add(exitbtn);
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == signbtn)
		{
			String name=tfield.getText();
			String pass=pfield.getText();
				
			if(name.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill All");
			}
			else
			{		
				AdminAcc acc= new AdminAcc(name,pass);
				acc.addaccount();
					
				JOptionPane.showMessageDialog(this,"Added");
					
				tfield.setText("");
				pfield.setText("");
					
				ALogin obj2 = new ALogin();
				obj2.setVisible(true);
				this.setVisible(false);
			}
		}
		else if(ae.getSource() == exitbtn)
		{
			System.exit(0);
		}
	}
	
}