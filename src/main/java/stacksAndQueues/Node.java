package stacksAndQueues;

/**
 * Node class with data and next pointer.
 **/
public class Node {

    public Node next;
    public int data;

    /**
     * The constructor of the node class that accepts data.
     * @param data
     */
    public  Node(int data) {
        this.next = null;
        this.data = data;
    }

}
