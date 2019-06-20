package findMaxBinary;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public Node root;

    public BinaryTree(){
        this.root = null;
    }

    public List<Integer> inorder(){
        List<Integer> list = new ArrayList<>();
        return inorderHelper(list, root);
    }

    private List<Integer> inorderHelper(List<Integer> list, Node node){
        if (node != null) {
            inorderHelper(list, node.getLeft());
            list.add(node.getData());
            inorderHelper(list, node.getRight());
        }
        return list;
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
