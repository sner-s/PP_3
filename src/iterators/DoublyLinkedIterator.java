package iterators;

import nodes.DLLNode;

import java.util.Iterator;

public class DoublyLinkedIterator<E> implements Iterator<E> {

	private DLLNode<E> current;
	private IteratorType iterationType;
	private List<E> randomList;
	private int index;

	public DoublyLinkedIterator(DLLNode<E> head, DLLNode<E> tail, IteratorType iterationType) {
		this.iterationType = iterationType;

		switch (iterationType) {
			case ORDERED:
				this.current = head;
				break;
			case REVERSE:
				this.current = tail;
				break;
			case RANDOM:
				// Gather all elements in a list and shuffle for random iteration
				randomList = new ArrayList<>();
				DLLNode<E> node = head;
				while (node != null) {
					randomList.add(node.getData());
					node = node.getNext();
				}
				Collections.shuffle(randomList);
				index = 0;
				break;
		}
	}

	@Override
	public boolean hasNext() {
		switch (iterationType) {
			case RANDOM:
				return index < randomList.size();
			default:
				return current != null;
		}
	}

	@Override
	public E next() {
		switch (iterationType) {
			case ORDERED:
				E orderedData = current.getData();
				current = current.getNext();
				return orderedData;
			case REVERSE:
				E reverseData = current.getData();
				current = current.getPrev();
				return reverseData;
			case RANDOM:
				return randomList.get(index++);
			default:
				throw new IllegalStateException("Invalid iteration type");
		}
	}

	public enum IteratorType {
		ORDERED, REVERSE, RANDOM
	}

}
