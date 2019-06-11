package queueWithStacks;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class QueueWithStacksTest {

    // test enqueue one node
    @Test
    public void testEnqueueOneNode() {
        QueueWithStacks queueWithStacks = new QueueWithStacks();
        queueWithStacks.enqueue(4);

        assertEquals("Should return 4", 4 , queueWithStacks.front.data);
    }


    //test enqueue multiple nodes
    @Test
    public void testEnqueueMultipleNode() {
        QueueWithStacks queueWithStacks = new QueueWithStacks();
        queueWithStacks.enqueue(34);
        queueWithStacks.enqueue(35);

        assertEquals("Should return 34", 34 , queueWithStacks.front.data);
    }

    // Test dequeue method
    @Test(expected = EmptyStackException.class)
    public void testDequeue(){
        QueueWithStacks queueWithStacks = new QueueWithStacks();
        queueWithStacks.enqueue(100);
        queueWithStacks.enqueue(101);
        queueWithStacks.dequeue();
    }
}