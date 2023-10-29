package org.example.basic;

public class NodeAtAGivenIndexInLinkedList {
    static class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }

    static Node head;

    static void insetList(Node node) {
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

    static void list(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insetList(new Node(76));
        insetList(new Node(82));
        insetList(new Node(54));
        insetList(new Node(93));
        list();
        System.out.println();
        System.out.print(getNth(head, 4));
    }

    static int getNth(Node node, int ind) {
        int count = 1;
        Node temp = node;
        while (temp.next != null) {
            if (count == ind) {
                break;
            }
            temp = temp.next;
            count++;
        }
        return temp.data > 0 ? temp.data : -1;
    }
}
