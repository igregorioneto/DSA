package org.example.basic;

import java.util.ArrayList;

public class InorderTraversal {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Node root;

    static void insert(int item) {
        root = insertRec(root, item);
    }

    private static Node insertRec(Node root, int item) {
        if (root == null) {
            root = new Node(item);
            return root;
        }

        if (item < root.data) {
            root.left = insertRec(root.left, item);
        } else if (item > root.data) {
            root.right = insertRec(root.right, item);
        }
        return root;
    }

    static void constructTree() {
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right.left = new Node(50);
    }

    public static void main(String[] args) {
        constructTree();
        for (Integer e:inOrder(root)) {
            System.out.print(e + " ");
        }
    }

    static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrderTraversal(root, arr);
        return arr;
    }

    static void inOrderTraversal(Node root, ArrayList<Integer> arr) {
        if (root != null) {
            inOrderTraversal(root.left, arr);
            arr.add(root.data);
            inOrderTraversal(root.right, arr);
        }
    }
}
