package linkedlist;

import java.util.ArrayList;
import java.util.List;


/**
 * The LinkedList class
 */
public class LinkedList {

    public Node head;
    public Node current;

    public LinkedList(){

    }

    /**
     * This method inserts which takes any value as an argument and adds a new node with that value to the head of the
     * list with an O(1) Time performance.
     *
     * @param value
     */
    public void insert(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    /**
     *
     * This method called includes which takes any value as an argument and returns a boolean result depending on
     * whether that value exists as a Node’s value somewhere within the list.
     *
     * @param value
     * @return boolean
     */
    public boolean includes(int value){
        current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * This method takes in no arguments and returns a collection all of the current Node values in the Linked List
     *
     * @return Node
     */
    public List<Node> print(){
        List<Node> newList = new ArrayList<>();

        current = head;

        while(current != null){
            newList.add(current);
            current = current.next;
        }
        return newList;
    }

}


