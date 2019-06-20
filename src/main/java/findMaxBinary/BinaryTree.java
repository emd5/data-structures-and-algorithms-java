package findMaxBinary;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public Node root;

    public BinaryTree(){
        this.root = null;
    }

    public int findMax(Node node){
        if (node == null){
            return 0;
        }
        int max = node.data;
        int left = findMax(node.left);
        int right = findMax(node.right);

        if(left > max){
            max = left;
        }
        if(right > max){
            max = right;
        }
        return max;
    }

    public String toString(){
        return  root.left.data + " | "+ this.root.data  + " | " + root.right.data;
    }
}
