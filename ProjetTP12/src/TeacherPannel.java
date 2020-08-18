import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;

public class TeacherPannel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherPannel frame = new TeacherPannel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null ;
	private JTextField textFieldMatriculeEns;
	/**
	 * Create the frame.
	 */
	public TeacherPannel() {
		connection = sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The Teacher Panel :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(15, 16, 343, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Logout");
		Image imgLogout = new ImageIcon(this.getClass().getResource("/logout.png")).getImage ();
		btnNewButton.setIcon(new ImageIcon(imgLogout));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(630, 30, 163, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("1- Consult a tuple of the table Teacher ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(15, 148, 351, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("by entering the teacher's ID :");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(38, 190, 351, 52);
		contentPane.add(lblNewLabel_2);
		
		textFieldMatriculeEns = new JTextField();
		textFieldMatriculeEns.setForeground(Color.GRAY);
		textFieldMatriculeEns.setText("Enter ID");
		textFieldMatriculeEns.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldMatriculeEns.setBounds(314, 190, 253, 47);
		contentPane.add(textFieldMatriculeEns);
		textFieldMatriculeEns.setColumns(10);
		
		JLabel lblSearch = new JLabel("");
		Image imgSearch = new ImageIcon(this.getClass().getResource("/search.png")).getImage ();
		lblSearch.setIcon(new ImageIcon(imgSearch));
		lblSearch.setBounds(630, 111, 163, 131);
		contentPane.add(lblSearch);
		
	}

}
