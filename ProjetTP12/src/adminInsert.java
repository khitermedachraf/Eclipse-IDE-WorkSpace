import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class adminInsert extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminInsert frame = new adminInsert();
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
	public adminInsert() {
		connection = sqliteConnection.dbConnector(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1025, 758);
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
				btnNewButton.setBounds(803, 30, 163, 50);
				contentPane.add(btnNewButton);
	}

}
