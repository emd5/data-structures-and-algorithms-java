package linkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedListTest {

    // Can successfully instantiate an empty linked list
    @Test
    public void linkedList_testEmptyLinkedList(){
        LinkedList linkedList= new LinkedList();

        List<Node> testList = linkedList.print();

        assertTrue("Test empty linked list, should be empty", testList.isEmpty());
    }

    // Can properly insert into the linked list.
    @Test
    public void linkedList_testInsertOneToLL(){

        LinkedList linkedList = new LinkedList();

        linkedList.insert(4);

        List<Node> testList = linkedList.print();

        assertTrue("Insert into LL the size of the List should be 1", testList.size() == 1);

    }

    // The head property will properly point to the first node in the linked list
    @Test
    public void linkedList_testHeadPointToFirstNode(){
        LinkedList linkedList4 = new LinkedList();

        linkedList4.insert(4);
        linkedList4.insert(10);
        linkedList4.insert(5);


        assertTrue("head should be 5", linkedList4.head.data == 5);

    }

    // Can properly insert multiple nodes into the linked list
    @Test
    public void linkedList_testInsertMultipleToLL(){

        LinkedList linkedList = new LinkedList();

        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insert(5);

        List<Node> testList = linkedList.print();

        assertTrue("Insert into LL the size of the List should be 3", testList.size() == 3);

    }

    // Will return true when finding a value within the linked list that exists
    @Test
    public void linkedList_testValueIsFoundInLinkedList(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insert(5);

        assertTrue("Should return true, 10 is found", linkedList.includes(10));

    }

    // Will return false when searching for a value in the linked list that does not exist
    @Test
    public void linkedList_testValueIsNotFoundInLinkedList(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insert(5);

        assertFalse("Should return true, 10 is found", linkedList.includes(23));
    }

    //Can properly return a collection of all the values that exist in the linked list
    @Test
    public void linkedList_testPrintLinkedListCollection(){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(4);
        linkedList.insert(10);
        linkedList.insert(5);

        List<Node> expected = linkedList.print();

        List<Integer> actual = new ArrayList<>(List.of((Integer) 5, (Integer) 10, (Integer) 4));

        for(Node e: expected){
            assertTrue("Should contain 10 in both lists", actual.contains(e.data));
        }

    }

}