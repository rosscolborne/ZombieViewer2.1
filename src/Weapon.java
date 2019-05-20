import javax.swing.ImageIcon;

/**
 * Stores information for the map objects. 
 */
public class Weapon {
	String name = "";
	String description = "";
	int damage = 0;
	String type = "";
	int ammo = 0;
	String fireType = "";
	int fireRate = 0;
	double reloadTime;
	int rating;
	String overview;
	ImageIcon picture;
	
	/**
	 * Returns the weapon's name
	 * @return name: The weapon's name
	 */
	String getName () {
		return name;
	}
	
	/**
	 * Sets the weapon's name
	 * @param n: The weapon's name
	 */
	void setName(String n) {
		name = n;
	}
	
	/**
	 * Returns the weapon's damage
	 * @return damage: weapon's damage
	 */
	int getDamage () {
		return damage;
	}
	
	/**
	 * Sets the weapon's damage
	 * @param d: The weapon's damage
	 */
	void setDamage (int d) {
		damage = d;
	}
	
	/**
	 * Returns the weapon's description
	 * @return description: weapon's description
	 */
	String getDescription () {
		return description;
	}
	
	/**
	 * Sets the weapon's description
	 * @param d: The weapon's description
	 */
	void setDescription (String d) {
		description = d;
	}
	
	/**
	 * Returns the weapon's type
	 * @return type: weapon's type
	 */
	String getType () {
		return type;
	}
	
	/**
	 * Sets the weapon's type
	 * @param t: The weapon's type
	 */
	void setType (String t) {
		type = t;
	}
	
	/**
	 * Returns the weapon's fire type
	 * @return fireType: weapon's fire type
	 */
	String getFireType () {
		return fireType;
	}
	
	/**
	 * Sets the weapon's fire type
	 * @param ft: The weapon's fire type
	 */
	void setFireType (String ft) {
		fireType = ft;
	}
	
	/**
	 * Returns the weapon's ammo count
	 * @return ammo count: weapon's ammo count
	 */
	int getAmmo () {
		return ammo;
	}
	
	/**
	 * Sets the weapon's ammo count
	 * @param a: The weapon's ammo count
	 */
	void setAmmo (int a) {
		ammo = a;
	}
	
	/**
	 * Returns the weapon's fire rate 
	 * @return fireRate: weapon's fire rate
	 */
	int getFireRate () {
		return fireRate;
	}
	
	/**
	 * Sets the weapon's fire rate
	 * @param fr: The weapon's fire rate
	 */
	void setFireRate (int fr) {
		fireRate = fr;
	}
	
	/**
	 * Returns the weapon's reload time
	 * @return reloadTime: weapon's reload time
	 */
	double getReloadTime () {
		return reloadTime;
	}
	
	/**
	 * Sets the weapon's reload time
	 * @param rt: The weapon's reload time
	 */
	void setReloadTime (double rt) {
		reloadTime = rt;
	}
	
	/**
	 * Returns the weapon's rating
	 * @return rating: weapon's rating
	 */
	int getRating () {
		return rating;
	}
	
	/**
	 * Sets the weapon's rating
	 * @param d: The weapon's rating
	 */
	void setRating (int r) {
		rating = r;
	}
	
	ImageIcon getPicture () {
		return picture;
	}
	
	void setPicture (ImageIcon p) {
		picture = p;
	}

}
