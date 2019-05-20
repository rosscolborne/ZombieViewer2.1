import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class MapWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void newScreen(Map map) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapWindow window = new MapWindow(map);
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
	public MapWindow(Map map) {
		initialize(map);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Map map) {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		// ================================================================================
		// Panels
		// ================================================================================
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel1, "name_210875490645146");
		panel1.setLayout(null);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		frame.getContentPane().add(panel2, "name_210882454240253");
		panel2.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(16, 80, 357, 332);
		panel2.add(panel_2);
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		panel_2.setLayout(null);

		// ================================================================================
		// Panel 1 Labels
		// ================================================================================
		JLabel lblName = new JLabel(map.getName());
		lblName.setFont(new Font("Impact", Font.PLAIN, 40));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(6, 6, 738, 62);
		panel1.add(lblName);

		JLabel lblDescription = new JLabel(map.getDescription());
		lblDescription.setForeground(new Color(128, 128, 128));
		lblDescription.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 16));
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setBounds(6, 73, 738, 16);
		panel1.add(lblDescription);

		JLabel picLabel = new JLabel("");
		picLabel.setHorizontalAlignment(SwingConstants.CENTER);
		picLabel.setIcon(map.getPicture());
		picLabel.setBounds(40, 101, 665, 357);
		panel1.add(picLabel);
		picLabel.setBorder(new LineBorder(new Color(128, 0, 0), 5));

		// ================================================================================
		// Panel 1 Buttons
		// ================================================================================
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				frame.setBounds(100, 100, 400, 500);
			}
		});
		btnNext.setBounds(171, 470, 117, 29);
		btnNext.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel1.add(btnNext);

		JButton btnExit = new JButton("Exit");
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(432, 470, 117, 29);
		panel1.add(btnExit);

		// ================================================================================
		// Panel 2 Labels
		// ================================================================================
		JLabel lblName2 = new JLabel(map.getName());
		lblName2.setForeground(Color.BLACK);
		lblName2.setBackground(new Color(255, 255, 255));
		lblName2.setOpaque(true);
		lblName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName2.setFont(new Font("Impact", Font.PLAIN, 40));
		lblName2.setBounds(16, 6, 357, 62);
		panel2.add(lblName2);

		JLabel lblDifficulty = new JLabel("Difficulty: " + map.getDifficulty());
		lblDifficulty.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 18));
		lblDifficulty.setBounds(17, 27, 334, 30);
		panel_2.add(lblDifficulty);

		JLabel lblComplexity = new JLabel("Complexity: " + map.getComplexity());
		lblComplexity.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 18));
		lblComplexity.setBounds(17, 84, 334, 24);
		panel_2.add(lblComplexity);

		JLabel lblSize = new JLabel("Size: " + map.getSize());
		lblSize.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 18));
		lblSize.setBounds(17, 145, 334, 30);
		panel_2.add(lblSize);

		JLabel lblWonderWeapon = new JLabel("<html>Wonder Weapon: " + map.getWonderWeapon() + "<html>");
		lblWonderWeapon.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 18));
		lblWonderWeapon.setBounds(17, 194, 334, 54);
		panel_2.add(lblWonderWeapon);

		JLabel lblEnemies = new JLabel("<html>Enemies: " + map.getEnemies() + "<html>");
		lblEnemies.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 18));
		lblEnemies.setBounds(17, 260, 334, 54);
		panel_2.add(lblEnemies);

		// ================================================================================
		// Panel 2 Buttons
		// ================================================================================
		JButton btnBack2 = new JButton("Back");
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
				frame.setBounds(100, 100, 750, 550);
			}
		});
		btnBack2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnBack2.setBounds(16, 428, 117, 29);
		panel2.add(btnBack2);

		JButton btnExit2 = new JButton("Exit");
		btnExit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit2.setBounds(255, 428, 117, 29);
		panel2.add(btnExit2);
	}
}
