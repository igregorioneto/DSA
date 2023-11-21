package org.example.basic;

public class ImplementStackUsingLinkedList {
     static class StackNode {
         int data;
         StackNode next;
         StackNode(int a) {
             data = a;
             next = null;
         }
     }
    static StackNode top;

     static void display() {
         StackNode current = top;
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
         System.out.println();
     }

    public static void main(String[] args) {
        push(2);
        push(3);
        push(4);
        display();
    }

    static void push (int a) {
        StackNode sn = new StackNode(a);
        if (top == null) {
            top = sn;
            return;
        }
        sn.next = top;
        top = sn;
    }

    int pop() {
         if (top == null) {
             return -1;
         }
        int temp = top.data;
        top = top.next;
        return temp;
    }
}
