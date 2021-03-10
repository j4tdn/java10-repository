package generic;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class JavaList<E> implements Ilist<E> {

	private int defaultCapacity= 3;
	private E[] elements;
	private int size;
	
	
	@SuppressWarnings("unchecked")
	public JavaList() {
		this.elements = (E[])Array.newInstance(Object.class, defaultCapacity);
	}
	
	public JavaList(int initCapacity) {
		if (initCapacity < defaultCapacity) {
			initCapacity = defaultCapacity;
		}
		this.elements = create(initCapacity);
	}
	
	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		// TODO Auto-generated method stub
		return (E[]) Array.newInstance(Object.class, size);
		
	}

	@Override
	public boolean add(E e) {
		if (size == elements.length) {
			E[] newElements = create(size + 1);
			for(int i = 0; i < size; i++) {
				newElements[i] = elements[i];
			}
			newElements[size++] = e;
			elements = newElements;
		} else {
			elements[size++] = e;
		}
		return false;
	}

	@Override
	public boolean add(int pos, E e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean remove(int pos) {
		E[] newElement = create(size - 1);
		for (int i = 0; i < pos; i++) {
			newElement[i] = elements[i];
		}
		for (int i = pos; i < size -1; i++) {
			newElement[i] = elements[i+1];
		}
		elements = newElement;
		size = elements.length;
		return true;
	}
	
	@Override
	public boolean removeIf(Predicate<E> predicate) {
		int pos = -1;
		for (int i = 0; i < size; i++) {
			if (predicate.test(elements[i])) {
				
			pos = 1;
			break;
		}
	}
	remove(pos);
	return false;
	}

	@Override
	public E get(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int pos, E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
    public void iterate() {
    	for (int i = 0; i < size; i++) {
    		System.out.println(elements[i] + " ");
    	}
    	System.out.println();
    }
    public int count (Predicate<E> predicate) {
    	int count = 0;
    	
    	for (E e: elements) {
    		if (predicate.test(e)) {
    			count ++;
    		}
    	}
    	return count;
    }
	
}
