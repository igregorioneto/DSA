package org.example.DSA.arvore

class BinaryTreeLengthKotlin {
    class Node(var data: Int) {
        var left: Node? = null;
        var right: Node? = null;
    }

    var root: Node? = null;

    fun constructTree() {
        // ROOT
        root = Node(10)
        // LEFT
        root?.left = Node(6)
        root?.left?.right = Node(8)
        root?.left?.left = Node(3)
        // RIGHT
        root?.right = Node(15)
        root?.right?.left = Node(12)
        root?.right?.right = Node(20)
    }

    fun lengthTree(node: Node?): Int {
        return lengthTreeUtil(node);
    }

    private fun lengthTreeUtil(node: Node?): Int {
        if (node == null) {
            return 0;
        }
        val countLeft = lengthTreeUtil(node.left);
        val countRight = lengthTreeUtil(node.right);
        return maxOf(countLeft , countRight)+ 1;
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val tree = BinaryTreeLengthKotlin();
            tree.constructTree();
            println("Tamanho da árvore: ${tree.lengthTree(tree.root)}");
        }
    }
}