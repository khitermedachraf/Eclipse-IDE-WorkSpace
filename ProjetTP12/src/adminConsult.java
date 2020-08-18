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
		setBounds(100, 100, 929, 654);
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
		btnNewButton.setBounds(730, 37, 163, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("1- Select Data from Student table :");
		lblNewLabel.setToolTipText("1- Select Data from Student table :");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel.setBounds(48, 143, 361, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(93, 196, 319, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSelectData = new JLabel("2- Select Data from Teacher table :");
		lblSelectData.setToolTipText("1- Select Data from Student table :");
		lblSelectData.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblSelectData.setBounds(48, 244, 361, 50);
		contentPane.add(lblSelectData);
		
		JLabel label = new JLabel("New label");
		label.setBounds(90, 298, 319, 20);
		contentPane.add(label);
		
		JLabel lblSelectData_1 = new JLabel("3- Select Data from Unite table :");
		lblSelectData_1.setToolTipText("1- Select Data from Student table :");
		lblSelectData_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblSelectData_1.setBounds(48, 363, 361, 50);
		contentPane.add(lblSelectData_1);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(90, 424, 319, 20);
		contentPane.add(label_1);
		
		JLabel lblSelectData_2 = new JLabel("4- Select Data from Unite table :");
		lblSelectData_2.setToolTipText("1- Select Data from Student table :");
		lblSelectData_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblSelectData_2.setBounds(48, 487, 361, 50);
		contentPane.add(lblSelectData_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(93, 530, 319, 20);
		contentPane.add(label_3);
		
		
	}

}
