/**
 * 
 * abstract class AbstractAnimal.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 10-10-2017
 */
public class AbstractAnimal {
	
	protected int legs;
	
	protected AbstractAnimal(int leg) {
		this.legs = leg;
	}
	
	public void walk() {
		System.out.println(String.format("%s wakling with %s legs", this.getClass().getName(), this.legs));
	}
	
	public void eat() {
		System.out.println(String.format("This %s eats some ...", this.getClass().getName()));
	}
}
