package org.example.basic;

public class ImplementQueueUsingArray {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(3);
        queue.push(2);
        queue.push(4);
        for (int e:queue.arr) {
            System.out.print(e + " ");
        }
    }

    static class MyQueue {

        int front, rear;
        int arr[] = new int[10];

        MyQueue()
        {
            front=0;
            rear=0;
        }

        //Function to push an element x in a queue.
        void push(int x)
        {
            if (rear == 0) {
                front++;
            } else if (rear == arr.length - 1) {
                return;
            }
            rear++;
            arr[rear] = x;
        }

        //Function to pop an element from queue and return that element.
        int pop()
        {
            if (front == 0 || front > rear) {
                return -1;
            }
            int t = arr[front];
            front++;
            return t;
        }
    }
}
