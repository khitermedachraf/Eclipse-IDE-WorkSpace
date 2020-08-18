import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
	/**
	 * Create the frame.
	 */
	public adminConsult() {
		connection = sqliteConnection.dbConnector(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
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
		contentPane.add(lblAdmin);
		
		
	}

}
