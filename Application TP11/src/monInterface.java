import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class monInterface {

	private Connection connection = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					monInterface window = new monInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public monInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnValider = new JButton("Valider ");
		btnValider.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnValider.setBounds(248, 186, 143, 29);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					rs = ((java.sql.Statement) stmt).executeQuery("SELECT * FROM ETUDIANT");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnValider);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(138, 41, 262, 112);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:BDDAdmin/TPAdmin@localhost");
			stmt = (Statement) connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
