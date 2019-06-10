# Stacks and Queues

## Challenge
Implement a stacks and queues data structure

## Approach & Efficiency
To implement the linked list and node class. Created instance methods for the linked list class: insert(), includes()
, print().


## Solution

### Stacks

[Code](../src/main/java/stacksAndQueues/Stack.java) | [Tests](../src/test/java/stacksAndQueues/StackTest.java)

### Queues

[Code](../src/main/java/stacksAndQueues/Queue.java) | [Tests](../src/test/java/stackAndQueues/QueueTest.java)


## Features

### Stacks

***`push()`*** S: O(1) T: O(1)

- [x] Define a method called `push` which takes any value as an argument and adds a new node with that value to the 
top of the stack with an O(1) Time performance.

***`pop()`*** S: O(1) T: O(1)

- [x] Define a method called `pop` that does not take any argument, removes the node from the top of the stack, and 
returns the node’s value.

***`peek()`*** S: O(1) T: O(1)

- [x] Define a method called `peek` that does not take an argument and returns the value of the node located on top of 
the stack, without removing it from the stack.

### Queues

***`enqueue()`*** S: O(1) T: O(1)

- [x] Define a method called `enqueue` which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.

***`dequeue()`*** S: O(1) T: O(1)

- [x] Define a method called `dequeue` that does not take any argument, removes the node from the front of the queue, and returns the node’s value.

***`peek()`*** S: O(1) T: O(1)

- [x] Define a method called `peek` that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.

 
***Test***
 
Write tests to prove the following functionality:
 
 - [x] Can successfully push onto a stack
 - [x] Can successfully push multiple values onto a stack
 - [x] Can successfully pop off the stack
 - [x] Can successfully empty a stack after multiple pops
 - [x] Can successfully peek the next item on the stack
 - [x] Can successfully instantiate an empty stack
 - [x] Can successfully enqueue into a queue
 - [x] Can successfully enqueue multiple values into a queue
 - [x] Can successfully dequeue out of a queue the expected value
 - [x] Can successfully peek into a queue, seeing the expected value
 - [x] Can successfully empty a queue after multiple dequeues
 - [x] Can successfully instantiate an empty queue