# Trees

## Challenge
Implement a Binary Tree

## Approach & Efficiency
To implement the Binary Tree and node class. Created instance methods for the linked list class: add(), contain()
, preOrder(), postOrder(), inorder().


## Solution
[Code](../src/main/java/binaryTree/BinaryTree.java) | [Tests](../src/test/java/binaryTree/BinaryTree.java)

## Features

***add()*** S: O(n) T: O(log n)

- [x] Define a method called insert which takes any value as an argument and adds a new node with that value to the 
head 
of the list with an O(1) Time performance.

***contains()*** S: O(n) T: O(log n)

- [x] Define a method called includes which takes any value as an argument and returns a boolean result depending on 
whether 
that value exists as a Node’s value somewhere within the list.

***preorder()*** S: O(n) T: O(log n)

- [x] Define a method for each of the depth first traversals called preOrder which returns an
 array of the values, ordered appropriately.
 
 ***inorder()*** S: O(n) T: O(log n)
 
 - [x] Define a method for each of the depth first traversals called inOrder which returns an array of the values, 
 ordered appropriately.
 
 ***postorder()*** S: O(n) T: O(log n)
 
 - [x] Define a method for each of the depth first traversals called postOrder which returns an array of the values, 
 ordered appropriately.
 
 
***Test***
 
 - [x]  Can successfully instantiate an empty tree
 - [x]  Can successfully instantiate a tree with a single root node
 - [x]  Can successfully add a left child and right child to a single root node
 - [x]  Can successfully return a collection from a preorder traversal
 - [x]  Can successfully return a collection from an inorder traversal
 - [x]  Can successfully return a collection from a postorder traversal

## Checklist
- [x] Top-level README “Table of Contents” is updated
- [x] Feature tasks for this challenge are completed
- [x] Unit tests written and passing
    - [x] “Happy Path” - Expected outcome
    - [x] Expected failure
    - [x] Edge Case (if applicable/obvious)
- [x] README for this challenge is complete
    - [x] Summary, Description, Approach & Efficiency, Solution
    - [x] Link to code
    - [x] Picture of whiteboard