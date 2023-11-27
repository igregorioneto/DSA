package org.example.basic;

import org.example.util.GeneratedLinkedList;

public class InsertInMiddleOfLinkedList {
    public static void main(String[] args) {
        GeneratedLinkedList.insertList();
        GeneratedLinkedList.display(GeneratedLinkedList.head1);
        insertInMid(GeneratedLinkedList.head1, 3);
        GeneratedLinkedList.display(GeneratedLinkedList.head1);
    }

    static GeneratedLinkedList.Node insertInMid(GeneratedLinkedList.Node head, int data) {
        GeneratedLinkedList.Node newNode = new GeneratedLinkedList.Node(data);
        GeneratedLinkedList.Node current = head;
        int size = 0;
        while (current.next != null) {
            size++;
            current = current.next;
        }

        int mid = size / 2;
        mid = Math.round(mid);
        for (int i = 0; i < mid; i++) {
            head = head.next;
        }

        GeneratedLinkedList.Node add = head.next;
        head.next = newNode;
        newNode.next = add;
        return head;
    }
}
