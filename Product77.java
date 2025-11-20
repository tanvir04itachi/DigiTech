import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Product77 extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;
	JButton btn1,btn2;
	ImageIcon img;
	JComboBox cb;
	Color c1;
	public Product77()
	{
		super("Product");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(126, 250, 193);
		panel.setBackground(c1);
		ImageIcon img = new ImageIcon("framelogo.png");
		this.setIconImage(img.getImage());
		
		lbl1 = new JLabel("Lenovo IdeaPad Slim 3 15ABR8 ");
		lbl1.setBounds(600,190,1400,40);
		lbl1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		panel.add(lbl1);
		 
		 
		lbl2 = new JLabel(new ImageIcon("7.png"));
		lbl2.setBounds(100,180,450,400);
		panel.add(lbl2);
		
		lbl3 = new JLabel("AMD Ryzen 7 7730U 8GB RAM 512GB SSD 15.6 Inch FHD Antiglare IPS Display Arctic Grey Laptop ");
        lbl3.setBounds(610, 230, 4000, 40);
        lbl3.setFont(new Font("Serif", Font.PLAIN, 15));
		panel.add(lbl3);

        lbl4 = new JLabel("Keyboard, Mouse and Monitor incluted");
        lbl4.setBounds(610, 270, 240, 40);
        lbl4.setFont(new Font("Serif", Font.PLAIN, 15));
		panel.add(lbl4);

        lbl5 = new JLabel("BDT 83,000 ");
        lbl5.setBounds(610, 380, 270, 40);
        lbl5.setFont(new Font("Serif", Font.BOLD, 35));
		panel.add(lbl5);
		
		lbl6 = new JLabel("Quantity");
        lbl6.setBounds(610, 330, 240, 40);
		panel.add(lbl6);
        lbl6.setFont(new Font("Serif", Font.BOLD, 18));

        String quantity[] = { "1", "2", "3", "4", "4", "5", "6", "7", "8", "9", "10" };
        cb = new JComboBox(quantity);
        cb.setBounds(690, 340, 60, 20);
		panel.add(cb);
		
		btn1 = new JButton("Buy Now");
        btn1.setBounds(610, 490, 250, 60);
        btn1.setForeground(Color.black);
        btn1.setFont(new Font("Serif", Font.BOLD, 30));
        btn1.setBackground(Color.orange);
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JButton("Back");
        btn2.setBounds(1010, 490, 250, 60);
        btn2.setForeground(Color.black);
        btn2.setFont(new Font("Serif", Font.BOLD, 30));
        btn2.setBackground(Color.orange);
		btn2.addActionListener(this);
		panel.add(btn2);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn2)
		{
        catagory2 cat = new catagory2();
		cat.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource() == btn1)
		{
        Payment pay = new Payment();
		pay.setVisible(true);
		this.setVisible(false);
		}
	}
}