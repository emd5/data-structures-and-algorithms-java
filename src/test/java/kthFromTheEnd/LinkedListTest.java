package kthFromTheEnd;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testLinkedListAppendSizeIs3(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        assertEquals("Size is 3 ", 3, linkedList.print().size());
    }

    @Test
    public void testKthFromTheEndFirstIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        assertEquals("Should return 5 ", 5, linkedList.kthFromTheEnd(0));
    }

    @Test
    public void testKthFromTheEndIsInTheMiddle() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        assertEquals("Should return 4 ", 4, linkedList.kthFromTheEnd(1));
    }

    @Test
    public void testKthFromTheEndIsInTheLastIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        assertEquals("Should return 3 ", 3, linkedList.kthFromTheEnd(2));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testKthFromTheEndIsInvalid() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.kthFromTheEnd(20);
    }

    @Test
    public void testKthFromTheEndIsInvalid2() {
        try{
            LinkedList linkedList = new LinkedList();
            linkedList.append(3);
            linkedList.append(4);
            linkedList.append(5);
            linkedList.kthFromTheEnd(20);
        }
        catch(IllegalArgumentException e){
            System.out.println("The kth value is greater than the length of the linked list");
        }
    }

    @Test
    public void testKthFromTheEndwithOneNode() {

        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.kthFromTheEnd(0);

        assertEquals("Should return 3 ", 3, linkedList.kthFromTheEnd(0));


    }
}