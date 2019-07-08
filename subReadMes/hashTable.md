# Hash Table

## Challenge
Implement a Hash Table

## Approach & Efficiency
Implement a Hashtable with the following methods: `add()`, `get()`, `contains()`, and `hash()`.

## Solution
[Code](../src/main/java/hashTable/HashTable.java) | [Tests](../src/test/java/hashTable/HashTableTest.java)

## Features

***add()*** S: O(n) T: O(1)

- [x] Define a method called add takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed..

***get()*** S: O(n) T: O(1)

- [x] Define a method called get which takes in the key and returns the value from the table.

***contains()*** S: O(1) T: O(n)

- [x] Define a method called contains takes in the key and returns a boolean, indicating if the key exists in the table already.
 
 ***hash()*** S: O(1) T: O(1)
 
 - [x] Define a method called hash which takes in an arbitrary key and returns an index in the collection.
 
 
***Test***
 
Write tests to prove the following functionality:
- [x]  Adding a key/value to your hashtable results in the value being in the data structure
- [x]  Retrieving based on a key returns the value stored
- [x]  Successfully returns null for a key that does not exist in the hashtable
- [x]  Successfully handle a collision within the hashtable
- [x]  Successfully retrieve a value from a bucket within the hashtable that has a collision
- [x]  Successfully hash a key to an in-range value

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