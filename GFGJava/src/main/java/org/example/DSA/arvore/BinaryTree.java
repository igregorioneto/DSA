package org.example.DSA.arvore;

public class BinaryTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Node root;

    // Função para verificar se a árvore é BST
    static boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBSTUtil(Node root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }

        if (root.data < minValue || root.data > maxValue) {
            return false;
        }

        return isBSTUtil(root.left, minValue, root.data - 1) && isBSTUtil(root.right, root.data + 1, maxValue);
    }

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

    static void list(Node root) {
        if (root != null) {
            list(root.left);
            System.out.print(root.data + " ");
            list(root.right);
        }
    }

    public static void main(String[] args) {
        constructTree();
        list(root);
        System.out.println(isBST(root));
    }


}
