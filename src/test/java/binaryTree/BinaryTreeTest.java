package binaryTree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    // Test add to empty tree works
    @Test
    public void binaryTree_addToEmptyTree() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);

        assertEquals("Should return 4", 4, tree.root.getData());
    }

    // Test add to existing tree works
    @Test
    public void binaryTree_addToExistingTree() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(80);
        tree.add(23);

        assertEquals("Should return true", true, tree.contains(80));
    }

    // Test contains method is true works
    @Test
    public void binarySearchTree_containsTrue() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(80);
        tree.add(23);
        tree.add(30);
        tree.add(1);
        tree.add(100);
        assertEquals("Should return true", true, tree.contains(100));
    }

    // Test contains method false works
    @Test
    public void binarySearchTree_containsFalse() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(80);
        tree.add(23);
        tree.add(30);
        tree.add(1);
        tree.add(100);
        assertEquals("Should return false", false, tree.contains(99));
    }

    // Test to String method works
    @Test
    public void binaryTree_testToString() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(80);
        tree.add(23);

        assertEquals("Message should return: ", true, tree.toString().contains("left= data=23"));
    }

    @Test
    public void binaryTree_testPreOrder(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(80);
        tree.add(23);

        List actualList = tree.preorder();

        List<Integer> list =new ArrayList<>();
        list.add(4);
        list.add(80);
        list.add(23);

        assertEquals("Preorder should be [4, 23, 80]", list, actualList);
    }

    @Test
    public void binaryTree_testInOrder(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(81);
        tree.add(23);

        List<Integer> list =new ArrayList<>();
        list.add(4);
        list.add(23);
        list.add(81);

        List actualList = tree.inorder();
        assertEquals("In order should be [4, 23, 81]", list, actualList);
    }

    @Test
    public void binaryTree_testPostOrder(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(80);
        tree.add(23);

        List<Integer> list =new ArrayList<>();
        list.add(23);
        list.add(80);
        list.add(4);

        List actualList = tree.postorder();

        assertEquals("Postorder should be [23, 80, 4]", list, actualList );
    }
}