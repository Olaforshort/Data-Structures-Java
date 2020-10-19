package dev.giovannix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int [] numeros = new int[3];
//        numeros[0] = 10;
//        numeros[1] = 20;
//        numeros[2] = 30;
//        System.out.println(Arrays.toString(numeros));

        Array numbers;
        numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.removeAt(0);
        numbers.print();
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(100));
    }
}
