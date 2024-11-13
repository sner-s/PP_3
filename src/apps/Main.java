package apps;

import adts.DoublyLinkedSortedList;
import iterators.DoublyLinkedIterator;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedSortedList<Integer> list = new DoublyLinkedSortedList<>();

        // Add elements to the list
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(7);
        list.add(3);

        // Set iteration type to ORDERED
        list.setIterationType(DoublyLinkedIterator.IteratorType.ORDERED);
        System.out.println("Ordered iteration:");
        for (int num : list) {
            System.out.println(num);
        }

        // Set iteration type to REVERSE
        list.setIterationType(DoublyLinkedIterator.IteratorType.REVERSE);
        System.out.println("\nReverse iteration:");
        for (int num : list) {
            System.out.println(num);
        }

        // Set iteration type to RANDOM
        list.setIterationType(DoublyLinkedIterator.IteratorType.RANDOM);
        System.out.println("\nRandom iteration:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}
