package ru.vsu.cs.semenov_d_s.bst;

import ru.vsu.cs.semenov_d_s.BinaryTree;

public class BSTreeAlgorithms {

    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getNode(BinaryTree.TreeNode<T> node, T value) {
        if (node == null) {
            return null;
        }
        int cmp = node.getValue().compareTo(value);
        if (cmp == 0) {
            return node;
        } else if (cmp > 0) {
            return getNode(node.getLeft(), value);
        } else {
            return getNode(node.getRight(), value);
        }
    }

    public static <T extends Comparable<? super T>> Integer getMinNode(BinaryTree.TreeNode<Integer> node) {
        if (node == null) {
            return null;
        }
        Integer minValue = node.getValue();
        while (node.getLeft() != null) {
            if (minValue > node.getLeft().getValue()) {
                minValue = node.getLeft().getValue();
            }
            node = node.getLeft();
        }
        return minValue;
    }
}
