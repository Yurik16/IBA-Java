/** * 
 * class FooBarBaz.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 28.09.2017
 */
public class FooBarBaz {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 50; i++) {
			String foo = "";
			String bar = "";
			String baz = "";
			if(i%3 == 0) {
				foo = "foo ";
			}
			if(i%5 == 0) {
				bar = "bar ";
			}
			if(i%7 == 0) {
				baz = "baz";
			}
			System.out.println(String.format("%s %s%s%s", i, foo, bar, baz));
		}
	}

}
