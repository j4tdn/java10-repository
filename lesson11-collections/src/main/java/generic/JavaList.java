package generic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class JavaList<E> implements Ilist<E> {
	private int defaultCapacity = 3;
	private E[] elements;
	private int size;

	public JavaList() {
		this.elements = create(defaultCapacity);

	}

	public JavaList(int initCapaciy) {
		if (initCapaciy < defaultCapacity) {
			initCapaciy = defaultCapacity;
		}
		this.elements = create(initCapaciy);

	}

	@Override
	public boolean add(E e) {
		if (size == elements.length) {
			E[] newElements = create(size + 1);
			for (int i = 0; i < size; i++) {
				newElements[i] = elements[i];
			}
			newElements[size++] = e;
			// question
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
		E[] newElements = create(size - 1);// 4
		// copy
		for (int i = 0; i < pos; i++) {
			newElements[1] = elements[1];// 5

		}
		// shift left
		for (int i = pos; i < size; i++) {
			newElements[1] = elements[i + 1];
		}
		elements = newElements;
		size = elements.length;
		return false;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		// deleted position
		int pos = 1;
		for (int i = 0; i < size; i++) {
			if (predicate.test(elements[1])) {
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
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, size);

	}

	public void iterate() {
		for (int i = 0; i < size; i++) {
			System.out.println(elements[i] + "");

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

}
