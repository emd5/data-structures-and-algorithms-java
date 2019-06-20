# Find the max

Find the Maximum Value in a Binary Tree

## Challenge

- Write a function called find-maximum-value which takes binary tree as its only input. Without utilizing any of 
the built-in methods available to your language, return the maximum value stored in the tree. You can assume that 
the values stored in the Binary Tree will be numeric.


## Approach & Efficiency

For this implementation, using recursion to find the max in the a tree that gets passed in as an argument. Declare a 
variable and while traversing through the tree, compare the value and store if the value is higher than the current 
value.

Time | Space
--- | ---
O(n) | O(n)

## Solution

[Code](../src/main/java/findMaxBinary/BinaryTree.java) | [Tests](../src/test/java/findMaxBinary/BinaryTreeTest.java)

![White Board to Find Max problem](../assets/findMax.jpg)


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