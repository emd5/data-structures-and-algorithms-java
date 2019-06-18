package fizzBuzzTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>>{

    public Node<T> root;

    public BinarySearchTree(){}

    public void add(T data){
        this.root = addHelper(this.root, data);
    }

    private Node<T> addHelper(Node<T> current, T value){
        //if tree is empty
        if (current == null) {
            return new Node<>(value);
        }
        //go left
        if((current.data.compareTo(value) < 0)) {
            current.setLeft(addHelper(current.getLeft(), value));
        }
        //go right
        else if((current.data.compareTo(value) > 0)){
            current.setRight(addHelper(current.getRight(), value));
        }
        else{
            return current;
        }
        return current;
    }

    public boolean contains(T currentData){
        return containsHelper(this.root, currentData);
    }

    private boolean containsHelper(Node<T> current, T data){
        if(current == null){
            return false;
        }
        if((data == current.data)){
            return true;
        }
        return ((data.compareTo(current.data) < 0) ? containsHelper(current.getLeft(), data)
      : containsHelper(current.getRight(), data));

    }

    public List preorder(){
        ArrayList list = new ArrayList<>();
        return preOrderHelper(list, this.root);
    }
    private List preOrderHelper(List list, Node node) {
        if (node != null) {
            list.add(node.getData());
            preOrderHelper(list, node.getLeft());
            preOrderHelper(list, node.getRight());
        }
        return list;
    }

    public List inorder(){
        List list = new ArrayList<>();
        return inorderHelper(list, this.root);
    }

    private List inorderHelper(List list, Node node){
        if (node != null) {
            inorderHelper(list, node.getLeft());
            list.add(node.data);
            inorderHelper(list, node.getRight());
        }
        return list;
    }

    public List postorder(){
        List list = new ArrayList<>();
        return postOrderHelper(list, this.root);
    }

    private List postOrderHelper(List list, Node node) {
        if (node != null) {
            postOrderHelper(list, node.getLeft());
            postOrderHelper(list, node.getRight());
            list.add(node.getData());
        }
        return list;
    }

    @Override
    public String toString() {
        return "BinarySearchTree: " + root;
    }

    public static void main(String[] args) {
        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();

        fizzBuzzTree.add(3);
        fizzBuzzTree.add(15);
        fizzBuzzTree.add(5);

//        fizzBuzz((Node<Object>) new Node(3));
//        System.out.println(fizzBuzzTree.inorder());
//        BinarySearchTree binarySearchTree = new BinarySearchTree();

//        binarySearchTree.add(4);
//        binarySearchTree.add(15);
//        binarySearchTree.add(9);
//
//        System.out.println(binarySearchTree.contains(4));

    }
}
