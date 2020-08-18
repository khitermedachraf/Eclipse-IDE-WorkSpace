import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection = sqliteConnection.dbConnector();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 852, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("The Login Page : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(15, 30, 389, 52);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblUsername = new JLabel("Username : ");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(107, 111, 116, 37);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(107, 196, 116, 52);
		frame.getContentPane().add(lblPassword);

		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldUsername.setBounds(250, 118, 252, 30);
		frame.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(250, 211, 252, 26);
		frame.getContentPane().add(passwordField);

		JButton btnLogin = new JButton("Login");
		Image img = new ImageIcon(this.getClass().getResource("/ok.png")).getImage ();
		btnLogin.setIcon(new ImageIcon(img));
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				// while cliquing on Login it will connect to database and verify the user info
				try {
					String query = " select * from Admins where username=? and password=? ;";
					PreparedStatement prprStat = connection.prepareStatement(query) ;
					prprStat.setString(1,textFieldUsername.getText());
					prprStat.setString(2,passwordField.getText());
					ResultSet result = prprStat.executeQuery();
					int count = 0 ; 
					while (result.next()) {
						count++;	
					}
					if(count == 1) {
						JOptionPane.showMessageDialog(null, " Username and Password is Corrected :)");
						frame.dispose();
						if(textFieldUsername.getText().contentEquals("BDDAdmin") && passwordField.getText().contentEquals("TPAdmin") ) {
							AdminPannel adminPnl = new AdminPannel () ;
							adminPnl.setVisible(true);						
						} else if (textFieldUsername.getText().contentEquals("Etudiant") && passwordField.getText().contentEquals("TPEtudiant")) {
							StudentPannel stdntPnl = new StudentPannel();
							stdntPnl.setVisible(true);
						} else if (textFieldUsername.getText().contentEquals("Enseignant") && passwordField.getText().contentEquals("TPEnseignant")) {
							TeacherPannel tchrPnl = new TeacherPannel () ;
							tchrPnl.setVisible(true);
						} 
							
					}else if (count > 1) {
						JOptionPane.showMessageDialog(null, " Duplicate Username and Password !? ");
					}else {
						JOptionPane.showMessageDialog(null, " Username or Password is not Corrected :( \n Try Again!!!");
					}
					result.close();
					prprStat.close();
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnLogin.setBounds(330, 281, 172, 52);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblLoginImg = new JLabel("");
		Image imgLogin = new ImageIcon(this.getClass().getResource("/login.png")).getImage ();
		lblLoginImg.setIcon(new ImageIcon(imgLogin));
		lblLoginImg.setBounds(545, 132, 252, 293);
		frame.getContentPane().add(lblLoginImg);
	}
}
