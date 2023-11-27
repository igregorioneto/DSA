package org.example.util;
import java.util.Scanner;

public class GeneratedLinkedList {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head1;
    public static Node tail1;

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void insertList() {
        System.out.println("Inserindo valores na lista...");
        Scanner sc = new Scanner(System.in);

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
    }
}
