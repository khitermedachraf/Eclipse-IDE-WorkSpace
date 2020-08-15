import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);

		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(35, 52, 325, 119);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);

		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(421, 52, 301, 119);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(112, 213, 200, 56);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.setBounds(484, 213, 172, 56);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("The result is : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(35, 339, 258, 56);
		frame.getContentPane().add(lblNewLabel);

		textFieldResult = new JTextField();
		textFieldResult.setBounds(318, 355, 404, 110);
		frame.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
		frame.setBounds(100, 100, 803, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
