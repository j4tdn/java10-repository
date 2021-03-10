package generic;

import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E t);

	boolean add(int pos, E e);

	boolean remove(int pos);

	boolean removeIf(Predicate<E> predicate);

	E get(int pos);

	void set(int pos, E e);

	boolean isEmpty();

	int size();
	
	void iterate();
	
	int count(Predicate<E> predicate);
}
