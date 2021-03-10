package generic;

import java.lang.reflect.Array;
import java.util.Arrays;
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
			E[] newElements = create(size + 1);
			for(int i = 0; i < size; i++) {
				newElements[i] = elements[i];
			}

//			newElements = Arrays.copyOfRange(elements, 0, size);
			newElements[size++] = e;
			elements = newElements;
		}else {
			elements[size++]= e;
		}
		return false;
	}

	@Override
	public boolean add(int pos, E e) {
		return false;
	}

	@Override
	public boolean remove(int pos) {
		E[] newElements = create(size - 1);
		// copy
		for(int i = 0; i < pos; i++) {
			newElements[i] = elements[i];
		}
		// shift left
		for(int i = pos; i < size -1 ; i++) {
			newElements[i] = elements[i+1];
		}
		elements = newElements;
		size = elements.length;
		return true;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		int pos = -1;
		for(int i = 0; i< size -1; i++) {
			if(predicate.test(elements[i])) {
				pos = i;
				break;
			}
		}
		remove(pos);
		return true;
	}

	@Override
	public E get(int pos) {
		return null;
	}

	@Override
	public void set(int pos, E e) {
		
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size ;
	}
	
	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[])Array.newInstance(Object.class, size);
	}
	
	@Override
	public void iterate() {
		for ( int i =0; i < size; i++) {
			System.out.print(elements[i] + " ");
		}
		System.out.println();		
	}
	
	@Override
	public int count(Predicate<E> predicate) {
		int count = 0;
		for(E e: elements) {
			if(predicate.test(e)) {
				count++;
			}
		}
		return count;
	}
	
}
