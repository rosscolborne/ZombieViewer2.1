import javax.swing.ImageIcon;

/**
 * Stores information for the map objects.
 */
public class Map {
	String name = "";
	String description = "";
	int difficulty = 0;
	int complexity = 0;
	int size = 0;
	String wonderWeapon = "";
	String enemies = "";
	ImageIcon picture;

	/**
	 * Returns the map's name
	 * 
	 * @return name: The map's name
	 */
	String getName() {
		return name;
	}

	/**
	 * Sets the map's name
	 * 
	 * @param n:
	 *            the map's name
	 */
	void setName(String n) {
		name = n;
	}

	/**
	 * Returns the map's description
	 * 
	 * @return description: The map's description
	 */
	String getDescription() {
		return description;
	}

	/**
	 * Sets the map's description
	 * 
	 * @param d:
	 *            the map's description
	 */
	void setDescription(String d) {
		description = d;
	}

	/**
	 * Returns the map's difficulty rating
	 * 
	 * @return difficulty: The map's difficulty
	 */
	int getDifficulty() {
		return difficulty;
	}

	/**
	 * Sets the map's difficulty rating
	 * 
	 * @param d:
	 *            the map's difficulty
	 */
	void setDifficulty(int d) {
		difficulty = d;
	}

	/**
	 * Returns the map's complexity rating
	 * 
	 * @return complexity: The map's complexity
	 */
	int getComplexity() {
		return complexity;
	}

	/**
	 * Sets the map's complexity rating
	 * 
	 * @param c:
	 *            the map's complexity
	 */
	void setComplexity(int c) {
		complexity = c;
	}

	/**
	 * Returns the map's size rating
	 * 
	 * @return size: The map's size
	 */
	int getSize() {
		return size;
	}

	/**
	 * Sets the map's size rating
	 * 
	 * @param s:
	 *            the map's size
	 */
	void setSize(int s) {
		size = s;
	}

	/**
	 * Returns the map's wonder weapon
	 * 
	 * @return wonderWeapon: The map's wonder weapon
	 */
	String getWonderWeapon() {
		return wonderWeapon;
	}

	/**
	 * Sets the map's wonder weapon
	 * 
	 * @param ww:
	 *            the map's wonder weapon
	 */
	void setWonderWeapon(String ww) {
		wonderWeapon = ww;
	}

	/**
	 * Returns the map's enemies
	 * 
	 * @return enemies: The map's enemies
	 */
	String getEnemies() {
		return enemies;
	}

	/**
	 * Sets the map's enemies
	 * 
	 * @param e:
	 *            the map's enemies
	 */
	void setEnemies(String e) {
		enemies = e;
	}

	ImageIcon getPicture() {
		return picture;
	}

	void setPicture(ImageIcon p) {
		picture = p;
	}
}
