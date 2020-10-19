package dev.giovannix;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    //    public void addFirst(int item) {
    //        Node node = new Node(item);
    //        if (first == null) {
    //            first = last = node;
    //        }
    //        else {
    //            first = first.next;
    //            first = node;
    //        }
    //    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    private boolean isEmpty() {
        return (first == null);
    }

    public int indexOf(int item) {
        Node current = first;
        int index = 0;
        if (isEmpty()) return -1;
        while(current != null) {
            if (current.value == item) return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    //    public boolean contains(int item) {
    //        Node current = first;
    //        if (isEmpty()) return false;
    //        while(current != null) {
    //            if (current.value == item) return true;
    //            current = current.next;
    //        }
    //        return false;
    //    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

}