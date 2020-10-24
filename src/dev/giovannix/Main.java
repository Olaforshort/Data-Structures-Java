package dev.giovannix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        java.util.LinkedList<Integer> x = new java.util.LinkedList<>();
//        x.addFirst(5);
//        x.addLast(10);

        var list = new LinkedList();
        list.addFirst(10);
        list.addLast(15);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
