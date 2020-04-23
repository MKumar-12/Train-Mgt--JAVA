package train.mgt;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Calendar;
import javax.swing.*;

@SuppressWarnings("serial")
public class F_AdminLn extends JFrame 
{

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					F_AdminLn frame = new F_AdminLn();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public F_AdminLn() 
	{
		setTitle("Train Management System v1.2.2");
		setBounds(100, 100, 1024, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		
		JLabel l = new JLabel("----- -----  Welcome  ----- -----");
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 26));
		l.setForeground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		l.setBounds(335, 170, 320, 28);
		add(l);
		
		JButton b1 = new JButton("Add Train Details to DB");
		b1.setFont(new Font("DialogInput", Font.BOLD, 13));
		b1.setBounds(44, 400, 350, 40);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(b1);
		b1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Add_Tdetails a=new Add_Tdetails();
				setVisible(false);
				a.setVisible(true);
			}
		});
		
		JButton b2 = new JButton("Modify Existing Train Detail from DB");
		b2.setFont(new Font("DialogInput", Font.BOLD, 13));
		b2.setBounds(620, 400, 350, 40);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(b2);
		b2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				Modify_Tdetails a=new Modify_Tdetails();
				setVisible(false);
				a.setVisible(true);
			}
		});
		
		JButton btnBack = new JButton("< Back");
		btnBack.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		btnBack.setBounds(12, 12, 100, 25);
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		ImageIcon img1 = new ImageIcon(getClass().getResource("theme4.jpg")); 
		JLabel jBg=new JLabel(img1);
		jBg.setBounds(0,0,1024, 600);
		add(jBg);
	}

}
