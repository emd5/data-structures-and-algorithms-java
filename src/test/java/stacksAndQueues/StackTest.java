package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * - [x] Can successfully push onto a stack
 *  - [x] Can successfully push multiple values onto a stack
 *  - [x] Can successfully pop off the stack
 *  - [x] Can successfully empty a stack after multiple pops
 *  - [x] Can successfully peek the next item on the stack
 *  - [x] Can successfully instantiate an empty stack
 */
public class StackTest {

    @Test(expected = NullPointerException.class)
    public void stack_testStackConstructor(){
        Stack stack = new Stack();
        stack.peek();
    }

    @Test
    public void stack_testPushOneIntoStack(){
        Stack stack = new Stack();

        stack.push(4);
        assertEquals("Should return 4", 4, stack.peek());
    }

    @Test
    public void stack_testPushMultipleIntoStack(){
        Stack stack = new Stack();

        stack.push(4);
        stack.push(10);
        assertEquals("Should return 4", 10, stack.peek());
    }

    @Test
    public void stack_testPopOneFromStack(){
        Stack stack = new Stack();

        stack.push(4);
        stack.push(80);
        stack.pop();

        assertEquals("Should return 4", 4, stack.peek());
    }

    @Test(expected = NullPointerException.class)
    public void stack_testEmptyStackOnMultiplePops(){
        Stack stack = new Stack();

        stack.push(4);
        stack.push(80);

        stack.pop();
        stack.pop();
        stack.pop();
    }

    @Test
    public void stack_testPeekNextNode(){
        Stack stack = new Stack();

        stack.push(4);

        stack.push(80);

        assertEquals("Should return 4", 4, stack.peek());

    }



}