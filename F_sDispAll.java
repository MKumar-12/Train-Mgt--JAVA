package train.mgt;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class F_sDispAll extends JFrame 
{

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					F_sDispAll frame = new F_sDispAll();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public void init_table()
	{
		try
		{
			String url="jdbc:mysql://localhost:3306/Trains";
			String u_name="root";
			String pw="123456";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =DriverManager.getConnection(url,u_name,pw);
			
			Statement st = conn.createStatement();
			String load="select * from T_details";
			
			ResultSet rs = st.executeQuery(load);
			
			DefaultTableModel model = new DefaultTableModel(); 
			JTable table = new JTable(model);
			table.setRowSelectionAllowed(false);
			table.setOpaque(false);
			table.setFont(new Font("Dialog", Font.PLAIN, 14));
			table.setEnabled(false);
			table.setRowHeight(30);
			table.setBounds(60, 176, 890, 350);

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
			getContentPane().add(table);
			
			int i =0;
			
			while(rs.next())
			{
				model.addRow(new Object[]{rs.getString("t_no"),rs.getString("loco_type"),rs.getString("t_name"),rs.getString("source"),
						rs.getString("destn"),rs.getString("n_seats"),rs.getString("fare"),rs.getString("n_stops"),rs.getString("n_days_avl")});
				i++;
			}
			
			if(i <1)
			{
				JOptionPane.showMessageDialog(null, "No Record Found","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			if(i ==1)
				JOptionPane.showMessageDialog(null,(i+" Record Found"));
			
			else
				JOptionPane.showMessageDialog(null,(i+" Records Found"));
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
	
	public F_sDispAll() 
	{
		setTitle("Train Management System v1.2.2");
		setBounds(100, 100, 1024, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblDisplayingAllTrain = new JLabel("<HTML><U>Displaying all Train Records</U> :</HTML>");
		lblDisplayingAllTrain.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		lblDisplayingAllTrain.setForeground(new Color(255, 69, 0));
		lblDisplayingAllTrain.setBounds(147, 58, 407, 34);
		getContentPane().add(lblDisplayingAllTrain);
		
		JLabel lblNewLabel_1 = new JLabel("    Train_No        Lcmtv_Type         Name           Source_Stn       Destn_Stn     "
				+ "No_of_Seats          Fare        No_of_Stops    No_of_Days_Avl.");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(60, 149, 899, 15);
		getContentPane().add(lblNewLabel_1);
		
		init_table();
		
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
		jBg.setBounds(0, 0, 1024, 570);
		getContentPane().add(jBg);
	}
}
