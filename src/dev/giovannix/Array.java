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

    public void insert(int item) {
        if(count >= items.length) {
            //the array is full we need to resize it
            int[] cloneItems = items;
            items = new int[count*2]; //double by decision
            for(int i = 0; i < count; i++)
                items[i] = cloneItems[i];
        }
        items[count++] = item;
    }



}