package fizzBuzzTree;

/**
 * Node class with data and left and right pointer.
 **/
public class Node{

    public Object data;
    public Node left;
    public Node right;

    /**
     * The constructor of the node class that accepts data.
     * @param data
     */
    public Node(Object data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    /**
     * String representation of the Node class
     * @return string representation of the Node class
     */
    @Override
    public String toString() {
        return "data=" + data + " right= "+ right+" left= "+ left + " | ";
    }
}
