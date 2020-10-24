package dev.giovannix;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        top = stack.peek();
        System.out.println(top);
    }
}

//Stacks
//Build navigation (eg forward/back)
//Implement the undo feature
//Stack of Books //LIFO


//Action 3
//Action 2
//Action 1

//Internally we use an array or LL
//Just a different way to storing and accessing objects

//4 Operations
//push(item)
//pop()
//peek()
//isEmpty()

