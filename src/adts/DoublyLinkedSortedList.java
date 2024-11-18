package adts;

import interfaces.ListInterface;
import iterators.DoublyLinkedIterator;
import nodes.DLLNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class DoublyLinkedSortedList<E> implements ListInterface<E>, Iterable<E>{
    private DLLNode<E> head;  // Head of the doubly linked list
    private DLLNode<E> tail;  // Tail of the doubly linked list
    private int size;         // Number of elements in the list
    private boolean found;    // Flag to check if element was found
    private DLLNode<E> location;  // Node where the element was found
    private DoublyLinkedIterator.IteratorType iterationType = DoublyLinkedIterator.IteratorType.ORDERED;

    @Override
    public void add(E element) {
        //code goes here
    }

    @Override
    public boolean remove(E element) {	//MARILIN
        find(element); 
	    if (found) {
	    	if(location == head) {
	    		head = location.getNext();
	    		if(head != null) {
	    			head.setPrev(null);
	    		}else {
	    			tail = null;
	    		}
	    	}else if(location == tail) {
	    		tail = location.getPrev();
	    		if(tail != null) {
	    			tail.setNext(null);
	    		}else {
	    			head = null;
	    		}
	    	}else {
	    		location.getPrev().setNext(location.getNext());
	    		location.getNext().setPrev(location.getPrev());
	    	}
	    	size--;
	    	return true;
	    	}
	    return false; 
	    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

   @Override
    public boolean contains(E element) {

	//Needs to connect binary search.
	//current state of contains is purely for testing purposes without binary search
	//however end result requires the find method to perform the binary search.

	    
        DLLNode<E> current = head;

        while (current != null) {
            if (current.getData().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
    return false;
    }

     @Override
    // Retrieve an item by value
    public E get(E item) {
        int index = Collections.binarySearch(list, item);
        return (index >= 0)? list.get(index) : null;
    }

    @Override
     public E get(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return list.get(index);
    }
        public string toString(){
        StringBuilder listStr = new StringBuilder();
    	for (int i = 0; i < list.size() i++) {
    		listStr.append(list.get(i) + "\n");
    	}
	    return listStr.toString();
        }
    
    protected void find(E target) {
        //testing push
    }    

    public void setIterationType(DoublyLinkedIterator.IteratorType type) {
        this.iterationType = type;
    }

    @Override
    public Iterator<E> iterator() {
        return new DoublyLinkedIterator<>(head, tail, iterationType);
    }

}
