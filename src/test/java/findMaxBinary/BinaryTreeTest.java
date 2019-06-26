package findMaxBinary;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void test_emptyBinaryTree(){
        BinaryTree bt = new BinaryTree();
        assertTrue("Should return 0", bt.findMax(bt.root) == 0);
    }

    @Test
    public void test_binaryTreeFindMaxIsSuccessful(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(5);
        bt.root.right = new Node(10);
        bt.root.left = new Node(1);
        assertTrue("Should return 10",bt.findMax(bt.root) == 10);
    }

    @Test
    public void test_binaryTreeFindMaxWithDuplicateValues(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(5);
        bt.root.right = new Node(5);
        bt.root.left = new Node(5);

        assertTrue("Should return 5",bt.findMax(bt.root) == 5);



    }


}