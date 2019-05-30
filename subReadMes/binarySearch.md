# Binary Search

## Challenge
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing
any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency
Start at the middle index of the array and compare the value to the current index, if the value is less than the 
current index, reassign the start and end of first half the array, otherwise reassign the start and end of the second
 half of the array. Return the index of the of the value found, otherwise return -1.
 

This loops through the array one time. Time and space is O(1) and O(lg(n)), respectively.

## Solution
[Code](../src/main/java/binarySearch/BinarySearch.java) | [Tests](../src/test/java/binarySearch/BinarySearchTest.java)
![White Board to BinarySearch problem](../assets/binarySearch.jpg)