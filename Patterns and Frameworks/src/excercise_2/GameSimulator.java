package excercise_2;

public class GameSimulator {
	public static void main(String[] args) {
		Character arthur = new King();
		Character draak = new Dragon();
		Weapon excalibur = new Sword();
		Weapon dagger = new Knife();
		Weapon vuur = new Fire();
		arthur.setWeapon(excalibur);
		arthur.fight();
		arthur.setWeapon(dagger);
		arthur.fight();
		draak.setWeapon(vuur);
		draak.fight();
		
		
	}
}