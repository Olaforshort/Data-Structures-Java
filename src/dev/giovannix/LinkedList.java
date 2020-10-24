package dev.giovannix;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size = 0;

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
        size++;
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
        size++;
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

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) first = last = null;
        else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) first = last = null;
        else {
            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node last) {
        Node current = first;
        while(current != null) {
            if (current.next == last) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    //O(1)
    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = first;
        int i = 0;
        while(current != null){
            array[i++] = current.value;
            current = current.next;
        }
        return array;
    }
}

