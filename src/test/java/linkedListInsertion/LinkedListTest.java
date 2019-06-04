package linkedListInsertion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedListTest {

    // Add a node to the end of the linked list
    @Test
    public void testAppendSingleValueToLinkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(4);

        List<Node> testList = linkedList.print();

        assertTrue("Insert into LL the size of the List should be 1", testList.size() == 1);
    }

    // Add multiple nodes to the end of a linked list
    @Test
    public void testAppendMultipleToLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(34);
        linkedList.append(4);

        List<Node> testList = linkedList.print();

        assertTrue("Insert into LL the size of the List should be 1", testList.size() == 3);
    }

    // Can successfully insert a node before a node located i the middle of a linked list
    @Test
    public void testInsertBeforeMiddleInLinkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.insertBefore(3,10);
        List<Node> testList = linkedList.print();

        List<Node> actual = new ArrayList<>();
        actual.add(new Node(1));
        actual.add(new Node(2));
        actual.add(new Node(10));
        actual.add(new Node(3));
        actual.add(new Node(4));
        actual.add(new Node(5));

        int actualValue = actual.get(2).data;

        assertTrue("Insert value should be at index 2", testList.get(2).data == actualValue);
    }

    // Insert a node before the first node of a linked list
    @Test
    public void testInsertBeforeFirstNode(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.insertBefore(1,10);

        List<Node> actual = new ArrayList<>();
        actual.add(new Node(10));
        actual.add(new Node(1));
        actual.add(new Node(2));
        actual.add(new Node(3));
        actual.add(new Node(4));
        actual.add(new Node(5));

        List<Node> expectedList = linkedList.print();
        int actualFirstIndexValue = actual.get(0).data;
        assertTrue("Insert value 10 should be at index 0", expectedList.get(0).data == actualFirstIndexValue);

    }


    @Test(expected = NullPointerException.class)
    public void testInsertBeforeDoesNotExist(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.insertBefore(500,10);

    }

    // Insert after a node in the middle of the linked list
    @Test
    public void testInsertAfterInMiddleOfLinkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.insertAfter(1,10);

        List<Node> actual = new ArrayList<>();
        actual.add(new Node(1));
        actual.add(new Node(10));
        actual.add(new Node(2));
        actual.add(new Node(3));
        actual.add(new Node(4));
        actual.add(new Node(5));

        List<Node> expectedList = linkedList.print();

        int actualFirstIndexValue = actual.get(1).data;
        assertTrue("Insert value 10 should be at index 0", expectedList.get(1).data == actualFirstIndexValue);

    }

    // Insert a node after the last node of the linked list
    @Test
    public void testInsertAfterInLastNode(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.insertAfter(5,10);

        List<Node> actual = new ArrayList<>();
        actual.add(new Node(1));
        actual.add(new Node(2));
        actual.add(new Node(3));
        actual.add(new Node(4));
        actual.add(new Node(5));
        actual.add(new Node(10));

        List<Node> expectedList = linkedList.print();
        int actualFirstIndexValue = actual.get(5).data;
        assertTrue("Insert value 10 should be at index 0", expectedList.get(5).data == actualFirstIndexValue);
    }



    @Test(expected = IllegalStateException.class)
    public void testInsertAfterInLastNodeDoesNotExist(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.insertAfter(6,10);
    }

    @Test(expected = IllegalStateException.class)
    public void testInsertAfterInLastNodeDoesNotExist2(){
        LinkedList linkedList = new LinkedList();
        try{
            linkedList.insertAfter(9,10);
            fail("inserting after should throw an exception on an empty list");
        } catch (IllegalStateException e){
            assertNull("Null");
        }
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.insertAfter(6,10);
    }

}