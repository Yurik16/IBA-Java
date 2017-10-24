import java.util.Iterator;

/**
 * 
 * class MyArrayList.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 12-10-2017
 */
public class MyArrayIterator<E> implements Iterator<E> {

	private int count;
	private E[] array;
	
	MyArrayIterator() {
		super();
		this.count = 0;
	}
	
	MyArrayIterator(E[] array) {
		super();
		this.count = 0;
		this.array = array;
	}

	
	@Override
	public boolean hasNext() {
		return array.length > count;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return array[count++];
	}

	
}
