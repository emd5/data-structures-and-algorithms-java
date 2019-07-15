package graph;

import linkedListInsertion.Node;

public class Graph<T> {

    Node<T> vertex;
    int edge;

    public Graph(Node vertex, int edge ){
        this.vertex = vertex;
        this.edge = edge;
    }
}
