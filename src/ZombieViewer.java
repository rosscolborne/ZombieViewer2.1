import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import java.awt.CardLayout;

public class ZombieViewer {

	// Object Arrays for Weapons, Maps and Perks
	static Weapon[] weapons = new Weapon[40];
	static Map[] maps = new Map[20];
	static Perk[] perks = new Perk[20];

	static int numWeapons = 0;
	static int numPerks = 0;
	static int numMaps = 0;

	static ImageIcon[] weaponPics = new ImageIcon[40];
	static ImageIcon[] perkPics = new ImageIcon[20];
	static ImageIcon[] mapPics = new ImageIcon[20];

	static JFrame frame;

	static JMenu mnWeapons = new JMenu("Weapons");
	static JMenu mnMaps = new JMenu("Maps");
	static JMenu mnPerks = new JMenu("Perks");

	static JMenu mnAssaultRifles = new JMenu("Assault Rifles");
	static JMenu mnSmgs = new JMenu("SMGs");
	static JMenu mnShotguns = new JMenu("Shotguns");
	static JMenu mnLmgs = new JMenu("LMGs");
	static JMenu mnPistols = new JMenu("Pistols");
	static JMenu mnOther = new JMenu("Other");

	static JMenuItem[] weaponMenu = new JMenuItem[40];
	static JMenuItem[] mapMenu = new JMenuItem[20];
	static JMenuItem[] perkMenu = new JMenuItem[20];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZombieViewer Window = new ZombieViewer();
					Window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the application.
	 * 
	 * @throws IOException
	 */
	public ZombieViewer() throws IOException {
		initialize();
		menu();
		menuBar();
		initMenuBar();
	}

	/**
	 * Initializes the contents of the frame.
	 * 
	 */

	private void menu() {
		// ================================================================================
		// Frame and Panel Declaration
		// ================================================================================
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		ImageIcon[] menuPics = new ImageIcon[6];
		menuPics[0] = new ImageIcon("menuPics/Chronicles.jpg");

		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(new Color(255, 255, 255));
		menuPanel.setForeground(Color.RED);
		frame.getContentPane().add(menuPanel, "name_161309353565361");
		menuPanel.setLayout(null);

		// ================================================================================
		// JLabels
		// ================================================================================
		// Title
		JLabel lblTitle = new JLabel("Call of Duty: Black Ops 3");
		lblTitle.setFont(new Font("Impact", Font.PLAIN, 59));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(6, 6, 888, 64);
		menuPanel.add(lblTitle);
		// End Title

		// Subtitle
		JLabel lblSubtitle = new JLabel("Zombies Chronicles");
		lblSubtitle.setForeground(new Color(128, 0, 0));
		lblSubtitle.setFont(new Font("Impact", Font.ITALIC, 49));
		lblSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtitle.setBounds(6, 69, 888, 76);
		menuPanel.add(lblSubtitle);
		// End Subtitle

		// Heading
		JLabel lblHeading = new JLabel("A comprehensive guide to the world's most popular zombie game!");
		lblHeading.setFont(new Font("Lucida Grande", Font.ITALIC, 24));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setBounds(16, 144, 878, 36);
		menuPanel.add(lblHeading);
		// End Heading

		// Picture Label
		JLabel picLabel = new JLabel("");
		picLabel.setBounds(481, 192, 413, 358);
		picLabel.setIcon(menuPics[0]);
		menuPanel.add(picLabel);
		menuPanel.setVisible(false);
		// End Picture Label

		// Sub-heading
		JLabel lblSubHeading = new JLabel("In This Guide:");
		lblSubHeading.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblSubHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubHeading.setBounds(27, 209, 413, 27);
		menuPanel.add(lblSubHeading);
		// End Sub-Heading

		// Info
		JLabel lblTextInfo1 = new JLabel("Learn about various weapons and their ideal uses during a match");
		lblTextInfo1.setBounds(27, 248, 413, 16);
		menuPanel.add(lblTextInfo1);

		JLabel lblTextInfo2 = new JLabel("Learn about the many maps in the game");
		lblTextInfo2.setBounds(27, 286, 413, 16);
		menuPanel.add(lblTextInfo2);

		JLabel lblTextInfo3 = new JLabel("Learn about perks, and how they can benefit your game");
		lblTextInfo3.setBounds(27, 328, 413, 16);
		menuPanel.add(lblTextInfo3);

		JLabel lblTextInfo4 = new JLabel("Explore a variety of tactics and stragies to improve your game");
		lblTextInfo4.setBounds(27, 369, 413, 16);
		menuPanel.add(lblTextInfo4);

		JLabel lblTextInfo5 = new JLabel("Learn game mechanics and how you can play them to your advantage");
		lblTextInfo5.setBounds(27, 414, 442, 16);
		menuPanel.add(lblTextInfo5);
		// End Info

		// ================================================================================
		// Buttons
		// ================================================================================
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		btnExit.setBackground(SystemColor.inactiveCaption);
		btnExit.setForeground(UIManager.getColor("Button.foreground"));
		btnExit.setBounds(156, 472, 151, 36);
		menuPanel.add(btnExit);
		btnExit.setBorder(new LineBorder(new Color(128, 0, 0), 3));

		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menuPanel.setVisible(true);

	}

	public static void clearMenu() {
		mnAssaultRifles.removeAll();
		mnSmgs.removeAll();
		mnShotguns.removeAll();
		mnLmgs.removeAll();
		mnPistols.removeAll();
		mnPerks.removeAll();
		mnMaps.removeAll();
		mnOther.removeAll();
	}

	/**
	 * Initializes arrays for weapons, maps and perks Loads and reads .txt files
	 * where information is stored
	 */
	static void initialize() throws IOException {

		// Declaring & Initializing Variables

		// Text Files
		File weaponsFile = new File("Weapons.txt");
		File mapsFile = new File("Maps.txt");
		File perksFile = new File("Perks.txt");

		try {
			// ================================================================================
			// Reading text files
			// ================================================================================
			FileReader weaponsInput = new FileReader(weaponsFile);
			FileReader mapsInput = new FileReader(mapsFile);
			FileReader perksInput = new FileReader(perksFile);

			BufferedReader weaponsFileInput = new BufferedReader(weaponsInput);
			BufferedReader mapsFileInput = new BufferedReader(mapsInput);
			BufferedReader perksFileInput = new BufferedReader(perksInput);

			numWeapons = Integer.parseInt(weaponsFileInput.readLine());
			numMaps = Integer.parseInt(mapsFileInput.readLine());
			numPerks = Integer.parseInt(perksFileInput.readLine());

			// ================================================================================
			// Initializing each object
			// ================================================================================
			for (int x = 0; x < numWeapons; x++) {
				weapons[x] = new Weapon();
				weapons[x].setName(weaponsFileInput.readLine());
				weapons[x].setDescription(weaponsFileInput.readLine());
				weapons[x].setDamage(Integer.parseInt(weaponsFileInput.readLine()));
				weapons[x].setType(weaponsFileInput.readLine());
				weapons[x].setAmmo(Integer.parseInt(weaponsFileInput.readLine()));
				weapons[x].setFireType(weaponsFileInput.readLine());
				weapons[x].setFireRate(Integer.parseInt(weaponsFileInput.readLine()));
				weapons[x].setReloadTime(Double.parseDouble(weaponsFileInput.readLine()));
				weapons[x].setRating(Integer.parseInt(weaponsFileInput.readLine()));
				weaponsFileInput.readLine();
			}

			for (int x = 0; x < numMaps; x++) {
				maps[x] = new Map();
				maps[x].setName(mapsFileInput.readLine());
				maps[x].setDescription(mapsFileInput.readLine());
				maps[x].setDifficulty(Integer.parseInt(mapsFileInput.readLine()));
				maps[x].setComplexity(Integer.parseInt(mapsFileInput.readLine()));
				maps[x].setSize(Integer.parseInt(mapsFileInput.readLine()));
				maps[x].setWonderWeapon(mapsFileInput.readLine());
				maps[x].setEnemies(mapsFileInput.readLine());
				mapsFileInput.readLine();
			}

			for (int x = 0; x < numPerks; x++) {
				perks[x] = new Perk();
				perks[x].setName(perksFileInput.readLine());
				perks[x].setDescription(perksFileInput.readLine());
				perks[x].setCost(Integer.parseInt(perksFileInput.readLine()));
				perks[x].setMaps(perksFileInput.readLine());
				perks[x].setRating(Integer.parseInt(perksFileInput.readLine()));
				perksFileInput.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ================================================================================
		// Declaring/Initializing Images
		// ================================================================================
		weapons[0].setPicture(new ImageIcon("weaponPics/KN-44.png"));
		weapons[1].setPicture(new ImageIcon("weaponPics/Man-O-War.png"));
		weapons[2].setPicture(new ImageIcon("weaponPics/HVK-30.jpg"));
		weapons[3].setPicture(new ImageIcon("weaponPics/Sheiva.png"));
		weapons[4].setPicture(new ImageIcon("weaponPics/M8A7.png"));
		weapons[5].setPicture(new ImageIcon("weaponPics/ICR-1.jpeg"));
		weapons[6].setPicture(new ImageIcon("weaponPics/Kuda.png"));
		weapons[7].setPicture(new ImageIcon("weaponPics/VMP.png"));
		weapons[8].setPicture(new ImageIcon("weaponPics/Vesper.png"));
		weapons[9].setPicture(new ImageIcon("weaponPics/Pharo.png"));
		weapons[10].setPicture(new ImageIcon("weaponPics/Weevil.png"));
		weapons[11].setPicture(new ImageIcon("weaponPics/KRM-262.png"));
		weapons[12].setPicture(new ImageIcon("weaponPics/205_Brecci.jpeg"));
		weapons[13].setPicture(new ImageIcon("weaponPics/Argus.png"));
		weapons[14].setPicture(new ImageIcon("weaponPics/Haymaker-12.png"));
		weapons[15].setPicture(new ImageIcon("weaponPics/Dingo.png"));
		weapons[16].setPicture(new ImageIcon("weaponPics/BRM.png"));
		weapons[17].setPicture(new ImageIcon("weaponPics/48 Dredge.jpeg"));
		weapons[18].setPicture(new ImageIcon("weaponPics/Gorgon.png"));
		weapons[19].setPicture(new ImageIcon("weaponPics/RK5.png"));
		weapons[20].setPicture(new ImageIcon("weaponPics/L-CAR 9.png"));

		perks[0].setPicture(new ImageIcon("perkPics/Juggernog.png"));
		perks[1].setPicture(new ImageIcon("perkPics/Quick Revive.png"));
		perks[2].setPicture(new ImageIcon("perkPics/Speed Cola.png"));
		perks[3].setPicture(new ImageIcon("perkPics/Mule Kick.png"));
		perks[4].setPicture(new ImageIcon("perkPics/Double Tap.png"));
		perks[5].setPicture(new ImageIcon("perkPics/Widow's Wine.png"));
		perks[6].setPicture(new ImageIcon("perkPics/Electric Cherry.png"));
		perks[7].setPicture(new ImageIcon("perkPics/Stamin-Up.png"));
		perks[8].setPicture(new ImageIcon("perkPics/Deadshot Daiquiri.png"));
		perks[9].setPicture(new ImageIcon("perkPics/Wunderfizz.jpg"));

		maps[0].setPicture(new ImageIcon("mapPics/Ascension.jpg"));
		maps[1].setPicture(new ImageIcon("mapPics/Kino Der Toten.jpg"));
		maps[2].setPicture(new ImageIcon("mapPics/Moon.jpg"));
		maps[3].setPicture(new ImageIcon("mapPics/Verrukt.jpg"));
		maps[4].setPicture(new ImageIcon("mapPics/Shangri-La.jpg"));
		maps[5].setPicture(new ImageIcon("mapPics/Shi No Numa.jpg"));
		maps[6].setPicture(new ImageIcon("mapPics/Origins.jpg"));
		maps[7].setPicture(new ImageIcon("mapPics/Nacht Der Untoten.jpg"));
	}

	/**
	 * Initializes data to be placed in the menu bar using loops
	 */
	static void initMenuBar() {
		// ================================================================================
		// Initializing each menu object
		// ================================================================================
		for (int x = 0; x < numWeapons; x++) { // Weapons
			weaponMenu[x] = new JMenuItem(weapons[x].getName());
			String w = weapons[x].getType();
			if (w.equals("Assault Rifle")) {
				mnAssaultRifles.add(weaponMenu[x]);
			} else if (w.equals("SMG")) {
				mnSmgs.add(weaponMenu[x]);
			} else if (w.equals("Shotgun")) {
				mnShotguns.add(weaponMenu[x]);
			} else if (w.equals("LMG")) {
				mnLmgs.add(weaponMenu[x]);
			} else if (w.equals("Pistol")) {
				mnPistols.add(weaponMenu[x]);
			} else {
				mnOther.add(weaponMenu[x]);
			}
			int i = x;

			weaponMenu[x].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					WeaponWindow.newScreen(weapons[i]);
				}
			});

		}

		for (int x = 0; x < numMaps; x++) { // Maps
			mapMenu[x] = new JMenuItem(maps[x].getName());
			mnMaps.add(mapMenu[x]);
			int i = x;

			mapMenu[x].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MapWindow.newScreen(maps[i]);
				}
			});
		}

		for (int x = 0; x < numPerks; x++) { // Perks
			perkMenu[x] = new JMenuItem(perks[x].getName());
			mnPerks.add(perkMenu[x]);
			int i = x;

			perkMenu[x].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PerkWindow.newScreen(perks[i]);
				}
			});
		}
	}

	/**
	 * Adds components to the menu bar
	 */
	static void menuBar() {
		// ================================================================================
		// Creating File Bar
		// ================================================================================
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Resets data to original settings
				try {
					initialize();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				clearMenu();
				initMenuBar();
			}
		});
		mnFile.add(mntmReset);
		mnFile.add(mntmExit);

		// ================================================================================
		// Weapons Menu
		// ================================================================================
		menuBar.add(mnWeapons);

		mnWeapons.add(mnAssaultRifles);

		mnWeapons.add(mnSmgs);

		mnWeapons.add(mnShotguns);

		mnWeapons.add(mnLmgs);

		mnWeapons.add(mnPistols);

		mnWeapons.add(mnOther);

		menuBar.add(mnMaps);

		menuBar.add(mnPerks);

		JMenu mnData = new JMenu("Data"); // Data Menu
		menuBar.add(mnData);

		JMenuItem mntmSearch = new JMenuItem("Search");
		mntmSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchWindow.searchWindow();
			}
		});
		mnData.add(mntmSearch);

		JMenu mnSort = new JMenu("Sort");
		mnData.add(mnSort);

		JMenu mnWeapons_1 = new JMenu("Weapons"); // Weapons Menu
		mnSort.add(mnWeapons_1);

		JMenuItem mntmByName = new JMenuItem("By Name");
		mntmByName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.weaponsName(weapons, numWeapons);
				SortWindow.sortWindow(weapons, perks, maps, numWeapons, 1);
			}

		});
		mnWeapons_1.add(mntmByName);

		JMenuItem mntmByDamage = new JMenuItem("By Damage");
		mntmByDamage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.weaponsDamage(weapons, numWeapons);
				SortWindow.sortWindow(weapons, perks, maps, numWeapons, 2);
			}
		});
		mnWeapons_1.add(mntmByDamage);

		JMenuItem mntmByRating = new JMenuItem("By Rating");
		mntmByRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.weaponsRating(weapons, numWeapons);
				SortWindow.sortWindow(weapons, perks, maps, numWeapons, 3);
			}
		});
		mnWeapons_1.add(mntmByRating);

		JMenu mnPerks_1 = new JMenu("Perks");
		mnSort.add(mnPerks_1);

		JMenuItem mntmByName_1 = new JMenuItem("By Name");
		mntmByName_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.perksName(perks, numPerks);
				SortWindow.sortWindow(weapons, perks, maps, numPerks, 4);
			}
		});
		mnPerks_1.add(mntmByName_1);

		JMenuItem mntmByCost_1 = new JMenuItem("By Cost");
		mntmByCost_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.perksCost(perks, numPerks);
				SortWindow.sortWindow(weapons, perks, maps, numPerks, 5);
			}
		});
		mnPerks_1.add(mntmByCost_1);

		JMenuItem mntmByRating_1 = new JMenuItem("By Rating");
		mntmByRating_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.perksRating(perks, numPerks);
				SortWindow.sortWindow(weapons, perks, maps, numPerks, 6);
			}
		});
		mnPerks_1.add(mntmByRating_1);

		JMenu mnMaps_1 = new JMenu("Maps"); // Maps Menu
		mnSort.add(mnMaps_1);

		JMenuItem mntmByCost = new JMenuItem("By Name");
		mntmByCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.mapsName(maps, numMaps);
				SortWindow.sortWindow(weapons, perks, maps, numMaps, 7);
			}
		});

		mnMaps_1.add(mntmByCost);

		JMenuItem mntmByDifficulty = new JMenuItem("By Difficulty");
		mntmByDifficulty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.mapsDifficulty(maps, numMaps);
				SortWindow.sortWindow(weapons, perks, maps, numMaps, 8);
			}
		});
		mnMaps_1.add(mntmByDifficulty);

		JMenuItem mntmBySize = new JMenuItem("By Size");
		mntmBySize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort.mapsSize(maps, numMaps);
				SortWindow.sortWindow(weapons, perks, maps, numMaps, 9);
			}
		});
		mnMaps_1.add(mntmBySize);

		JMenu mnAppend = new JMenu("Append");
		mnData.add(mnAppend);

		JMenuItem mntmWeapons_1 = new JMenuItem("Weapons");
		mntmWeapons_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppendWindow.appendWindow(1);
			}
		});
		mnAppend.add(mntmWeapons_1);

		JMenuItem mntmPerks_1 = new JMenuItem("Perks");
		mntmPerks_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppendWindow.appendWindow(2);
			}
		});
		mnAppend.add(mntmPerks_1);

		JMenuItem mntmMaps_1 = new JMenuItem("Maps");
		mntmMaps_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppendWindow.appendWindow(3);
			}
		});
		mnAppend.add(mntmMaps_1);

		JMenu mnCalculate = new JMenu("Calculate");
		menuBar.add(mnCalculate);

		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator.calculate();
			}
		});
		mnCalculate.add(mntmCalculator);

		JMenu mnNewMenu = new JMenu("Help");
		menuBar.add(mnNewMenu);

		// ================================================================================
		// JOptionPanes
		// ================================================================================
		JMenuItem mntmVersion = new JMenuItem("Version");
		mntmVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ZombieViewer\nVersion 2.1");
			}
		});
		mnNewMenu.add(mntmVersion);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"ZombieViewer\nVersion 2.1\nCreated by Ross Colborne");
			}
		});
		mnNewMenu.add(mntmAbout);

		// ================================================================================
		// End Main Class
		// ================================================================================

	}
}
