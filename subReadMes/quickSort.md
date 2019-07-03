# Quick Sort

## Learning Objectives
What is Quick Sort?

How to implement quick sort?

## Lecture Flow

***Main Points***

Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.

- Always pick first element as pivot.
- Always pick last element as pivot (implemented below)
- Pick a random element as pivot.
- Pick median as pivot.
- The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as 
pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.

# Challenge Summary
Quick sort is based on the divide-and-conquer approach based on the idea of choosing one element as a pivot element and partitioning the array around it such that: Left side of pivot contains all the elements that are less than the pivot element Right side contains all elements greater than the pivot

 
## Challenge Description
Create a method that accepts an array and performs quick sort on the array. 

## Approach & Efficiency


Time | Space
--- | ---
O(n^2)) | O(n)

## Solution
[Code](../src/main/java/quickSort/Quicksort.java) | [Tests](../src/test/java/quickSort/QuicksortTest.java)

![White Board to Quick Sort problem](../assets/quicksort.jpg)

## Resources

### Videos
https://www.youtube.com/watch?v=PgBzjlCcFvc

### Reading
https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/

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
