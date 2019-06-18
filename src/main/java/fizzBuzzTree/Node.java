package fizzBuzzTree;

/**
 * Node class with data and left and right pointer.
 **/
public class Node<T> {

    public T data;
    public Node<T> left;
    public Node<T> right;

    /**
     * The constructor of the node class that accepts data.
     * @param data
     */
    public Node(T data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public T getData() { return this.data; }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() { return this.left; }

    public void setLeft(Node<T> left) { this.left = left; }

    public Node<T> getRight() { return this.right; }

    public void setRight(Node<T> right) { this.right = right; }

    /**
     * String representation of the Node class
     * @return string representation of the Node class
     */
    @Override
    public String toString() {
        return "data=" + getData() + " right= "+ getRight() +" left= "+ getLeft() + " | ";
    }
}
