package org.example.basic;

import java.util.Scanner;

public class IdenticalLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head1, tail1, head2, tail2;

    static void insertList() {
        System.out.println("Inserindo valores na lista...");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Primeira Lista");
            int n1 = sc.nextInt();
            int d1 = sc.nextInt();
            head1 = new Node(d1);
            tail1 = head1;

            while (n1-- > 1) {
                Node n = new Node(sc.nextInt());
                tail1.next = n;
                tail1 = tail1.next;
            }

            System.out.println("Segunda Lista");
            int n2 = sc.nextInt();
            int d2 = sc.nextInt();
            head2 = new Node(d2);
            tail2 = head2;

            while (n2-- > 1) {
                Node n = new Node(sc.nextInt());
                tail2.next = n;
                tail2 = tail2.next;
            }
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
        insertList();
        System.out.print("Lista vinculada 1: ");
        display(head1);
        System.out.print("Lista vinculada 2: ");
        display(head2);
        System.out.print("Verificando se a lista é identica: ");
        if (isIdentical(head1, head2))
            System.out.println("Identical");
        else
            System.out.println("Not identical");
    }

    static boolean isIdentical(Node head1, Node head2) {
        Node current1 = head1;
        Node current2 = head2;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        if (current1 != null || current2 != null)
            return false;

        return true;
    }
}
