package generic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

public class JavaList<E> implements Ilist<E> {

	private int defaultCapacity = 3;
	private E[] elements;
	private int size;

	public JavaList() {
		this.elements = create(defaultCapacity);
	}

	public JavaList(int initCapacity) {
		if (initCapacity < defaultCapacity) {
			initCapacity = defaultCapacity;
		}
		this.elements = create(initCapacity);
	}

	@Override
	public boolean add(E e) {
		if (size == elements.length) {
			E[] newElements = create(size + 1);
			for (int i = 0; i < size; i++) {
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
		E[] newelements = create(size - 1);
		for (int i = 0; i < pos; i++) {
			newelements[i] = elements[i];

		}
		for (int i = pos; i < size - 1; i++) {
			newelements[i] = elements[i + 1];
		}
		elements = newelements;
		size = elements.length;
		return true;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		int pos = -1;
		for (int i = 0; i < size; i++) {
			if (predicate.test(elements[i])) {
				pos = i;
				break;
			}
		}
		remove(pos);
		return true;

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
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, size);

	}

	public void iterate() {
		for (int i = 0; i < size; i++) {
			System.out.print(elements[i] + " ");

		}
		System.out.println();
	}

	public int count(Predicate<E> predicate) {
		int count = 0;
		for (E e : elements) {
			if (predicate.test(e)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int remove(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return 0;
	}
}
