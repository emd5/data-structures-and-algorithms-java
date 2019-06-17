package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree(){}

    public void add(int value){
        this.root = addHelper(this.root, value);
    }

    private Node addHelper(Node current, int value){
        //if tree is empty
        if (current == null) {
            return new Node(value);
        }
        //go left
        if(value < current.getData()) {
            current.setLeft(addHelper(current.getLeft(), value));
        }
        //go right
        else if(value > current.getData()){
            current.setRight(addHelper(current.getRight(), value));
        }
        else{
            //the value exist
            return current;
        }
        return current;
    }

    public boolean contains(int value){
        return containsHelper(this.root, value);
    }

    private boolean containsHelper(Node current, int value){
        if(current == null){
            return false;
        }
        if(value == current.getData()){
            return true;
        }
        return value < current.getData() ? containsHelper(current.getLeft(), value)
      : containsHelper(current.getRight(), value);

    }

    public List<Integer> preorder(){
        List<Integer> list = new ArrayList<>();
        return preorderHelper(list, this.root);
    }
    public List<Integer> preorderHelper(List list, Node node) {
        if (node != null) {
//            System.out.print(" " + node.getData());
            list.add(node.getData());

            preorderHelper(list, node.getLeft());

            preorderHelper(list, node.getRight());
        }
        return list;
    }

    public List<Integer> inorder(){
        List<Integer> list = new ArrayList<>();
        return inorderHelper(list, this.root);
    }

    public List<Integer> inorderHelper(List<Integer> list, Node node){
        if (node != null) {
            inorderHelper(list, node.getLeft());

            System.out.print(" " + node.getData());
            list.add(node.getData());

            inorderHelper(list, node.getRight());
        }
        return list;
    }

    public List postorder(){
        List<Integer> list = new ArrayList<>();
        return postorderHelper(list, this.root);
    }


    public List<Integer> postorderHelper(List list, Node node) {
        if (node != null) {
            postorderHelper(list, node.getLeft());

            postorderHelper(list, node.getRight());

//            System.out.print(" " + node.getData());
            list.add(node.getData());
        }
        return list;
    }

    @Override
    public String toString() {
        return "BinarySearchTree: " + root;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(80);
        tree.add(23);

        System.out.println("root:"+ tree.root.getData());
        System.out.println("left:"+tree.root.getLeft());
        System.out.println("r:"+tree.root.getRight());
    }
}
