package excercise_2;

public class Dragon extends Character {
	
	public Dragon() {
		setStrength(10);
	}
	
	public void fight() {
		weapon.useWeapon(strength);
	}
}
