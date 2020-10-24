package dev.giovannix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addFirst(10);
        list.addLast(15);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
