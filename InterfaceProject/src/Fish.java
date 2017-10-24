/**
 * 
 * class Fish.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 10-10-2017
 */
public class Fish extends AbstractAnimal implements Pet{

	protected Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	private String name;
	
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
		System.out.println(String.format("%s %s sounds: - Bool-Bool", this.getClass().getName(), this.getName()));
	}

}
