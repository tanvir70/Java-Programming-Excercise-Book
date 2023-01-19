package book.Generic;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public BinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (root == null) {
            root = newNode;
            size++;
            return;
        }
        add(root, newNode);
    }

    private void add(Node<T> current, Node<T> newNode) {
        int comparison = newNode.value.compareTo(current.value);
        if (comparison < 0) {
            if (current.left == null) {
                current.left = newNode;
                size++;
            } else {
                add(current.left, newNode);
            }
        } else {
            if (current.right == null) {
                current.right = newNode;
                size++;
            } else {
                add(current.right, newNode);
            }
        }
    }

    public boolean search(T value) {
        return search(root, value);
    }

    private boolean search(Node<T> current, T value) {
        if (current == null) {
            return false;
        }
        int comparison = value.compareTo(current.value);
        if (comparison == 0) {
            return true;
        }
        return comparison < 0
                ? search(current.left, value)
                : search(current.right, value);
    }

    public void delete(T value) {
        root = delete(root, value);
    }

    private Node<T> delete(Node<T> current, T value) {
        if (current == null) {
            return null;
        }
        int comparison = value.compareTo(current.value);
        if (comparison < 0) {
            current.left = delete(current.left, value);
        } else if (comparison > 0) {
            current.right = delete(current.right, value);
        } else {
            size--;
            if (current.left == null && current.right == null) {
                current = null;
            } else if (current.left == null) {
                current = current.right;
            } else if (current.right == null) {
                current = current.left;
            } else {
                Node<T> smallest = findSmallest(current.right);
                current.value = smallest.value;
                current.right = delete(current.right, smallest.value);
            }
        }
        return current;
    }

    private Node<T> findSmallest(Node<T> current) {
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;

        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}