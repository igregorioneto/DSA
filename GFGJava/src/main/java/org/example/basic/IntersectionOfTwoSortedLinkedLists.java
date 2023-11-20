package org.example.basic;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedLinkedLists {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head1 = null,last1 = null, head2 = null, last2 = null, intersection = null;

    static void insertHead1(int data) {
        Node n = new Node(data);
        if (head1 == null && last1 == null) {
            head1 = n;
            last1 = n;
        } else {
            last1.next = n;
            last1 = n;
        }
    }

    static void insertHead2(int data) {
        Node n = new Node(data);
        if (head2 == null && last2 == null) {
            head2 = n;
            last2 = n;
        } else {
            last2.next = n;
            last2 = n;
        }
    }

    static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Head 1");
        insertHead1(1);
        insertHead1(2);
        insertHead1(3);
        insertHead1(4);
        insertHead1(6);
        display(head1);

        System.out.println("Head 2");

        insertHead2(2);
        insertHead2(4);
        insertHead2(6);
        insertHead2(8);
        display(head2);

        System.out.println("Intersection");
        intersection = findIntersection(head1, head2);
        display(intersection);
    }

    static Node findIntersection(Node head1, Node head2) {
        Node x = head1, y = head2, res = null, head = null;
        while (x != null && y != null) {
            if (x.data < y.data)
                x = x.next;
            else if (x.data > y.data)
                y = y.next;
            else {
                Node t = new Node(x.data);
                if (head == null)
                    head = t;
                else
                    res.next = t;
                res = t;
                y = y.next;
                x = x.next;
            }
        }
        return head;
    }
}
