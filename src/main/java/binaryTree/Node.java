package binaryTree;

/**
 * Node class with data and left and right pointer.
 **/
public class Node {

    private int data;
    private Node left;
    private Node right;

    /**
     * The constructor of the node class that accepts data.
     * @param data
     */
    public Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public int getData() { return this.data; }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() { return this.left; }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() { return this.right; }

    public void setRight(Node right) { this.right = right; }

    /**
     * String representation of the Node class
     * @return string representation of the Node class
     */
    @Override
    public String toString() {
        return "data=" + getData() + " right= "+ getRight() +" left= "+ getLeft() + " | ";
    }
}
