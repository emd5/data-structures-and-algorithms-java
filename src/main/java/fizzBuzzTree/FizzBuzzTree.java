package fizzBuzzTree;

import fizzBuzzTree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTree extends BinarySearchTree{

    public static BinarySearchTree fizzBuzz (BinarySearchTree tree, Node node) {

        if (node.data == null){
            return tree;
        }
        if (((int) node.data % 15) == 0){
            tree.root.setData("FizzBuzz");
        }
        else if ((int) node.data % 5 == 0){
            tree.root.setData( "Buzz");
        }
        else if ((int) node.data % 3 == 0){
            tree.root.setData("Fizz");
        }
        if (tree.root.getLeft()!= null){
            fizzBuzz(tree, node);
        }
        if (tree.root.getRight() != null){
            fizzBuzz(tree, node);
        }
        return tree;
    }


}
