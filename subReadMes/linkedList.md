# Singly Linked List

## Challenge
Implement a Singly Linked List Data Structure

## Approach & Efficiency
To implement the l inked list, there needs to be a node class that includes the value to store data and a next for 
the node to point to the next node. 
 

Traversing through a linked list takes O(n) space.

## Solution
[Code](../src/main/java/linkedlist/LinkedList.java) | [Tests](../src/test/java/linkedlist/LinkedListTest.java)

##Features


***insert()***
- Define a method called insert which takes any value as an argument and adds a new node with that value to the head 
of the list with an O(1) Time performance.

***includes()***
- Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.

***print()***
- Define a method called print which takes in no arguments and returns a collection all of the current Node values in 
the Linked List.