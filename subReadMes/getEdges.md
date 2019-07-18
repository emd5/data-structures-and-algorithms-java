# Get Edges
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? 
If so, how much will the total trip cost be?

## Challenge

Write a function based on the specifications above, which takes in a graph, and an array of city names.

 ![example graph](../assets/get_edge_example1.png)
 
 ![example input output](../assets/get_edge_example2.png)
## Approach & Efficiency
Create a method that accepts a start node as a parameter. 

Time | Space
--- | ---
O(e) | O(e)

## Solution
[Code](../src/main/java/graph/Graph.java) | [Tests](../src/test/java/graph/GraphTest.java)

![White Board to Get Edges Problem](../assets/getEdges.jpg)


## Checklist
- [x] Top-level README “Table of Contents” is updated
- [] Feature tasks for this challenge are completed
- [] Unit tests written and passing
    - [x] “Happy Path” - Expected outcome
    - [x] Expected failure
    - [x] Edge Case (if applicable/obvious)
- [] README for this challenge is complete
    - [] Summary, Description, Approach & Efficiency, Solution
    - [x] Link to code
    - [] Picture of whiteboard