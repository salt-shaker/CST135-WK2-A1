/**
 * 
 */
package assignment4;

/**
 * @author Sashae
 *
 */
public class Batman extends SuperHero{
	
	public Batman(int health, int coolDown) {
		super("Batman", health, coolDown);
	}
	
	public void specialAbility(String type) {
		//Intense Focus
	}
	
	// Batman Special Ability
	// Cause opponent to lose a turn... or allow Batman to attack two times in a row
	public void smokeScreen(SuperHero atSuper) {
		System.out.println("Batman uses Special Ability: Smoke Screen!");
		attack(atSuper);
	}
}
