package graph;

import java.util.*;

public class Graph<T> {

    public HashSet<Node<T>> vertices;

    public Graph(){
       this.vertices = new HashSet<>();
    }

   public Node<T>addNode(T data){
        Node node = new Node(data);
        this.vertices.add(node);
        return node;
   }

   public boolean addEdge(Node<T> source, Node<T> destination){
        if(this.vertices.contains(source) && this.vertices.contains(destination)){
            this.vertices.add(source);
            this.vertices.add(destination);
            return true;
        }
        return false;
   }

   public HashSet<Node<T>>getNodes(){
       return this.vertices;
   }

   public HashSet<Edge> getNeighbors(Node<T> node){
        return node.neighbors;
   }

   public int getSize(){
        return this.vertices.size();
   }

   public static LinkedList<Node> depthFirstSearch(Node start){
        LinkedList result = new LinkedList();
        HashSet<Node> visited = new HashSet<>();

        Stack stack  = new Stack();
        stack.push(start);
        visited.add(start);

        while(!stack.isEmpty()){
            Node tempNode = (Node) stack.pop();
            result.add(tempNode);

            for(Edge neighbor: (HashSet<Edge>) tempNode.neighbors){
                if(!visited.contains(neighbor.node)){
                    stack.push(neighbor.node);
                    visited.add(neighbor.node);
                }
            }
        }
        return result;
   }

    public static void main(String[] args) {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

//        System.out.println(cat);
        cat.addNeighbor(dog, 20);
        cat.addNeighbor(hamster, 50);

        dog.addNeighbor(cat);
        hamster.addNeighbor(cat);

        //check for edges
        System.out.println("Check for edges");
        System.out.println(graph.addEdge(cat, dog));
        System.out.println(graph.addEdge(cat, hamster));

        System.out.println("Get Nodes: "  +graph.getNodes().toString());

        System.out.println("Get " + cat + " neighbors: " + graph.getNeighbors(cat));
        System.out.println("Get " + dog + " neighbors: " + graph.getNeighbors(dog));
        System.out.println("Get " + hamster + " neighbors: " + graph.getNeighbors(hamster));

        System.out.println(graph.getSize());

        System.out.println(depthFirstSearch(cat));
        System.out.println(depthFirstSearch(dog));
        System.out.println(depthFirstSearch(hamster));
    }
}


