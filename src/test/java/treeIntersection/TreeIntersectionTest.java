package treeIntersection;

import binaryTree.BinaryTree;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void test_AllCommonNodes() {
        BinaryTree bt = new BinaryTree();
        bt.add(30);
        bt.add(20);
        bt.add(50);
        bt.add(100);
        bt.add(150);
        bt.add(800);

        BinaryTree bt2 = new BinaryTree();
        bt2.add(30);
        bt2.add(20);
        bt2.add(50);
        bt2.add(100);
        bt2.add(150);
        bt2.add(800);


       HashSet actual = new HashSet();
        actual.add(800);
        actual.add(50);
        actual.add(20);
        actual.add(100);
        actual.add(150);
        actual.add(30);

        assertEquals("Should equal [800, 50, 20, 100, 150, 30]", actual,
                TreeIntersection.treeIntersection(bt, bt2) );

    }

    @Test
    public void test_SomeCommonNodes() {
        BinaryTree bt = new BinaryTree();
        bt.add(30);
        bt.add(20);
        bt.add(50);
        bt.add(100);
        bt.add(150);
        bt.add(800);

        BinaryTree bt2 = new BinaryTree();
        bt2.add(30);
        bt2.add(20);
        bt2.add(50);

        HashSet actual = new HashSet();
        actual.add(50);
        actual.add(20);
        actual.add(30);

        assertEquals("Should equal [50, 20, 30]", actual,
                TreeIntersection.treeIntersection(bt, bt2) );
    }

    @Test
    public void test_EmptyBinaryTree(){
        BinaryTree bt = new BinaryTree();

        BinaryTree bt2 = new BinaryTree();
        bt2.add(30);
        bt2.add(20);
        bt2.add(50);
        bt2.add(100);
        bt2.add(150);
        bt2.add(800);

        HashSet actual = new HashSet();
        assertEquals("Should equal empty hashset", actual,
                TreeIntersection.treeIntersection(bt, bt2) );

    }

}