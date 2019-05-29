# Array Shift

## Challenge
Given an integer and an array, add the integer to the middle of the array. 

## Approach & Efficiency
Divide the length of the array by two and round up to the nearest whole number (to account for arrays of odd length). Then create an empty array to copy the old array items into, leaving space for the new integer to be inserted in the middle of it. 

This loops through the array one time. Time and space will have a linear effect on the computer. 

## Solution
[Code](../src/main/java/arrayShift/ArrayShift.java) | [Tests](../src/test/java/arrayShift/ArrayShiftTest.java)
![White Board to Array Shift problem](../assets/arrayShift.JPG)