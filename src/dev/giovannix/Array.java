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

    //    public void removeAt(int index) {
    //        if(index < count) {
    //            int[] newItems = new int[items.length];
    //            int j = 0;
    //            for (int i = 0; i < count - 1; i++) {
    //                if (i == index) j++;
    //                newItems[i] = items[j++];
    //            }
    //            items = newItems;
    //            count--;
    //        } else {
    //            throw new IllegalArgumentException();
    //        }
    //    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i = index; i < count-1; i++)
            items[i] = items[i+1];
        count--; //count represents the total # of elements in the array
    }

    public int indexOf(int value) {
        for(int i = 0; i < count; i++) {
            if (items[i] == value) return i;
        }
        return -1;
    }
}