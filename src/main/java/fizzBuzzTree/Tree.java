package fizzBuzzTree;

import java.util.ArrayList;
import java.util.List;

public class Tree{

    public Node root;

    public Tree(){}

    public Tree(Node node){
        this.root =node;
    }

    public List<Object> inorder(){
        List<Object> list = new ArrayList<>();
        return inorderHelper(list, this.root);
    }

    private List<Object> inorderHelper(List<Object> list, Node node){
        if (node != null) {
            inorderHelper(list, node.left);
            list.add(node.data);
            inorderHelper(list, node.right);
        }
        return list;
    }

    public static void main(String[] args) {
        Tree tr = new Tree();
        tr.root=new Node(5);
        tr.root.left=new Node(15);
        tr.root.right=new Node(4);
        tr.root.left.left=new Node(9);
        List r = tr.inorder();
        for(Object o:r){
            System.out.println(o);
        }
        Tree res = FizzBuzzTree.fizzBuzz( tr,tr.root);

        System.out.println("++++++++++++++++++++++++++");
        List rr = res.inorder();
        for(Object o:rr){
            System.out.println(o);
        }
    }
}
