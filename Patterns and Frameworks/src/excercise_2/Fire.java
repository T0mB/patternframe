package excercise_2;

public class Fire implements Weapon {
	@Override
	public void useWeapon(int strength) {
		System.out.println("Breath fire and kill " + strength);
	}

}
