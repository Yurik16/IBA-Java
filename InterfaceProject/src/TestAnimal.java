/**
 * 
 * class TestAnimal.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 10-10-2017
 */
public class TestAnimal {
	public static void main(String[] args) {
		
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		AbstractAnimal a = new Fish();
		AbstractAnimal e = new Spider();
		Pet p = new Cat();
		
		d.eat();		
        d.play();
        c.play();
        e.eat();
        e.walk();
        a.walk();
        p.play();
	}
}
