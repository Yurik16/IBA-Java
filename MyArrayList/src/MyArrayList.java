import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * class MyArrayList.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 16-10-2017
 */
public class MyArrayList<E> implements InterfaceMyArrayList<E> {

	private E[] array;
	private int size;
	private boolean isAddable;
	
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		this.array =  (E[]) new Object[6];
		this.size = 0;
		this.isAddable = true;
	}
	
	@Override
	public Iterator<E> iterator() {
		return new MyArrayIterator<>(array);
	}


	@SuppressWarnings("unchecked")
	@Override
	public boolean add(E object) {
		
		Iterator<E> it = this.iterator();
		boolean result = false;
		
		if(isAddable && it.hasNext()) {
			array[this.size++] = object;;
			result = true;
		} else {
			if(isAddable && !it.hasNext()) {			
				E[] temp = array;
				array = (E[]) new Object[this.size + (this.size / 2)];
				System.arraycopy(temp, 0, array, 0, temp.length);
				array[this.size++] = object;
				result = true;
			}
		}		
		if(!isAddable) isAddable = true;
		else isAddable = false;
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(int count) {
		
		E[] temp = array;
		array = (E[]) new Object[array.length - 1];
		System.arraycopy(temp, 0, array, 0, count);
		System.arraycopy(temp, count + 1, array, count, array.length - count - 1);
	}

	@Override
	public E get(int count) {
		return array[count];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void rewrite(int count, E object) {
		array[count] = object;
	}

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + "]";
	}
	
	

}
