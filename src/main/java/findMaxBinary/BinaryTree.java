package findMaxBinary;

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

    public int findMax2(Node n){
        if(n == null){
            return 0;
        }

        int sumLeft = findMax2(n.left);
        int sumRight = findMax2(n.right);

        if(sumLeft > sumRight){
            return n.data + sumLeft;
        }
        else{
            return n.data + sumRight;
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        System.out.println(bt.findMax2(bt.root));
        System.out.println(bt.findMax(bt.root));

    }

    public String toString(){
        return  root.left.data + " | "+ this.root.data  + " | " + root.right.data;
    }
}
