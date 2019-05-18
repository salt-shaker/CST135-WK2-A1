package assignment4;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 0;

		// Create Super Heros
		System.out.println("Creating out Super Heros........");
		Batman batman = new Batman(((int) (Math.random() * 1000)), ((int) ((Math.random() * 10) + 5)));
		SuperMan superman = new SuperMan(((int) (Math.random() * 1000)), ((int) ((Math.random() * 10) + 5)));
		System.out.println("Super Heros have been created!.");

		// Game Loop
		while (!batman.isDead() && !superman.isDead()) {

			// Hero attack each other
			batman.attack(superman);
			if (counter % batman.getCoolDown() == 0) {
				batman.smokeScreen(superman);
			}
			superman.attack(batman);
			if (counter % superman.getCoolDown() == 0) {
				superman.quickAttack(batman);
			}

			if (batman.isDead()) {
				System.out.println("Super Man has defeated Batman");
			}
			if (superman.isDead()) {
				System.out.println("Batman has defeated Super Man");
			}
			counter++;
		}

	}

}
