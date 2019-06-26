package findMaxBinary;

/**
 * Node class with data and left and right pointer.
 **/
public class Node {

    public int data;
    public Node left;
    public Node right;

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
}
