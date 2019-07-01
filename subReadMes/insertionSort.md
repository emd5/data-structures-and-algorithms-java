# Insertion Sort

# Challenge Summary
Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.

## Challenge Description
Create a method that accepts an array and performs insertion sort on the array. The goal is to sort in place rather 
than declaring another array to store and sort values.

## Approach & Efficiency
Using in place method starting at index 1 and loop through to compare each index and swap the adjacent value if it is
 smaller than the current value. 

Time | Space
--- | ---
O(n^2) | O(n)

## Solution
[Code](../src/main/java/insertionSort/InsertionSort.java) | [Tests](../src/test/java/insertionSort/InsertionSortTest.java)

![White Board to Insertion Sort problem](../assets/insertionSort.jpg)

## Resources

### Videos
https://www.youtube.com/watch?v=i-SKeOcBwko

### Reading
https://www.geeksforgeeks.org/insertion-sort/


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
