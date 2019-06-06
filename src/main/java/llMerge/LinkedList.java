package llMerge;

import java.util.ArrayList;
import java.util.List;


/**
 * The LinkedList class
 */
public class LinkedList {

    public Node head;
    private Node current;


    public LinkedList(){

    }

    /**
     * This method accepts 2 different linked list, zips the second ll into the first ll.
     * @param ll1 first linked list
     * @param ll2 second list
     * @return first linked list zipped with the second list
     */
    public static LinkedList merge(LinkedList ll1, LinkedList ll2){

        if(ll1.head == null){
            return ll2;
        }

        Node forward = ll1.head.next;
        Node back = ll1.head;
        ll2.current = ll2.head;

        while(forward != null){

            if(ll2.current == null){
                return ll1;
            }

            ll2.head = ll2.current.next;
            back.next = ll2.current;
            ll2.current.next = forward;

            ll2.current = ll2.head;
            back = forward;
            forward = forward.next;
        }

        back.next = ll2.current;
        return ll1;
    }

    /**
     * This method takes in no arguments and returns a collection all of the current Node values in the Linked List
     *
     * @return Node
     */
    public List<Node> print(){
        List<Node> newList = new ArrayList<>();

        Node current = head;

        while(current != null){
            newList.add(current);
            current = current.next;
        }
        return newList;
    }

    /**
     * Adds a new node with the given value to the end of the list
     *
     * @param value the data
     */
    public void append(int value) throws AssertionError{

        if(head == null){
            insert(value);
        }
        else{
            Node current = head;

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
            Node current = head;

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
        Node current = head;

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
        Node current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.append(1);
        ll1.append(3);
        ll1.append(5);
        ll1.append(7);


        LinkedList ll2 = new LinkedList();
        ll2.append(2);
//        ll2.append(4);
//        ll2.append(6);
//        ll2.append(8);

        LinkedList newList = merge(ll1, ll2);

        List<Node> listNode = newList.print();

        for(Node value: listNode){
            System.out.println(value.data);
        }


    }

}



