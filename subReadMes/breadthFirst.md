# Animal Shelter

Breadth-first Traversal.

## Challenge

- Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the 
built-in methods available to your language, traverse the input binaryTree using a Breadth-first approach; print every 
visited node’s value.


## Approach & Efficiency

I created a method that that accepts a binaryTree as a parameter. Then traverse the binaryTree for each node. Using a queue to and 
add each node by checking the front of the queue and if the left and right child are not null. Dequeue to print the 
values.

Time | Space
--- | ---
O(n) | O(1) or O(n)

## Solution

[Code](../src/main/java/breadthFirst/BreadthFirstSearch.java) | [Tests](../src/test/java/breadthFirst/BreadthFirstSearchTest.java)

![White Board to BFS problem](../assets/bfs.jpg)


## Checklist
- [x] Top-level README “Table of Contents” is updated
- [x] Feature tasks for this challenge are completed
- [x] Unit tests written and passing
    - [x] “Happy Path” - Expected outcome
    - [ ] Expected failure
    - [x] Edge Case (if applicable/obvious)
- [x] README for this challenge is complete
    - [x] Summary, Description, Approach & Efficiency, Solution
    - [x] Link to code
    - [x] Picture of whiteboard