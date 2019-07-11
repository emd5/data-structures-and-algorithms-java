package treeIntersection;

import binaryTree.BinaryTree;

import java.util.HashSet;

public class TreeIntersection {

    public static HashSet treeIntersection(BinaryTree tree1, BinaryTree tree2){

        HashSet intersection = new HashSet();

        HashSet set1 = setTreeToHash(tree1);
        HashSet set2 = setTreeToHash(tree2);

        for(Object n : set1){
            if(set2.contains(n)){
                intersection.add(n);
            }
        }
        return intersection;
    }

    public static HashSet setTreeToHash(BinaryTree bt){
        HashSet nodeSet = new HashSet();

        for(Object n : bt.preorder()){
            nodeSet.add(n);
        }
        return nodeSet;
    }
}
