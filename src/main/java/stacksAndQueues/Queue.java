package stacksAndQueues;

public class Queue<T> {

    public Node<T> front;
    public Node<T> back;
    public Node<T> temp;

    public Queue(){
    }

    public void enqueue(T value){
        Node<T> newNode = new Node(value);
        temp = newNode;
        if(back == null){
            front = temp;
            back = temp;
        }
        else{
            back.next = temp;
            back = temp;
        }
    }

    public T dequeue(){
        if(front == null){
            throw new NullPointerException("Queue is empty");
        }
        else{
            temp = front;
            front= front.next;
            return temp.data;
        }
    }

    public T peek(){
        if(front == null){
            throw new NullPointerException("Queue is empty");
        }
        else{
            return front.data;
        }
    }
}
