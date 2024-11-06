package adts;

import interfaces.ListInterface;

import java.util.Iterator;

public class ArraySortedList<E> implements ListInterface<E>, Iterable<E>{
    protected E[] list;               // array to hold this lists elements

    protected int numElements = 0;    // number of elements in this list

    protected final int DEFAULT_CAPACITY = 10;  // default capacity
    protected int initialCapacity;              // original capacity

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
