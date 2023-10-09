package org.example.basic;

public class CheckIfCircularLinkedList {

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

    static void insert(int data) {
        Node e = new Node(data);
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
                System.out.print( e.data + " ");
                if (next != null) {
                    e = next;
                    next = e.next;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        ultimo.next = primeiro;
        get();

        System.out.println(isCircular(primeiro));
    }

    static boolean isCircular(Node head) {
        if (head == null || head.next == null) return false;
        Node temp = head.next;
        while (temp != null) {
            if (temp.equals(head)) return true;
            temp = temp.next;
        }
        return false;
    }

    static boolean isCircular2(Node head) {
        Node curr = head;
        Node next = head.next;
        boolean circular = false;
        while (true) {
            if (next != null) {
                if (next.equals(head)) {
                    circular = true;
                    break;
                }
                curr = next;
                next = curr.next;
            }
        }
        return circular;
    }


}
