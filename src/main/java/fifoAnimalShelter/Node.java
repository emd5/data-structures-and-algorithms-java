package fifoAnimalShelter;

/**
 * Node class with data and next pointer.
 **/
public class Node<T> {

    public Node<T> next;
    public T data;

    /**
     * The constructor of the node class that accepts data.
     * @param data
     */
    public  Node(T data) {
        this.next = null;
        this.data = data;
    }

}
