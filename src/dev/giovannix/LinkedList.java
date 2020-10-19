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
}