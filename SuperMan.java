/**
 * 
 */
package assignment4;

/**
 * @author Sashae
 *
 */
public class SuperMan extends SuperHero {

	// Contructor
	public SuperMan(int health, int coolDown) {
		super("Superman", health, coolDown);
	}

	// Super Man Special Ability
	// Attack an additional time in same turn
	public void quickAttack(SuperHero atSuper) {
		System.out.println("Super Man uses Special Ability: Quick Attack!");
		attack(atSuper);
	}

}
