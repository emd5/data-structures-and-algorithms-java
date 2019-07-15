package graph;

import java.util.HashSet;

public class Node<T> {

    public T data;
    public HashSet<Edge> neighbors;

    //constructor to add new node, creates a hashset
    public Node(T data){
        this.data = data;
        this.neighbors = new HashSet<>();
    }

    // add new neighbor to existing node
    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        return true;
    }

    // add new neighbor to existing node with weight
    public boolean addNeighbor(Node<T> node, int weight){
        Edge edge = new Edge(node, weight);
        this.neighbors.add(edge);
        return true;
    }

    //string representation of the Node class
    public String toString(){
        return this.data.toString();
    }

}
