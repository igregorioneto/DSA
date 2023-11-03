package org.example.DSA.arvore;

public class BinaryTreeLength {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Node root;

    static void constructTree() {
        //ROOT
        root = new Node(10);
        // LEFT
        root.left = new Node(6);
        root.left.right = new Node(8);
        root.left.left = new Node(3);
        // RIGHT
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
    }

    static int lengthTree(Node node) {
        return lengthTreeUtil(node);
    }

    private static int lengthTreeUtil(Node node) {
        if (node == null) {
            return 0;
        }
        int countLeft = lengthTreeUtil(node.left);
        int countRight = lengthTreeUtil(node.right);
        return Math.max(countLeft, countRight) + 1;
    }

    public static void main(String[] args) {
        constructTree();
        System.out.println("Tamanho da árvore: " + lengthTree(root));
    }
}
