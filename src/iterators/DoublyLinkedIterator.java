package iterators;

import nodes.DLLNode;

import java.util.Iterator;

public class DoublyLinkedIterator<E> implements Iterator<E> {

	private DLLNode<E> current;

	public DoublyLinkedIterator(DLLNode<E> head) {
		this.current = head;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public E next() {
		E element = current.getData();
		current = current.getNext();
		return element;
	}

}
