package adts;

import interfaces.ListInterface;
import iterators.DoublyLinkedIterator;
import nodes.DLLNode;

import java.util.Iterator;

public class DoublyLinkedSortedList<E> implements ListInterface<E>, Iterable<E>{
    private DLLNode<E> head;  // Head of the doubly linked list
    private DLLNode<E> tail;  // Tail of the doubly linked list
    private int size;         // Number of elements in the list
    private boolean found;    // Flag to check if element was found
    private DLLNode<E> location;  // Node where the element was found

    @Override
    public void add(E element) {

    }

    @Override
    public boolean remove(E element) {
        return false;
    }

    @Override
    public int size() {
        return numElements;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public E get(E element) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private enum IteratorType {
        ORDERED, REVERSE, RANDOM
    }
}
