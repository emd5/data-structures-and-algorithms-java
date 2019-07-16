package stacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private Node<T> top;
    private Node<T> temp;

    public Stack(){

    }

    public void push(T value){

        if(top == null){
            top = new Node(value);
        }
        else {
            temp = top;
            top = new Node(value);
            top.next = temp;
        }
    }

    public T pop(){
        if(top == null){
            throw new NullPointerException("Can't peek at an empty stack. This stack is empty");
        }
        else{
            temp = top;
            top = top.next;
            return temp.data;
        }
    }

    public T peek(){

        //if empty
        if(top == null){
            throw new NullPointerException("Can't peek at an empty stack. This stack is empty");
        }
        return top.data;
    }

    public static void main(String[] args) {

        List<Integer>  list = new ArrayList<>();


        Stack s = new Stack();
        s.push(4);
        s.push(10);
        s.push(14);
        s.push(18);
        s.push(24);
        s.push(32);


        while(s.top != null){
            list.add((Integer)s.pop());
        }
        System.out.println(list);
    }
}
