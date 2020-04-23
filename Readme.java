package train.mgt;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Calendar;
import javax.swing.*;

@SuppressWarnings("serial")
public class Readme extends JFrame 
{

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Readme frame = new Readme();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Readme() 
	{
		setTitle("Train Management System v1.2.2");
		setBounds(100, 100, 1024, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		
		JLabel lbl1=new JLabel("<HTML><U>Train Schedulling System</U> (TSS)</HTML>");
		lbl1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(new Color(255, 140, 0));
		lbl1.setBounds(130, 80, 300, 35);
		add(lbl1);
		
		
		JLabel lbl7 = new JLabel("<HTML><U>About the Project :</U></HTML>");
		lbl7.setForeground(new Color(0, 255, 0));
		lbl7.setBounds(80, 150, 200, 15);
		add(lbl7);
		
		JLabel lbl8 = new JLabel("Simple GUI based App, by implementing java SWINGS n AWT(Abstract Window Toolkit)!!");
		lbl8.setForeground(new Color(255, 255, 255));
		lbl8.setBounds(100, 190, 650, 15);
		add(lbl8);
		
		JLabel lbl2 = new JLabel("<HTML><U>Organised By :</U></HTML>");
		lbl2.setForeground(new Color(0, 255, 0));
		lbl2.setBounds(80, 240, 100, 15);
		add(lbl2);
		
		JLabel lbl3 = new JLabel("Vaishnavi Sriramoju               ||                      Prajwal Sonar");
		lbl3.setBounds(100, 280, 400, 15);
		lbl3.setForeground(new Color(255, 255, 255));
		add(lbl3);
		
		JLabel lbl4 = new JLabel("Parvi Agrawal                          ||                      Manish Kumar");
		lbl4.setForeground(new Color(255, 255, 255));
		lbl4.setBounds(100, 310, 400, 15);
		add(lbl4);
		
		JLabel lbl5 = new JLabel("<HTML><U>Branch :</U></HTML>");
		lbl5.setForeground(new Color(0, 255, 0));
		lbl5.setBounds(80, 360, 60, 15);
		add(lbl5);
		
		JLabel lbl6 = new JLabel("SE-IT (APSIT)");
		lbl6.setForeground(new Color(255, 255, 255));
		lbl6.setBounds(100, 400, 100, 15);
		add(lbl6);
		
		JButton btnBack = new JButton("< Back");
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
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
		
		ImageIcon img1 = new ImageIcon(getClass().getResource("theme14.jpg")); 
		JLabel jBg=new JLabel(img1);
		jBg.setBounds(0,0,1024, 600);
		add(jBg);
		
	}

}
