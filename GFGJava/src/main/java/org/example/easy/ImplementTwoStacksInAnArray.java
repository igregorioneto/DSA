package org.example.easy;

import java.util.ArrayList;
import java.util.Stack;

public class ImplementTwoStacksInAnArray {
    public static void main(String[] args) {
        twoStacks g = new twoStacks();

        g.push1(1);
        g.push2(2);
        System.out.print(g.pop1() + " ");
        g.push1(3);
        System.out.print(g.pop1() + " ");
        System.out.print(g.pop1() + " ");
        System.out.println();
        for (int i = 0; i < g.arr.length; i++) {
            System.out.print(g.arr[i] + " ");
        }
    }

    static class twoStacks
    {
        int[] arr;
        int size, top1, top2;
        twoStacks()
        {
            size = 100;
            arr = new int[100];
            top1 = -1;
            top2 = size;
        }
        //Function to push an integer into the stack1.
        void push1(int x)
        {
            arr[++top1] = x;
        }
        //Function to push an integer into the stack2.
        void push2(int x)
        {
            arr[--top2] = x;
        }
        //Function to remove an element from top of the stack1.
        int pop1()
        {
            return top1 == -1 ? -1 : arr[top1--];
        }
        //Function to remove an element from top of the stack2.
        int pop2()
        {
            return top2 == 100 ? -1 : arr[top2++];
        }
    }
}
