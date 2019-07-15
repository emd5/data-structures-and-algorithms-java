package graph;

public class Edge<T> {

    public int weight;
    public Node<T> node;

    //constructor with node
    public Edge(Node<T> node){
        this.node = node;
    }

    //constructor with node and weight
    public Edge(Node<T> node, int weight){
        this.node = node;
        this.weight = weight;
    }

    public Node<T> getNode(){
        return this.node;
    }

    //string representation of the edge class
    @Override
    public String toString(){
        return this.node.toString();
    }
}
