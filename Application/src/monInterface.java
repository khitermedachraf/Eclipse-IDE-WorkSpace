import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class monInterface {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox actPrincipal;

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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel realisateur = new JLabel("R\u00E9alisateur :");
		realisateur.setFont(new Font("Tahoma", Font.PLAIN, 19));
		realisateur.setVerticalAlignment(SwingConstants.TOP);
		realisateur.setBounds(15, 16, 115, 25);
		frame.getContentPane().add(realisateur);

		JFormattedTextField realisateurInput = new JFormattedTextField();
		realisateurInput.setFont(new Font("Tahoma", Font.PLAIN, 19));
		realisateurInput.setDropMode(DropMode.INSERT);
		realisateurInput.setText("Ins\u00E9rer le nom du r\u00E9alisateur");
		realisateurInput.setBounds(123, 15, 265, 32);
		frame.getContentPane().add(realisateurInput);

		JButton button = new JButton("Valider");
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomRealisateur = realisateurInput.getText();
				System.out.println("le nom de realisateur est :" + nomRealisateur);
			}
		});
		button.setBounds(123, 199, 115, 29);
		frame.getContentPane().add(button);

		JLabel version = new JLabel("version :");
		version.setFont(new Font("Tahoma", Font.PLAIN, 19));
		version.setBounds(15, 57, 97, 20);
		frame.getContentPane().add(version);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("VF \"version Fran\u00E7aise \"");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(120, 55, 213, 29);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("VO \"version originale\"");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(120, 92, 213, 29);
		frame.getContentPane().add(rdbtnNewRadioButton_1);

		actPrincipal = new JCheckBox("Acteur principal.");
		actPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (actPrincipal.isSelected()) {
					System.out.println(actPrincipal.getText());
				}
			}
		});
		actPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		actPrincipal.setBounds(171, 143, 168, 29);
		frame.getContentPane().add(actPrincipal);
	}

}
