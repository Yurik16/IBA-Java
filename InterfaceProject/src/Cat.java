/**
 * 
 * class Cat.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 10-10-2017
 */
public class Cat extends AbstractAnimal implements Pet{

	private String name;
	
	public Cat() {
		super(4);
	}

	public Cat(String s) {
		super(4);
		this.name = s;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println(String.format("%s %s sounds: - Miyau-Miyau", this.getClass().getName(), this.getName()));
	}
	
	@Override
	public void eat() {
		System.out.println(String.format("%s %s eating milk", this.getClass().getName(), this.getName()));
	}	

}
