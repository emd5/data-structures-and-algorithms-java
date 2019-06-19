package breadthFirstTraversal;


import java.util.*;

public class BinaryTree<T extends Comparable<T>>{

    public Node<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public List<Integer> preorder(){
        List<Integer> list = new ArrayList<>();
        return preorderHelper(list, this.root);
    }
    private List<Integer> preorderHelper(List list, Node node) {
        if (node != null) {
            list.add(node.data);

            preorderHelper(list, node.left);

            preorderHelper(list, node.right);
        }
        return list;
    }
    public List<Integer> inorder(){
        List<Integer> list = new ArrayList<>();
        return inorderHelper(list, this.root);
    }
    private List<Integer> inorderHelper(List<Integer> list, Node node){
        if (node != null) {
            inorderHelper(list, node.left);
            list.add((Integer) node.data);
            inorderHelper(list, node.right);
        }
        return list;
    }
    public List<Integer> postorder(){
        List<Integer> list = new ArrayList<>();
        return postorderHelper(list, this.root);
    }
    private List<Integer> postorderHelper(List list, Node node) {
        if (node != null) {
            postorderHelper(list, node.left);
            postorderHelper(list, node.right);
            list.add(node.data);
        }
        return list;
    }

    public List<T> breadthFirstTraversal(){
        List<T> list = new ArrayList<>();
        if(this.root != null){
            Queue q = new LinkedList();
            q.offer(this.root);
            while(q.peek() != null){
                Node front = q.poll();
                list.add(front.data);
                if(front.left != null){
                    q.offer(front.left);
                }
                if(front.right !=null){
                    q.offer(front.right);
                }
            }
        }
        else{
            throw new NullPointerException("Empty Queue");
        }
        return list;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root.data = new Node(50);
        binaryTree.root.left.data = new Node(20);
        binaryTree.root.right.data = new Node(80);

        List bfsList= binaryTree.breadthFirstTraversal();
        for(Object eachNode : bfsList){
            System.out.println(eachNode);
        }

    }

}
