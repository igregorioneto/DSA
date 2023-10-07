package org.example.basic;


public class ImplementStackUsingArray {
    static class MyStack {
        int top;
        int arr[] = new int[1000];

        MyStack() {
            top = -1;
        }

        void push(int a) {
            if (top < 1000)
                arr[++top] = a;
        }

        int pop() {
            if (top > -1)
                return arr[top--];
            return -1;
        }
    }
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(3);
        System.out.println("poped element will be " + myStack.pop());
        myStack.push(4);
        System.out.println("poped element will be " + myStack.pop());

        for (int e:myStack.arr) {
            System.out.print(e + " ");
        }
    }
}
