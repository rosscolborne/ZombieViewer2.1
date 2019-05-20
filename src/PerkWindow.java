import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerkWindow {

	private JFrame frame;

	/**
	 * Launch the window.
	 */
	public static void newScreen(Perk p) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerkWindow window = new PerkWindow(p);
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
	public PerkWindow(Perk p) {
		initialize(p);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Perk p) {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ================================================================================
		// Panels
		// ================================================================================
		JPanel mainPanel = new JPanel();
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new CardLayout(0, 0));

		JPanel perkPanel1 = new JPanel();
		perkPanel1.setBackground(Color.WHITE);
		mainPanel.add(perkPanel1, "name_175777750697938");
		perkPanel1.setLayout(null);

		JPanel perkPanel2 = new JPanel();
		perkPanel2.setBackground(Color.WHITE);
		mainPanel.add(perkPanel2, "name_201837650505628");
		perkPanel2.setLayout(null);

		JPanel innerPanel = new JPanel();
		innerPanel.setBackground(Color.WHITE);
		innerPanel.setBounds(6, 79, 338, 304);
		perkPanel2.add(innerPanel);
		innerPanel.setLayout(null);

		// ================================================================================
		// Panel 1 Labels
		// ================================================================================
		JLabel lblName1 = new JLabel(p.getName());
		lblName1.setFont(new Font("Impact", Font.PLAIN, 45));
		lblName1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName1.setBounds(6, 6, 338, 67);
		perkPanel1.add(lblName1);

		JLabel picLabel = new JLabel("");
		picLabel.setBackground(Color.WHITE);
		picLabel.setHorizontalAlignment(SwingConstants.CENTER);
		picLabel.setBounds(6, 78, 338, 307);
		perkPanel1.add(picLabel);
		picLabel.setIcon(p.getPicture());

		// ================================================================================
		// Panel 1 Buttons
		// ================================================================================
		JButton btnNext1 = new JButton("Next");
		btnNext1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				perkPanel1.setVisible(false);
				perkPanel2.setVisible(true);
			}
		});
		btnNext1.setBounds(227, 393, 117, 29);
		btnNext1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		perkPanel1.add(btnNext1);

		JButton btnExit1 = new JButton("Exit");
		btnExit1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnExit1.setBounds(6, 393, 117, 29);
		perkPanel1.add(btnExit1);

		// ================================================================================
		// Panel 2 Labels
		// ================================================================================
		JLabel lblName2 = new JLabel(p.getName());
		lblName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName2.setFont(new Font("Impact", Font.PLAIN, 45));
		lblName2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblName2.setBounds(6, 6, 338, 67);
		perkPanel2.add(lblName2);

		JLabel lblDescription = new JLabel(p.getDescription());
		lblDescription.setBackground(new Color(128, 128, 128));
		lblDescription.setForeground(Color.GRAY);
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 16));
		lblDescription.setBorder(new LineBorder(new Color(192, 192, 192), 2));
		lblDescription.setBounds(18, 16, 300, 57);
		innerPanel.add(lblDescription);

		JLabel lblCost = new JLabel("Cost: " + p.getCost());
		lblCost.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblCost.setBounds(6, 103, 326, 39);
		innerPanel.add(lblCost);

		JLabel lblMaps = new JLabel("<html>Maps: " + p.getMaps() + "<html>");
		lblMaps.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblMaps.setBounds(6, 154, 326, 73);
		innerPanel.add(lblMaps);

		JLabel lblRating = new JLabel("Rating: " + p.getRating());
		lblRating.setFont(new Font("Krungthep", Font.BOLD | Font.ITALIC, 20));
		lblRating.setBounds(6, 239, 326, 39);
		innerPanel.add(lblRating);

		// ================================================================================
		// Panel 2 Buttons
		// ================================================================================
		JButton btnExit2 = new JButton("Exit");
		btnExit2.setBorder(new LineBorder(new Color(128, 0, 0), 2));
		btnExit2.setBounds(6, 395, 117, 29);
		btnExit2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}

		});
		perkPanel2.add(btnExit2);

		JButton btnBack2 = new JButton("Back");
		btnBack2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnBack2.setBounds(227, 395, 117, 29);
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				perkPanel1.setVisible(true);
				perkPanel2.setVisible(false);
			}

		});
		perkPanel2.add(btnBack2);

		// ================================================================================
		// Customizing Borders for Panels and Labels
		// ================================================================================

		if (p.getName().equals("Quick Revive") || p.getName().equals("Electric Cherry")
				|| p.getName().equals("Wunderfizz")) {
			picLabel.setBorder(new LineBorder(new Color(30, 144, 255), 4));
			innerPanel.setBorder(new LineBorder(new Color(30, 144, 255), 4));
		}

		else if (p.getName().equals("Juggernog") || p.getName().equals("Widow’s Wine")) {
			picLabel.setBorder(new LineBorder(new Color(128, 0, 0), 4));
			innerPanel.setBorder(new LineBorder(new Color(128, 0, 0), 4));
		}

		else if (p.getName().equals("Speed Cola") || p.getName().equals("Mule Kick")) {
			picLabel.setBorder(new LineBorder(new Color(34, 139, 34), 4));
			innerPanel.setBorder(new LineBorder(new Color(34, 139, 34), 4));
		}

		else if (p.getName().equals("Double Tap 2.0") || p.getName().equals("Stamin-up")) {
			picLabel.setBorder(new LineBorder(new Color(218, 165, 32), 4));
			innerPanel.setBorder(new LineBorder(new Color(218, 165, 32), 4));
		}

		else {
			picLabel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
			innerPanel.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		}

	}
}
