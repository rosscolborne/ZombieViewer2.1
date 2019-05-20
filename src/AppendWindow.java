import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class AppendWindow {

	private JFrame frame;
	private JTextField txtName1;
	private JTextField txtDescription1;
	private JTextField txtType1;
	private JTextField txtFireRate1;
	private JTextField txtFireType1;
	private JTextField txtRating1;
	private JButton btnAdd1;
	private JTextField txtAmmo1;
	private JPanel addPerk;
	private JTextField txtName2;
	private JTextField txtDescription2;
	private JTextField txtPrice2;
	private JTextField txtMaps2;
	private JLabel lblTitle2;
	private JButton btnAdd2;
	private JPanel addMap;
	private JLabel lblAddMap;
	private JTextField txtRating2;
	private JTextField Name3;
	private JTextField txtDescription3;
	private JTextField txtDifficulty3;
	private JTextField txtComplexity3;
	private JTextField txtSize3;
	private JButton btnAdd3;
	private JTextField txtWonderWeapon3;
	private JTextField txtEnemies3;
	private JButton btnExit1;
	private JButton btnExit2;
	private JButton btnExit3;

	/**
	 * Launch the application.
	 */
	public static void appendWindow(int c) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppendWindow window = new AppendWindow(c);
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
	public AppendWindow(int c) {
		initialize(c);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int c) {
		// ================================================================================
		// JFrame and JPanels
		// ================================================================================
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JPanel addWeapon = new JPanel();
		addWeapon.setBackground(Color.WHITE);
		frame.getContentPane().add(addWeapon, "name_261527839028621");
		addWeapon.setLayout(null);

		addPerk = new JPanel();
		addPerk.setBackground(Color.WHITE);
		frame.getContentPane().add(addPerk, "name_261533778438460");
		addPerk.setLayout(null);

		addMap = new JPanel();
		addMap.setBackground(Color.WHITE);
		frame.getContentPane().add(addMap, "name_262800676060661");
		addMap.setLayout(null);

		// ================================================================================
		// AddWeapon Labels
		// ================================================================================

		JLabel lblTitle1 = new JLabel("Add Weapon");
		lblTitle1.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle1.setBounds(6, 6, 289, 32);
		addWeapon.add(lblTitle1);

		txtName1 = new JTextField();
		txtName1.setText("Name");
		txtName1.setBounds(6, 48, 279, 26);
		addWeapon.add(txtName1);
		txtName1.setColumns(10);
		txtName1.setBorder(new LineBorder(new Color(128, 0, 0), 2));

		txtDescription1 = new JTextField();
		txtDescription1.setText("Description");
		txtDescription1.setColumns(10);
		txtDescription1.setBounds(6, 82, 279, 26);
		addWeapon.add(txtDescription1);
		txtDescription1.setBorder(new LineBorder(new Color(128, 0, 0), 2));

		txtType1 = new JTextField();
		txtType1.setText("Type");
		txtType1.setColumns(10);
		txtType1.setBounds(6, 120, 279, 26);
		txtType1.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addWeapon.add(txtType1);

		txtFireRate1 = new JTextField();
		txtFireRate1.setText("Fire Rate");
		txtFireRate1.setColumns(10);
		txtFireRate1.setBounds(6, 158, 279, 26);
		txtFireRate1.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addWeapon.add(txtFireRate1);

		txtFireType1 = new JTextField();
		txtFireType1.setText("Fire Type");
		txtFireType1.setColumns(10);
		txtFireType1.setBounds(6, 191, 279, 26);
		txtFireType1.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addWeapon.add(txtFireType1);

		txtRating1 = new JTextField();
		txtRating1.setText("Rating");
		txtRating1.setColumns(10);
		txtRating1.setBounds(6, 268, 279, 26);
		txtRating1.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addWeapon.add(txtRating1);

		txtAmmo1 = new JTextField();
		txtAmmo1.setText("Ammo");
		txtAmmo1.setColumns(10);
		txtAmmo1.setBounds(6, 229, 279, 26);
		txtAmmo1.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addWeapon.add(txtAmmo1);

		// ================================================================================
		// AddWeapons Buttons
		// ================================================================================
		btnAdd1 = new JButton("Add");
		btnAdd1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAdd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if (ZombieViewer.numWeapons < 40) {
					ZombieViewer.numWeapons += 1;
					ZombieViewer.weapons[ZombieViewer.numWeapons - 1] = new Weapon();
					ZombieViewer.weapons[ZombieViewer.numWeapons - 1].setName(txtName1.getText());
					ZombieViewer.weapons[ZombieViewer.numWeapons - 1].setDescription(txtDescription1.getText());
					ZombieViewer.weapons[ZombieViewer.numWeapons - 1].setType(txtType1.getText());
					ZombieViewer.weapons[ZombieViewer.numWeapons - 1]
							.setFireRate(Integer.parseInt(txtFireRate1.getText()));
					ZombieViewer.weapons[ZombieViewer.numWeapons - 1].setAmmo(Integer.parseInt(txtAmmo1.getText()));
					ZombieViewer.weapons[ZombieViewer.numWeapons - 1].setRating(Integer.parseInt(txtRating1.getText()));
					ZombieViewer.weapons[ZombieViewer.numWeapons - 1]
							.setPicture(new ImageIcon("weaponPics/DefaultGun.png"));

					ZombieViewer.clearMenu();
					ZombieViewer.initMenuBar();
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "You have already added the maximum ammount of weapons");
				}
				} catch (NumberFormatException x2) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number.");
				}
			}
		});

		btnAdd1.setBounds(168, 306, 117, 29);
		addWeapon.add(btnAdd1);

		btnExit1 = new JButton("Exit");
		btnExit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit1.setBounds(6, 306, 117, 29);
		addWeapon.add(btnExit1);

		// ================================================================================
		// AddPerks JLabels
		// ================================================================================
		lblTitle2 = new JLabel("Add Perk");
		lblTitle2.setFont(new Font("Impact", Font.PLAIN, 20));
		lblTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle2.setBounds(6, 6, 288, 46);
		addPerk.add(lblTitle2);

		txtName2 = new JTextField();
		txtName2.setText("Name");
		txtName2.setBounds(6, 64, 288, 26);
		addPerk.add(txtName2);
		txtName2.setColumns(10);
		txtName2.setBorder(new LineBorder(new Color(128, 0, 0), 2));

		txtDescription2 = new JTextField();
		txtDescription2.setText("Description");
		txtDescription2.setColumns(10);
		txtDescription2.setBounds(6, 110, 288, 26);
		txtDescription2.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addPerk.add(txtDescription2);

		txtPrice2 = new JTextField();
		txtPrice2.setText("Price");
		txtPrice2.setColumns(10);
		txtPrice2.setBounds(6, 162, 288, 26);
		txtPrice2.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addPerk.add(txtPrice2);

		txtMaps2 = new JTextField();
		txtMaps2.setText("Maps");
		txtMaps2.setColumns(10);
		txtMaps2.setBounds(6, 207, 288, 26);
		txtMaps2.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addPerk.add(txtMaps2);

		txtRating2 = new JTextField();
		txtRating2.setText("Rating");
		txtRating2.setColumns(10);
		txtRating2.setBounds(6, 253, 288, 26);
		txtRating2.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addPerk.add(txtRating2);

		// ================================================================================
		// AddPerks JButtons
		// ================================================================================
		btnAdd2 = new JButton("Add");
		btnAdd2.setBounds(177, 291, 117, 29);
		btnAdd2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAdd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if (ZombieViewer.numPerks < 20) {
					ZombieViewer.numPerks += 1;
					ZombieViewer.perks[ZombieViewer.numPerks - 1] = new Perk();
					ZombieViewer.perks[ZombieViewer.numPerks - 1].setName(txtName2.getText());
					ZombieViewer.perks[ZombieViewer.numPerks - 1].setDescription(txtDescription2.getText());
					ZombieViewer.perks[ZombieViewer.numPerks - 1].setCost(Integer.parseInt(txtPrice2.getText()));
					ZombieViewer.perks[ZombieViewer.numPerks - 1].setMaps(txtMaps2.getText());
					ZombieViewer.perks[ZombieViewer.numPerks - 1].setRating(Integer.parseInt(txtRating2.getText()));
					ZombieViewer.perks[ZombieViewer.numPerks - 1].setPicture(new ImageIcon("perkPics/DefaultPerk.jpg"));

					ZombieViewer.clearMenu();
					ZombieViewer.initMenuBar();
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "You have already added the maximum ammount of perks");
				}
				} catch (NumberFormatException x2) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number.");
				}
			}
		});
		addPerk.add(btnAdd2);

		btnExit2 = new JButton("Exit");
		btnExit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit2.setBounds(6, 292, 117, 29);
		addPerk.add(btnExit2);

		lblAddMap = new JLabel("Add Map");
		lblAddMap.setFont(new Font("Impact", Font.PLAIN, 20));
		lblAddMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddMap.setBounds(6, 6, 288, 29);
		addMap.add(lblAddMap);

		// ================================================================================
		// AddMaps Jlabels
		// ================================================================================
		Name3 = new JTextField();
		Name3.setText("Name");
		Name3.setColumns(10);
		Name3.setBounds(6, 49, 288, 26);
		Name3.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addMap.add(Name3);

		txtDescription3 = new JTextField();
		txtDescription3.setText("Description");
		txtDescription3.setColumns(10);
		txtDescription3.setBounds(6, 87, 288, 26);
		txtDescription3.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addMap.add(txtDescription3);

		txtDifficulty3 = new JTextField();
		txtDifficulty3.setText("Difficulty");
		txtDifficulty3.setColumns(10);
		txtDifficulty3.setBounds(6, 127, 288, 26);
		txtDifficulty3.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addMap.add(txtDifficulty3);

		txtComplexity3 = new JTextField();
		txtComplexity3.setText("Complexity");
		txtComplexity3.setColumns(10);
		txtComplexity3.setBounds(6, 165, 288, 26);
		txtComplexity3.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addMap.add(txtComplexity3);

		txtSize3 = new JTextField();
		txtSize3.setText("Size");
		txtSize3.setColumns(10);
		txtSize3.setBounds(6, 203, 288, 26);
		txtSize3.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addMap.add(txtSize3);

		txtWonderWeapon3 = new JTextField();
		txtWonderWeapon3.setText("Wonder Weapon");
		txtWonderWeapon3.setColumns(10);
		txtWonderWeapon3.setBounds(6, 244, 288, 26);
		txtWonderWeapon3.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addMap.add(txtWonderWeapon3);

		txtEnemies3 = new JTextField();
		txtEnemies3.setText("Enemies");
		txtEnemies3.setColumns(10);
		txtEnemies3.setBounds(6, 282, 288, 26);
		txtEnemies3.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		addMap.add(txtEnemies3);

		// ================================================================================
		// AddMaps JButtons
		// ================================================================================
		btnAdd3 = new JButton("Add");
		btnAdd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (ZombieViewer.numMaps < 20) {
						ZombieViewer.numMaps += 1;
						ZombieViewer.maps[ZombieViewer.numMaps - 1] = new Map();
						ZombieViewer.maps[ZombieViewer.numMaps - 1].setName(Name3.getText());
						ZombieViewer.maps[ZombieViewer.numMaps - 1].setDescription(txtDescription3.getText());
						ZombieViewer.maps[ZombieViewer.numMaps - 1]
								.setDifficulty(Integer.parseInt(txtDifficulty3.getText()));
						ZombieViewer.maps[ZombieViewer.numMaps - 1]
								.setComplexity(Integer.parseInt(txtComplexity3.getText()));
						ZombieViewer.maps[ZombieViewer.numMaps - 1].setSize(Integer.parseInt(txtSize3.getText()));
						ZombieViewer.maps[ZombieViewer.numMaps - 1].setWonderWeapon(txtWonderWeapon3.getText());
						ZombieViewer.maps[ZombieViewer.numMaps - 1].setEnemies(txtEnemies3.getText());
						ZombieViewer.maps[ZombieViewer.numMaps - 1].setPicture(new ImageIcon("mapPics/MapDefault.jpg"));
						ZombieViewer.clearMenu();
						ZombieViewer.initMenuBar();
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "You have already added the maximum ammount of weapons");
					}

				} catch (NumberFormatException x3) {
					JOptionPane.showMessageDialog(null, "Please Enter a valid number.");
				}
			}
		});
		btnAdd3.setBounds(177, 320, 117, 29);
		btnAdd3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		addMap.add(btnAdd3);

		btnExit3 = new JButton("Exit");
		btnExit3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit3.setBounds(6, 321, 117, 29);
		addMap.add(btnExit3);

		// Determines what JPanel to display based on what the user wishes to ad
		if (c == 1) {
			addWeapon.setVisible(true);
			addPerk.setVisible(false);
			addMap.setVisible(false);
		}

		if (c == 2) {
			addWeapon.setVisible(false);
			addPerk.setVisible(true);
			addMap.setVisible(false);
		}

		if (c == 3) {
			addWeapon.setVisible(false);
			addPerk.setVisible(false);
			addMap.setVisible(true);
		}
	}
}
