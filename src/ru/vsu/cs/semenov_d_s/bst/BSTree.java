package ru.vsu.cs.semenov_d_s.bst;

import ru.vsu.cs.semenov_d_s.BinaryTree;

public interface BSTree<T extends Comparable<? super T>> extends BinaryTree<T> {

    default BinaryTree.TreeNode<T> getNode(T value) {
        return BSTreeAlgorithms.getNode(getRoot(), value);
    }

    default T get(T value) {
        BinaryTree.TreeNode<T> valueNode = getNode(value);
        return (valueNode == null) ? null : valueNode.getValue();
    }

    default boolean contains(T value) {
        return getNode(value) != null;
    }

    T put(T value);

    T remove(T value);

    void clear();

    int size();
}

