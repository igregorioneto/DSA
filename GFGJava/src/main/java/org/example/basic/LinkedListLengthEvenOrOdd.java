package org.example.basic;

public class LinkedListLengthEvenOrOdd {
    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    static Node head;

    static void inset(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    static void list() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static int isLengthEvenorOdd(Node head1) {
        int count = 0;
        while (head1 != null) {
            head1 = head1.next;
            count++;
        }
        if (count % 2 == 0) return 0; else return 1;
    }

    public static void main(String[] args) {
        inset(new Node(12));
        inset(new Node(52));
        inset(new Node(10));
        inset(new Node(47));
        inset(new Node(95));
        inset(new Node(0));
        list();
        System.out.println();
        System.out.print(isLengthEvenorOdd(head));
    }
}
