import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchWindow {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void searchWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchWindow window = new SearchWindow();
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
	public SearchWindow() {
		initialize();
	}

	/**
	 * Searches the data for a weapon
	 * 
	 * @param s
	 *            the search term
	 */
	public static void searchWeapons(String s) {
		int max = ZombieViewer.numWeapons - 1;
		int mid = max / 2;
		int min = 0;
		int result = 1;
		int count = 0;

		while (result != 0 && max >= min) {
			mid = (min + max) / 2;
			result = s.compareToIgnoreCase(ZombieViewer.weapons[mid].getName());
			if (result > 0) {
				min = mid + 1;
			}
			if (result < 0) {
				max = mid - 1;
			}
			if (result == 0) {
				WeaponWindow.newScreen(ZombieViewer.weapons[mid]);
				count += 1;
			}
		}
		if (count == 0) {
			JOptionPane.showMessageDialog(null, "No Results found");
		}
	}

	/**
	 * Searches the data for a perk
	 * 
	 * @param s:
	 *            the search term
	 */
	public static void searchPerks(String s) {
		int max = ZombieViewer.numPerks - 1;
		int mid = max / 2;
		int min = 0;
		int result = 1;
		int count = 0;

		while (result != 0 && max >= min) {
			mid = (min + max) / 2;
			result = s.compareToIgnoreCase(ZombieViewer.perks[mid].getName());
			if (result > 0) {
				min = mid + 1;
			}
			if (result < 0) {
				max = mid - 1;
			}
			if (result == 0) {
				PerkWindow.newScreen(ZombieViewer.perks[mid]);
				count += 1;
			}
		}
		if (count == 0) {
			JOptionPane.showMessageDialog(null, "No Results found");
		}
	}

	/**
	 * Searches the data for a map
	 * 
	 * @param s:
	 *            the search term
	 */
	public static void searchMaps(String s) {
		int max = ZombieViewer.numMaps - 1;
		int mid = max / 2;
		int min = 0;
		int result = 1;
		int count = 0;

		while (result != 0 && max >= min) {
			mid = (min + max) / 2;
			result = s.compareToIgnoreCase(ZombieViewer.maps[mid].getName());
			if (result > 0) {
				min = mid + 1;
			}
			if (result < 0) {
				max = mid - 1;
			}
			if (result == 0) {
				MapWindow.newScreen(ZombieViewer.maps[mid]);
				count += 1;
			}
		}
		if (count == 0) {
			JOptionPane.showMessageDialog(null, "No Results found");
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// ================================================================================
		// JFrame and JPanel
		// ================================================================================
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] items = { "Weapons", "Maps", "Perks" };

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Search In: ");
		lblNewLabel.setBounds(6, 23, 116, 16);
		panel.add(lblNewLabel);

		// ================================================================================
		// ComboBox and TextField
		// ================================================================================
		JComboBox comboBox = new JComboBox(items);
		comboBox.setBounds(81, 19, 163, 27);
		panel.add(comboBox);

		textField = new JTextField();
		textField.setBounds(6, 51, 238, 26);
		panel.add(textField);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(128, 0, 0), 2));

		// ================================================================================
		// Buttons
		// ================================================================================
		JButton btnSearch = new JButton("Search");
		btnSearch.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = comboBox.getSelectedItem().toString();
				String searchText = textField.getText();

				if (s == items[0]) {
					Sort.weaponsName(ZombieViewer.weapons, ZombieViewer.numWeapons);
					ZombieViewer.clearMenu();
					ZombieViewer.initMenuBar();
					searchWeapons(searchText);
				}

				if (s == items[1]) {
					Sort.mapsName(ZombieViewer.maps, ZombieViewer.numMaps);
					ZombieViewer.clearMenu();
					ZombieViewer.initMenuBar();
					searchMaps(searchText);
				}

				if (s == items[2]) {
					Sort.perksName(ZombieViewer.perks, ZombieViewer.numPerks);
					ZombieViewer.clearMenu();
					ZombieViewer.initMenuBar();
					searchPerks(searchText);
				}

			}
		});
		btnSearch.setBounds(6, 93, 117, 29);
		panel.add(btnSearch);

		JButton btnExit = new JButton("Exit");
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit.setBounds(127, 93, 117, 29);
		panel.add(btnExit);
	}
}
