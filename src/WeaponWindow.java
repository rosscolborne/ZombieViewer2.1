import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class WeaponWindow {

	private JFrame frame;

	/**
	 * Launches the window
	 */
	public static void newScreen(Weapon wp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeaponWindow window = new WeaponWindow(wp);
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
	public WeaponWindow(Weapon wp) {
		initialize(wp);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Weapon wp) {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		// ================================================================================
		// Panels
		// ================================================================================
		JPanel weaponPanel1 = new JPanel();
		weaponPanel1.setBackground(Color.WHITE);
		frame.getContentPane().add(weaponPanel1, "name_163259289818250");
		weaponPanel1.setLayout(null);

		JPanel weaponPanel2 = new JPanel();
		weaponPanel2.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(weaponPanel2, "name_198397248616609");
		weaponPanel2.setLayout(null);

		JPanel statsPanel = new JPanel();
		statsPanel.setBackground(new Color(255, 255, 255));
		statsPanel.setBounds(16, 88, 306, 233);
		weaponPanel2.add(statsPanel);
		statsPanel.setLayout(null);

		// ================================================================================
		// Panel 1 Labels
		// ================================================================================
		JLabel lblName = new JLabel(wp.getName());
		lblName.setFont(new Font("Impact", Font.PLAIN, 40));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(74, 6, 451, 50);
		lblName.setBorder(null);
		weaponPanel1.add(lblName);

		JLabel picLabel = new JLabel("");
		picLabel.setHorizontalAlignment(SwingConstants.CENTER);
		picLabel.setBounds(74, 108, 451, 227);
		picLabel.setIcon(wp.getPicture());
		picLabel.setBorder(new LineBorder(new Color(128, 0, 0), 3));
		weaponPanel1.add(picLabel);

		JLabel lblDescription = new JLabel(wp.getDescription());
		lblDescription.setBorder(null);
		lblDescription.setForeground(Color.GRAY);
		lblDescription.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 16));
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setBounds(6, 67, 588, 29);
		weaponPanel1.add(lblDescription);

		// ================================================================================
		// Panel 1 Buttons
		// ================================================================================
		JButton btnNext = new JButton("Next");
		btnNext.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				weaponPanel1.setVisible(false);
				weaponPanel2.setVisible(true);
				statsPanel.setVisible(true);
				frame.setBounds(100, 100, 340, 400);
			}
		});
		btnNext.setBounds(109, 343, 168, 29);
		weaponPanel1.add(btnNext);

		JButton btnExit = new JButton("Exit");
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(339, 343, 161, 29);
		weaponPanel1.add(btnExit);

		// ================================================================================
		// Panel 2 Labels
		// ================================================================================
		JLabel lblTitle = new JLabel("Statistics");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Impact", Font.PLAIN, 40));
		lblTitle.setBounds(16, 26, 306, 50);
		weaponPanel2.add(lblTitle);

		statsPanel.setBorder(new LineBorder(new Color(128, 0, 0), 4));

		JLabel lblDamage = new JLabel("Damage: " + wp.getDamage());
		lblDamage.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblDamage.setBounds(6, 6, 232, 27);
		statsPanel.add(lblDamage);

		JLabel lblType = new JLabel("Type: " + wp.getType());
		lblType.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblType.setBounds(6, 40, 232, 24);
		statsPanel.add(lblType);

		JLabel lblAmmo = new JLabel("Ammo: " + wp.getAmmo() + " bullets");
		lblAmmo.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblAmmo.setBounds(6, 66, 232, 32);
		statsPanel.add(lblAmmo);

		JLabel lblFiretype = new JLabel("Fire Type: " + wp.getFireType());
		lblFiretype.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblFiretype.setBounds(6, 100, 352, 24);
		statsPanel.add(lblFiretype);

		JLabel lblFireRate = new JLabel("Fire Rate: " + wp.getFireRate() + " RpS");
		lblFireRate.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblFireRate.setBounds(6, 128, 232, 32);
		statsPanel.add(lblFireRate);

		JLabel lblReloadTime = new JLabel("Reload Time: " + wp.getReloadTime() + " s");
		lblReloadTime.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblReloadTime.setBounds(6, 164, 232, 24);
		statsPanel.add(lblReloadTime);

		JLabel lblRating = new JLabel("Rating: " + wp.getRating() + "/100");
		lblRating.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblRating.setBounds(6, 195, 232, 32);
		statsPanel.add(lblRating);

		// ================================================================================
		// Panel 2 Buttons
		// ================================================================================
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				weaponPanel1.setVisible(true);
				weaponPanel2.setVisible(false);
				frame.setBounds(100, 100, 600, 400);
			}
		});
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnBack.setBounds(58, 343, 104, 29);
		weaponPanel2.add(btnBack);

		JButton btnExit2 = new JButton("Exit");
		btnExit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit2.setBounds(174, 343, 104, 29);
		weaponPanel2.add(btnExit2);
	}
}
