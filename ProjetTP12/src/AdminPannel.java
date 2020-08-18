import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class AdminPannel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPannel frame = new AdminPannel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null ;
	/**
	 * Create the frame.
	 */
	public AdminPannel() {
		connection = sqliteConnection.dbConnector(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmin = new JLabel("The Admin Panel  :");
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblAdmin.setBounds(93, 32, 270, 43);
		contentPane.add(lblAdmin);
		
		JButton btnNewButton = new JButton("Logout");
		Image imgLogout = new ImageIcon(this.getClass().getResource("/logout.png")).getImage ();
		btnNewButton.setIcon(new ImageIcon(imgLogout));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(630, 30, 163, 50);
		contentPane.add(btnNewButton);
		

		JLabel lblNewLabel_1 = new JLabel("1- Consult data in all tables :  ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(44, 148, 351, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2- Insert tuples in all tables :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(44, 286, 286, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3- Execute some requests from TP7 & TP9 :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(44, 424, 437, 71);
		contentPane.add(lblNewLabel_3);
		
		JButton btnConsult = new JButton("Access the frame");
		btnConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// open the first frame for searching
				try {
					adminConsult adminConslt = new adminConsult () ;
					adminConslt.setVisible(true);
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConsult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConsult.setBounds(379, 141, 253, 50);
		contentPane.add(btnConsult);
		
		JButton btnInsert = new JButton("Access the frame");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// open the second frame for inserting
				try {
					adminInsert adminAdd = new adminInsert () ;
					adminAdd.setVisible(true);
					
				}catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnInsert.setBounds(379, 288, 253, 56);
		contentPane.add(btnInsert);
		
		JButton btnExecute = new JButton("Access the frame");
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// open the third frame for executing
				try {
					adminRequette adminRqt = new adminRequette () ;
					adminRqt.setVisible(true);
				}catch (Exception e1) {
					e1.printStackTrace();
				}
					
			}
		});
		btnExecute.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExecute.setBounds(496, 424, 257, 50);
		contentPane.add(btnExecute);
		
		JLabel lblSearch = new JLabel("");
		Image imgSearch = new ImageIcon(this.getClass().getResource("/search.png")).getImage ();
		lblSearch.setIcon(new ImageIcon(imgSearch));
		lblSearch.setBounds(695, 84, 139, 134);
		contentPane.add(lblSearch);
		
		JLabel labelExecute = new JLabel("New label");
		Image imgExecute = new ImageIcon(this.getClass().getResource("/execute.png")).getImage ();
		labelExecute.setIcon(new ImageIcon(imgExecute));
		labelExecute.setBounds(814, 394, 139, 134);
		contentPane.add(labelExecute);
		
		JLabel labelInsert = new JLabel("");
		Image imgInsert = new ImageIcon(this.getClass().getResource("/insert.png")).getImage ();
		labelInsert.setIcon(new ImageIcon(imgInsert));
		labelInsert.setBounds(737, 251, 139, 134);
		contentPane.add(labelInsert);
		
		JLabel labelAdmin = new JLabel("");
		Image imgAdmin = new ImageIcon(this.getClass().getResource("/admin.png")).getImage ();
		labelAdmin.setIcon(new ImageIcon(imgAdmin));
		labelAdmin.setBounds(31, 16, 137, 71);
		contentPane.add(labelAdmin);
		
		
		
	}
}
