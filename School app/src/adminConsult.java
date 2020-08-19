import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class adminConsult extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminConsult frame = new adminConsult();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null ; 
	private JTable table;
	/**
	 * Create the frame.
	 */
	public adminConsult() {
		connection = sqliteConnection.dbConnector(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1176, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// admin image
		JLabel labelAdmin = new JLabel("");
		Image imgAdmin = new ImageIcon(this.getClass().getResource("/admin.png")).getImage ();
		labelAdmin.setIcon(new ImageIcon(imgAdmin));
		labelAdmin.setBounds(31, 16, 137, 71);
		contentPane.add(labelAdmin);
		// admin sentence
		
		JLabel lblAdmin = new JLabel("The Admin Panel  :");
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblAdmin.setBounds(93, 32, 270, 43);
		contentPane.add(lblAdmin, BorderLayout.WEST);
		// add logout button 
		JButton btnNewButton = new JButton("Logout");
		Image imgLogout = new ImageIcon(this.getClass().getResource("/logout.png")).getImage ();
		btnNewButton.setIcon(new ImageIcon(imgLogout));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(976, 30, 163, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("1- Select Data from Student table :");
		lblNewLabel.setToolTipText("1- Select Data from Student table :");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel.setBounds(48, 143, 361, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SELECT *  FROM  Etudiant ;");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(93, 196, 319, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSelectData = new JLabel("2- Select Data from Teacher table :");
		lblSelectData.setToolTipText("1- Select Data from Student table :");
		lblSelectData.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblSelectData.setBounds(48, 244, 361, 50);
		contentPane.add(lblSelectData);
		
		JLabel lblSelectFrom = new JLabel("SELECT * FROM Enseignant ;");
		lblSelectFrom.setForeground(Color.BLUE);
		lblSelectFrom.setBounds(90, 298, 319, 20);
		contentPane.add(lblSelectFrom);
		
		JLabel lblSelectData_1 = new JLabel("3- Select Data from Unite table :");
		lblSelectData_1.setToolTipText("1- Select Data from Student table :");
		lblSelectData_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblSelectData_1.setBounds(48, 363, 361, 50);
		contentPane.add(lblSelectData_1);
		
		JLabel lblSelectFrom_1 = new JLabel("SELECT * FROM Unite ;");
		lblSelectFrom_1.setForeground(Color.BLUE);
		lblSelectFrom_1.setBounds(90, 424, 319, 20);
		contentPane.add(lblSelectFrom_1);
		
		JLabel lblSelectData_2 = new JLabel("4- Select Data from Student-Unite table :");
		lblSelectData_2.setToolTipText("1- Select Data from Student table :");
		lblSelectData_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblSelectData_2.setBounds(48, 487, 400, 50);
		contentPane.add(lblSelectData_2);
		
		JLabel lblSelectFrom_2 = new JLabel("SELECT * FROM EtudiantUnite ;");
		lblSelectFrom_2.setForeground(Color.BLUE);
		lblSelectFrom_2.setBounds(93, 530, 319, 20);
		contentPane.add(lblSelectFrom_2);
		
		JButton btnStudent = new JButton("Show Data");
		Image imgShow = new ImageIcon(this.getClass().getResource("/showbtn.png")).getImage ();
		btnStudent.setIcon(new ImageIcon(imgShow));
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// show Data for  student table 
				try {
					String query = " SELECT *  FROM  Etudiant ;";
					PreparedStatement prprStat = connection.prepareStatement(query) ;
					ResultSet result = prprStat.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(result));
					// close connection with data base .
					result.close();
					prprStat.close();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnStudent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnStudent.setBounds(455, 166, 209, 50);
		contentPane.add(btnStudent);
		
		JButton buttonTeacher = new JButton("Show Data");
		buttonTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// show Data for  Teacher table 
				try {
					String query = " SELECT *  FROM  Enseignant ;";
					PreparedStatement prprStat = connection.prepareStatement(query) ;
					ResultSet result = prprStat.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(result));
					// close connection with data base .
					result.close();
					prprStat.close();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonTeacher.setIcon(new ImageIcon(imgShow));
		buttonTeacher.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonTeacher.setBounds(455, 268, 209, 50);
		contentPane.add(buttonTeacher);
		
		JButton button = new JButton("Show Data");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// show Data for  Unite table 
				try {
					String query = " SELECT *  FROM  Unite ;";
					PreparedStatement prprStat = connection.prepareStatement(query) ;
					ResultSet result = prprStat.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(result));
					// close connection with data base .
					result.close();
					prprStat.close();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		button.setIcon(new ImageIcon(imgShow));
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(325, 421, 209, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Show Data");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// show Data for  Etudiant-Unite table 
				try {
					String query = " SELECT *  FROM  EtudiantUnite ;";
					PreparedStatement prprStat = connection.prepareStatement(query) ;
					ResultSet result = prprStat.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(result));
					// close connection with data base .
					result.close();
					prprStat.close();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button_1.setIcon(new ImageIcon(imgShow));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(325, 532, 209, 50);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		Image imgLblShow = new ImageIcon(this.getClass().getResource("/show.png")).getImage ();
		lblNewLabel_2.setIcon(new ImageIcon(imgLblShow));
		lblNewLabel_2.setBounds(961, 172, 131, 122);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("New label");
		Image imgLbl = new ImageIcon(this.getClass().getResource("/search.png")).getImage ();
		label.setIcon(new ImageIcon(imgLbl));
		label.setBounds(771, 172, 131, 122);
		contentPane.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("#Bulletin board# :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(567, 347, 192, 43);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(567, 408, 572, 190);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
	}

}
