package fizzBuzzTree;

import binarySearch.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest extends BinarySearchTree {

    @Test
    public void fizzBuzz() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(3);
        binarySearchTree.add(15);
        binarySearchTree.add(5);

        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();


        assertEquals("Should return matched arrays", FizzBuzzTree.fizzBuzz(fizzBuzzTree, binarySearchTree.root));
    }
}