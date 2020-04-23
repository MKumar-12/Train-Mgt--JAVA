package train.mgt;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;

@SuppressWarnings("serial")
public class Modify_Tdetails extends JFrame 
{
	private JTextField tF;
	private JTextField tF2;
	private JTextField tF3;
	private JTextField tF4;
	private JTextField tF5;
	private JTextField tF6;
	private JTextField tF7;
	private JTextField tF8;
	private JTextField tF9;
	private JButton btnGo;
	String s_X;
	String s2,s3,s4,s5,s6,s7,s8,s9;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Modify_Tdetails frame = new Modify_Tdetails();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Modify_Tdetails() 
	{
		getContentPane().setBackground(UIManager.getColor("OptionPane.errorDialog.titlePane.foreground"));
		setTitle("Train Management System v1.2.2");
		setBounds(100, 100, 1024, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JPanel p1 = new JPanel();
		p1.setOpaque(false);
		p1.setBounds(0, 115, 1024, 485);
		p1.setLayout(null);
		getContentPane().add(p1);
		
		JLabel lblEnter = new JLabel("Enter  the no. of Train whose Record is to be MODIFIED : ");
		lblEnter.setForeground(Color.ORANGE);
		lblEnter.setBounds(45, 70, 385, 15);
		getContentPane().add(lblEnter);
		
		tF = new JTextField();
		tF.setHorizontalAlignment(SwingConstants.CENTER);
		tF.setBounds(470, 70, 125, 18);
		getContentPane().add(tF);
		tF.setColumns(10);
		
		JLabel lblFillTheFollowing = new JLabel();
		lblFillTheFollowing.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblFillTheFollowing.setForeground(Color.GREEN);
		lblFillTheFollowing.setBounds(30, 0, 400, 18);
		p1.add(lblFillTheFollowing);
		
		JLabel lblLocomotiveType = new JLabel("Locomotive Type :");
		lblLocomotiveType.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblLocomotiveType.setBounds(40, 55, 125, 15);
		p1.add(lblLocomotiveType);
		
		tF2 = new JTextField();
		tF2.setBounds(350, 55, 125, 18);
		p1.add(tF2);
		tF2.setColumns(10);
		
		JLabel lblTrainName = new JLabel("Train Name :");
		lblTrainName.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblTrainName.setBounds(40, 90, 100, 15);
		p1.add(lblTrainName);
		
		tF3 = new JTextField();
		tF3.setBounds(350, 90, 125, 18);
		p1.add(tF3);
		tF3.setColumns(10);
		
		JLabel lblSourceStn = new JLabel("Source Stn. :");
		lblSourceStn.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblSourceStn.setBounds(40, 125, 100, 15);
		p1.add(lblSourceStn);
		
		tF4 = new JTextField();
		tF4.setBounds(350, 125, 125, 18);
		p1.add(tF4);
		tF4.setColumns(10);
		
		JLabel lblDestination = new JLabel("Destination :");
		lblDestination.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblDestination.setBounds(40, 160, 100, 15);
		p1.add(lblDestination);
		
		tF5 = new JTextField();
		tF5.setBounds(350, 160, 125, 18);
		p1.add(tF5);
		tF5.setColumns(10);
		
		JLabel lblNoOfSeats = new JLabel("No. of Seats Available :");
		lblNoOfSeats.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblNoOfSeats.setBounds(40, 195, 175, 15);
		p1.add(lblNoOfSeats);
		
		tF6 = new JTextField();
		tF6.setBounds(350, 195, 125, 18);
		p1.add(tF6);
		tF6.setColumns(10);
		
		JLabel lblFare = new JLabel("Fare :");
		lblFare.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblFare.setBounds(40, 230, 100, 15);
		p1.add(lblFare);
		
		tF7 = new JTextField();
		tF7.setBounds(350, 230, 125, 18);
		p1.add(tF7);
		tF7.setColumns(10);
		
		JLabel lblNoOfStops = new JLabel("No. of Stops :");
		lblNoOfStops.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblNoOfStops.setBounds(40, 265, 100, 15);
		p1.add(lblNoOfStops);
		
		tF8 = new JTextField();
		tF8.setBounds(350, 265, 125, 18);
		p1.add(tF8);
		tF8.setColumns(10);
		
		JLabel lblNoOfDays = new JLabel("No. of Days Available :");
		lblNoOfDays.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblNoOfDays.setBounds(40, 300, 175, 15);
		p1.add(lblNoOfDays);
		
		tF9 = new JTextField();
		tF9.setBounds(350, 300, 125, 18);
		p1.add(tF9);
		tF9.setColumns(10);
		
		JCheckBox cbx1 = new JCheckBox("Monday");
		cbx1.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx1.setBounds(45, 345, 120, 20);
		cbx1.setOpaque(false);
		p1.add(cbx1);
		
		JCheckBox cbx2 = new JCheckBox("Tuesday");
		cbx2.setOpaque(false);
		cbx2.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx2.setBounds(190, 345, 120, 20);
		p1.add(cbx2);
		
		JCheckBox cbx3 = new JCheckBox("Wednesday");
		cbx3.setOpaque(false);
		cbx3.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx3.setBounds(335, 345, 120, 20);
		p1.add(cbx3);
		
		JCheckBox cbx4 = new JCheckBox("Thrusday");
		cbx4.setOpaque(false);
		cbx4.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx4.setBounds(480, 345, 120, 20);
		p1.add(cbx4);
		
		JCheckBox cbx5 = new JCheckBox("Friday");
		cbx5.setOpaque(false);
		cbx5.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx5.setBounds(95, 390, 120, 20);
		p1.add(cbx5);
		
		JCheckBox cbx6 = new JCheckBox("Saturday");
		cbx6.setOpaque(false);
		cbx6.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx6.setBounds(240, 390, 120, 20);
		p1.add(cbx6);
		
		JCheckBox cbx7 = new JCheckBox("Sunday");
		cbx7.setOpaque(false);
		cbx7.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx7.setBounds(385, 390, 120, 20);
		p1.add(cbx7);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(700, 50, 115, 25);
		btnSubmit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(btnSubmit);
		btnSubmit.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				//Adding to DB 
				String tno=tF.getText();
				s2=tF2.getText();
				s3=tF3.getText();
				s4=tF4.getText();
				s5=tF5.getText();
				s6=tF6.getText();
				s7=tF7.getText();
				s8=tF8.getText();
				s9=tF9.getText();
				
				if ( tF2.getText().equals("") || tF3.getText().equals("") || tF4.getText().equals("") 
						|| tF6.getText().equals("") || tF7.getText().equals("")
                        || tF8.getText().equals("") || tF9.getText().equals("") ) 
                {	
                    JOptionPane.showMessageDialog(null, "All record Must be filled Out");
                } 
                else 
                {
                	try
                	{
                		String url="jdbc:mysql://localhost:3306/Trains";
                		String u_name="root";
                		String pw="123456";
					
                		Class.forName("com.mysql.cj.jdbc.Driver");
                		Connection conn =DriverManager.getConnection(url,u_name,pw);
                		int reply =JOptionPane.showConfirmDialog(null, 
                				"Are you sure Insert Data?","INSERT",JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION)
                        {
                        	String loco_type=s2;
                        	String t_name=s3;
                        	String source=s4;
                        	String destn=s5;
                        	int n_seats=Integer.parseInt(s6);
                        	float fare=Float.parseFloat(s7);
                        	int n_stops=Integer.parseInt(s8);
                        	int n_days_avl=Integer.parseInt(s9);
					
                        	String query="update T_details set loco_type=?,t_name=?,"
                        			+ "source=?,destn=?,n_seats=?,fare=?,n_stops=?, "
                        			+ "n_days_avl=? where t_no="+tno+";";
                        	PreparedStatement st=conn.prepareStatement(query);
                		
                        	st.setString(1, loco_type);
                        	st.setString(2, t_name);
                        	st.setString(3, source);
                        	st.setString(4, destn);
                        	st.setInt(5, n_seats);
                        	st.setFloat(6, fare);
                        	st.setInt(7, n_stops);
                        	st.setInt(8, n_days_avl);
                        	st.executeUpdate();
                        	JOptionPane.showMessageDialog(null,"Data Entered Successfully into the DataBase!!");
                        	
                        	st.close();
                        	conn.close();
                        }
					
						//Resetting Field Values
                        tF.setText("");
						tF2.setText("");
						tF3.setText("");
						tF4.setText("");
						tF5.setText("");
						tF6.setText("");
						tF7.setText("");
						tF8.setText("");
						tF9.setText("");
						cbx1.setSelected(false);
						cbx2.setSelected(false);
						cbx3.setSelected(false);
						cbx4.setSelected(false);
						cbx5.setSelected(false);
						cbx6.setSelected(false);
						cbx7.setSelected(false);
						p1.setVisible(false);
						btnGo.setVisible(true);
						tF.setEditable(true);
						
                	}
                	
                	catch (SQLException se) 
                    {
                        se.printStackTrace();
                    } 
                	
                	catch (Exception e)
                	{
                		JOptionPane.showMessageDialog(null, e);
                		System.out.println(e.toString());
                	}
                }
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(700, 120, 115, 25);
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(btnReset);
		btnReset.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				tF2.setText("");
				tF3.setText("");
				tF4.setText("");
				tF5.setText("");
				tF6.setText("");
				tF7.setText("");
				tF8.setText("");
				tF9.setText("");
				cbx1.setSelected(false);
				cbx2.setSelected(false);
				cbx3.setSelected(false);
				cbx4.setSelected(false);
				cbx5.setSelected(false);
				cbx6.setSelected(false);
				cbx7.setSelected(false);
			}
		});
		
		p1.setVisible(false);
		
		btnGo = new JButton("Go >");
		btnGo.setBounds(620, 70, 70, 18);
		btnGo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnGo);
		btnGo.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try
				{
					String s_tno=tF.getText();
					s_X=s_tno;
					
					String url="jdbc:mysql://localhost:3306/Trains";
            		String u_name="root";
            		String pw="123456";
				
            		Class.forName("com.mysql.cj.jdbc.Driver");
            		Connection conn =DriverManager.getConnection(url,u_name,pw);
            		
					Statement st = conn.createStatement();
					String load = "Select * from T_details where t_no ='" + s_tno + "'";
					
					ResultSet rs = st.executeQuery(load);
					
					/*if(rs.next()==false)
					{
						JOptionPane.showMessageDialog(null,"Record not found for any such Train no. !!!");
						tF.setText("");
						//rs.beforeFirst();
					}*/
					
					while(rs.next())
					{
						if(s_tno.equals(rs.getString("t_no")))
						{
							btnGo.setVisible(false);
							tF.setEditable(false);
							p1.setVisible(true);
							lblFillTheFollowing.setText("<HTML><U>Update the Details for Train no. "
							+s_X+"</U> : </HTML>");
							tF2.setText(rs.getString("loco_type"));
							tF3.setText(rs.getString("t_name"));
							tF4.setText(rs.getString("source"));
							tF5.setText(rs.getString("destn"));
							tF6.setText(rs.getString("n_seats"));
							tF7.setText(rs.getString("fare"));
							tF8.setText(rs.getString("n_stops"));
							tF9.setText(rs.getString("n_days_avl"));
						}
					}
				}
				catch (SQLException se) 
                {
                    se.printStackTrace();
                } 
            	
            	catch (Exception e)
            	{
            		JOptionPane.showMessageDialog(null, e);
            		System.out.println(e.toString());
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
				F_AdminLn a=new F_AdminLn();
				setVisible(false);
				a.setVisible(true);
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
		
		ImageIcon img1 = new ImageIcon(getClass().getResource("theme6.jpg")); 
		JLabel jBg=new JLabel(img1);
		jBg.setBounds(0,0,1024, 600);
		getContentPane().add(jBg);
		
	}
}
