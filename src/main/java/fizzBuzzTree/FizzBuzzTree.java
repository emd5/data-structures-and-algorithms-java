package fizzBuzzTree;

public class FizzBuzzTree{

    public static Tree fizzBuzz (Tree tree, Node node) {

        if (node !=null){
            if (((int)node.data % 15)==0){
                node.data = "FizzBuzz";
            }
            else if (((int)node.data % 5)==0){
                node.data = "Buzz";
            }
            else if (((int)node.data % 3)==0){
                node.data = "Fizz";
            }
            if (tree.root.left!= null){
                fizzBuzz(tree, node);
            }
            if (tree.root.right!= null){
                fizzBuzz(tree, node);
            }
        }
        return tree;
    }
}
