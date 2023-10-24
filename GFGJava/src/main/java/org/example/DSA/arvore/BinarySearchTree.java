package org.example.DSA.arvore;

public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public boolean isBST(Node root) {
        return isBTSUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBTSUtil(Node root, int minValue, int maxValue) {
        if (root == null) {
            return false;
        }

        if (root.data < minValue || root.data > maxValue) {
            return false;
        }

        boolean isBTSLeft = isBTSUtil(root.left, minValue, root.data - 1);

        boolean isBTSRight = isBTSUtil(root.right, root.data + 1, maxValue);

        return isBTSLeft && isBTSRight;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(15);
        tree.insert(5);
        tree.insert(9);
        tree.insert(11);
        tree.insert(8);
        tree.insert(12);

        System.out.println("Árvore Binária de Busca (inorder traversal):");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("É uma BST: " + tree.isBST(tree.root));
    }
}
