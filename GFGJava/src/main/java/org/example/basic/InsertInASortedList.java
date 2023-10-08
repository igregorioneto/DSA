package org.example.basic;

public class InsertInASortedList {

    static int tamanho = 0;
    static Node primeiro = null;
    static Node ultimo = null;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        insert(25);
        insert(36);
        insert(47);
        insert(58);
        insert(69);
        insert(80);
        get();
        primeiro = sortedInsert(primeiro, 70);
        get();
    }

    static void insert(int key) {
        Node e = new Node(key);
        if (primeiro == null && ultimo == null) {
            primeiro = e;
            ultimo = e;
        } else {
            ultimo.next = e;
            ultimo = e;
        }
        tamanho++;
    }

    static void get() {
        Node e = primeiro;
        Node next = e.next;
        for (int i = 0; i < tamanho; i++) {
            if (e != null) {
                System.out.print(e.data + " ");
                e = next;
                if (e.next != null) next = e.next;
            }
        }
        System.out.println();
    }

    static Node sortedInsert(Node head1, int key) {
        tamanho++;

        if (head1 == null || head1.data >= key) {
            Node temp = new Node(key);
            temp.next = head1;
            head1 = temp;
            return head1;
        }

        if (head1.next == null) {
            Node temp = new Node(key);
            head1.next = temp;
            return head1;
        }

        Node prev = head1;
        Node curr = head1.next;
        Node e = new Node(key);
        while (curr.next != null) {
            if (key >= prev.data && key <= curr.data) {
                break;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }

        if (curr.next == null && (key >= prev.data && key >= curr.data)) {
            curr.next = e;
        } else {
            prev.next = e;
            e.next = curr;
        }

        return head1;
    }


}
