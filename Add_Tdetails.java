package train.mgt;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.*;
import java.util.Calendar;
import javax.swing.*;

@SuppressWarnings("serial")
public class Add_Tdetails extends JFrame 
{
	private JTextField tF1,tF2,tF3,tF4,tF5,tF6,tF7,tF8,tF9;
	JCheckBox cbx1,cbx2,cbx3,cbx4,cbx5,cbx6,cbx7;
	int countChecked=0;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Add_Tdetails frame = new Add_Tdetails();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Add_Tdetails() 
	{
		
		setTitle("Train Management System v1.2.2");
		setBounds(100, 100, 1024, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblFillTheFollowing = new JLabel("<HTML><U>Fill the Following Details</U> :</HTML>");
		lblFillTheFollowing.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblFillTheFollowing.setForeground(Color.GREEN);
		lblFillTheFollowing.setBounds(80, 80, 250, 20);
		getContentPane().add(lblFillTheFollowing);
		
		JLabel lblTrainNo = new JLabel("Train No. :");
		lblTrainNo.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblTrainNo.setBounds(50, 140, 75, 15);
		getContentPane().add(lblTrainNo);
		
		tF1 = new JTextField();
		tF1.setBounds(350, 135, 125, 18);
		getContentPane().add(tF1);
		tF1.setColumns(10);
		
		JLabel lblLocomotiveType = new JLabel("Locomotive Type :");
		lblLocomotiveType.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblLocomotiveType.setBounds(50, 175, 125, 15);
		getContentPane().add(lblLocomotiveType);
		
		tF2 = new JTextField();
		tF2.setBounds(350, 170, 125, 18);
		getContentPane().add(tF2);
		tF2.setColumns(10);
		
		JLabel lblTrainName = new JLabel("Train Name :");
		lblTrainName.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblTrainName.setBounds(50, 210, 100, 15);
		getContentPane().add(lblTrainName);
		
		tF3 = new JTextField();
		tF3.setBounds(350, 205, 125, 18);
		getContentPane().add(tF3);
		tF3.setColumns(10);
		
		JLabel lblSourceStn = new JLabel("Source Stn. :");
		lblSourceStn.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblSourceStn.setBounds(50, 245, 100, 15);
		getContentPane().add(lblSourceStn);
		
		tF4 = new JTextField();
		tF4.setBounds(350, 240, 125, 18);
		getContentPane().add(tF4);
		tF4.setColumns(10);
		
		JLabel lblDestination = new JLabel("Destination :");
		lblDestination.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblDestination.setBounds(50, 280, 100, 15);
		getContentPane().add(lblDestination);
		
		tF5 = new JTextField();
		tF5.setBounds(350, 275, 125, 18);
		getContentPane().add(tF5);
		tF5.setColumns(10);	
		
		JLabel lblNoOfSeats = new JLabel("No. of Seats Available :");
		lblNoOfSeats.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblNoOfSeats.setBounds(50, 315, 175, 15);
		getContentPane().add(lblNoOfSeats);
		
		tF6 = new JTextField();
		tF6.setBounds(350, 310, 125, 18);
		getContentPane().add(tF6);
		tF6.setColumns(10);
		
		JLabel lblFare = new JLabel("Fare :");
		lblFare.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblFare.setBounds(50, 350, 100, 15);
		getContentPane().add(lblFare);
		
		tF7 = new JTextField();
		tF7.setBounds(350, 345, 125, 18);
		getContentPane().add(tF7);
		tF7.setColumns(10);
		
		JLabel lblNoOfStops = new JLabel("No. of Stops :");
		lblNoOfStops.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblNoOfStops.setBounds(50, 385, 100, 15);
		getContentPane().add(lblNoOfStops);
		
		tF8 = new JTextField();
		tF8.setBounds(350, 380, 125, 18);
		getContentPane().add(tF8);
		tF8.setColumns(10);
		
		JLabel lblNoOfDays = new JLabel("No. of Days Available :");
		lblNoOfDays.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblNoOfDays.setBounds(50, 420, 175, 15);
		getContentPane().add(lblNoOfDays);
		
		tF9 = new JTextField();
		tF9.setBounds(350, 415, 125, 18);
		getContentPane().add(tF9);
		tF9.setColumns(10);
		
		cbx1 = new JCheckBox("Monday");
		cbx1.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx1.setBounds(50, 465, 120, 20);
		cbx1.setOpaque(false);
		getContentPane().add(cbx1);
		cbx1.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent arg0) 
			{
				++countChecked;
			}
		});
		
		
		cbx2 = new JCheckBox("Tuesday");
		cbx2.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx2.setBounds(195, 465, 120, 20);
		cbx2.setOpaque(false);
		getContentPane().add(cbx2);
		cbx2.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent arg0) 
			{
				++countChecked;
			}
		});
		
		JCheckBox cbx3 = new JCheckBox("Wednesday");
		cbx3.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx3.setBounds(340, 465, 120, 20);
		cbx3.setOpaque(false);
		getContentPane().add(cbx3);
		cbx3.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent arg0) 
			{
				++countChecked;
			}
		});
		
		cbx4 = new JCheckBox("Thrusday");
		cbx4.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx4.setBounds(485, 465, 120, 20);
		cbx4.setOpaque(false);
		getContentPane().add(cbx4);
		cbx4.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent arg0) 
			{
				++countChecked;
			}
		});
		
		JCheckBox cbx5 = new JCheckBox("Friday");
		cbx5.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx5.setBounds(115, 510, 120, 20);
		cbx5.setOpaque(false);
		getContentPane().add(cbx5);
		cbx5.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent arg0) 
			{
				++countChecked;
			}
		});
		
		cbx6 = new JCheckBox("Saturday");
		cbx6.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx6.setBounds(260, 510, 120, 20);
		cbx6.setOpaque(false);
		getContentPane().add(cbx6);
		cbx6.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent arg0) 
			{
				++countChecked;
			}
		});
		
		cbx7 = new JCheckBox("Sunday");
		cbx7.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		cbx7.setBounds(405, 510, 120, 20);
		cbx7.setOpaque(false);
		getContentPane().add(cbx7);
		cbx7.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent arg0) 
			{
				++countChecked;
			}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(705, 130, 115, 25);
		btnSubmit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnSubmit);
		btnSubmit.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				//Adding to DB 
				s1=tF1.getText();
				s2=tF2.getText();
				s3=tF3.getText();
				s4=tF4.getText();
				s5=tF5.getText();
				s6=tF6.getText();
				s7=tF7.getText();
				s8=tF8.getText();
				s9=tF9.getText();
				int n_chk_bx=countChecked;
				//String s10=chckbxWednesday.getText();
				
				if ( tF1.getText().equals("") || tF2.getText().equals("") || tF3.getText().equals("")
						|| tF4.getText().equals("") || tF6.getText().equals("") || tF7.getText().equals("")
                        || tF8.getText().equals("") || tF9.getText().equals("") ) 
                {	
                    JOptionPane.showMessageDialog(null, "All record Must be filled Out");
                } 
				
				else if(Integer.parseInt(tF9.getText())>7 || n_chk_bx!=Integer.parseInt(tF9.getText()))
				{
					System.out.println("Marked :"+countChecked);
					JOptionPane.showMessageDialog(null, "Data out bounds for days availability set,Please check n Re-enter!!");
					tF9.setText("");
					cbx1.setSelected(false);
					cbx2.setSelected(false);
					cbx3.setSelected(false);
					cbx4.setSelected(false);
					cbx5.setSelected(false);
					cbx6.setSelected(false);
					cbx7.setSelected(false);
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
                        	int t_no=Integer.parseInt(s1);
                        	String loco_type=s2;
                        	String t_name=s3;
                        	String source=s4;
                        	String destn=s5;
                        	int n_seats=Integer.parseInt(s6);
                        	float fare=Float.parseFloat(s7);
                        	int n_stops=Integer.parseInt(s8);
                        	int n_days_avl=Integer.parseInt(s9);
					
                        	String query="insert into T_details values(?,?,?,?,?,?,?,?,?,null)";
                        	PreparedStatement st=conn.prepareStatement(query);
                		
                        	st.setInt(1, t_no);
                        	st.setString(2, loco_type);
                        	st.setString(3, t_name);
                        	st.setString(4, source);
                        	st.setString(5, destn);
                        	st.setInt(6, n_seats);
                        	st.setFloat(7, fare);
                        	st.setInt(8, n_stops);
                        	st.setInt(9, n_days_avl);
                        	st.executeUpdate();
                        	JOptionPane.showMessageDialog(null,"Data Entered Successfully into the DataBase!!");
                        	
                        	st.close();
                        	conn.close();
                        }
					
						//Resetting Field Values
						tF1.setText("");
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
		btnReset.setBounds(705, 200, 115, 25);
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnReset);
		btnReset.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				tF1.setText("");
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
