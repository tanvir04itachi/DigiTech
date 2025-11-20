import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;
public class Payment extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;
	JButton btn1,btn2,btn3,btn4;
	ImageIcon img;
	JTextField txt1,txt2,txt3,txt4;
	JComboBox cb;
	Color c1;
	public Payment()
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
		
		btn1 = new JButton("Pay");
        btn1.setBounds(800, 550, 160, 40);
        btn1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btn1.setBackground(Color.orange);
        btn1.setForeground(Color.black);
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JButton("Exit");
        btn2.setBounds(1020, 550, 160, 40);
        btn2.setForeground(Color.black);
        btn2.setFont(new Font("Serif", Font.BOLD, 30));
        btn2.setBackground(Color.orange);
		btn2.addActionListener(this);
		panel.add(btn2);
		
		txt1 = new JTextField();
        txt1.setBounds(800, 300, 400, 40);
        txt1.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(txt1);
        txt2 = new JTextField();
        txt2.setBounds(800, 380, 400, 40);
        txt2.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(txt2);
		
        txt3 = new JTextField();
        txt3.setBounds(800, 460, 200, 40);
        txt3.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(txt3);

        txt4 = new JTextField();
        txt4.setBounds(1050, 460, 150, 40);
        txt4.setFont(new Font("Serif", Font.PLAIN, 18));
		panel.add(txt4);
		
		lbl1 = new JLabel("*Card number");
        lbl1.setBounds(800, 260, 150, 40);
        lbl1.setFont(new Font("Serif", Font.PLAIN, 20));
		panel.add(lbl1);
		
		
        lbl2 = new JLabel("*Name on card");
        lbl2.setBounds(800, 340, 150, 40);
        lbl2.setFont(new Font("Serif", Font.PLAIN, 20));
		panel.add(lbl2);
		
        lbl3 = new JLabel("*Expiration date");
        lbl3.setBounds(800, 420, 150, 40);
        lbl3.setFont(new Font("Serif", Font.PLAIN, 20));
		panel.add(lbl3);

        lbl4 = new JLabel("*CVV");
        lbl4.setBounds(1050, 420, 100, 40);
        lbl4.setFont(new Font("Serif", Font.PLAIN, 20));
		panel.add(lbl4);
		
		lbl5 = new JLabel("Secure Payment");
        lbl5.setBounds(800, 120, 300, 50);
        lbl5.setFont(new Font("Serif", Font.BOLD, 42));
		panel.add(lbl5);
		
		
		lbl6 = new JLabel();
        lbl6.setIcon(new ImageIcon("payment.png"));
        lbl6.setBounds(0, 0, 665, 768);
		panel.add(lbl6);
		
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
		Uhome home = new Uhome();
		home.setVisible(true);
		this.setVisible(false);
		}
	}
}