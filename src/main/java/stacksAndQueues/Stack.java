package stacksAndQueues;

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
}
