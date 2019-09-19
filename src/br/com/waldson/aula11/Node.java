package br.com.waldson.aula11;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }

    public int getValue() {
        return this.value;
    }

    public Node remove(Node node, int key) {
        if (node == null)
            return node;

        if (key < node.value)
            node.left = remove(node.left, key);

        else if (key > node.value)
            node.right = remove(node.right, key);

        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.value = node.right.minValue();
            node.right = remove(node.right, node.value);
        }

        return node;
    }

    public int minValue() {
        if (left == null)
            return value;
        else
            return left.minValue();
    }

    void print(Node node, String prefix) {
        if(node == null) return;
        System.out.println(prefix + " |-- " + node.value);
        print(node.left , prefix + " ");
        print(node.right , prefix + " ");
    }

}
