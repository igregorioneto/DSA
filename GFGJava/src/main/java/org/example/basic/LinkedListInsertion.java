package org.example.basic;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedListInsertion {

    public static void main(String[] args) {
        Node head = null;
        head = insertAtBeginning(head, 9);
        System.out.print(head.data);
    }

    static Node insertAtBeginning(Node head, int x) {
        Node newObject = new Node(x);
        newObject.next = head;
        head = newObject;
        return head;
    }

    static Node insertAtEnd(Node head, int x) {
        Node newObject = new Node(x);
        if (head == null) return newObject;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newObject;
        return head;
    }

}
