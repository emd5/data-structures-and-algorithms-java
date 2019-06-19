package breadthFirstTraversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void test_bfsMethodIsEmpty(){
        BinaryTree binaryTree = new BinaryTree();

        assertTrue("Should return empty/null", binaryTree == null);
    }

    @Test
    public void test_bfsWithRootLeftAndRightChild(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root= new Node(50);
        binaryTree.root.right= new Node(60);
        binaryTree.root.left= new Node(20);

//        binaryTree.breadthFirstTraversal();
        assertEquals("Should return same", List.of(3,4,5,5) , binaryTree.breadthFirstTraversal());




    }

}