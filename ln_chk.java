package train.mgt;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;


@SuppressWarnings("serial")
public class ln_chk extends JFrame 
{

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ln_chk frame = new ln_chk();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public ln_chk() 
	{
		setTitle("Train Management System v1.2.2");
		setBounds(100, 100, 1024, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblName = new JLabel("Enter Name :");
		lblName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblName.setForeground(Color.ORANGE);
		lblName.setBounds(250, 170, 120, 15);
		getContentPane().add(lblName);
		
		JTextField textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		textField.setBounds(654, 164, 150, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword.setForeground(Color.ORANGE);
		lblPassword.setBounds(250, 270, 120, 15);
		getContentPane().add(lblPassword);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));
		passwordField.setBounds(654, 262, 150, 30);
		getContentPane().add(passwordField);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(345, 386, 114, 25);
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnReset);
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				textField.setText("");
				passwordField.setText("");
			}
		});
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(552, 386, 114, 25);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnLogin);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				String Uname=textField.getText();
				String PW=String.valueOf(passwordField.getPassword());
				if(Uname.equals("Xtr") && PW.equals("123456"))
				{
					F_AdminLn a=new F_AdminLn();
					setVisible(false);
					a.setVisible(true);
				}
				else
				{
					JOptionPane x=new JOptionPane();
					x.setBounds(100, 100, 300, 200);
					x.setVisible(true);
					setLocationRelativeTo(null);
					JOptionPane.showMessageDialog(x,"Invalid Username or Password");
					textField.setText("");
					passwordField.setText("");
				}
			}
		});
		
		JButton btnBack = new JButton("< Back");
		btnBack.setBounds(12, 12, 100, 25);
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnBack);
		btnBack.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Startup a=new Startup();
				setVisible(false);
				a.f1.setVisible(true);
			}
		});
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy   hh:mm:ss a");
		Calendar cal = Calendar.getInstance();
		JLabel lblNewLabel = new JLabel(dateFormat.format(cal.getTime()));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(810, 12, 175, 15);
		getContentPane().add(lblNewLabel);
		new Timer(1000, new ActionListener() 
		{
	        @Override
	        public void actionPerformed(ActionEvent e) 
	        {
	            Calendar now = Calendar.getInstance();
	            lblNewLabel.setText(dateFormat.format(now.getTime()));
	        }
	    }).start();

		ImageIcon img;
		img = new ImageIcon(getClass().getResource("ic3.png"));
		setIconImage(img.getImage());
		
		ImageIcon img1 = new ImageIcon(getClass().getResource("theme5.jpg")); 
		JLabel jBg=new JLabel(img1);
		jBg.setBounds(0,0,1024, 600);
		getContentPane().add(jBg);
	}
}
