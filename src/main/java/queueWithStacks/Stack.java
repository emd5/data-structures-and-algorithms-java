package queueWithStacks;

public class Stack {

    protected Node top;
    protected Node temp;

    public Stack(){

    }

    public Stack(Node node){
        this.top = node;
    }

    public void push(int value){

        if(this.top == null){
            this.top = new Node(value);
        }
        else {
            temp = this.top;
            this.top = new Node(value);
            this.top.next = temp;
        }
    }

    public int pop(){
        if(this.top == null){
            throw new NullPointerException("Can't peek at an empty stack. This stack is empty");
        }
        else{
            temp = this.top;
            top = this.top.next;
            return temp.data;
        }
    }

    public int peek(){

        //if empty
        if(this.top == null){
            throw new NullPointerException("Can't peek at an empty stack. This stack is empty");
        }
        return this.top.data;
    }
}
