package org.example.basic;

import org.example.DSA.linkedList.DoublyLinkedList;

public class ReserveADoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node head = null,tail = null;

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);

        display();

        head = reverseDLL(head);
        display();
    }

    static Node reverseDLL(Node head) {
        Node current = head;
        Node newCurrent = null;
        while (current != null) {
            if (current.next == null) {
                newCurrent = current;
            }
            current = current.next;
        }

        Node reversedHead = newCurrent;

        while (newCurrent != null) {
            Node temp = newCurrent.next;
            newCurrent.next = newCurrent.prev;
            newCurrent.prev = temp;
            newCurrent = newCurrent.next;
        }

        return reversedHead;
    }
}
