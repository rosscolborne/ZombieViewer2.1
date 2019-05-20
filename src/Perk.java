import javax.swing.ImageIcon;

/**
 * Stores information for the perk objects.
 */
public class Perk {
	String name;
	String description;
	int cost;
	String maps;
	int rating;
	ImageIcon picture;

	/**
	 * Returns the perk's name
	 * 
	 * @return name: The perk's name
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
	 * Returns the perk's description
	 * 
	 * @return description: The perk's description
	 */
	String getDescription() {
		return description;
	}

	/**
	 * Sets the map's description
	 * 
	 * @param n:
	 *            the map's description
	 */
	void setDescription(String d) {
		description = d;
	}

	/**
	 * Returns the perk's cost
	 * 
	 * @return cost: The perk's cost
	 */
	int getCost() {
		return cost;
	}

	/**
	 * Sets the map's cost
	 * 
	 * @param c:
	 *            the map's cost
	 */
	void setCost(int c) {
		cost = c;
	}

	/**
	 * Returns the maps where the perk is located
	 * 
	 * @return maps: The perk's maps
	 */
	String getMaps() {
		return maps;
	}

	/**
	 * Sets the maps where the perk is located
	 * 
	 * @param m:
	 *            the perk's maps
	 */
	void setMaps(String m) {
		maps = m;
	}

	/**
	 * Returns the perk's rating
	 * 
	 * @return rating: The perk's rating
	 */
	int getRating() {
		return rating;
	}

	/**
	 * Sets the map's rating
	 * 
	 * @param r:
	 *            the map's rating
	 */
	void setRating(int r) {
		rating = r;
	}

	ImageIcon getPicture() {
		return picture;
	}

	void setPicture(ImageIcon p) {
		picture = p;
	}

}
