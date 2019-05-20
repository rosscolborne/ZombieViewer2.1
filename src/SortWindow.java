import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JButton;

public class SortWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void sortWindow(Weapon[] w, Perk[] p, Map[] m, int n, int c) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortWindow window = new SortWindow(w, p, m, n, c);
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
	public SortWindow(Weapon[] w, Perk[] p, Map[] m, int n, int c) {
		initialize(w, p, m, n, c);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Weapon[] w, Perk[] p, Map[] m, int n, int c) {
		// ================================================================================
		// JFrames and JPanels
		// ================================================================================
		frame = new JFrame();
		frame.setBounds(100, 100, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JMenuItem[] menuItems = new JMenuItem[n];

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// ================================================================================
		// JLabels
		// ================================================================================
		JLabel lblTitle = new JLabel("");
		lblTitle.setFont(new Font("Impact", Font.PLAIN, 24));
		lblTitle.setBounds(16, 6, 132, 29);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTitle);
		
		JLabel lblCriteria = new JLabel("");
		lblCriteria.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCriteria.setBounds(26, 45, 122, 16);
		panel.add(lblCriteria);

		// ================================================================================
		// Menus and Buttons
		// ================================================================================
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(16, 73, 132, 22);
		menuBar.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		panel.add(menuBar);

		JMenu SortMenu = new JMenu("Click Here");
		menuBar.add(SortMenu);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(16, 107, 132, 29);
		panel.add(btnExit);
		
		// ================================================================================
		// Determines what criteria to sort the data by
		// ================================================================================
		
		//int c: the users choice; i.e. what he wants to sort the data by
		//    1-3: Sort Weapons
		//	  4-6: Sort Perks
		//    7-9: Sort Maps
		
		if (c >= 1 && c <= 3) {
			
			ZombieViewer.clearMenu();
			ZombieViewer.initMenuBar();
			for (int x = 0; x < n; x++) {
				menuItems[x] = new JMenuItem((x + 1) + ": " + w[x].getName());
				SortMenu.add(menuItems[x]);
				lblTitle.setText("Weapons");				
				int i = x;
				
				menuItems[x].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						WeaponWindow.newScreen(w[i]);
						frame.dispose();
					}
				});
			}
		}

		if (c >= 4 && c <= 6) {
			ZombieViewer.clearMenu();
			ZombieViewer.initMenuBar();
			for (int x = 0; x < n; x++) {
				menuItems[x] = new JMenuItem((x + 1) + ": " + p[x].getName());
				SortMenu.add(menuItems[x]);
				lblTitle.setText("Perks");

				int i = x;

				menuItems[x].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						PerkWindow.newScreen(p[i]);
						frame.dispose();
					}
				});

			}
		}

		if (c >= 7 && c <= 9) {
			ZombieViewer.clearMenu();
			ZombieViewer.initMenuBar();
			for (int x = 0; x < n; x++) {
				menuItems[x] = new JMenuItem((x + 1) + ": " + m[x].getName());
				SortMenu.add(menuItems[x]);
				lblTitle.setText("Maps");

				int i = x;

				menuItems[x].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MapWindow.newScreen(m[i]);
						frame.dispose();
					}
				});
			}
		}
		
		// ================================================================================
		// Determines what the title of the Panel will be
		// ================================================================================
		
		//int c: the users choice; i.e. what he wants to sort the data by
		
		switch (c) {
		case 1:
			lblCriteria.setText("By Name"); //Sort Weapons by Name
			break;
		case 2:
			lblCriteria.setText("By Damage"); //Sort Weapons by Damage
			break;
		case 3:
			lblCriteria.setText("By Rating"); //Sort Weapons by Rating
			break;
		case 4:
			lblCriteria.setText("By Name"); //Sorts Perks by Name
			break;
		case 5:
			lblCriteria.setText("By Cost"); //Sorts Perks by Cost
			break;
		case 6:
			lblCriteria.setText("By Rating"); //Sorts Perks by Rating
			break;
		case 7:
			lblCriteria.setText("By Name"); //Sorts Maps by Name
			break;
		case 8:
			lblCriteria.setText("By Difficulty"); //Sorts Maps by Difficulty
			break;
		case 9:
			lblCriteria.setText("By Size"); //Sorts Maps by Size
			break;
		}

	}
}
