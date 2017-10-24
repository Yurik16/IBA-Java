/**
 * 
 * class InterfaceMyArrayList.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @param <E> any Object
 * @since 12-10-2017
 */
public interface InterfaceMyArrayList<E> extends Iterable<E> {
	
	boolean add(E object);
	void delete(int count);
	E get(int count);
	int size();
	void rewrite(int count, E object);
}
