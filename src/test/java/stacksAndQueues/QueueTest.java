package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  *  - [x] Can successfully peek into a queue, seeing the expected value
 */
public class QueueTest {

    // Test successfully instantiate an empty queue
    @Test(expected = NullPointerException.class)
    public void queue_testConstructor(){
        Queue queue = new Queue();
        queue.peek();
    }

    // Test successfully enqueue into a queue
    @Test
    public void queue_testEnqueueOneNode(){
        Queue queue = new Queue();
        queue.enqueue(3);
        assertEquals("Should return 3", 3, queue.peek());
    }

    // Test successfully enqueue multiple values into a queue
    @Test
    public void queue_testEnqueueMultipleNodes(){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(33);
        queue.enqueue(333);
        queue.enqueue(3333);
        assertEquals("Should return 3", 3, queue.peek());
    }

    // Test successfully dequeue out of a queue the expected value
    @Test(expected = NullPointerException.class)
    public void queue_testDequeueOneNode(){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.dequeue();
        queue.peek();
    }

    // Test successfully peek into a queue, seeing the expected value
    @Test
    public void queue_testPeekExpectedValue(){
        Queue queue = new Queue();
        queue.enqueue(37);
        queue.enqueue(137);
        assertEquals("Should return 37", 37, queue.peek());
    }


    // Test successfully empty a queue after multiple dequeues
    @Test
    public void queue_testEmptyQueueOnMultipleQueues(){
        Queue queue = new Queue();
        queue.enqueue(37);
        assertEquals("Should return 37", 37, queue.peek());
        queue.enqueue(137);
        queue.dequeue();
        assertEquals("Should return 37", 137, queue.peek());


    }
}