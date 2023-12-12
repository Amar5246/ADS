package ImplClasses;

import java.util.List;

import Interfaces.Linklist;

public class SortedLinkList<T extends Comparable<T>> implements Linklist<T> {

	private int size = 0;
	private Node<T> first;
	private Node<T> last;

	@Override
	public void add(T a) {
		Node<T> l = last;
		Node<T> f = first;
		Node<T> newNode = new Node<T>(a, null);
		last = newNode;
		if (l == null) {
			first = newNode;
		} else {
			while (f.next != null && f.next.isLessThan(a)) {
				f = f.next;
			}
			if (f != l) {
				newNode.next = f.next;
				f.next = newNode;
			} else {
				l.next = newNode;
			}
		}
		size++;
	}

	@Override
	public void addAll(List<? extends T> list) {
		Node<T> l = null;
		Node<T> f = first;
		for (T data : list) {
			l = last;
			Node<T> newNode = new Node<T>(data, null);
			last = newNode;
			if (l == null) {
				first = newNode;
			} else {

				while (f.next != null && f.next.isLessThan(data)) {
					f = f.next;
				}
				if (f != l) {
					newNode.next = f.next;
					f.next = newNode;
				} else {
					l.next = newNode;
				}
			}
			size++;
		}
	}

	@Override
	public T remove(int index) {
		int count = 1;
		Node<T> f = first;
		while (count != index - 1) {
			f = f.next;
			count++;
		}
		T element = f.next.element;
		f.next = f.next.next;
		return element;
	}

	@Override
	public String toString() {
		String listOfelem = "";
		Node<T> f = first;
		while (f != null) {
			listOfelem += f.element + ",";
			f = f.next;
		}

		return listOfelem;
	}

	private static class Node<T extends Comparable<T>> {
		T element;
		Node<T> next;

		Node(T element, Node<T> next) {
			this.element = element;
			this.next = next;
		}

		boolean isLessThan(T a) {
			return element.compareTo(a) < 0;
		}
	}

	@Override
	public void reverse() {
		Node<T> f = first.next;
		Node<T> prv = first;
		Node<T> nxt = first.next.next;
		while (f != null) {
			f.next = prv;
			prv = f;
			f = nxt;
			if (nxt != null)
				nxt = nxt.next;
		}
		last = first;
		last.next = null;
		first = prv;
	}

	@Override
	public int find(T a) {
		int count = 1;
		Node<T> f = first;
		while (f != null && a != f.element) {
			f = f.next;
			count++;
		}
		if (f == null)
			count = -1;
		return count;
	}

	@Override
	public boolean isSorted() {
		boolean flag = true;
		Node<T> f = first;
		while (f.next != null) {
			if (!f.isLessThan(f.next.element)) {
				flag = false;
			} 
			f=f.next;
		}
		return flag;
	}

	@Override
	public void uadd(T a) {
		Node<T> l = last;
		Node<T> newNode = new Node<T>(a, null);
		last = newNode;
		if (l == null) {
			first = newNode;
		} else {

			l.next = newNode;
		}
		size++;
	}

}
