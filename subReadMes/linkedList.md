# Singly Linked List

## Challenge
Implement a Singly Linked List Data Structure

## Approach & Efficiency
To implement the linked list and node class. Created instance methods for the linked list class: insert(), includes()
, print().


## Solution
[Code](../src/main/java/linkedlist/LinkedList.java) | [Tests](../src/test/java/linkedlist/LinkedListTest.java)

## Features


***insert()*** S: O(1) T: O(1)

- [x] Define a method called insert which takes any value as an argument and adds a new node with that value to the 
head 
of the list with an O(1) Time performance.

***includes()*** S: O(1) T: O(n)

- [x] Define a method called includes which takes any value as an argument and returns a boolean result depending on 
whether 
that value exists as a Node’s value somewhere within the list.

***print()*** S: O(n) T: O(n)

- [x]Define a method called print which takes in no arguments and returns a collection all of the current Node values
 in the Linked List.
 
 
***Test***
 - [x] Can successfully instantiate an empty linked list
 - [x] Can properly insert into the linked list
 - [x] The head property will properly point to the first node in the linked list
 - [x] Can properly insert multiple nodes into the linked list
 - [x] Will return true when finding a value within the linked list that exists
 - [x] Will return false when searching for a value in the linked list that does not exist
 - [x] Can properly return a collection of all the values that exist in the linked list
