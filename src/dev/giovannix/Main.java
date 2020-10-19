package dev.giovannix;

public class Main {

    public static void main(String[] args) {
//        java.util.LinkedList<Integer> x = new java.util.LinkedList<>();
//        x.addFirst(5);
//        x.addLast(10);

        var list = new LinkedList();
        list.addFirst(10);
        list.addLast(15);
        list.addFirst(5);
        list.addLast(20);
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(10));
    }
}
