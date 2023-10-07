package org.example.basic;

class Node1 {
    int data;
    Node1 next;
    Node1(int a) { data = a; next = null; };
}

public class CountNodesOfLinkedList {
    public static void main(String[] args) {

    }

    static int getCount(Node1 head) {
        int count = 0;
        Node1 e = null;
        while (head != null) {
            e = head.next;
            head = e;
            count++;
        }
        return count;
    }
}
