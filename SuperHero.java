package assignment4;

public class SuperHero {
	private String name;
	private int health;
	private boolean isDead;
	private int coolDown;

	// Constructor
	public SuperHero(String newName, int newHealth, int newCoolDown) {
		this.name = newName;
		this.health = newHealth;
		this.coolDown = newCoolDown;
	}

	public int getCoolDown() {
		return coolDown;
	}

	public void setCoolDown(int coolDown) {
		this.coolDown = coolDown;
	}

	// Attack opponent
	public void attack(SuperHero atSuper) {

		// Random Number for attack
		int attack = (int) (Math.random() * 10);

		// Attack opponent and update console
		atSuper.defend(attack);

		System.out.println(String.format("%s has taken %d damage and their health is now %d", atSuper.getName(), attack,
				atSuper.getHealth()));

	}

	// Defend against opponent attack
	public void defend(int attack) {

		if (this.health - attack <= 0) {
			this.health = 0;
			isDead = true;
		} else {
			this.health -= attack;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

}
