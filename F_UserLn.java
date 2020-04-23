package train.mgt;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Calendar;
import javax.swing.*;

@SuppressWarnings("serial")
public class F_UserLn extends JFrame 
{
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					F_UserLn frame = new F_UserLn();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public F_UserLn() 
	{
		setTitle("Train Management System v1.2.2");
		setBounds(100, 100, 1024, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		
		JLabel l = new JLabel("----- -----  Greetings!!  ----- -----");
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 22));
		l.setForeground(new Color(255, 69, 0));
		l.setBounds(648, 260, 300, 25);
		add(l);
		
		JButton b1 = new JButton("Search By Train Name");
		b1.setFont(new Font("DialogInput", Font.BOLD, 13));
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setBounds(75, 120, 375, 40);
		add(b1);
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				F_sname a=new F_sname();
				setVisible(false);
				a.setVisible(true);
			}
		});
		
		JButton b2 = new JButton("Search By Train No.");
		b2.setFont(new Font("DialogInput", Font.BOLD, 13));
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBounds(105, 205, 375, 40);
		add(b2);
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				F_sno a=new F_sno();
				setVisible(false);
				a.setVisible(true);
			}
		});
		
		JButton b3 = new JButton("Search By Train Days Availabilty");
		b3.setFont(new Font("DialogInput", Font.BOLD, 13));
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setBounds(135, 290, 375, 40);
		add(b3);
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				F_sdayn a=new F_sdayn();
				setVisible(false);
				a.setVisible(true);
			}
		});
		
		JButton b4 = new JButton("Search for Trains Btw 2 destinations");
		b4.setFont(new Font("DialogInput", Font.BOLD, 13));
		b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b4.setBounds(165, 375, 375, 40);
		add(b4);
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				F_s2Dest a=new F_s2Dest();
				setVisible(false);
				a.setVisible(true);
			}
		});
		
		JButton b5 = new JButton("Display all Trains Details");
		b5.setForeground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		b5.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 14));
		b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b5.setBounds(215, 475, 375, 40);
		add(b5);
		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				F_sDispAll a=new F_sDispAll();
				setVisible(false);
				a.setVisible(true);
			}
		});
		
		JButton btnBack = new JButton("< Back");
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.setBounds(12, 12, 100, 25);
		add(btnBack);
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
		
		ImageIcon img1 = new ImageIcon(getClass().getResource("theme7.jpg")); 
		JLabel jBg=new JLabel(img1);
		jBg.setBounds(0,0,1024, 600);
		add(jBg);
		
	}

}
