import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class AdminPanel extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel title, subtitle;
	JTextArea output;
	JScrollPane scrollPane;
	JButton usersBtn, adminsBtn, paymentsBtn, backBtn, exitBtn;
	Color color1;
	Font f1;
	
	public AdminPanel()
	{
		super("Admin Panel");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(25,118,211);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		
		ImageIcon img = new ImageIcon("framelogo.png");
		this.setIconImage(img.getImage());
		
		title = new JLabel("Admin Panel");
		title.setBounds(80, 40, 500, 60);
		title.setFont(new Font("Segoe UI", Font.BOLD, 45));
		panel.add(title);
		
		subtitle = new JLabel("Manage DIGITECH records");
		subtitle.setBounds(85, 95, 500, 40);
		subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(subtitle);
		
		usersBtn = new JButton("View Users");
		usersBtn.setBounds(80, 180, 250, 40);
		usersBtn.setBackground(Color.RED);
		usersBtn.setForeground(Color.WHITE);
		f1 = new Font("Arial", Font.BOLD, 22);
		usersBtn.setFont(f1);
		usersBtn.addActionListener(this);
		panel.add(usersBtn);
		
		adminsBtn = new JButton("View Admins");
		adminsBtn.setBounds(80, 240, 250, 40);
		adminsBtn.setBackground(Color.RED);
		adminsBtn.setForeground(Color.WHITE);
		adminsBtn.setFont(f1);
		adminsBtn.addActionListener(this);
		panel.add(adminsBtn);
		
		paymentsBtn = new JButton("View Payments");
		paymentsBtn.setBounds(80, 300, 250, 40);
		paymentsBtn.setBackground(Color.RED);
		paymentsBtn.setForeground(Color.WHITE);
		paymentsBtn.setFont(f1);
		paymentsBtn.addActionListener(this);
		panel.add(paymentsBtn);
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(80, 600, 170, 40);
		backBtn.setBackground(Color.RED);
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(new Font("Arial", Font.BOLD, 25));
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		exitBtn = new JButton("EXIT");
		exitBtn.setBounds(280, 600, 170, 40);
		exitBtn.setBackground(Color.RED);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.setFont(new Font("Arial", Font.BOLD, 25));
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		output = new JTextArea();
		output.setEditable(false);
		output.setFont(new Font("Consolas", Font.PLAIN, 16));
		output.setText("Select an option to view admin records.");
		
		scrollPane = new JScrollPane(output);
		scrollPane.setBounds(500, 150, 760, 490);
		panel.add(scrollPane);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == exitBtn)
		{
			System.exit(0);
		}
		else if(ae.getSource() == backBtn)
		{
			ALogin login = new ALogin();
			login.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == usersBtn)
		{
			showFile("data.txt", "Registered Users");
		}
		else if(ae.getSource() == adminsBtn)
		{
			showFile("admindata.txt", "Registered Admins");
		}
		else if(ae.getSource() == paymentsBtn)
		{
			showFile("payments.txt", "Payment Logs");
		}
	}
	
	private void showFile(String fileName, String heading)
	{
		File file = new File("./" + fileName);
		StringBuilder builder = new StringBuilder();
		builder.append(heading).append("\n\n");
		
		if(!file.exists())
		{
			builder.append("No records found.");
			output.setText(builder.toString());
			return;
		}
		
		try
		{
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				builder.append(sc.nextLine()).append("\n");
			}
			sc.close();
		}
		catch(IOException ioe)
		{
			builder.append("Could not read records.");
		}
		
		output.setText(builder.toString());
		output.setCaretPosition(0);
	}
}
