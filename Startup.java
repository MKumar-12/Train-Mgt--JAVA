package train.mgt;
//Resources used : theme2,4,5,6,7,14, ic3
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Calendar;
import javax.swing.*;

public class Startup 
{
	public JFrame f1;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Startup window = new Startup();
					window.f1.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Startup() 
	{
		f1 = new JFrame("Train Management System v1.2.2");
		f1.setBounds(100, 100, 1024, 600);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.getContentPane().setLayout(null);
		f1.setResizable(false);
		
		JLabel l = new JLabel("----- ----- ----- ----- ----- ----- Welcome to Train Schedulling System!! ----- ----- ----- ----- ----- -----");
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setFont(new Font("FreeSerif", Font.BOLD, 18));
		l.setForeground(new Color(255, 255, 0));
		l.setBounds(140, 55, 750, 20);
		f1.getContentPane().add(l);
		
		JButton b1 = new JButton("Login as ADMIN");
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setFont(new Font("DialogInput", Font.BOLD, 13));
		b1.setBounds(105, 175, 175, 40);
		f1.getContentPane().add(b1);
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				ln_chk a=new ln_chk();
				f1.setVisible(false);
				a.setVisible(true);
			}
		});
		
		JLabel lbl1 = new JLabel("-> To add/modify Db content");
		lbl1.setForeground(new Color(240, 230, 140));
		lbl1.setBounds(95, 240, 214, 15);
		f1.getContentPane().add(lbl1);
		
		JButton b2 = new JButton("Login as GUEST");
		b2.setFont(new Font("DialogInput", Font.BOLD, 13));
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setBounds(744, 175, 175, 40);
		f1.getContentPane().add(b2);
		b2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				F_UserLn b=new F_UserLn();
				f1.setVisible(false);
				b.setVisible(true);
			}
		});
		
		JLabel lbl2 = new JLabel("-> To access Db content");
		lbl2.setForeground(new Color(240, 230, 140));
		lbl2.setBounds(746, 240, 175, 15);
		f1.getContentPane().add(lbl2);
		
		JButton btnReadme = new JButton("Readme");
		btnReadme.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReadme.setFont(new Font("DialogInput", Font.BOLD, 13));
		btnReadme.setBounds(240, 400, 150, 40);
		f1.getContentPane().add(btnReadme);
		btnReadme.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg) 
			{
				Readme b=new Readme();
				f1.setVisible(false);
				b.setVisible(true);	
			}
		});
		
		JButton b4 = new JButton("EXIT");
		b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b4.setFont(new Font("DialogInput", Font.BOLD, 13));
		b4.setBounds(634, 400, 150, 40);
		f1.getContentPane().add(b4);
		b4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg) 
			{
				System.exit(0);	
			}
		});
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy   hh:mm:ss a");
		Calendar cal = Calendar.getInstance();
		JLabel lblNewLabel = new JLabel(dateFormat.format(cal.getTime()));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(810, 12, 175, 15);
		f1.getContentPane().add(lblNewLabel);
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
		f1.setIconImage(img.getImage());
		
		ImageIcon img1 = new ImageIcon(getClass().getResource("theme2.jpg")); 
		JLabel jBg=new JLabel(img1);
		jBg.setBounds(0,0,1024, 600);
		f1.getContentPane().add(jBg);
	}
}
