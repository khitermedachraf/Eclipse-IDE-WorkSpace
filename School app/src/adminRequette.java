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

public class adminRequette extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminRequette frame = new adminRequette();
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
	public adminRequette() {
		connection = sqliteConnection.dbConnector(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1155, 822);
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
				btnNewButton.setBounds(912, 30, 163, 50);
				contentPane.add(btnNewButton);
				
				JLabel lblNewLabel = new JLabel("$  Execute some requests from TP7 & TP9 $ :");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
				lblNewLabel.setForeground(Color.GRAY);
				lblNewLabel.setBounds(81, 103, 507, 43);
				contentPane.add(lblNewLabel);
				
				JButton btnNewButton_1 = new JButton("1. Afficher les noms et pr\u00E9noms des \u00E9tudiants ayant obtenus\r\n des notes d'examens \u00E9gales \u00E0 20.");
				btnNewButton_1.setForeground(Color.RED);
				btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// show Data for  the selected query  
						try {
							String query = "SELECT nom_etu,prenom_etu \r\n" + 
									"	  FROM Etudiant,EtudiantUnite\r\n" + 
									"	  WHERE Etudiant.matricule_etu=EtudiantUnite.matricule_etu \r\n" + 
									"	  and note_examen =20;";
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
				btnNewButton_1.setBounds(31, 212, 722, 57);
				contentPane.add(btnNewButton_1);
				
				JButton btnAfficherPour_1 = new JButton("1. Afficher pour chaque \u00E9tudiant son matricule et sa moyenne g\u00E9n\u00E9rale.");
				btnAfficherPour_1.setForeground(Color.BLUE);
				btnAfficherPour_1.setBounds(31, 490, 539, 57);
				contentPane.add(btnAfficherPour_1);
				
				JLabel lblNewLabel_1 = new JLabel("RED");
				lblNewLabel_1.setForeground(Color.RED);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_1.setBounds(112, 162, 69, 20);
				contentPane.add(lblNewLabel_1);
				
				JLabel lblForTpAnd = new JLabel("for TP7 and ");
				lblForTpAnd.setForeground(Color.BLACK);
				lblForTpAnd.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblForTpAnd.setBounds(166, 162, 130, 20);
				contentPane.add(lblForTpAnd);
				
				JLabel lblBlue = new JLabel("BLUE");
				lblBlue.setForeground(Color.BLUE);
				lblBlue.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblBlue.setBounds(294, 164, 69, 20);
				contentPane.add(lblBlue);
				
				JLabel lblForTpQuerys = new JLabel("for TP9 queries !");
				lblForTpQuerys.setForeground(Color.BLACK);
				lblForTpQuerys.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblForTpQuerys.setBounds(356, 164, 182, 20);
				contentPane.add(lblForTpQuerys);
				
				JButton btnAfficherLes = new JButton("2. Afficher les noms et pr\u00E9noms des \u00E9tudiants qui ne sont pas inscrits dans l'unit\u00E9 \u00AB POO \u00BB.");
				btnAfficherLes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// show Data for  the selected query  
						try {
							String query = "SELECT nom_etu,prenom_etu\r\n" + 
									"	  FROM Etudiant\r\n" + 
									"	  WHERE matricule_etu \r\n" + 
									"	  NOT IN  (SELECT matricule_etu \r\n" + 
									"	          FROM EtudiantUnite,Unite\r\n" + 
									"		        WHERE EtudiantUnite.code_unite=Unite.code_unite\r\n" + 
									"		        AND libelle='POO');";  
									
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
				btnAfficherLes.setForeground(Color.RED);
				btnAfficherLes.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnAfficherLes.setBounds(31, 316, 722, 57);
				contentPane.add(btnAfficherLes);
				
				JButton btnAfficherPour = new JButton("3. Afficher pour chaque \u00E9tudiant, son nom, son pr\u00E9nom sa moyenne par unit\u00E9 d'enseignement");
				btnAfficherPour.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// show Data for  the selected query  
						try {
							String query = "     Select nom_etu,prenom_etu,libelle, (note_CC+note_TP+2*note_examen)/4 as moyG\r\n" + 
									"     From etudiantunite,etudiant,unite\r\n" + 
									"     Where etudiant.matricule_etu = etudiantunite.matricule_etu\r\n" + 
									"     And unite.code_unite = etudiantunite.code_unite;" ;
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
				btnAfficherPour.setForeground(Color.RED);
				btnAfficherPour.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnAfficherPour.setBounds(31, 417, 722, 57);
				contentPane.add(btnAfficherPour);
				
				JButton btnAfficherPour_2 = new JButton("2. Afficher pour chaque unit\u00E9 son libell\u00E9 et la moyenne de la section.");
				btnAfficherPour_2.setForeground(Color.BLUE);
				btnAfficherPour_2.setBounds(31, 579, 539, 57);
				contentPane.add(btnAfficherPour_2);
				
				JButton btnAfficherLa = new JButton("3. Afficher la moyenne g\u00E9n\u00E9rale de la section.");
				btnAfficherLa.setForeground(Color.BLUE);
				btnAfficherLa.setBounds(31, 672, 539, 57);
				contentPane.add(btnAfficherLa);
				
				JLabel lblNewLabel_2 = new JLabel("New label");
				Image imgLbl = new ImageIcon(this.getClass().getResource("/search.png")).getImage ();
				lblNewLabel_2.setIcon(new ImageIcon(imgLbl));
				lblNewLabel_2.setBounds(903, 137, 137, 132);
				contentPane.add(lblNewLabel_2);
				
				JLabel label = new JLabel("New label");
				Image imgRun = new ImageIcon(this.getClass().getResource("/run.png")).getImage ();
				label.setIcon(new ImageIcon(imgRun));
				label.setBounds(912, 285, 137, 132);
				contentPane.add(label);
				
				JLabel lblNewLabel_3 = new JLabel("#Bulletin board# :");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_3.setBounds(846, 433, 229, 41);
				contentPane.add(lblNewLabel_3);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(585, 490, 533, 260);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
	}
}
