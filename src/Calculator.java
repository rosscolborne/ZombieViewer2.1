import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField txtRoundNum;
	private JTextField txtNumZombies;
	private JTextField txtHealthZombies;

	/**
	 * Launch the application.
	 */
	public static void calculate() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Calculates the health of zombies in a round
	 * 
	 * @param r:
	 *            The round number
	 * @return numZombies: the health of zombies in the round
	 */
	public static int healthZombiesCalc(int r) {
		int healthZombies = 0;
		switch (r) {
		case 1:
			healthZombies = 150;
			break;
		case 2:
			healthZombies = 250;
			break;
		case 3:
			healthZombies = 350;
			break;
		case 4:
			healthZombies = 450;
			break;
		case 5:
			healthZombies = 550;
			break;
		case 6:
			healthZombies = 650;
			break;
		case 7:
			healthZombies = 750;
			break;
		case 8:
			healthZombies = 850;
			break;
		case 9:
			healthZombies = 950;
			break;
		}

		if (r >= 10) {
			healthZombies = (int) (950 * (Math.pow(1.1, r - 9)));
		}

		return healthZombies;
	}

	/**
	 * Calculates the number of zombies in a round
	 * 
	 * @param r:
	 *            The round number
	 * @return numZombies: the number of zombies in the round
	 */
	public static int numZombiesCalc(int r) {
		int numZombies = 0;

		switch (r) {
		case 1:
			numZombies = 6;
			break;
		case 2:
			numZombies = 8;
			break;
		case 3:
			numZombies = 18;
			break;
		case 4:
			numZombies = 24;
			break;
		case 5:
			numZombies = 24;
			break;
		case 6:
			numZombies = 27;
			break;
		case 7:
			numZombies = 28;
			break;
		case 8:
			numZombies = 28;
			break;
		case 9:
			numZombies = 29;
			break;
		}

		if (r >= 10) {
			numZombies = (int) (r * 24 * 0.15);
		}
		return numZombies;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// ================================================================================
		// JFrame and JPanel
		// ================================================================================
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// ================================================================================
		// JLabels
		// ================================================================================
		JLabel lblTitle = new JLabel("Calculator");
		lblTitle.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(16, 18, 267, 26);
		panel.add(lblTitle);

		JLabel lblRoundNumber = new JLabel("Round Number: ");
		lblRoundNumber.setBounds(16, 72, 102, 16);
		panel.add(lblRoundNumber);

		JLabel lblNumberOfZombies = new JLabel("Number of Zombies:");
		lblNumberOfZombies.setBounds(16, 119, 142, 16);
		panel.add(lblNumberOfZombies);

		JLabel lblHealthOfZombies = new JLabel("Health of Zombies: ");
		lblHealthOfZombies.setBounds(16, 168, 142, 16);
		panel.add(lblHealthOfZombies);

		// ================================================================================
		// JTextFields
		// ================================================================================
		txtRoundNum = new JTextField();
		txtRoundNum.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		txtRoundNum.setBounds(153, 67, 130, 26);
		panel.add(txtRoundNum);
		txtRoundNum.setColumns(10);

		txtNumZombies = new JTextField();
		txtNumZombies.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		txtNumZombies.setColumns(10);
		txtNumZombies.setBounds(153, 114, 130, 26);
		panel.add(txtNumZombies);

		txtHealthZombies = new JTextField();
		txtHealthZombies.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		txtHealthZombies.setColumns(10);
		txtHealthZombies.setBounds(153, 163, 130, 26);
		panel.add(txtHealthZombies);

		// ================================================================================
		// JButton and Calculating Values
		// ================================================================================
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int roundNumber = 0;
				int numZombies = 0;
				int healthZombies = 0;

				try {
					roundNumber = Integer.parseInt(txtRoundNum.getText());
					numZombies = numZombiesCalc(roundNumber);
					healthZombies = healthZombiesCalc(roundNumber);
					txtNumZombies.setText(Integer.toString(numZombies));
					txtHealthZombies.setText(Integer.toString(healthZombies));
				} catch (NumberFormatException x) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number for round number.");
				}
			}
		});
		btnCalculate.setBounds(26, 205, 117, 29);
		panel.add(btnCalculate);

		JButton btnExit = new JButton("Exit");
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(153, 205, 117, 29);
		panel.add(btnExit);
	}
}
