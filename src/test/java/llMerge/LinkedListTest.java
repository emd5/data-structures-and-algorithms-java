package llMerge;

import org.junit.Test;

import java.util.List;

import static llMerge.LinkedList.merge;

import static org.junit.Assert.*;

public class LinkedListTest {

    // Test when LL1 and LL2 have equal length
    @Test
    public void llmerge_testLLEqualSizeReturnAllValues() {
        LinkedList ll1 = new LinkedList();
        ll1.append(1);
        ll1.append(3);
        ll1.append(5);
        ll1.append(7);


        LinkedList ll2 = new LinkedList();
        ll2.append(2);
        ll2.append(4);
        ll2.append(6);
        ll2.append(8);

        LinkedList newList = merge(ll1, ll2);

        List<Node> listNode = newList.print();

        int counter = 1;
        for(Node value: listNode){
            assertEquals("Should Return" + value.data, counter, value.data);
            counter += 1;
        }
    }

    // Test when LL1 is shorter than LL2
    @Test
    public void llmerge_testLL1IsShorterThanLL2(){
        LinkedList ll1 = new LinkedList();
        ll1.append(1);

        LinkedList ll2 = new LinkedList();
        ll2.append(2);
        ll2.append(3);
        ll2.append(4);
        ll2.append(5);

        LinkedList newList = merge(ll1, ll2);

        List<Node> listNode = newList.print();

        int counter = 1;
        for(Node value: listNode){
            assertEquals("Should Return " + value.data, counter, value.data);
            counter += 1;
        }
    }

    // Test when LL2 is shorter than LL1
    @Test
    public void llmerge_testLL2IsShorterThanLL1(){
        LinkedList ll1 = new LinkedList();
        ll1.append(1);
        ll1.append(3);
        ll1.append(4);
        ll1.append(5);

        LinkedList ll2 = new LinkedList();
        ll2.append(2);

        LinkedList newList = merge(ll1, ll2);

        List<Node> listNode = newList.print();

        int counter = 1;
        for(Node value: listNode){
            assertEquals("Should Return " + value.data, counter, value.data);
            counter += 1;
        }
    }

    // Test when LL1 is empty and LL2 is not
    @Test
    public void llmerge_testLL1isEmptyReturnsLL2(){
        LinkedList ll1 = new LinkedList();

        LinkedList ll2 = new LinkedList();
        ll2.append(1);
        ll2.append(2);
        ll2.append(3);

        LinkedList newList = merge(ll1, ll2);

        List<Node> listNode = newList.print();

        int counter = 1;
        for(Node value: listNode){
            assertEquals("Should Return " + value.data, counter, value.data);
            counter += 1;
        }

    }


    // Test when LL2 is empty and LL1 is not
    @Test
    public void llmerge_testLL2IsEmptyReturnsLL1(){
        LinkedList ll1 = new LinkedList();
        ll1.append(1);
        ll1.append(2);
        ll1.append(3);

        LinkedList ll2 = new LinkedList();

        LinkedList newList = merge(ll1, ll2);

        List<Node> listNode = newList.print();

        int counter = 1;
        for(Node value: listNode){
            assertEquals("Should Return " + value.data, counter, value.data);
            counter += 1;
        }

    }

    // Test when both LL are empty
    @Test
    public void llmerge_testBothEmptyLL(){
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        LinkedList newList = merge(ll1, ll2);

        List<Node> listNode = newList.print();

        int counter = 1;
        for(Node value: listNode){
            assertEquals("Should Return Empty ", counter, value.data);
            counter += 1;
        }
    }
}