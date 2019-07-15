# Graphs

## Challenge
Implement the Graph Class

## Approach & Efficiency
To implement the Graph and node class. Created instance methods for the Graph class: addNode(), addEdge()
, getNodes(), getNeighbors(), size().


## Solution
[Code](../src/main/java/graph/Graph.java) | [Tests](../src/test/java/graph/Graph.java)

## API

***addNode()*** S: O(|v| + |e|) T: O(1)

- Adds a new node to the graph
- Takes in the value of that node
- Returns the added node

***addEdge()*** S: O(|v| + |e|) T: O(1)

- Adds a new edge between two nodes in the graph
- Include the ability to have a “weight”
- Takes in the two nodes to be connected by the edge
- Both nodes should already be in the Graph

***getNodes()*** S: O(v) T: O(v)

- Returns all of the nodes in the graph as a collection (set, list, or similar)
 
 ***getNeighbors()*** S: O(e) T: O(e)
 
 - Returns a collection of nodes connected to the given node
 - Takes in a given node
 - Include the weight of the connection in the returned collection
 
 ***size()*** S: O(v) T: O(v)
 
 - Returns the total number of nodes in the graph


***Test***

Write tests to prove the following functionality:

- [x] Node can be successfully added to the graph
- [x] An edge can be successfully added to the graph
- [x] A collection of all nodes can be properly retrieved from the graph
- [x] All appropriate neighbors can be retrieved from the graph
- [x] Neighbors are returned with the weight between nodes included
- [x] The proper size is returned, representing the number of nodes in the graph
- [x] A graph with only one node and edge can be properly returned
- [x] An empty graph properly returns null

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