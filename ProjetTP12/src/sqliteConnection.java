import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class sqliteConnection {
	Connection conx = null;

	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conx = DriverManager.getConnection(
					"jdbc:sqlite:D:\\Mon travail\\Git & Github\\Eclipse IDE WorkSpace\\Eclipse-IDE-WorkSpace\\ProjetTP12\\ProjetTP12.db3");
			JOptionPane.showMessageDialog(null, "Connection Successful");
			return conx;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}
}
	 	