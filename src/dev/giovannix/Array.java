package dev.giovannix;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count = 0;

    public Array(int len) {
        items = new int[len];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}