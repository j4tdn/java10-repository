package generic;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {
	
	private int defaultCapacity = 3;
	private E[] elements;
	private int size;
	
	public JavaList() {
		this.elements = create(defaultCapacity);
	}
	
	public JavaList(int initCapacity) {
		if(initCapacity < defaultCapacity) {
			initCapacity = defaultCapacity;
		}
		this.elements = create(initCapacity);
	}
	
	@Override
	public boolean add(E e) {
		if(size == elements.length) {
			// growth
			E[] newElements = create(size + 1);
			for(int i = 0; i < size; i++) {
				newElements[i] = elements[i];
			}
			newElements[size] = e;
			size++;
			elements = newElements;
		} else {
			elements[size] = e;
			size++;
		}
		
		return false;
	}
	@Override
	public E get(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean remove(int pos) {
		E[] newElement = create(size - 1);
		for(int i = 0; i < pos; i++) {
			newElement[i] = elements[i];
		}
		for(int i = pos; i < size - 1; i++) {
			newElement[i] = elements[i + 1];
		}
		elements = newElement;
		size = elements.length;
		return false;
	}
	@Override
	public void set(int pos, E e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public boolean add(int pos, E e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeIf(Predicate<E> predicate) {
		int pos = -1;
		for(int i = 0; i < size; i++) {
			if(predicate.test(elements[i])) {
				pos = i;
				break;
			}
		}
		remove(pos);
		return true;
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[])Array.newInstance(Object.class, size);
	}

	public void iterate() {
		for(int i = 0; i < size; i++) {
			System.out.print(elements[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int count(Predicate<E> predicate) {
		int count = 0;
		for(E e : elements) {
			if (predicate.test(e)) {
				count++;
			}
		}
		return count;
	}

}
