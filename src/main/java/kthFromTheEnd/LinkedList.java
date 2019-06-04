package kthFromTheEnd;

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
     * This method takes a number, k, as a parameter. Return the node’s value that is k
     * from
     *
     *
     * @param index
     */
    public int kthFromTheEnd(int index){
        return 0;
    }

    /**
     * Adds a new node with the given value to the end of the list
     *
     * @param value the data
     */
    public void append(int value) throws AssertionError{

        if(head == null){
            current = new Node(value);
            head = current;
        }
        else{
            current = head;

            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(value);
            current.next = newNode;
        }
    }

    /**
     *
     * Adds a new node with the given newValue immediately before the first value node
     *
     * @param value
     * @param newVal
     */
    public void insertBefore(int value, int newVal) throws NullPointerException{

        if(head.data == value ){
            head = new Node(newVal);
        }
        else{
            current = head;

            while(current.next.data != value){
                current = current.next;
            }
            Node newNode = new Node(newVal);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    /**
     * Adds a new node with the given newValue immediately after the first value node
     *
     * @param value
     * @param newValue
     */
    public void insertAfter(int value, int newValue) throws NullPointerException{
        current = head;

        while(current.data != value){
            current = current.next;
        }

        Node newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;

        if(current.next ==  null){
            current = new Node(newValue);
        }
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


