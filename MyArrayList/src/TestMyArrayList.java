
/**
 * 
 * class TestMyArrayList.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 17-10-2017
 */
public class TestMyArrayList {

	public static void main(String[] args) {		
		
		InterfaceMyArrayList<Integer> myList = new MyArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.delete(3);
		
		System.out.println(myList.toString());
	}

}
