package queueWithStacks;

import stacksAndQueues.Node;

public class Stack {

    private Node top;
    private Node temp;

    public Stack(){

    }

    public void push(int value){

        if(top == null){
            top = new Node(value);
        }
        else {
            temp = top;
            top = new Node(value);
            top.next = temp;
        }
    }

    public int pop(){
        if(top == null){
            throw new NullPointerException("Can't peek at an empty stack. This stack is empty");
        }
        else{
            temp = top;
            top = top.next;
            return temp.data;
        }
    }

    public int peek(){

        //if empty
        if(top == null){
            throw new NullPointerException("Can't peek at an empty stack. This stack is empty");
        }
        return top.data;
    }
}
