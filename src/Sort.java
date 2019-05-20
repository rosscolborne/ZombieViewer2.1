/**
 * Sorts data using the bubble sort algorithm.
 */
public class Sort {

	/**
	 * Sorts weapons by name
	 * 
	 * @param w:
	 *            the array of weapons
	 * @param n:
	 *            the number of weapons
	 */
	public static void weaponsName(Weapon[] w, int n) {
		int j;
		boolean flag = true;
		Weapon temp = new Weapon();

		while (flag) {
			flag = false;
			for (j = 0; j < n - 1; j++) {
				if (w[j].getName().compareToIgnoreCase(w[j + 1].getName()) > 0) {
					temp = w[j];
					w[j] = w[j + 1];
					w[j + 1] = temp;
					flag = true;
				}
			}
		}
	}

	/**
	 * Sorts weapons by damage
	 * 
	 * @param w:
	 *            the array of weapons
	 * @param n:
	 *            the number of weapons
	 */
	public static void weaponsDamage(Weapon[] w, int n) {
		Weapon temp = new Weapon();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n); j++) {
				if (w[j - 1].getDamage() < w[j].getDamage()) {
					temp = w[j - 1];
					w[j - 1] = w[j];
					w[j] = temp;
				}

			}
		}
	}

	/**
	 * Sorts weapons by rating
	 * 
	 * @param w:
	 *            the array of weapons
	 * @param n:
	 *            the number of weapons
	 */
	public static void weaponsRating(Weapon[] w, int n) {
		Weapon temp = new Weapon();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n); j++) {
				if (w[j - 1].getRating() < w[j].getRating()) {
					temp = w[j - 1];
					w[j - 1] = w[j];
					w[j] = temp;
				}

			}
		}
	}

	/**
	 * Sorts perks by name
	 * 
	 * @param p:
	 *            the array of perks
	 * @param n:
	 *            the number of perks
	 */
	public static void perksName(Perk[] p, int n) {
		int j;
		boolean flag = true;
		Perk temp = new Perk();

		while (flag) {
			flag = false;
			for (j = 0; j < n - 1; j++) {
				if (p[j].getName().compareToIgnoreCase(p[j + 1].getName()) > 0) { // ascending
																					// sort
					temp = p[j];
					p[j] = p[j + 1]; // swapping
					p[j + 1] = temp;
					flag = true;
				}
			}
		}
	}

	/**
	 * Sorts perks by cost
	 * 
	 * @param p:
	 *            the array of perks
	 * @param n:
	 *            the number of perks
	 */
	public static void perksCost(Perk[] p, int n) {
		Perk temp = new Perk();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n); j++) {
				if (p[j - 1].getCost() < p[j].getCost()) {
					temp = p[j - 1];
					p[j - 1] = p[j];
					p[j] = temp;
				}

			}
		}
	}

	/**
	 * Sorts perks by rating
	 * 
	 * @param p:
	 *            the array of perks
	 * @param n:
	 *            the number of perks
	 */
	public static void perksRating(Perk[] p, int n) {
		Perk temp = new Perk();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n); j++) {
				if (p[j - 1].getRating() < p[j].getRating()) {
					temp = p[j - 1];
					p[j - 1] = p[j];
					p[j] = temp;
				}

			}
		}
	}

	/**
	 * Sorts maps by name
	 * 
	 * @param p:
	 *            the array of maps
	 * @param n:
	 *            the number of maps
	 */
	public static void mapsName(Map[] m, int n) {
		int j;
		boolean flag = true;
		Map temp = new Map();

		while (flag) {
			flag = false;
			for (j = 0; j < n - 1; j++) {
				if (m[j].getName().compareToIgnoreCase(m[j + 1].getName()) > 0) {
					temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
					flag = true;
				}
			}
		}
	}

	/**
	 * Sorts maps by difficulty
	 * 
	 * @param p:
	 *            the array of maps
	 * @param n:
	 *            the number of maps
	 */
	public static void mapsDifficulty(Map[] m, int n) {
		Map temp = new Map();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n); j++) {
				if (m[j - 1].getDifficulty() < m[j].getDifficulty()) {
					temp = m[j - 1];
					m[j - 1] = m[j];
					m[j] = temp;
				}

			}
		}
	}

	/**
	 * Sorts maps by complexity
	 * 
	 * @param p:
	 *            the array of maps
	 * @param n:
	 *            the number of maps
	 */
	public static void mapsSize(Map[] m, int n) {
		Map temp = new Map();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n); j++) {
				if (m[j - 1].getSize() < m[j].getSize()) {
					temp = m[j - 1];
					m[j - 1] = m[j];
					m[j] = temp;
				}

			}
		}
	}

}
