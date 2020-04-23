package train.mgt;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class F_sname extends JFrame 
{
	JTextField tF;
	JButton btnGo,btnReset;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					F_sname frame = new F_sname();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public F_sname() 
	{
		setTitle("Train Management System v1.2.2");
		setBounds(100, 100, 1024, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		JLabel lblEnter = new JLabel("Enter  the name of Train whose Record is to be SEARCHED : ");
		lblEnter.setForeground(new Color(255, 69, 0));
		lblEnter.setBounds(45, 70, 425, 15);
		getContentPane().add(lblEnter);
		
		tF = new JTextField();
		tF.setHorizontalAlignment(SwingConstants.CENTER);
		tF.setBounds(490, 70, 125, 18);
		getContentPane().add(tF);
		tF.setColumns(10);
		
		JPanel p1 = new JPanel();
		p1.setOpaque(false);
		p1.setBounds(10, 115, 950, 420);
		p1.setLayout(null);
		getContentPane().add(p1);
		p1.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("    Train_No        Lcmtv_Type         Name           Source_Stn       Destn_Stn     "
				+ "No_of_Seats          Fare        No_of_Stops    No_of_Days_Avl.");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(60, 90, 899, 15);
		p1.add(lblNewLabel_1);
		
		btnGo = new JButton("Go >");
		btnGo.setBounds(640, 70, 70, 18);
		btnGo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnGo);
		btnGo.addMouseListener(new MouseAdapter() 
		{	
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try
				{
					btnReset.setVisible(true);
					btnGo.setVisible(false);
					tF.setEditable(false);
					
					String s_name=tF.getText();
					
					String url="jdbc:mysql://localhost:3306/Trains";
					String u_name="root";
					String pw="123456";
				
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn =DriverManager.getConnection(url,u_name,pw);
				
					Statement st = conn.createStatement();
					String load="select * from T_details where t_name ='" + s_name + "'";
				
					ResultSet rs = st.executeQuery(load);
				
					DefaultTableModel model = new DefaultTableModel(); 
					JTable table = new JTable(model);
					table.setRowSelectionAllowed(false);
					table.setOpaque(false);
					table.setFont(new Font("Dialog", Font.PLAIN, 14));
					table.setEnabled(false);
					table.setRowHeight(30);
					table.setBounds(60, 110, 890, 350);

					String[] columnNames= {"Train_No.","Locomotive_type","Name","Source_Stn","Destination_Stn",
						"No_of_Seats","Fare","No_of_Stops","No_of_Days_availability"};
					model.setColumnIdentifiers(columnNames);
					DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
					rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
					table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
					table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
					table.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
					table.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
					table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
					table.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
					table.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
					table.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
					table.getColumnModel().getColumn(8).setCellRenderer(rightRenderer);
				
					table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					p1.add(table);
				
					int i =0;
				
					while(rs.next())
					{

						p1.setVisible(true);
						model.addRow(new Object[]{rs.getString("t_no"),rs.getString("loco_type"),rs.getString("t_name"),rs.getString("source"),
							rs.getString("destn"),rs.getString("n_seats"),rs.getString("fare"),rs.getString("n_stops"),rs.getString("n_days_avl")});
						i++;
					}
				
					if(i <1)
					{
						JOptionPane.showMessageDialog(null, "No Record Found","Error",JOptionPane.ERROR_MESSAGE);
					}
	
					else
						JOptionPane.showMessageDialog(null,(i+" Record(s) Found"));
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
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(740, 70, 75, 18);
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.setVisible(false);
		getContentPane().add(btnReset);
		btnReset.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				p1.setVisible(false);
				tF.setEditable(true);
				tF.setText("");
				btnGo.setVisible(true);
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
				F_UserLn a=new F_UserLn();
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
		
		ImageIcon img1 = new ImageIcon(getClass().getResource("theme7.jpg"));
		JLabel jBg=new JLabel(img1);
		jBg.setBounds(0,0,1024, 600);
		getContentPane().add(jBg);
	}

}
