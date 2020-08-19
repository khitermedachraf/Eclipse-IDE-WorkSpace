import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;

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
	private JTextField textFieldMatriculeEtu;
	private JTextField textFieldNomEtu;
	private JTextField textFieldPrenomEtu;
	private JTextField textFieldNaissance;
	private JTextField textFieldAdresse;
	private JTextField textFieldMatricule_ens;
	private JTextField textFieldNom_ens;
	private JTextField textFieldPrenom_ens;
	private JTextField textFieldCodeUnit;
	private JTextField textFieldLibelle;
	private JTextField textFieldHeures;
	private JTextField textFieldMatEns;
	private JTextField textFieldMatEtu;
	private JTextField textFieldCodeUnit4;
	private JTextField textFieldNoteCC;
	private JTextField textFieldNoteTP;
	private JTextField textFieldNoteExam;
	/**
	 * Create the frame.
	 */
	public adminInsert() {
		connection = sqliteConnection.dbConnector(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1025, 952);
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
				
				JLabel lblNewLabel = new JLabel("1- Insert a tuple in the table ");
				lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
				lblNewLabel.setBounds(48, 122, 296, 43);
				contentPane.add(lblNewLabel);
				
				JLabel lblInsertA = new JLabel("2- Insert a tuple in the table ");
				lblInsertA.setFont(new Font("Tahoma", Font.ITALIC, 20));
				lblInsertA.setBounds(48, 362, 296, 43);
				contentPane.add(lblInsertA);
				
				JLabel lblInsertA_1 = new JLabel("3- Insert a tuple in the table ");
				lblInsertA_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
				lblInsertA_1.setBounds(31, 518, 296, 43);
				contentPane.add(lblInsertA_1);
				
				JLabel lblInsertA_2 = new JLabel("4- Insert a tuple in the table ");
				lblInsertA_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
				lblInsertA_2.setBounds(31, 711, 296, 43);
				contentPane.add(lblInsertA_2);
				
				JLabel lblNewLabel_4 = new JLabel("Teacher : ");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
				lblNewLabel_4.setBounds(311, 365, 163, 37);
				contentPane.add(lblNewLabel_4);
				
				JLabel lblUnite = new JLabel("Unite: ");
				lblUnite.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
				lblUnite.setBounds(293, 521, 163, 37);
				contentPane.add(lblUnite);
				
				JLabel lblStudent = new JLabel("Student : ");
				lblStudent.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
				lblStudent.setBounds(311, 122, 163, 37);
				contentPane.add(lblStudent);
				
				JLabel lblStudentunite = new JLabel("Student-Unite : ");
				lblStudentunite.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
				lblStudentunite.setBounds(291, 714, 183, 37);
				contentPane.add(lblStudentunite);
				
				JLabel lblMatriculeetu = new JLabel("matricule_etu :");
				lblMatriculeetu.setForeground(Color.BLUE);
				lblMatriculeetu.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblMatriculeetu.setBounds(31, 181, 137, 37);
				contentPane.add(lblMatriculeetu);
				
				textFieldMatriculeEtu = new JTextField();
				textFieldMatriculeEtu.setForeground(Color.GRAY);
				textFieldMatriculeEtu.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldMatriculeEtu.setBounds(165, 182, 179, 37);
				contentPane.add(textFieldMatriculeEtu);
				textFieldMatriculeEtu.setColumns(10);
				
				JLabel lblNometu = new JLabel("nom_etu :");
				lblNometu.setForeground(Color.BLUE);
				lblNometu.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblNometu.setBounds(359, 181, 137, 37);
				contentPane.add(lblNometu);
				
				textFieldNomEtu = new JTextField();
				textFieldNomEtu.setForeground(Color.GRAY);
				textFieldNomEtu.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldNomEtu.setColumns(10);
				textFieldNomEtu.setBounds(464, 181, 179, 37);
				contentPane.add(textFieldNomEtu);
				
				JLabel lblPrenometu = new JLabel("prenom_etu :");
				lblPrenometu.setForeground(Color.BLUE);
				lblPrenometu.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblPrenometu.setBounds(671, 181, 137, 37);
				contentPane.add(lblPrenometu);
				
				textFieldPrenomEtu = new JTextField();
				textFieldPrenomEtu.setForeground(Color.GRAY);
				textFieldPrenomEtu.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldPrenomEtu.setColumns(10);
				textFieldPrenomEtu.setBounds(803, 181, 179, 37);
				contentPane.add(textFieldPrenomEtu);
				
				JLabel lblDatenaissance = new JLabel("date_naissance :");
				lblDatenaissance.setForeground(Color.BLUE);
				lblDatenaissance.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblDatenaissance.setBounds(93, 242, 163, 37);
				contentPane.add(lblDatenaissance);
				
				textFieldNaissance = new JTextField();
				textFieldNaissance.setForeground(Color.GRAY);
				textFieldNaissance.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldNaissance.setColumns(10);
				textFieldNaissance.setBounds(251, 242, 179, 37);
				contentPane.add(textFieldNaissance);
				
				JLabel lblAdresse = new JLabel("adresse :");
				lblAdresse.setForeground(Color.BLUE);
				lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblAdresse.setBounds(474, 242, 137, 37);
				contentPane.add(lblAdresse);
				
				textFieldAdresse = new JTextField();
				textFieldAdresse.setForeground(Color.GRAY);
				textFieldAdresse.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldAdresse.setColumns(10);
				textFieldAdresse.setBounds(559, 248, 179, 37);
				contentPane.add(textFieldAdresse);
				
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
				btnSave.setBounds(813, 412, 153, 46);
				contentPane.add(btnSave);
				
				JButton button = new JButton("Save ");
				button.setIcon(new ImageIcon(imgInsertBtn));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							String query = " insert into Etudiant (matricule_etu,nom_etu,prenom_etu,date_naissance,adresse) values (?,?,?,?,?);";
							PreparedStatement prprStat = connection.prepareStatement(query) ;
							prprStat.setString(1,textFieldMatriculeEtu.getText());
							prprStat.setString(2,textFieldNomEtu.getText());
							prprStat.setString(3,textFieldPrenomEtu.getText());
							prprStat.setString(4,textFieldNaissance.getText());
							prprStat.setString(5,textFieldAdresse.getText());
							prprStat.execute();
							JOptionPane.showMessageDialog(null,"Data saved successfully");
							prprStat.close();
						}catch (Exception e1) {
							e1.printStackTrace();
						}
						
					}
				});
				button.setFont(new Font("Tahoma", Font.BOLD, 20));
				button.setBounds(813, 247, 153, 46);
				contentPane.add(button);
				
				JLabel lblMatriculeens = new JLabel("matricule_ens :");
				lblMatriculeens.setForeground(Color.BLUE);
				lblMatriculeens.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblMatriculeens.setBounds(31, 421, 137, 37);
				contentPane.add(lblMatriculeens);
				
				textFieldMatricule_ens = new JTextField();
				textFieldMatricule_ens.setForeground(Color.GRAY);
				textFieldMatricule_ens.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldMatricule_ens.setColumns(10);
				textFieldMatricule_ens.setBounds(165, 421, 146, 37);
				contentPane.add(textFieldMatricule_ens);
				
				JLabel label00 = new JLabel("nom_etu :");
				label00.setForeground(Color.BLUE);
				label00.setFont(new Font("Tahoma", Font.BOLD, 17));
				label00.setBounds(319, 421, 137, 37);
				contentPane.add(label00);
				
				textFieldNom_ens = new JTextField();
				textFieldNom_ens.setForeground(Color.GRAY);
				textFieldNom_ens.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldNom_ens.setColumns(10);
				textFieldNom_ens.setBounds(413, 421, 121, 37);
				contentPane.add(textFieldNom_ens);
				
				JLabel lblPrenometu_1 = new JLabel("prenom_etu :");
				lblPrenometu_1.setForeground(Color.BLUE);
				lblPrenometu_1.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblPrenometu_1.setBounds(538, 421, 137, 37);
				contentPane.add(lblPrenometu_1);
				
				textFieldPrenom_ens = new JTextField();
				textFieldPrenom_ens.setForeground(Color.GRAY);
				textFieldPrenom_ens.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldPrenom_ens.setColumns(10);
				textFieldPrenom_ens.setBounds(662, 418, 146, 37);
				contentPane.add(textFieldPrenom_ens);
				
				JSeparator separator = new JSeparator();
				separator.setForeground(Color.RED);
				separator.setBounds(68, 333, 881, 2);
				contentPane.add(separator);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setForeground(Color.RED);
				separator_1.setBounds(68, 495, 881, 2);
				contentPane.add(separator_1);
				
				JLabel lblCodeunite = new JLabel("code_unite :");
				lblCodeunite.setForeground(Color.BLUE);
				lblCodeunite.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblCodeunite.setBounds(31, 577, 137, 37);
				contentPane.add(lblCodeunite);
				
				textFieldCodeUnit = new JTextField();
				textFieldCodeUnit.setForeground(Color.GRAY);
				textFieldCodeUnit.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldCodeUnit.setColumns(10);
				textFieldCodeUnit.setBounds(147, 577, 121, 37);
				contentPane.add(textFieldCodeUnit);
				
				JLabel lblLibelle = new JLabel("libelle :");
				lblLibelle.setForeground(Color.BLUE);
				lblLibelle.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblLibelle.setBounds(283, 577, 137, 37);
				contentPane.add(lblLibelle);
				
				textFieldLibelle = new JTextField();
				textFieldLibelle.setForeground(Color.GRAY);
				textFieldLibelle.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldLibelle.setColumns(10);
				textFieldLibelle.setBounds(353, 577, 121, 37);
				contentPane.add(textFieldLibelle);
				
				JLabel lblNbrheures = new JLabel("nbr_heures :");
				lblNbrheures.setForeground(Color.BLUE);
				lblNbrheures.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblNbrheures.setBounds(486, 577, 137, 37);
				contentPane.add(lblNbrheures);
				
				textFieldHeures = new JTextField();
				textFieldHeures.setForeground(Color.GRAY);
				textFieldHeures.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldHeures.setColumns(10);
				textFieldHeures.setBounds(605, 577, 121, 37);
				contentPane.add(textFieldHeures);
				
				JLabel lblMatriculeens_1 = new JLabel("matricule_ens :");
				lblMatriculeens_1.setForeground(Color.BLUE);
				lblMatriculeens_1.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblMatriculeens_1.setBounds(283, 630, 147, 37);
				contentPane.add(lblMatriculeens_1);
				
				textFieldMatEns = new JTextField();
				textFieldMatEns.setForeground(Color.GRAY);
				textFieldMatEns.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldMatEns.setColumns(10);
				textFieldMatEns.setBounds(432, 630, 179, 37);
				contentPane.add(textFieldMatEns);
				
				JButton buttonSaveUnit = new JButton("Save ");
				buttonSaveUnit.setIcon(new ImageIcon(imgInsertBtn));
				buttonSaveUnit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							String query = " insert into Unite (code_unite,libelle,nbr_heures,matricule_ens) values (?,?,?,?);";
							PreparedStatement prprStat = connection.prepareStatement(query) ;
							prprStat.setString(1,textFieldCodeUnit.getText());
							prprStat.setString(2,textFieldLibelle.getText());
							prprStat.setString(3,textFieldHeures.getText());
							prprStat.setString(4,textFieldMatEns.getText());
							prprStat.execute();
							JOptionPane.showMessageDialog(null,"Data saved successfully");
							prprStat.close();
						}catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				buttonSaveUnit.setFont(new Font("Tahoma", Font.BOLD, 20));
				buttonSaveUnit.setBounds(813, 571, 153, 46);
				contentPane.add(buttonSaveUnit);
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setForeground(Color.RED);
				separator_2.setBounds(68, 693, 881, 2);
				contentPane.add(separator_2);
				
				JLabel lblCodeunite_1 = new JLabel("matricule_etu :");
				lblCodeunite_1.setForeground(Color.BLUE);
				lblCodeunite_1.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblCodeunite_1.setBounds(31, 770, 137, 37);
				contentPane.add(lblCodeunite_1);
				
				textFieldMatEtu = new JTextField();
				textFieldMatEtu.setForeground(Color.GRAY);
				textFieldMatEtu.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldMatEtu.setColumns(10);
				textFieldMatEtu.setBounds(165, 770, 179, 37);
				contentPane.add(textFieldMatEtu);
				
				JLabel lblCodeunite_2 = new JLabel("code_unite :");
				lblCodeunite_2.setForeground(Color.BLUE);
				lblCodeunite_2.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblCodeunite_2.setBounds(359, 767, 137, 37);
				contentPane.add(lblCodeunite_2);
				
				textFieldCodeUnit4 = new JTextField();
				textFieldCodeUnit4.setForeground(Color.GRAY);
				textFieldCodeUnit4.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldCodeUnit4.setColumns(10);
				textFieldCodeUnit4.setBounds(474, 770, 179, 37);
				contentPane.add(textFieldCodeUnit4);
				
				JLabel lblNotecc = new JLabel("note_cc :");
				lblNotecc.setForeground(Color.BLUE);
				lblNotecc.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblNotecc.setBounds(671, 770, 137, 37);
				contentPane.add(lblNotecc);
				
				textFieldNoteCC = new JTextField();
				textFieldNoteCC.setForeground(Color.GRAY);
				textFieldNoteCC.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldNoteCC.setColumns(10);
				textFieldNoteCC.setBounds(770, 770, 179, 37);
				contentPane.add(textFieldNoteCC);
				
				JLabel lblNotetp = new JLabel("note_tp :");
				lblNotetp.setForeground(Color.BLUE);
				lblNotetp.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblNotetp.setBounds(147, 826, 137, 37);
				contentPane.add(lblNotetp);
				
				textFieldNoteTP = new JTextField();
				textFieldNoteTP.setForeground(Color.GRAY);
				textFieldNoteTP.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldNoteTP.setColumns(10);
				textFieldNoteTP.setBounds(241, 826, 179, 37);
				contentPane.add(textFieldNoteTP);
				
				JLabel lblNoteexamen = new JLabel("note_examen :");
				lblNoteexamen.setForeground(Color.BLUE);
				lblNoteexamen.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblNoteexamen.setBounds(435, 826, 137, 37);
				contentPane.add(lblNoteexamen);
				
				textFieldNoteExam = new JTextField();
				textFieldNoteExam.setForeground(Color.GRAY);
				textFieldNoteExam.setFont(new Font("Tahoma", Font.PLAIN, 17));
				textFieldNoteExam.setColumns(10);
				textFieldNoteExam.setBounds(572, 823, 179, 37);
				contentPane.add(textFieldNoteExam);
				
				JButton button_1 = new JButton("Save ");
				button_1.setIcon(new ImageIcon(imgInsertBtn));
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							String query = " insert into EtudiantUnite (matricule_etu,code_unite,note_cc,note_tp,note_examen) values (?,?,?,?,?);";
							PreparedStatement prprStat = connection.prepareStatement(query) ;
							prprStat.setString(1,textFieldMatEtu.getText());
							prprStat.setString(2,textFieldCodeUnit4.getText());
							prprStat.setString(3,textFieldNoteCC.getText());
							prprStat.setString(4,textFieldNoteTP.getText());
							prprStat.setString(5,textFieldNoteExam.getText());
							prprStat.execute();
							JOptionPane.showMessageDialog(null,"Data saved successfully");
							prprStat.close();
						}catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				button_1.setBounds(813, 817, 153, 46);
				contentPane.add(button_1);
				
				
	}
}
