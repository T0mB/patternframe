package excercise_2;

public abstract class Character {
	protected int strength;
	protected Weapon weapon;

	public Character() {
		setStrength(0);
	}

	public void setWeapon(Weapon w) {
		weapon = w;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	// wat een Spelkaracter kan (gedrag, behavior)
	public void fight() {
	}
}
