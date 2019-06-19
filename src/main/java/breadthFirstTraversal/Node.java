package breadthFirstTraversal;

/**
 * Node class with data and left and right pointer.
 **/
public class Node<T> {

    public T data;
    public Node<T> left;
    public Node<T> right;

    /**
     * The constructor of the node class that accepts data.
     *
     * @param data
     */
    public Node(T data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

}

