import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JScrollPane;

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
	private JTable table;
	private JTextField textFieldMatricule_ens;
	private JTextField textFieldNom_ens;
	private JTextField textFieldPrenom_ens;
	/**
	 * Create the frame.
	 */
	public TeacherPannel() {
		connection = sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 688);
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
		
		JButton btnSearch = new JButton("Search");
		Image imgSearchBtn = new ImageIcon(this.getClass().getResource("/searchBtn.png")).getImage ();
		btnSearch.setIcon(new ImageIcon(imgSearchBtn));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = " select * from Enseignant where matricule_ens=? ;";
					PreparedStatement prprStat = connection.prepareStatement(query) ;
					prprStat.setString(1,textFieldMatriculeEns.getText());
					ResultSet result = prprStat.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(result));
					// close connection with data base .
					result.close();
					prprStat.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSearch.setBounds(640, 258, 153, 50);
		contentPane.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 258, 586, 131);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_3 = new JLabel("2- Insert a tuple in the table");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(15, 421, 269, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Teacher : ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(272, 421, 163, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblInsert = new JLabel("");
		Image imgInsert = new ImageIcon(this.getClass().getResource("/insert.png")).getImage ();
		lblInsert.setIcon(new ImageIcon(imgInsert));
		lblInsert.setBounds(640, 377, 190, 153);
		contentPane.add(lblInsert);
		
		JLabel lblNewLabel_5 = new JLabel("matricule_ens :");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(38, 491, 141, 39);
		contentPane.add(lblNewLabel_5);
		
		textFieldMatricule_ens = new JTextField();
		textFieldMatricule_ens.setForeground(Color.GRAY);
		textFieldMatricule_ens.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMatricule_ens.setBounds(194, 491, 146, 39);
		contentPane.add(textFieldMatricule_ens);
		textFieldMatricule_ens.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("nom_ens :");
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(355, 491, 103, 39);
		contentPane.add(lblNewLabel_6);
		
		textFieldNom_ens = new JTextField();
		textFieldNom_ens.setForeground(Color.GRAY);
		textFieldNom_ens.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldNom_ens.setBounds(457, 491, 163, 39);
		contentPane.add(textFieldNom_ens);
		textFieldNom_ens.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("prenom_ens :");
		lblNewLabel_7.setForeground(Color.BLUE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(212, 546, 146, 34);
		contentPane.add(lblNewLabel_7);
		
		textFieldPrenom_ens = new JTextField();
		textFieldPrenom_ens.setForeground(Color.GRAY);
		textFieldPrenom_ens.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldPrenom_ens.setBounds(351, 546, 163, 34);
		contentPane.add(textFieldPrenom_ens);
		textFieldPrenom_ens.setColumns(10);
		
		JButton btnSave = new JButton("Save ");
		Image imgInsertBtn = new ImageIcon(this.getClass().getResource("/insertBtn.png")).getImage();
		btnSave.setIcon(new ImageIcon(imgInsertBtn));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = " insert into Enseignant (matricule_ens,nom_ens,prenom_ens) values (?,?,?);";
					PreparedStatement prprStat = connection.prepareStatement(query) ;
					prprStat.setString(1,textFieldMatricule_ens.getText());
					prprStat.setString(2,textFieldNom_ens.getText());
					prprStat.setString(3,textFieldPrenom_ens.getText());
					prprStat.execute();
					JOptionPane.showMessageDialog(null,"Data saved successfully");
					prprStat.close();
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBounds(640, 546, 153, 46);
		contentPane.add(btnSave);
		
		
		
	}

}
